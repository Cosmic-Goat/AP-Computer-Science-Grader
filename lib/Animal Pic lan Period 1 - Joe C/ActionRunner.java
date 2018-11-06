
/**
 * Write a description of class ActionRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActionRunner
{
    Picture pic = new Picture();

    public ActionRunner()
    {
        //pic.draw();
        
        waitTime(1000);
        System.out.println("Color Changes");
        colorChanges();
        
        pic.action1();
        System.out.println("Action1");
        waitTime(1000);
        
        pic.action2();
        System.out.println("Action2");
        waitTime(1000);
        
        pic.action3();
        System.out.println("Action3");
        waitTime(1000);

    }

    
    public void waitTime(int x)//x is in milliseconds. One thousand milliseconds is a second.
    {
        try 
        {
            Thread.sleep(x);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }

    }
    
    public void colorChanges()
    {
        pic.setBlackAndWhite();
        waitTime(1000);
        pic.setFunnyColor();
        waitTime(1000);
        pic.setOriginalColor();
        waitTime(1000);
    }
}
