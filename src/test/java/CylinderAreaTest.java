import org.junit.Assert;
import org.junit.Test;

public class CylinderAreaTest {
    @Test
    public void cylinderAreaTest(){
        Cylinder cylinder=new Cylinder(6,3);
        Assert.assertEquals(56,cylinder.area(),1);
    }
}
