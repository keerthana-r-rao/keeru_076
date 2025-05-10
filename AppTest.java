package keerthana_076;
import org.testing.Assert;
import org.testing.annotations.Test;

import keerthana.App;

public class AppTest {
	public void testlogin() {
		App myapp=new App();
		Assert.assertEquals(0, myapp.userlogin("abc","abc123"));
	}
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(1,myapp.userlogin("abc","abc@123"));
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                    