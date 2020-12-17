import org.junit.Assert;
import org.junit.Test;

public class CubeVolumeTest {
    @Test
    public void cubeVolumeTest(){
        Cube cube=new Cube(12);
        Assert.assertEquals(1728,cube.volume(),1);
    }
}
