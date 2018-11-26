/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square rect0;
    private Square rect1;
    private Square rect2;
    private Square rect3;
    private Square rect4;
    private Square rect5;
    private Square rect6;
    
    private Triangle roof;
    private Triangle roof1;
    
    
    private Circle circle0;
    private Circle circle1;
    private Circle circle2;
    private Circle circle3;
    private Circle circle4;
    private Circle circle5;
    private Circle circle6;
    private Circle circle7;
    private Circle circle8;
    private Circle circle9;
    private Circle circle10;
    
    
    
   
    
    
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        //All objects are intialized to start at (0,0) on the grid. 
        //(0,0) is the upper left hand corner of the screen.
        // The grid is (500, 300) pixels.
        
        rect0 = new Square();
        rect0.changeColor("dark grey");
        rect0.moveHorizontal(185);
        rect0.moveVertical(165);
        rect0.changeSize(90,30);
        rect0.makeVisible();
        
        rect1 = new Square();
        rect1.changeColor("dark grey");
        rect1.moveHorizontal(265);
        rect1.moveVertical(165);
        rect1.changeSize(90,30);
        rect1.makeVisible();
        
        rect2 = new Square();
        rect2.changeColor("grey");
        rect2.moveHorizontal(195);
        rect2.moveVertical(175);
        rect2.changeSize(90,30);
        rect2.makeVisible();
        
        rect4 = new Square();
        rect4.changeColor("grey");
        rect4.moveHorizontal(275);
        rect4.moveVertical(175);
        rect4.changeSize(90,30);
        rect4.makeVisible();

           

        circle0 = new Circle();
        circle0.changeColor("grey");
        circle0.moveHorizontal(175);
        circle0.moveVertical(75);
        circle0.changeSize(150);
        circle0.makeVisible();
        
        circle1 = new Circle();
        circle1.changeColor("grey");
        circle1.moveHorizontal(200);
        circle1.moveVertical(60);
        circle1.changeSize(55);
        circle1.makeVisible();
        
        circle2 = new Circle();
        circle2.changeColor("grey");
        circle2.moveHorizontal(120);
        circle2.moveVertical(60);
        circle2.changeSize(55);
        circle2.makeVisible();
        
        circle3 = new Circle();
        circle3.changeColor("white");
        circle3.moveHorizontal(135);
        circle3.moveVertical(75);
        circle3.changeSize(25);
        circle3.makeVisible();
        
        circle4 = new Circle();
        circle4.changeColor("white");
        circle4.moveHorizontal(215);
        circle4.moveVertical(75);
        circle4.changeSize(25);
        circle4.makeVisible();
        
        circle5 = new Circle();
        circle5.changeColor("dark grey");
        circle5.moveHorizontal(150);
        circle5.moveVertical(60);
        circle5.changeSize(75);
        circle5.makeVisible();
        
        
        circle6 = new Circle();
        circle6.changeColor("white");
        circle6.moveHorizontal(190);
        circle6.moveVertical(80);
        circle6.changeSize(17);
        circle6.makeVisible();
        
        circle7 = new Circle();
        circle7.changeColor("white");
        circle7.moveHorizontal(158);
        circle7.moveVertical(80);
        circle7.changeSize(17);
        circle7.makeVisible();
        
        circle8 = new Circle();
        circle8.changeColor("black");
        circle8.moveHorizontal(160);
        circle8.moveVertical(83);
        circle8.changeSize(7);
        circle8.makeVisible();
        
        circle9 = new Circle();
        circle9.changeColor("black");
        circle9.moveHorizontal(192);
        circle9.moveVertical(83);
        circle9.changeSize(7);
        circle9.makeVisible();
        
        rect3 = new Square();
        rect3.changeColor("grey");
        rect3.moveHorizontal(170);
        rect3.moveVertical(105);
        rect3.changeSize(70,20);
        rect3.makeVisible();
    }

    /**
     * Change this picture to use color display
     * Required for project. Do not delete
     */
    public void setOriginalColor()
    {
        //if (Picture != null)   //only if it's painted already...
        {
            draw();            
        }
    }
    
        /**
     * Change this picture to black/white display
     * Required for project. Do not delete
     */
    public void setBlackAndWhite()
    {
      rect0.changeColor("black");
      rect1.changeColor("black");
      rect2.changeColor("black");
      rect4.changeColor("black");
      circle0.changeColor("black");
      circle1.changeColor("black");
      circle2.changeColor("black");
      circle3.changeColor("white");
      circle4.changeColor("white");
      circle5.changeColor("black");
      circle6.changeColor("white");
      circle7.changeColor("white");
      circle8.changeColor("black");
      circle9.changeColor("black");
      rect3.changeColor("white");
      
    }

    
     /**
     * Change this picture to use color display
     * Required for project. Do not delete
     */
    public void setFunnyColor()
    {
      rect0.changeColor("yellow");
      rect1.changeColor("teal");
      rect2.changeColor("magenta");
      rect4.changeColor("magenta");
      circle0.changeColor("teal");
      circle1.changeColor("magenta");
      circle2.changeColor("teal");
      circle3.changeColor("magenta");
      circle4.changeColor("teal");
      circle5.changeColor("yellow");
      circle6.changeColor("teal");
      circle7.changeColor("magenta");
      circle8.changeColor("black");
      circle9.changeColor("black");
      rect3.changeColor("magenta");

    }
    
    /**  //This action drops a pair of sunglasses onto the elephants head from above.
     * Describe your action here
     * Required for project. Do not delete
     */
    public void action1()
    {
        rect0.erase();
        rect1.erase();
        rect2.erase();
        rect4.erase();
        circle0.erase();
        circle1.erase();
        circle2.erase();
        circle3.erase();
        circle4.erase();
        circle5.erase();
        circle6.erase();
        circle7.erase();
        circle8.erase();
        circle9.erase();
        rect3.erase();
        draw();
        
        roof = new Triangle(); 
        roof.changeSize(-23, 23);
        roof.changeColor("black");
        roof.moveHorizontal(166);
        //roof.moveVertical(105); 
        roof.makeVisible();
        //roof.slowMoveHorizontal(218);
        
        rect5 = new Square();
        rect5.changeColor("black");
        rect5.moveHorizontal(169);
        rect5.moveVertical(-22);
        rect5.changeSize(10,30);
        rect5.makeVisible();
        
        roof1 = new Triangle(); 
        roof1.changeSize(-23, 23);
        roof1.changeColor("black");
        roof1.moveHorizontal(198);
        //roof1.moveVertical(105); 
        roof1.makeVisible();
        //roof1.slowMoveHorizontal(237);
        
        for (int i = 0; i < 103; i++)
        {
            roof.moveVertical(1);
            roof1.moveVertical(1);
            rect5.moveVertical(1);
        }
        System.out.println("Deal With It");
    }

    /**  //This action reveals the elephants true body: an orange square.
     * Describe your action here
     * Required for project. Do not delete
     */
    public void action2()
    {
        rect0.erase();
        rect1.erase();
        rect2.erase();
        rect4.erase();
        circle0.erase();
        circle1.erase();
        circle2.erase();
        circle3.erase();
        circle4.erase();
        circle5.erase();
        circle6.erase();
        circle7.erase();
        circle8.erase();
        circle9.erase();
        rect3.erase();
        circle0.makeInvisible();
        
         rect0 = new Square();
        rect0.changeColor("dark grey");
        rect0.moveHorizontal(185);
        rect0.moveVertical(165);
        rect0.changeSize(90,30);
        rect0.makeVisible();
        
        rect1 = new Square();
        rect1.changeColor("dark grey");
        rect1.moveHorizontal(265);
        rect1.moveVertical(165);
        rect1.changeSize(90,30);
        rect1.makeVisible();
        
       
        
        
        
        
        rect2 = new Square();
        rect2.changeColor("grey");
        rect2.moveHorizontal(195);
        rect2.moveVertical(175);
        rect2.changeSize(90,30);
        rect2.makeVisible();
        
        rect4 = new Square();
        rect4.changeColor("grey");
        rect4.moveHorizontal(275);
        rect4.moveVertical(175);
        rect4.changeSize(90,30);
        rect4.makeVisible();
        
        rect6 = new Square();
        rect6.changeColor("orange");
        rect6.moveHorizontal(175);
        rect6.moveVertical(75);
        rect6.changeSize(130,130);
        rect6.makeVisible();
        
        circle10 = new Circle();
        circle10.changeColor("grey");
        circle10.moveHorizontal(175);
        circle10.moveVertical(75);
        circle10.changeSize(150);
        circle10.makeVisible();
        
        circle1 = new Circle();
        circle1.changeColor("grey");
        circle1.moveHorizontal(200);
        circle1.moveVertical(60);
        circle1.changeSize(55);
        circle1.makeVisible();
        
        circle2 = new Circle();
        circle2.changeColor("grey");
        circle2.moveHorizontal(120);
        circle2.moveVertical(60);
        circle2.changeSize(55);
        circle2.makeVisible();
        
        circle3 = new Circle();
        circle3.changeColor("white");
        circle3.moveHorizontal(135);
        circle3.moveVertical(75);


        circle3.changeSize(25);
        circle3.makeVisible();
        
        circle4 = new Circle();
        circle4.changeColor("white");
        circle4.moveHorizontal(215);
        circle4.moveVertical(75);
        circle4.changeSize(25);
        circle4.makeVisible();
        
        circle5 = new Circle();
        circle5.changeColor("dark grey");
        circle5.moveHorizontal(150);
        circle5.moveVertical(60);
        circle5.changeSize(75);
        circle5.makeVisible();
        
        
        circle6 = new Circle();
        circle6.changeColor("white");
        circle6.moveHorizontal(190);
        circle6.moveVertical(80);
        circle6.changeSize(17);
        circle6.makeVisible();
        
        circle7 = new Circle();
        circle7.changeColor("white");
        circle7.moveHorizontal(158);
        circle7.moveVertical(80);
        circle7.changeSize(17);
        circle7.makeVisible();
        
        circle8 = new Circle();
        circle8.changeColor("black");
        circle8.moveHorizontal(160);
        circle8.moveVertical(83);
        circle8.changeSize(7);
        circle8.makeVisible();
        
        circle9 = new Circle();
        circle9.changeColor("black");
        circle9.moveHorizontal(192);
        circle9.moveVertical(83);
        circle9.changeSize(7);
        circle9.makeVisible();
        
        rect3 = new Square();
        rect3.changeColor("grey");
        rect3.moveHorizontal(170);
        rect3.moveVertical(105);
        rect3.changeSize(70,20);
        rect3.makeVisible();
        
        
        circle10.slowMoveHorizontal(350);
      
    }

    /** //This action makes the elephant defy the laws of physics and float
     * upward for a few seconds. Due to the glitchy nature, I am not including
     * this action in the project.
     * Describe your action here
     * Not required but please don't delete. Only for fun.
     */
    public void action3()
    {
       //   for (int i = 0; i < 103; i++)
     {   //rect0.moveVertical(-1);
         //rect1.moveVertical(-1);
         
         //circle0.moveVertical(-1);
         //circle1.moveVertical(-1);
         //circle2.moveVertical(-1);
         //circle3.moveVertical(-1);
         //circle4.moveVertical(-1);
         //circle5.moveVertical(-1);
         //circle6.moveVertical(-1);
         //circle7.moveVertical(-1);
         //circle8.moveVertical(-1);
         //circle9.moveVertical(-1);
         //rect2.moveVertical(-1);
         //rect3.moveVertical(-1);
         //rect4.moveVertical(-1);
         
    
}
 //for (int i = 0; i < 103; i++)
     {   //rect0.moveVertical(1);
         //rect1.moveVertical(1);
         
         //circle0.moveVertical(1);
         //circle1.moveVertical(1);
         //circle2.moveVertical(1);
         //circle3.moveVertical(1);
         //circle4.moveVertical(1);
         //circle5.moveVertical(1);
         //circle6.moveVertical(1);
         //circle7.moveVertical(1);
         //circle8.moveVertical(1);
         //circle9.moveVertical(1);
         
         //rect2.moveVertical(1);
         //rect3.moveVertical(1);
         //rect4.moveVertical(1);
         
    
}
    }
    
    public void reset()
    {
        rect0.erase();
        rect1.erase();
        rect2.erase();
        rect4.erase();
        circle0.erase();
        circle1.erase();
        circle2.erase();
        circle3.erase();
        circle4.erase();
        circle5.erase();
        circle6.erase();
        circle7.erase();
        circle8.erase();
        circle9.erase();
        rect3.erase();
        rect6.erase();
        draw();
    }


}
