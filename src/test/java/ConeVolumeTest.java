import org.junit.Assert;
import org.junit.Test;

public class ConeVolumeTest {
    @Test
    public void coneVolumeTest(){
        Cone cone=new Cone(5,3);
        Assert.assertEquals(47,cone.volume(),0.5);
    }
}
