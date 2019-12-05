
public abstract class GovernmentLeader
	{
		protected String name;
		protected int age;

		public abstract void serve(); 
		
		public abstract void lead();

		public void campaign()
			{
				System.out.println(name + " is campaigning for political leadership.");
			}

	}
