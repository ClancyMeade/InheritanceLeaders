
public class GovernmentLeaderDriver
	{

		public static void main(String[] args)
			{
				
				GovernmentLeader [] leaders = new GovernmentLeader[3];
				
				leaders[0] = new Mayor(); 
				leaders[1] = new President(); 
				leaders[2] = new Dictator(); 
				
				for(GovernmentLeader g: leaders)
					{
						g.lead(); 
						g.campaign(); 
						g.serve();
					
						
						
						System.out.println();
						
					}
				
				Mayor[] mayors = new Mayor[1]; 
				mayors[0] = new Mayor(); 
				
				for(Mayor m : mayors)
					{ 
						System.out.println("I am a mayor "); 
						  m.runCity(); 
					}
				
			}

	}
