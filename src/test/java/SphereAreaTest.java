import org.junit.Assert;
import org.junit.Test;

public class SphereAreaTest {
    @Test
    public void sphereTest(){
        Sphere sphere=new Sphere(9);
        Assert.assertEquals(1017.36,sphere.area(),0.5);
    }
}
