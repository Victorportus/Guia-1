import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    int speed = 2;
    int length;
    StreetWorld myWorld;
    
    class Direction {
        public static final int UP = 270;
        public static final int DOWN = 90;
        public static final int LEFT = 180;
        public static final int RIGHT = 0;
    }
    
    public Carro(){
        length = getImage().getWidth();
    }
    
    public void addedToWorld(World w){
      myWorld = (StreetWorld)w;  
    } 
    
    public void recogerBebe(){
        Actor t = getOneIntersectingObject(bebe.class);
        if (t!=null){
            myWorld.removeObject(t);
            myWorld.addScore(1);
        }
    }
    
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            setRotation(Direction.UP);
            moveCarro();
        } else if(Greenfoot.isKeyDown("down")){
            setRotation(Direction.DOWN);
            moveCarro();
        } else if(Greenfoot.isKeyDown("left")){
            setRotation(Direction.LEFT);
            moveCarro();
        } else if(Greenfoot.isKeyDown("right")){
            setRotation(Direction.RIGHT);
            moveCarro();
        }
        recogerBebe();
    }    
    
    private void moveCarro(){
        int currentX = getX();
        int currentY = getY();
        int direction = getRotation();
        int changeX = getChangeX(direction);
        int changeY = getChangeY(direction);
        int adjustChangeX = adjustOfOffset(changeX);
        int adjustChangeY = adjustOfOffset(changeY);
        Actor edificio = getOneObjectAtOffset(adjustChangeX, adjustChangeY, Edificio.class);
        if(edificio == null){
            setLocation(currentX + changeX,currentY + changeY);
        }

    }
    
    private int getChangeX(int direction){
        if(direction == Direction.RIGHT){
            return speed;
        }
        if(direction ==Direction.LEFT){
            return -speed;
        }
        return 0;
    }
    
    private int getChangeY(int direction){
        if(direction == Direction.DOWN){
            return speed;
        }
        if(direction ==Direction.UP){
            return -speed;
        }
        return 0;
    }
    
    private int adjustOfOffset(int offset){
        int signOfOffset = (int)Math.signum(offset);
        int distanceToFront = length/2;
        int adjustAmount = distanceToFront * signOfOffset;
        return offset + adjustAmount;
    }
}
 






