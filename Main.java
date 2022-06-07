import java.util.*;

public class Main
{ 
  private int pH = 0;		// score for player
  private int dH = 0;
  private int cardsDealt[] = new int[13];
  private boolean plAce = false;	// ace high in hand so that player can't bust on ace
  private boolean dlAce = false;
  private Random rand = new Random ();
  private Scanner input = new Scanner (System.in);
  public int hit (int score, boolean player)
  {
    boolean hit = true;
    try{
		while (hit)
      {
	int temp = rand.nextInt (13) + 1;
	switch (temp)
	  {
	  case 1:
	    if (this.cardsDealt[0] < 4)
	      {
		this.cardsDealt[0] += 1;
		score += 11;
		if (score > 21)
		  {
		    score -= 10;
		  }
		else
		  {
		    if (player)
		      {
			this.plAce = true;
		      }
		    else
		      {
			this.dlAce = true;
		      }
		  }
		System.out.println ("Dealer has dealt an Ace");
		hit = false;
	      }
	    break;
	  case 2:
	    if (this.cardsDealt[1] < 4)
	      {
		this.cardsDealt[1] += 1;
		score += 2;
		hit = false;
		System.out.println ("Dealer has dealt a 2");
	      }
	    break;
	  case 3:
	    if (this.cardsDealt[2] < 4)
	      {
		this.cardsDealt[2] += 1;
		score += 3;
		System.out.println ("Dealer has dealt a 3");
		hit = false;
	      }
	    break;
	  case 4:
	    if (this.cardsDealt[3] < 4)
	      {
		this.cardsDealt[3] += 1;
		score += 4;
		System.out.println ("Dealer has dealt a 4");
		hit = false;
	      }
	    break;
	  case 5:
	    if (this.cardsDealt[4] < 4)
	      {
		this.cardsDealt[4] += 1;
		score += 5;
		System.out.println ("Dealer has dealt a 5");
		hit = false;
	      }
	    break;
	  case 6:
	    if (this.cardsDealt[5] < 4)
	      {
		this.cardsDealt[5] += 1;
		score += 6;
		System.out.println ("Dealer has dealt a 6");
		hit = false;
	      }
	    break;
	  case 7:
	    if (this.cardsDealt[6] < 4)
	      {
		this.cardsDealt[6] += 1;
		score += 7;
		System.out.println ("Dealer has dealt a 7");
		hit = false;
	      }
	    break;
	  case 8:
	    if (this.cardsDealt[7] < 4)
	      {
		this.cardsDealt[7] += 1;
		score += 8;
		System.out.println ("Dealer has dealt an 8");
		hit = false;
	      }
	    break;
	  case 9:
	    if (this.cardsDealt[8] < 4)
	      {
		this.cardsDealt[8] += 1;
		score += 9;
		System.out.println ("Dealer has dealt a 9");
		hit = false;
	      }
	    break;
	  case 10:
	    if (this.cardsDealt[9] < 4)
	      {
		this.cardsDealt[9] += 1;
		score += 10;
		System.out.println ("Dealer has dealt a 10");
		hit = false;
	      }
	    break;
	  case 11:
	    if (this.cardsDealt[10] < 4)
	      {
		this.cardsDealt[10] += 1;
		hit = false;
		score += 10;
		System.out.println ("Dealer has dealt a Jack");
	      }
	    break;
	  case 12:
	    if (this.cardsDealt[11] < 4)
	      {
		this.cardsDealt[11] += 1;
		hit = false;
		System.out.println ("Dealer has dealt a Queen");
		score += 10;
	      }
	    break;
	  case 13:
	    if (this.cardsDealt[12] < 4)
	      {
		this.cardsDealt[12] += 1;
		score += 10;
		System.out.println ("Dealer has dealt a King");
		hit = false;
	      }
	    break;
	  }
	  Thread.sleep(500);
      }
	}catch(InterruptedException ieException){
		ieException.printStackTrace();
	  }
    return score;
  }
  public void run ()
  {
    this.pH = hit (this.pH, true);
    this.pH = hit (this.pH, true);
    if (this.pH == 21)
      {
	System.out.println ("Blackjack! You win!");
      }
    else
      {
	boolean inv = true;
	String temp = "";
	while (inv && this.pH < 21)
	  {
	    System.out.println ("You have: " + this.pH + "."
				+ "\nWould you like to hit? (y/n)");
	    temp = input.nextLine ();
	    if (temp.equalsIgnoreCase ("Y"))
	      {
		this.pH = hit (this.pH, true);
		if (this.pH > 21 && this.plAce)
		  {
		    this.plAce = false;
		    this.pH -= 10;
		  }
	      }
	    else if (temp.equalsIgnoreCase ("N"))
	      {
		inv = false;
	      }
	    else
	      {
		System.out.println ("Invalid input!");
	      }

	  }
	if (this.pH == 21)
	  {
	    System.out.println ("You win!");
	  }
	else if (this.pH > 21)
	  {
	    System.out.println ("You lose...");
	  }
	else
	  {
	    System.out.println ("House's turn...");
	    this.dH = hit (this.dH, false);
	    this.dH = hit (this.dH, false);
	    System.out.println ("House has: " + this.dH + ".");
	    if (this.dH == 21)
	      {
		System.out.println ("Blackjack! House wins!");
	      }
	    else
	      {
		while (this.dH < 17)
		  {
		    
		    this.dH = hit (this.dH, false);
		    if (this.dH > 21 && this.dlAce)
		      {
			this.dlAce = false;
			this.dH -= 10;
		      }
		  System.out.println ("House has: " + this.dH + ".");
		  }
		  	if (this.dH > 21 || this.dH < this.pH)
		  {
		    System.out.println ("You win!");
		  }
		else if (this.dH == 21 || this.dH>this.pH)
		  {
		    System.out.println ("House wins!");
		  }
	
		  else{
		      System.out.println("Push!");
		  }
	      }
	  }

      }


  }

  public static void main (String[]args)
  {
      Scanner kB = new Scanner (System.in);
    Main main = new Main ();
    
    while(true){
    main.run ();
    System.out.println("Play again?");
    if(kB.nextLine().equalsIgnoreCase("n")){
        System.exit(0);
    }
    main = new Main();
    }

  }
}
