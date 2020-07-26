
package TTD_and_JUNIT_Task;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Junit_Testing {
	Junit_class obj=new Junit_class();
	@Test
	public void test() {
		assertEquals(obj.Remove("ABCDD"),"BCDD");
		assertEquals(obj.Remove("AAACD"),"ACD");
		assertEquals(obj.Remove("BACDD"),"BCDD");
		assertEquals(obj.Remove("BBAA"),"BBAA");
                assertEquals(obj.Remove("AAB"),"B");
	    assertEquals(obj.Remove("AABAA"),"BAA");
	}
}
