import java.util.*;
import java.io.*;

public class Main
{
  public static void main (String[]args)
  {
	int play = 1;
	while(play ==1) {
    Random rand = new Random ();
    Scanner input = new Scanner (System.in);
    int pH = 0; //score for player
    int dH = 0;
    int ac = 0; //card count
    int tw = 0;
    int th = 0;
    int fo = 0;
    int fi = 0;
    int si = 0;
    int se = 0;
    int ei = 0;
    int ni = 0;
    int te = 0; //counts face cards separately thus ensuring that the deck is dealt with realistic odds.
    int ja = 0;
    int qu = 0;
    int ki = 0;
    int temp = 0; //card dealt
    int plAce = 0; //ace high in hand so that player can't bust on ace
    int dlAce = 0;
    for (int i = 0; i < 2; i++) //initial deal 2 cards 
      {
	temp = rand.nextInt (13) + 1;
	switch (temp)
	  {
	  case 1:
	    ac++;//adds to the card count when a card is dealt. 
	    if (plAce == 0) //if 2 aces are dealt, the second ace becomes a 1 so that the hand doesn't bust on initial deal
	      {
		pH += 11;
		plAce++; //ace high count when given 11
	      }
	    else
	      {
		pH++;
	      }
	    break;
	  case 2:
	    tw++;
	    pH += 2;
	    break;
	  case 3:
	    th++;
	    pH += 3;
	    break;
	  case 4:
	    fo++;
	    pH += 4;
	    break;
	  case 5:
	    fi++;
	    pH += 5;
	    break;
	  case 6:
	    si++;
	    pH += 6;
	    break;
	  case 7:
	    se++;
	    pH += 7;
	    break;
	  case 8:
	    ei++;
	    pH += 8;
	    break;
	  case 9:
	    ni++;
	    pH += 9;
	    break;
	  case 10: 
	    te++;
	    pH += 10;
	    break;
	  case 11:
	    ja++;
	    pH += 10;
	    break;
	  case 12:
	    qu++;
	    pH += 10;
	    break;
	  case 13:
	    ki++;
	    pH += 10;
	    break;
	  }
      }
    System.out.println ("You have: " + pH); //player hand announcement
    for (int i = 0; i < 2; i++) //dealer hand dealt
      {
	temp = rand.nextInt (13) + 1;
	switch (temp)
	  {
	  case 1:
	    ac++;
	    if (dlAce == 0)
	      {
		dH += 11;
		dlAce++;
	      }
	    else
	      {
		dH++;
	      }
	    break;
	  case 2:
	    tw++;
	    dH += 2;
	    break;
	  case 3:
	    th++;
	    dH += 3;
	    break;
	  case 4:
	    fo++;
	    dH += 4;
	    break;
	  case 5:
	    fi++;
	    dH += 5;
	    break;
	  case 6:
	    si++;
	    dH += 6;
	    break;
	  case 7:
	    se++;
	    dH += 7;
	    break;
	  case 8:
	    ei++;
	    dH += 8;
	    break;
	  case 9:
	    ni++;
	    dH += 9;
	    break;
	  case 10:
	    te++;
	    dH += 10;
	    break;
	  case 11:
	    ja++;
	    dH += 10;
	    break;
	  case 12:
	    qu++;
	    dH += 10;
	    break;
	  case 13:
	    ki++;
	    dH += 10;
	    break;
	  }
      }
    System.out.println ("Dealer has: " + dH); //announces dealer hand

    if (dH == 21) //win conditions
      {
	System.out.println ("BLACKJACK! Dealer wins...");
      }
    else if (pH == 21)
      {
	System.out.println ("BLACKJACK! You win!");
      }
    else
      {
	System.out.println ("Do you want to hit? 1 for yes, 2 for no");
	int hit= input.nextInt();
	for (int j = hit; j <2;) { //hit mechanic
	    for (int i = 0; i < 1;) //checks for card is dealt. 
	      {
		temp = rand.nextInt (13) + 1;

		switch (temp)
		  {
		  case 1:
		    if (ac < 4) //checks if there are aces in the deck, if not skips over and breaksto next loop
		      {
			ac++;
			if (pH < 11) 
			  {
			    pH += 11;
			    plAce++; //high ace count raised if played
			  }
			else
			  {
			    pH++; //low ace
			  }
			i++; //card count raised here, no matter what 
			System.out.println("You've been dealt an ace!");
		      }
		    break; //exit 
		  case 2:
		    if (tw < 4)
		      {
			tw++;
			pH += 2;
			i++;
			System.out.println("You've been dealt a two!");
		      }
		    break;
		  case 3:
		    if (th < 4)
		      {
			th++;
			pH += 3;
			i++;
			System.out.println("You've been dealt a three!");
		      }
		    break;
		  case 4:
		    if (fo < 4)
		      {
			fo++;
			pH += 4;
			i++;
			System.out.println("You've been dealt a four!");
		      }
		    break;
		  case 5:
		    if (fi < 4)
		      {
			fi++;
			pH += 5;
			i++;
			System.out.println("You've been dealt a five!");
		      }
		    break;
		  case 6:
		    if (si < 4)
		      {
			si++;
			pH += 6;
			i++;
			System.out.println("You've been dealt a six!");
		      }
		    break;
		  case 7:
		    if (se < 4)
		      {
			se++;
			pH += 7;
			i++;
			System.out.println("You've been dealt a seven!");
		      }
		    break;
		  case 8:
		    if (ei < 4)
		      {
			ei++;
			pH += 8;
			i++;
			System.out.println("You've been dealt an eight!");
		      }
		    break;
		  case 9:
		    if (ni < 4)
		      {
			ni++;
			pH += 9;
			i++;
			System.out.println("You've been dealt a nine!");
		      }
		    break;
		  case 10:
		    if (te < 4)
		      {
			te++;
			pH += 10;
			i++;
			System.out.println("You've been dealt a ten!");
		      }
		    break;
		  case 11:
		    if (ja < 4)
		      {
			ja++;
			pH += 10;
			i++;
			System.out.println("You've been dealt a jack!");
		      }
		    break;
		  case 12:
		    if (qu < 4)
		      {
			qu++;
			pH += 10;
			i++;
			System.out.println("You've been dealt a queen!");
		      }
		    break;
		  case 13:
		    if (ki < 4)
		      {
			ki++;
			pH += 10;
			i++;
			System.out.println("You've been dealt a king!");
		      }
		    break;
		  }

	      }
	    if (pH > 21 && plAce > 0) //checks for high aces, that way the player can't bust with an ace high
		  {
		    pH -= 10;
		    plAce--;
		  }
		System.out.println("You have: "+pH+". ");
		if (pH < 21)
		  {
		    System.out.print ("Hit again? 1 for yes, 2 for no.");
		    j = input.nextInt(); //hit check, anything <2 is another hit
		  }
		else if (pH == 21)
		  {
		    System.out.print ("You win!");
		    j = 2; //win check
		  }
		else
		  {
		    System.out.print ("You lose!");
		   j= 2;
		  }
	  }
	if(pH < 21) {
		while(dH<17 && pH >dH) { //dealer stands on 17
		for (int i = 0; i < 1;) //card dealt check
	      {
		temp = rand.nextInt (13) + 1;

		switch (temp) //same deal, but no user input
		  {
		  case 1:
		    if (ac < 4)
		      {
			ac++;
			if (dH < 11)
			  {
			    dH += 11;
			    dlAce++;
			  }
			else
			  {
			    dH++;
			  }
			System.out.println("Dealer's been dealt an ace!");
			i++;
		      }
		    break;
		  case 2:
		    if (tw < 4)
		      {
			tw++;
			dH += 2;
			i++;
			System.out.println("Dealer's been dealt a two!");
		      }
		    break;
		  case 3:
		    if (th < 4)
		      {
			th++;
			dH += 3;
			i++;
			System.out.println("Dealer's been dealt a three!");
		      }
		    break;
		  case 4:
		    if (fo < 4)
		      {
			fo++;
			dH += 4;
			i++;
			System.out.println("Dealer's been dealt a four!");
		      }
		    break;
		  case 5:
		    if (fi < 4)
		      {
			fi++;
			dH += 5;
			i++;
			System.out.println("Dealer's been dealt a five!");
		      }
		    break;
		  case 6:
		    if (si < 4)
		      {
			si++;
			dH += 6;
			i++;
			System.out.println("Dealer's been dealt a six!");
		      }
		    break;
		  case 7:
		    if (se < 4)
		      {
			se++;
			dH += 7;
			i++;
			System.out.println("Dealer's been dealt a seven!");
		      }
		    break;
		  case 8:
		    if (ei < 4)
		      {
			ei++;
			dH += 8;
			i++;
			System.out.println("Dealer's been dealt an eight!");
		      }
		    break;
		  case 9:
		    if (ni < 4)
		      {
			ni++;
			dH += 9;
			i++;
			System.out.println("Dealer's been dealt a nine!");
		      }
		    break;
		  case 10:
		    if (te < 4)
		      {
			te++;
			dH += 10;
			i++;
			System.out.println("Dealer's been dealt a ten!");
		      }
		    break;
		  case 11:
		    if (ja < 4)
		      {
			ja++;
			dH += 10;
			i++;
			System.out.println("Dealer's been dealt a jack!");
		      }
		    break;
		  case 12:
		    if (qu < 4)
		      {
			qu++;
			dH += 10;
			i++;
			System.out.println("Dealer's been dealt a queen!");
		      }
		    break;
		  case 13:
		    if (ki < 4)
		      {
			ki++;
			dH += 10;
			i++;
			System.out.println("Dealer's been dealt a king!");
		      }
		    break;
		  }

	      }
	    if (dH > 21 && dlAce > 0) //dealer ace check
		  {
		    dH -= 10;
		    dlAce--;
		  }
		System.out.println("Dealer has: "+dH);
	
      }
		
		if (pH > dH || dH >21) //second win conditions after hits have been distributed
		  {
		    System.out.print ("You win!");
		    
		  }
		else if(pH == dH) {
			System.out.print ("Push!");
		}
		else
		  {
		    System.out.print ("You lose!");
		  }
	}
    	
    	
    }
    System.out.println("\nPlay again? 1 for yes, 2 for no."); //play again starts the loop as play < 2
    play = input.nextInt();
  }
	System.exit(0); //exit
 }
}
