
package ab.demo;

        import java.awt.Point;
        import java.awt.Rectangle;
        import java.awt.image.BufferedImage;
        import java.util.ArrayList;
        import java.util.LinkedHashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.Random;

        import ab.demo.other.ActionRobot;
        import ab.demo.other.Shot;
        import ab.planner.TrajectoryPlanner;
        import ab.utils.StateUtil;
        import ab.vision.ABObject;
        import ab.vision.ABShape;
        import ab.vision.ABType;
        import ab.vision.GameStateExtractor.GameState;
        import ab.vision.Vision;

public class BlocksDetails {
    private ActionRobot aRobot;

    public void Structure()
    {
        BufferedImage screenshot = ActionRobot.doScreenShot();
        Vision vision = new Vision(screenshot);
        List<ABObject> pigs = vision.findPigsMBR();
        List<ABObject> blocks = vision.findBlocksMBR();
        List<ABObject> Blocks_shape = vision.findBlocksRealShape();
        List<ABObject> h6ills = vision.findHills();
        ABObject type;
        ABShape circle=ABShape.Circle;
        ABShape tri=ABShape.Triangle;
        ABShape rect=ABShape.Rect;
        ABShape poly=ABShape.Poly;

        for(int i=0;i<blocks.size();i++) {
            type=new ABObject(blocks.get(i));
            System.out.println(blocks.get(i) + " block " +i+" type "+type.getType()+" shape "+blocks.get(i).shape);
        }
    }


}
