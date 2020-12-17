import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void circleTest(){
        Circle circle=new Circle(5);
        System.out.println(circle.area());
        Assert.assertEquals(78.5,circle.area(),0.5);
    }
}
