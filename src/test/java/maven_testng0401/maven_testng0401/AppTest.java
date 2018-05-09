package maven_testng0401.maven_testng0401;
import org.testng.annotations.Test;
import org.apache.commons.codec.digest.DigestUtils; 


public class AppTest {
	@Test
	public void Test() {
		
		
		String str = "000000";  ///
		  
		String sign = DigestUtils.md5Hex(str);  
		
		System.out.println("============************>>>>>>TEST----"+sign);
		String sign_ = sign.toLowerCase(); 
		System.out.println("============************>>>>>>TEST----"+sign_);
		
		String sign_str =  DigestUtils.md5Hex(sign_); 
		System.out.println("============************>>>>>>TEST----"+sign_str);
		
		
		//System.out.println("============************>>>>>>TEST");
	}
}
