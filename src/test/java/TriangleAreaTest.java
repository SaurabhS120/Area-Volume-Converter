import org.junit.Assert;
import org.junit.Test;

public class TriangleAreaTest {
    @Test
    public void triangleArea(){
        Triangle triangle=new Triangle(3,4);
        Assert.assertEquals(6,triangle.area(),1);
    }
}
