
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Methods d = new Methods();
		String name = d.getData();
		System.out.println(name);
		
		//Method in Another class  & calling or executing here
		Methods2 d1 = new Methods2();
		d1.getUserData();
		
		
		//Static method calling
		getData2();
		
		
		//INSIDE the MAIN , we cannt create METHODS
		
		
	}

	
	//Why method 
	//MEthod with object creation model
	public String getData()
	{
		System.out.println("hello world");
		return "rahul shetty academy";
		
		
	}
	
	//MEthod with Static model
	
	
	public static String getData2()
	{
		System.out.println("hello world");
		return "rahul shetty academy";
		
		
	}
	
}
