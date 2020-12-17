import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(
                CircleTest.class,
                CubeAreaTest.class,
                CubeVolumeTest.class,
                SphereAreaTest.class,
                SphereVolumeTest.class,
                SquareAreaTest.class,
                ConeAreaTest.class,
                ConeVolumeTest.class,
                CylinderAreaTest.class,
                CylinderVolumeTest.class,
                EllipseAreaTest.class,
                EquilateralTriangleAreaTest.class,
                TriangleAreaTest.class
                );
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Success : "+result.wasSuccessful());
    }
}
