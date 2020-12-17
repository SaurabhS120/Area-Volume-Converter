import org.junit.Assert;
import org.junit.Test;

public class CubeAreaTest {
    @Test
    public void cubeAreaTest(){
        Cube cube=new Cube(16);
        Assert.assertEquals(1536,cube.area(),1);
    }
}
