
public class GovernmentLeaderDriver
	{

		public static void main(String[] args)
			{
				
				GovernmentLeader [] leaders = new GovernmentLeader[2];
				
				leaders[0] = new Mayor(); 
				leaders[1] = new President(); 
				
				for(GovernmentLeader g: leaders)
					{
						g.lead(); 
						g.campaign(); 
						g.serve();
						
						System.out.println();
						
					}
				
			}

	}
