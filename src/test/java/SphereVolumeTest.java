import org.junit.Assert;
import org.junit.Test;

public class SphereVolumeTest {
    @Test
    public void sphereVolumeTest(){
        Sphere sphere=new Sphere(15);
        Assert.assertEquals(14130.0,sphere.volume(),1);
    }
}
