import org.junit.Assert;
import org.junit.Test;

public class EllipseAreaTest {
    @Test
    public void ellipseAreaTest(){
        Ellipse ellipse=new Ellipse(8,3);
        Assert.assertEquals(18.8,ellipse.area(),0.5);
    }
}
