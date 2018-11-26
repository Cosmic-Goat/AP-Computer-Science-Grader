package space.cosmicgoat;

public class ActionRunnerThread extends Thread
{
	private Class actionRunnerClass;

	public ActionRunnerThread (Class actionRunnerClass)
	{
		this.actionRunnerClass = actionRunnerClass;
	}

	@Override
	public void run()
	{
		try
		{
			actionRunnerClass.getDeclaredConstructor().newInstance();
			System.out.println("done");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
