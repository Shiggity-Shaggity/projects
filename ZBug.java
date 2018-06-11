import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
public class ZBug extends Bug{
    private int lengthyboi;
    private int movers;
    private int path;

    public ZBug(int length){
        setDirection(Location.EAST);
        movers = 0;
        path = 1;
        lengthyboi = length;
    }
    public void act(){
        if(path<=3&&movers<lengthyboi){
            if (canMove()){
                move();
                movers++;
            }
        }
        else if(path == 1){
            setDirection(Location.SOUTHWEST);
            movers = 0;
            path++;
        }
        else if(path == 2){
            setDirection(Location.EAST);
            movers = 0;
            path++;
        }

    }
}
