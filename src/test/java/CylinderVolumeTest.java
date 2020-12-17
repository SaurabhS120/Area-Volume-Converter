import org.junit.Assert;
import org.junit.Test;

public class CylinderVolumeTest {
    @Test
    public void cylinderVolumeTest(){
        Cylinder cylinder=new Cylinder(7,2);
        Assert.assertEquals(113,cylinder.volume(),0.5);
    }
}
