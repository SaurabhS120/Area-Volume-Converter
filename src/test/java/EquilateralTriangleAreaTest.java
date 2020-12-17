import org.junit.Assert;
import org.junit.Test;

public class EquilateralTriangleAreaTest {
    @Test
    public void equilateralTriangleAreaTest(){
        EquilateralTriangle equilateralTriangle=new EquilateralTriangle(9);
        Assert.assertEquals(35,equilateralTriangle.area(),0.5);
    }
}
