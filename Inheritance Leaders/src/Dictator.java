
public class Dictator extends Authoritarian
	{
		protected String country; 
		public Dictator()
		{ 
			name = "Michael"; 
			age = 56;
			country = "United States"; 
		}
		
		
		
		

	@Override
	public void serve()
		{
			System.out.println("I am serving as a Dictator! I am " + age + ". The country that I am ruling is " + country);
		 	
		}
	
	public void Dictate()
	{ 
		System.out.println("I use my power to DICTATE!");
	}
	}
