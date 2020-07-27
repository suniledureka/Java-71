class StaticTest
{
  static {
	  System.out.println("Static block - 1");
  }
  public static void main(String[] args)
  {
	  System.out.println("In MAIN Method");
  }
  
  static {
	  System.out.println("Static black - 2");
  }
}