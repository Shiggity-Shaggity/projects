import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class SpiralBugRunner {
    public static void main(String[] args){
        UnboundedGrid grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(grid);
        SpiralBug soup = new SpiralBug(3);
        world.add(new Location(3,5),soup);
        world.show();
    }
}
