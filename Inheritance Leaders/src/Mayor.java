
public class Mayor extends PublicServant
	{
		
		public Mayor()
		{ 
			name = "Bill"; 
			age = 43; 
			salary = 400; 
			
		}
		
		

		@Override
		public void serve()
			{
				System.out.println("I am serving as the Mayor of my city and I am " + age);
			}
		
		public void runCity()
		   { 
			System.out.println("I am running my city, yay!");
		   }
		
		
		
		
		

	}
