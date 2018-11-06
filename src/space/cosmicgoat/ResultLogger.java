package space.cosmicgoat;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ResultLogger
{
	private File outputFile;
	private int maxShapes = 0;


	public ResultLogger(File outputFile) //throws IOException
	{
		this.outputFile = outputFile;
		// Output initial info
		//Files.createFile(outputFile.getPath(), )
		System.out.printf("%-20s\t%-20s\t%-20s%n%n", "Background Colour:", "Number of Shapes:", "Shapes:");
	}

	public void writeFrame(FrameInfo frameInfo)
	{
		final Color backgroundColor = frameInfo.getBackgroundColor();
		final String outputBackColor = backgroundColor.getRed() + " " + backgroundColor.getGreen() + " " + backgroundColor.getBlue();
		final int numberOfShapes = frameInfo.getShapes().size();
		if (numberOfShapes > maxShapes) maxShapes = numberOfShapes;

		// Create a TreeMap to count individual elements
		TreeMap<String, Integer> counts = new TreeMap<>();
		frameInfo.getShapes().forEach(t -> {
			String comp = t.toString();
			Integer c = counts.get(comp);
			counts.put(comp, (c == null) ? 1 : c + 1);
		});

		System.out.printf("%-20s\t%17s\t\t%s%n", outputBackColor, numberOfShapes, counts);
	}

	public void timeWrite(long time)
	{
		System.out.printf("\t|%n%5d ms%n\t|%n\t▼%n", time);
	}
}
