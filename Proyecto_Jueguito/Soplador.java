import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soplador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soplador extends Actor
{
    /**
     * Act - do whatever the Soplador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Soplador(int cantidad){
        setRotation(cantidad);
    }
    
     public void act()
     {
         if(Greenfoot.isKeyDown("right")){
         setLocation(getX()+5, getY());
         }
         if(Greenfoot.isKeyDown("left")){
         setLocation(getX()-5, getY());
     }
     if(Greenfoot.isKeyDown("up")){
         setLocation(getY()-5, getX());
         }
         if(Greenfoot.isKeyDown("down")){
        setLocation(getY()+5, getX());
        }
}
}
