import org.junit.Assert;
import org.junit.Test;

public class SphereVolume {
    @Test
    public void sphereVolumeTest(){
        Sphere sphere=new Sphere(15);
        System.out.println(sphere.volume());
        Assert.assertEquals(14130.0,sphere.volume(),1);
    }
}
