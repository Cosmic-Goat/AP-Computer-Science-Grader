package space.cosmicgoat;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class FrameInfo
{
	private ArrayList<ShapeTuple> shapes;
	private Color backgroundColor;

	public FrameInfo(HashMap<Object, ?> shapes, Field shapeField, Field shapeColorField, Color backgroundColor) throws IllegalAccessException
	{
		this.shapes = new ArrayList<>();
		this.backgroundColor = backgroundColor;

		for (Object shape : shapes.values())
		{
			this.shapes.add(new ShapeTuple(shapeField.get(shape).getClass().getName(), shapeColorField.get(shape).toString()));
		}
	}

	public boolean equals(Object other)
	{
		if (other == this)
		{
			return true;
		}

		if (!(other instanceof FrameInfo))
		{
			return false;
		}

		FrameInfo other_ = (FrameInfo) other;
		return other_.backgroundColor.equals(this.backgroundColor) && other_.shapes.equals(this.shapes);
	}

	public ArrayList<ShapeTuple> getShapes()
	{
		return shapes;
	}

	public Color getBackgroundColor()
	{
		return backgroundColor;
	}
}
