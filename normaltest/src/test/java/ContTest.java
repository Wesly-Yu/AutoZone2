import com.wesly.jacoco.Count;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContTest {
    @Test
    public void  testAdd(){
        Count count = new Count();
        int result = count.add(2,10);
        assertEquals(result,12);
    }

}
