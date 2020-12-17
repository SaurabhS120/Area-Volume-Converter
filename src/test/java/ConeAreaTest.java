import org.junit.Assert;
import org.junit.Test;

public class ConeAreaTest {
    @Test
    public void coneAreaTest(){
        Cone cone=new Cone(5,2);
        Assert.assertEquals(43,cone.area(),1);
    }
}
