/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square body;
    private Circle eye;
    private Triangle topfin;
    private Triangle bottomfin;
    private rotatetriangle tail;
    private Square sharktop;
    private Triangle sharkbottom;
    private Circle bubble;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        draw();
    }
    
    public void waitTime(int x)//shapeClass is in milliseconds. One thousand milliseconds is a second.
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
    
    /**
     * Draw a fish, uses 8 shapes.
     */
    public void draw()
    {
        //All objects are intialized to start at (0,0) on the grid. 
        //(0,0) is the upper left hand corner of the screen.
        // The grid is (500, 300) pixels.
        
        tail = new rotatetriangle();
        tail.moveHorizontal(160);
        tail.moveVertical(210);
        tail.changeColor("yellow");
        tail.changeSize(60, 70);
        tail.makeVisible();
        
        body = new Square();
        body.moveHorizontal(150);
        body.moveVertical(125);
        body.changeColor("yellow");
        body.changeSize(75);
        body.makeVisible();
        
        eye = new Circle();
        eye.moveHorizontal(165);
        eye.moveVertical(135);
        eye.changeColor("black");
        eye.changeSize(20);
        eye.makeVisible();
        
        topfin = new Triangle();
        topfin.moveHorizontal(185);
        topfin.moveVertical(100);
        topfin.changeColor("yellow");
        topfin.changeSize(30, 40);
        topfin.makeVisible();
        
        bottomfin = new Triangle();
        bottomfin.moveHorizontal(190);
        bottomfin.moveVertical(220);
        bottomfin.changeColor("yellow");
        bottomfin.changeSize(-20, 30);
        bottomfin.makeVisible();
        
        sharktop = new Square();
        sharktop.moveHorizontal(0);
        sharktop.moveVertical(-500);
        sharktop.changeColor("grey");
        sharktop.changeSize(510);
        
        sharkbottom = new Triangle();
        sharkbottom.moveHorizontal(0);
        sharkbottom.moveVertical(300);
        sharkbottom.changeColor("grey");
        sharkbottom.changeSize(300, 1000);

        bubble = new Circle();
        bubble.moveHorizontal(140);
        bubble.moveVertical(170);
        bubble.changeColor("blue");
        bubble.changeSize(20);
    }

    /**
     * Change this picture to use color display
     * Required for project. 
     */
    public void setOriginalColor()
    {
        if (body != null)   // only if it's painted already...
        {
            body.changeColor("yellow");
            eye.changeColor("black");
            topfin.changeColor("yellow");
            bottomfin.changeColor("yellow");
            tail.changeColor("yellow");
            sharktop.changeColor("grey");
            sharkbottom.changeColor("grey");
            bubble.changeColor("blue");
        }
    }
    
    /**
     * Change this picture to black/white display
     * Required for project. 
     */
    public void setBlackAndWhite()
    {
           body.changeColor("black");
           eye.changeColor("white");
           topfin.changeColor("black");
           bottomfin.changeColor("black");
           tail.changeColor("black");
           sharktop.changeColor("black");
           sharkbottom.changeColor("black");
           bubble.changeColor("black");
    }

    /**
     * Change this picture to use color display
     * Required for project. 
     */
    public void setFunnyColor()
    {
           body.changeColor("red");
           eye.changeColor("white");
           topfin.changeColor("bad1");
           bottomfin.changeColor("bad2");
           tail.changeColor("bad3");
           sharktop.changeColor("magenta");
           sharkbottom.changeColor("magenta");
           bubble.changeColor("bad4");
    }
    
    /**
     * Shark will murder the fish like the punny little failure of evolution
     * that it is, rekt.
     * 
     * But actually, the shark shapes will move up or down unto the screen
     * as the fish "cloaks" itself and waits for a bit while the shark shapes 
     * move back.
     */
    public void action1()
    {
        sharkbottom.makeVisible();
        sharktop.makeVisible();
        for (int i = 0; i < 150; i ++) {
            sharkbottom.moveVertical(-2);
            sharktop.moveVertical(2);
        }     
        
        body.makeInvisible();
        eye.makeInvisible();
        topfin.makeInvisible();
        bottomfin.makeInvisible();
        tail.makeInvisible();
        
        for (int i = 0; i < 150; i ++) {
            sharkbottom.moveVertical(2);
            sharktop.moveVertical(-2);
        }
        sharktop.makeInvisible();
        sharkbottom.makeInvisible();
        
        waitTime(2000);
        
        body.makeVisible();
        eye.makeVisible();
        topfin.makeVisible();
        bottomfin.makeVisible();
        tail.makeVisible();
    }

    /**
     * The bubble circle shape will makeVisible and then will go up for a bit
     * and teleport back, a bunch of repeats since I don't know for loops yet...
     */
    public void action2()
    {
        bubble.makeVisible();
        
         for (int i = 0; i < 7; i ++) {
            bubble.slowMoveVertical(-75);
            bubble.moveVertical(75);
        }
        bubble.makeInvisible();
    }
 
    public void reset()
    {
        body.erase();
        eye.erase();
        topfin.erase();
        bottomfin.erase();
        tail.erase();
        sharktop.erase();
        sharkbottom.erase();
        bubble.erase();
        draw();
    }


}
