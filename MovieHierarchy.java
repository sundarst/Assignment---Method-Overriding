class Movie
{
	public void moviePrice()
	{
		System.out.println("Movie Ticket start with 150");
	
	}
}
class Leo extends Movie
{
    public void moviePrice()
	{
     System.out.println(" LEO Movie Ticket was 200");
	}
}
class Goat extends Movie
{
	 public void moviePrice()
	{
     System.out.println(" Got Movie Ticket was 200");
	}

}

public class MovieHierarchy
{
	public static void main(String[] args)
	{
		Movie movie=new Leo(); //ploymorphysim // Upcasting implicity
		//movie.moviePrice();
		
		Leo leo=(Leo) movie; // downcasting
		leo.moviePrice();
		
		Movie move2=new Goat();
		move2.moviePrice();
	
	}

}