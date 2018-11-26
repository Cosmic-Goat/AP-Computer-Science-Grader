package space.cosmicgoat;

import java.io.File;
import java.net.MalformedURLException;

public class Main
{
	public static void main(String[] args) throws InterruptedException, IllegalAccessException
	{
		//args[0] = "/home/cosmicgoat/Development/IdeaProjects/APCompSciGrader/lib/Animal Pic lan Period 1 - Joe C/";
		LabRunner test = new LabRunner(new File(args[0]));

		try
		{
			test.RunLab();
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
			return;
		}
	}
}
