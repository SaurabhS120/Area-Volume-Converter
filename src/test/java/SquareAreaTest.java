import org.junit.Assert;
import org.junit.Test;

public class SquareAreaTest {
    @Test
    public void sphereAreaTest(){
        Square square=new Square(6,7);
        Assert.assertEquals(42,square.area(),1);
    }
}
