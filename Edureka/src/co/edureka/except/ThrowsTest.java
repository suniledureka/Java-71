package co.edureka.except;
class Sunil{
 public void loginLogic() throws InterruptedException
 {
	 System.out.println("Logging in");
 }
}

public class ThrowsTest {
	public static void main(String[] args) throws Exception
	{
		Sunil obj = new Sunil();
		//try {
			obj.loginLogic();
		//}catch(Exception ex) {}
	}
}
