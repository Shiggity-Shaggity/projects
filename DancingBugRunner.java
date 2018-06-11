import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        int[] turns = {2,2,1,3};
        DancingBug yeep = new DancingBug(turns);
        yeep.setColor(Color.ORANGE);
        world.add(new Location(9, 9), yeep);
        world.show();
    }
} 