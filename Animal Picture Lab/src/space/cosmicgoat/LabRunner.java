package space.cosmicgoat;

import java.awt.*;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.time.Duration;
import java.time.Instant;
import java.util.ConcurrentModificationException;
import java.util.HashMap;

class LabRunner
{
	private final File folderLocation;
	private final ResultLogger resultLogger;

	LabRunner(File folderLocation)
	{

		this.folderLocation = folderLocation;
		resultLogger = new ResultLogger(folderLocation);
	}

	void RunLab() throws IllegalAccessException, MalformedURLException
	{
		URL[] classUrls = {folderLocation.toURI().toURL()};
		URLClassLoader ucl = new URLClassLoader(classUrls);

		Class<?> CustomCanvas, ActionRunnerClass;
		Method getCanvas;
		Object canvas;

		try
		{
			CustomCanvas = ucl.loadClass("Canvas");
			ActionRunnerClass = ucl.loadClass("ActionRunner");
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return;
		}

		try
		{
			getCanvas = CustomCanvas.getDeclaredMethod("getCanvas");
			canvas = getCanvas.invoke(null);
		} catch (NoSuchMethodException | InvocationTargetException e)
		{
			e.printStackTrace();
			return;
		}

		Class shapeDescription = CustomCanvas.getDeclaredClasses()[0];

		Field canvasBackgroundColorField, canvasShapesField, shapeColorField, shapeField;
		try
		{
			canvasBackgroundColorField = CustomCanvas.getDeclaredField("backgroundColor");
			canvasShapesField = CustomCanvas.getDeclaredField("shapes");
			shapeColorField = shapeDescription.getDeclaredField("colorString");
			shapeField = shapeDescription.getDeclaredField("shape");
		} catch (NoSuchFieldException e)
		{
			e.printStackTrace();
			return;
		}

		canvasBackgroundColorField.setAccessible(true);
		canvasShapesField.setAccessible(true);
		shapeColorField.setAccessible(true);
		shapeField.setAccessible(true);

		@SuppressWarnings("unchecked")
		HashMap<Object, ?> shapes = (HashMap<Object, ?>) canvasShapesField.get(canvas);

		Thread t = new ActionRunnerThread(ActionRunnerClass);

		Instant lastFrame = Instant.now(); // Initialise variable for use

		t.start();
		FrameInfo previousFrameInfo = new FrameInfo(shapes, shapeField, shapeColorField, (Color) canvasBackgroundColorField.get(canvas));

		while (t.isAlive())
		{
			long delta = Duration.between(lastFrame, Instant.now()).toMillis();

			if (delta >= 200)
			{
				try
				{
					FrameInfo currentFrameInfo = new FrameInfo(shapes, shapeField, shapeColorField, (Color) canvasBackgroundColorField.get(canvas));
					if (!currentFrameInfo.equals(previousFrameInfo))
					{
						resultLogger.writeFrame(currentFrameInfo);
						resultLogger.timeWrite(delta);
						lastFrame = Instant.now();
					}
					previousFrameInfo = currentFrameInfo;
				} catch (ConcurrentModificationException e)
				{
					//System.out.println("test"); Try again?
				}

			}


		}
	}
}
