import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular extends Actor
{
    int score = 0;
    
    public void act()
    {
        getWorld().showText("Score = "+score, 50, 20);
        
        if(Greenfoot.isKeyDown("up")){
            move(2);
        }
        if(Greenfoot.isKeyDown("down")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        
        if(isTouching(Katak.class)){
            eat();
        }
    }
    
    private void eat(){
        removeTouching(Katak.class);
          score++;
    }
    
}
