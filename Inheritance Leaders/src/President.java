
public class President extends PublicServant
	{

	public President() 
	{ 
		name = "Phil"; 
		age = 43; 
		
	}
	 
	@Override
	public void serve()
		{
			System.out.println("I am serving as the President of my country and I am " + age + ". My salary is " + salary + " Dollars.");
			
		}
	
	public void veto()
	{ 
		System.out.println("VETO! I veto that!");
	}
	
	}
