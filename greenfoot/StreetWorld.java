import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StreetWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StreetWorld extends World
{
    String[] textMap = {
        "****************",
        "*.*    ****** .*",
        "* * **.*.   * **",
        "*     ***** *  *",
        "** ******** ** *",
        "*  .*.         *",
        "* * * ******** *",
        "* * * *.*   ** *",
        "* *   *   *  . *",
        "* * ******* ****",
        "* *    *.*  * .*",
        "* **** * * ** **",
        "* *.   *    * **",
        "* *******.*.   *",
        "*      C******.*",
        "****************"
    };
    
    TablaDePuntaje sb;
    /**
     * Constructor for objects of class StreetWorld.
     * 
     */
    public StreetWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 860, 1); 
        GreenfootImage bgImage = new GreenfootImage(1,1);
        bgImage.setColor(Color.GRAY);
        bgImage.drawRect(0, 0, 1, 1);
        setBackground(bgImage);
        prepare();
        drawMap();
        sb = new TablaDePuntaje();
        addObject(sb, getWidth()/2,830);
    }

    public void addScore(int amount){
        sb.addScore(amount);
    }
    
    public void act(){
        if(getObjects(bebe.class).isEmpty()){
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
    
    private void drawMap(){
        for(int i = 0; i < textMap.length;i++){
            String mapLine = textMap[i];
            for(int j = 0; j < mapLine.length(); j++){
                char mapChar= mapLine.charAt(j);
                int y = i * 50 + 25;
                int x = j * 50 + 25;
                switch(mapChar){
                    case '*':
                        addObject(new Edificio(), x, y);
                        break;
                    case '.':
                        addObject(new bebe(), x, y);
                        break;
                    case 'C':
                        addObject(new Carro(), x, y);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
