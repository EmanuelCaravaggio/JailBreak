/*
Jail Break
Emanuel Caravaggio
June 17 2022

the program runs a choose your own adventure game, where the player
will attempt to escape a prison before they run out of lives


*/
import java.awt.*;
import hsa.Console;

public class CulminatingJailBreak
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//colours and fonts
	Font title = new Font ("STENCIL", Font.PLAIN, 100);
	Font introFont = new Font ("STENCIL", Font.PLAIN, 25);
	Font goal = new Font ("STENCIL", Font.BOLD, 80);
	Font goal2 = new Font ("STENCIL", Font.PLAIN, 25);
	Font text = new Font ("STENCIL", Font.PLAIN, 20);
	Font loss = new Font ("STENCIL", Font.PLAIN, 40);


	Color co1 = new Color (152, 157, 163); //prison wall
	Color co2 = new Color (117, 122, 128); //wall break
	Color co3 = new Color (151, 175, 204); //sky
	Color co4 = new Color (189, 114, 17); //text colour
	Color co5 = new Color (207, 198, 165); // hallway/room floor
	Color co6 = new Color (102, 119, 128); //door
	Color co7 = new Color (179, 190, 196); //door window
	Color co8 = new Color (227, 224, 216); //washing machine
	Color co9 = new Color (196, 193, 185);  //washing machine
	Color co10 = new Color (114, 150, 60); //arrows
	Color co11 = new Color (76, 100, 112); // water
	Color co12 = new Color (79, 87, 94); //darker wall lines
	Color co13 = new Color (245, 234, 120);  //lock
	Color co14 = new Color (232, 70, 86); //heart
	Color co15 = new Color (71, 74, 79); //bed frame
	Color co16 = new Color (112, 138, 94); //grass
	Color co17 = new Color (25, 77, 26); //bush
	Color co18 = new Color (209, 191, 117); //rope
	Color co19 = new Color (176, 147, 90); //board
	Color co20 = new Color (214, 200, 69); //keys
	Color co22 = new Color (150, 8, 8); //loss background



	//main variables
	int lives = 3;
	char intro;
	char rules;
	int roll;
	int choice1;
	int choice2;
	int choice3;
	int choice4;
	int choice5;
	int choice6;
	int choice7;
	int choice8;
	int choice9;
	int choice10;




	//intro
	cell ();

	//text for intro
	c.setColor (co4);
	c.setFont (title);
	c.drawString ("JailBreak", 50, 250);
	c.drawRect (40, 120, 560, 200);

	c.setFont (introFont);

	c.setColor (co2);
	c.drawString ("Press any key to Start", 170, 450);
	delay (100);
	c.setColor (co4);
	c.drawString ("Press any key to Start", 170, 450);

	intro = c.getChar ();

	c.clear ();

	//rules
	c.setFont (goal);
	c.setColor (co1);
	c.fillRect (0, 0, 640, 500);

	c.setColor (co2);
	c.fillOval (10, 10, 30, 30);

	c.fillOval (10, 460, 30, 30);

	c.fillOval (600, 10, 30, 30);
	c.fillOval (600, 460, 30, 30);

	c.drawRoundRect (40, 40, 560, 420, 10, 10);

	c.setColor (co4);
	c.drawString ("YOUR GOAL", 70, 150);
	c.drawString ("-------------------", 70, 200);
	c.setFont (goal2);
	c.drawString ("enter 1 or 2 when propted to", 50, 230);
	c.drawString ("make choices that will help you ", 50, 270);
	c.drawString ("to successfully escape the prison. ", 50, 310);
	c.drawString ("you will only have 3 lives,", 50, 350);
	c.drawString ("use them wisely.", 50, 390);

	c.setFont (text);
	c.drawString ("Press any key to Continue", 50, 430);
	rules = c.getChar ();
	c.clear ();

	while (lives > 0)
	{


	    //START OF GAME
	    cell ();
	    textbox ();

	    //first choice
	    c.setFont (text);
	    c.drawString ("You wake up with a mysterious package left for you.", 10, 425);
	    c.drawString ("Your look inside and it is _____", 10, 450);
	    c.drawString ("1. a Screwdriver    2. a Filer", 10, 475);

	    do
	    {
		c.setCursor (-10, -10);
		choice1 = c.readInt ();
	    }
	    while (choice1 != 1 && choice1 != 2);

	    //first choice outcomes
	    if (choice1 == 1)
	    {

		//vent scene
		c.setColor (co1);
		c.fillRect (0, 0, 640, 500);

		c.setColor (co2);
		c.fillOval (10, 10, 30, 30);

		c.fillOval (10, 460, 30, 30);

		c.fillOval (600, 10, 30, 30);
		c.fillOval (600, 460, 30, 30);

		c.setColor (Color.black);
		c.fillRoundRect (40, 40, 560, 420, 10, 10);
		c.setColor (co2);
		c.drawRoundRect (40, 40, 560, 420, 10, 10);
		int vent = 45;
		while (vent < 600)
		{
		    c.fillRect (vent, 45, 10, 445);
		    vent += 15;
		}

		//text
		textbox ();
		c.drawString ("using the screwdriver to open the vent,", 10, 425);
		c.drawString ("you head into it, escaping your cell", 10, 450);
		delay (4000);

		c.clear ();


		//vent graphics
		c.setColor (co1);
		c.fillRect (0, 0, 640, 500);
		c.setColor (co2);
		c.fillRect (200, 200, 240, 100);


		int[] ventLine1 = {5, 0, 200, 205};
		int[] ventLine2 = {0, 5, 205, 200};
		c.fillPolygon (ventLine1, ventLine2, 4);

		int[] ventLine3 = {635, 640, 440, 435};
		int[] ventLine4 = {0, 5, 205, 200};
		c.fillPolygon (ventLine3, ventLine4, 4);

		int[] ventLine5 = {0, 5, 205, 200};
		int[] ventLine6 = {495, 500, 300, 295};
		c.fillPolygon (ventLine5, ventLine6, 4);

		int[] ventLine7 = {635, 640, 440, 435};
		int[] ventLine8 = {500, 495, 295, 300};
		c.fillPolygon (ventLine7, ventLine8, 4);

		//ADD GRATE


		//vent choice/text

		textbox ();
		c.drawString ("While in the vent you find 2 ways to go. ", 10, 425);
		c.drawString ("do you ___", 10, 450);
		c.drawString ("1. Go down the hatch    2. Continue Straight", 10, 475);

		// choice 2
		do
		{
		    c.setCursor (-10, -10);
		    choice2 = c.readInt ();
		}
		while (choice2 != 1 && choice2 != 2);

		//vent choice outcomes
		if (choice2 == 1)
		{
		    c.clear ();

		    c.setColor (co5);
		    c.fillRect (0, 300, 640, 200);
		    c.setColor (co1);
		    c.fillRect (0, 0, 640, 300);
		    c.setColor (co2);
		    c.fillRect (0, 200, 640, 100);

		    //doors
		    c.fillRect (110, 100, 110, 100);
		    c.fillRect (410, 100, 110, 100);
		    c.setColor (co6);
		    c.fillRect (120, 110, 90, 190);
		    c.fillRect (420, 110, 90, 190);
		    c.setColor (co7);
		    c.fillRect (130, 120, 70, 50);
		    c.fillRect (430, 120, 70, 50);
		    //hallway text
		    textbox ();
		    c.drawString ("you fall down into a hallway with two doors", 10, 425);
		    c.drawString (" at the end of it. do you ____", 10, 450);
		    c.drawString ("1. Go into the laundry room    2. go into the boiler room", 10, 475);

		    // choice 3
		    do
		    {
			c.setCursor (-10, -10);
			choice3 = c.readInt ();
		    }
		    while (choice3 != 1 && choice3 != 2);

		    //hallway outcomes
		    if (choice3 == 1)
		    {
			room ();

			c.setColor (co8);
			c.fillRect (100, 200, 150, 150);
			c.setColor (co2);
			c.fillOval (120, 220, 110, 110);
			c.setColor (co9);
			c.fillRect (100, 180, 150, 20);


			//pile of clothes
			c.setColor (co4);
			c.fillOval (400, 170, 100, 100);
			c.fillOval (350, 200, 100, 100);
			c.fillOval (450, 200, 100, 100);
			c.fillOval (325, 220, 100, 100);
			c.fillOval (455, 230, 100, 120);
			c.fillRect (335, 260, 230, 90);
			c.fillOval (315, 250, 100, 100);
			c.fillOval (495, 250, 100, 100);
			c.fillArc (290, 300, 200, 100, 0, 180);
			c.fillArc (430, 250, 200, 200, 0, 180);


			//text for laundry

			textbox ();

			c.drawString ("When you enter the room you here footsteps", 10, 425);
			c.drawString ("coming towards you.", 10, 450);

			delay (10000);

			textbox ();

			c.drawString ("you quickly hide somewhere", 10, 425);
			c.drawString ("to avaoid being caught. do you ____", 10, 450);
			c.drawString ("1. hide in the machine    2. hide the basket of clothes", 10, 475);

			// choice 4

			do
			{
			    c.setCursor (-10, -10);
			    choice4 = c.readInt ();
			}
			while (choice4 != 1 && choice4 != 2);

			if (choice4 == 2)
			{
			    //clothes graphics
			    c.setColor (co10);
			    c.fillRect (450, 20, 40, 80);
			    int[] arrowx = {420, 470, 520};
			    int[] arrowy = {100, 150, 100};
			    c.fillPolygon (arrowx, arrowy, 3);

			    //clothes text
			    textbox ();
			    c.drawString ("luckily, you make it into the pile just in time", 10, 425);
			    c.drawString ("while hiding out, you notice a grate leading to the", 10, 450);
			    c.drawString ("sewers. once the coast is clear you head into the sewers", 10, 475);

			    delay (10000);
			    c.clear ();

			    //sewers graphics
			    c.setColor (co1);
			    c.fillRect (0, 0, 640, 300);
			    c.fillRect (0, 300, 300, 200);
			    c.fillRect (470, 300, 170, 200);

			    c.setColor (co2);

			    int[] wallLine3 = {0, 5, 310, 305};
			    int[] wallLine4 = {470, 470, 200, 200};
			    c.fillPolygon (wallLine3, wallLine4, 4);

			    int[] wallLine5 = {330, 335, 435, 430};
			    int[] wallLine6 = {200, 200, 255, 255};
			    c.fillPolygon (wallLine5, wallLine6, 4);

			    c.fillRect (430, 250, 210, 5);
			    c.setColor (co12);
			    c.fillRect (305, 0, 5, 200);
			    c.fillRect (330, 0, 5, 200);

			    c.setColor (co2);
			    c.fillRect (430, 0, 5, 250);
			    c.fillRect (310, 0, 20, 200);

			    c.setColor (co11);
			    int[] waterx = {50, 310, 330, 590};
			    int[] watery = {500, 200, 200, 500};
			    c.fillPolygon (waterx, watery, 4);

			    c.fillRect (330, 300, 310, 100);

			    //sewer text
			    textbox ();

			    c.drawString ("while in the sewers you come to a", 10, 425);
			    c.drawString ("split in the path. do you ____", 10, 450);
			    c.drawString ("1. Go left    2. go straight", 10, 475);

			    //choice5
			    do
			    {
				c.setCursor (-10, -10);
				choice5 = c.readInt ();
			    }
			    while (choice5 != 1 && choice5 != 2);

			    if (choice5 == 2)

				{
				    //out of sewer text
				    textbox ();
				    c.drawString ("you head straight. you have been", 10, 425);
				    c.drawString ("walking for some time when get taken by", 10, 450);
				    c.drawString ("the sewers current!", 10, 475);

				    delay (10000); //alter
				    c.clear ();
				    //out of sewer graphics

				    c.setColor (co3);
				    c.fillRect (0, 0, 640, 200);
				    c.setColor (co1);
				    c.fillRect (0, 200, 640, 200);
				    c.setColor (co2);
				    c.drawRect (0, 200, 640, 200);
				    c.setColor (co11);
				    c.fillRect (0, 400, 640, 100);

				    c.setColor (co1);
				    c.fillRect (100, 40, 150, 160);
				    c.setColor (co2);
				    c.drawRect (100, 40, 150, 160);

				    farWindows (60);
				    farWindows (100);
				    farWindows (140);
				    farWindows (180);

				    c.fillOval (400, 250, 75, 75);
				    c.setColor (Color.black);
				    c.fillOval (415, 265, 45, 45);

				    c.setColor (co11);
				    c.fillRect (415, 300, 45, 200);


				    //win1 text
				    c.setColor (co2);
				    c.fillRoundRect (0, 5, 640, 100, 10, 10);
				    c.setColor (Color.white);
				    c.drawRoundRect (0, 5, 640, 100, 10, 10);

				    c.drawString ("you regain your stability and look around and find ", 10, 30);
				    c.drawString ("youself in a lake. you turn around and see the prison", 10, 60);
				    c.drawString ("behind you. you did it you escaped!!", 10, 90);

				    delay (10000);

				    win ();

				    delay (10000);
				    break;


				}
			    else
			    {
				//to the left text
				textbox ();
				c.drawString ("you head left. you have been", 10, 425);
				c.drawString ("walking for some time when get taken by", 10, 450);
				c.drawString ("the sewers current!", 10, 475);

				delay (10000); //loss1 text
				textbox ();
				c.drawString ("the current takes you to a pool of water under ground", 10, 425);
				c.drawString ("you look around and quickly realize your in an aligator pit!", 10, 450);
				c.drawString ("you look around for an escape but their isn't one", 10, 475);
				delay (10000);

				//loss Graphics
				loss ();
				c.drawString ("you were aligator food", 60, 400);

				c.setFont (text);
				lives--;
				c.drawString ("you have " + lives + " lives left", 200, 480);

				delay (10000);
				continue;

			    }


			}

			else
			{
			    //washing machine

			    c.setColor (co10);
			    c.fillRect (150, 20, 40, 80);
			    int[] arrowx = {120, 170, 220};
			    int[] arrowy = {100, 150, 100};
			    c.fillPolygon (arrowx, arrowy, 3);

			    textbox ();
			    c.drawString ("luckily, you make it into the machine just in time. the", 10, 425);
			    c.drawString ("the footsteps become louder and are now inside the room.", 10, 450);

			    delay (10000);
			    c.drawString (" you stay as quite as possible when suddenly the", 10, 425);
			    c.drawString ("washing machine starts!", 10, 450);
			    delay (10000);


			    c.setColor (co8);
			    c.fillRect (100, 200, 150, 150);
			    c.setColor (co2);
			    c.fillOval (120, 220, 110, 110);
			    c.setColor (co9);
			    c.fillRect (100, 180, 150, 20);

			    c.setColor (co11);
			    c.fillArc (120, 220, 110, 110, 180, 180);

			    delay (10000);

			    c.fillArc (120, 220, 110, 110, 0, 180);

			    delay (10000);

			    //loss Graphics

			    loss ();
			    c.drawString ("you drowed in the", 120, 400);
			    c.drawString ("washine machine", 120, 450);

			    c.setFont (text);
			    lives--;

			    c.drawString ("you have " + lives + " lives left", 200, 480);
			    delay (10000);
			    continue;



			}

		    }
		    else
		    {
			//boiler room
			room ();

			//boiler graphics
			c.setColor (co1);
			c.fillRect (550, 175, 20, 100);


			c.setColor (co2);

			c.fillRect (300, 250, 300, 100);
			c.fillOval (295, 250, 10, 100);
			c.fillOval (595, 250, 10, 100);

			c.fillRect (450, 170, 50, 50);

			c.setColor (Color.red);
			c.fillOval (460, 180, 30, 30);

			c.setColor (co2);



			c.fillRect (110, 150, 110, 200);

			c.setColor (co6);
			c.fillRect (120, 160, 90, 190);
			c.setColor (co7);
			c.fillRect (130, 170, 70, 50);



			//boiler room text
			textbox ();
			c.drawString ("When you enter the boiler room you here footsteps", 10, 425);
			c.drawString ("coming towards you.", 10, 450);

			delay (10000); //alter

			textbox ();
			c.drawString ("you look anround for a place to hide but cannot find any", 10, 425);
			c.drawString ("what you do find is a secret door and a big red button.", 10, 450);

			delay (10000); //alter


			textbox ();
			c.drawString ("do you _____", 10, 425);
			c.drawString ("1. hit the button    2. go through the door", 10, 450);


			//choice 6
			do
			{
			    c.setCursor (-10, -10);
			    choice6 = c.readInt ();
			}
			while (choice6 != 1 && choice6 != 2);

			if (choice6 == 1)
			{
			    loss ();

			    c.drawString ("you got blown to bits", 80, 400);
			    c.setFont (text);
			    c.drawString ("you have " + lives + " lives left", 200, 480);
			    delay (10000);
			    continue;

			}
			else
			{

			    //random chance to win
			    roll = (int) (Math.random () * 6) + 1;

			    if (roll > 3)
			    {

				textbox ();
				c.drawString ("you go through the door and to your suprise", 10, 425);
				c.drawString ("it leads you outside of the prison!!", 10, 450);

				delay (10000);

				win ();

				delay (10000);
				break;



			    }
			    else
			    {

				textbox ();
				c.drawString ("you go through the door and to your suprise", 10, 425);
				c.drawString ("it leads to an endless void ", 10, 450);

				delay (10000);


				loss ();

				c.drawString ("the door led to your doom", 40, 400);

				c.setFont (text);
				lives--;

				c.drawString ("you have " + lives + " lives left", 200, 480);

				delay (10000);
				continue;

			    }

			}

		    }
		}
		else
		{

		    //text keep in the vents
		    textbox ();
		    c.drawString ("you continue going straight through when", 10, 425);
		    c.drawString ("suddenly the you fall through the vent onto the floor", 10, 450);

		    delay (10000);

		    c.setColor (co5);
		    c.fillRect (0, 250, 640, 250);
		    c.setColor (co2);
		    c.fillRect (0, 0, 640, 250);

		    c.setColor (co1);
		    int[] hallx = {0, 150, 100, 0};
		    int[] hally = {300, 300, 500, 500};
		    c.fillPolygon (hallx, hally, 4);
		    c.fillRect (0, 0, 150, 300);


		    int[] hallx2 = {640, 490, 530, 640};
		    int[] hally2 = {300, 300, 500, 500};
		    c.fillPolygon (hallx2, hally2, 4);
		    c.fillRect (490, 0, 150, 300);

		    textbox ();
		    c.drawString ("you fall into a hallway that is turning right and left", 10, 425);
		    c.drawString ("before you get do you ____", 10, 450);
		    c.drawString ("1.turn to the right    2. turn to the left ", 10, 475);

		    do
		    {
			c.setCursor (-10, -10);
			choice7 = c.readInt ();
		    }
		    while (choice7 != 1 && choice7 != 2);

		    if (choice7 == 2)
		    {

			//hall graphics
			hallway ();

			c.setColor (co3);
			c.fillOval (260, 150, 110, 200);
			c.setColor (Color.black);
			c.fillOval (270, 160, 90, 180);





			textbox ();

			c.drawString ("you go down the left hallway when suddenly a", 10, 425);
			c.drawString ("portal opens up in front of you. intrigued, you", 10, 450);
			c.drawString ("walk into it", 10, 475);

			delay (10000);


			//random win/loss
			roll = (int) (Math.random () * 6) + 1;
			if (roll == 6)
			{
			    textbox ();
			    c.drawString ("when you walked through the portal you", 10, 425);
			    c.drawString ("were knocked unconscious. when you wake up", 10, 450);
			    c.drawString ("you are safely far away from the jail!", 10, 475);
			    win ();
			    delay (10000);
			    break;
			}
			else
			{
			    textbox ();
			    c.drawString ("when you walked through the portal you", 10, 425);
			    c.drawString ("were knocked unconscious. when you wake up", 10, 450);
			    c.drawString ("you are back in a new cell", 10, 475);

			    delay (10000);

			    loss ();
			    c.setFont (text);
			    c.drawString ("", 40, 400);

			    lives--;
			    c.drawString ("you have " + lives + " lives left", 200, 480);


			    delay (10000);
			    continue;
			}

		    }
		    else
		    {

			//hall graphics
			hallway ();



			textbox ();
			c.drawString ("you go down the right corridor", 10, 425);
			c.drawString ("just when you think the coast is clear", 10, 450);
			c.drawString ("a guard comes out of nowhere, detaining you", 10, 475);

			delay (10000);


			loss ();

			c.drawString ("the guards caught", 100, 400);
			c.drawString ("you lacking", 180, 450);

			c.setFont (text);
			lives--;

			c.drawString ("you have " + lives + " lives left", 200, 480);

			delay (10000);
			continue;

		    }
		}
	    }
	    else
	    {
		//filer way graphics
		c.clear ();

		c.setColor (co1);
		c.fillRect (0, 0, 640, 500);

		c.setColor (co3);
		c.fillRect (100, 50, 450, 350);

		c.setColor (co2);

		int bars1 = 110;
		while (bars1 < 550)
		{
		    c.fillRect (bars1, 50, 15, 350);
		    bars1 += 65;
		}


		//filer text
		textbox ();
		c.drawString ("using the filer you break down the bars on the window", 10, 425);
		c.drawString ("just enough for you to slip through.", 10, 450);
		c.drawString ("you plan to free fall of the window to make your escape", 10, 475);

		delay (10000);

		c.clear ();

		c.setColor (co16);
		c.fillRect (0, 0, 320, 500);

		c.setColor (co1);
		c.fillRect (320, 0, 320, 500);

		c.setColor (Color.white);
		c.fillRect (360, 100, 10, 300);
		c.fillRect (590, 100, 10, 300);

		c.fillRect (360, 245, 240, 10);
		c.fillOval (455, 225, 50, 50);
		c.fillArc (375, 300, 210, 210, 0, 180);
		c.fillArc (375, 0, 210, 210, 180, 180);

		c.setColor (co1);
		c.fillOval (460, 230, 40, 40);
		c.fillArc (385, 310, 190, 200, 0, 180);
		c.fillArc (385, 0, 190, 200, 180, 180);

		c.setColor (Color.white);

		c.fillRect (360, 100, 240, 10);
		c.fillRect (360, 400, 240, 10);

		//text
		textbox ();
		c.drawString ("as you fall out the window you look for a safe", 10, 425);
		c.drawString ("place to land. you notice two spots, do you ____", 10, 450);
		c.drawString ("1.land in the yard    2.land on the concrete", 10, 475);

		do
		{
		    c.setCursor (-10, -10);
		    choice8 = c.readInt ();
		}
		while (choice8 != 1 && choice8 != 2);

		if (choice8 == 1)
		{

		    c.clear ();
		    //yard graphics
		    c.setColor (co16);
		    c.fillRect (0, 300, 640, 200);

		    c.setColor (co3);
		    c.fillRect (0, 0, 640, 300);

		    c.setColor (co1);

		    c.fillRect (0, 200, 640, 100);

		    c.fillRect (0, 150, 50, 50);
		    c.fillRect (280, 150, 70, 50);
		    c.fillRect (610, 150, 50, 50);


		    c.setColor (co17);
		    c.fillOval (-50, 400, 300, 300);
		    c.fillOval (50, 350, 200, 200);
		    c.fillOval (100, 375, 300, 250);
		    c.fillOval (150, 425, 200, 200);
		    c.fillOval (200, 350, 100, 300);
		    c.fillOval (250, 400, 300, 300);
		    c.fillOval (300, 350, 200, 200);
		    c.fillOval (350, 375, 300, 250);
		    c.fillOval (400, 425, 200, 200);
		    c.fillOval (450, 350, 100, 300);



		    //yard text
		    textbox ();

		    c.drawString ("you safely land in the yard, using a bush", 10, 425);
		    c.drawString ("to break your fall. suprisingly inside the bush you", 10, 450);
		    c.drawString ("find a rope hidden inside of it!", 10, 475);


		    delay (10000);

		    //rope graphic
		    c.clear ();
		    c.setColor (co3);
		    c.fillRect (0, 0, 640, 200);


		    c.setColor (co1);
		    c.fillRect (0, 200, 640, 275);

		    c.fillRect (0, 100, 100, 100);

		    c.setColor (co2);
		    c.fillRect (5, 395, 60, 85);

		    c.setColor (co6);
		    c.fillRect (10, 400, 50, 75);

		    c.setColor (co7);
		    c.fillRect (15, 410, 40, 20);

		    c.setColor (co16);
		    c.fillRect (0, 475, 640, 25);

		    delay (10000);

		    c.setColor (co18);
		    c.fillRect (350, 200, 5, 275);


		    textbox ();

		    c.drawString ("using the rope you scale the wall. when you get to the top", 10, 425);
		    c.drawString ("a guard spots you, do you ____", 10, 450);
		    c.drawString ("1.fight the guard    2.run away", 10, 475);

		    do
		    {
			c.setCursor (-10, -10);
			choice9 = c.readInt ();
		    }
		    while (choice9 != 1 && choice9 != 2);

		    if (choice9 == 1)
		    {
			textbox ();
			c.drawString ("you try to take on the guard", 10, 425);
			c.drawString ("unfortunatley you forgot guards carry tasers", 10, 450);

			delay (10000);

			loss ();

			c.drawString ("you took on a guard", 100, 400);
			c.drawString ("and failed", 200, 450);

			c.setFont (text);
			lives--;

			c.drawString ("you have " + lives + " lives left", 200, 480);

			delay (10000);
			continue;


		    }
		    else
		    {
			//run away graphics
			c.clear ();
			c.setColor (co3);
			c.fillRect (0, 0, 640, 300);

			c.setColor (co16);
			c.fillRect (0, 300, 640, 200);

			c.setColor (co1);

			int[] onWallx = {0, 0, 400, 350, 300};
			int[] onWally = {400, 500, 500, 200, 200};

			c.fillPolygon (onWallx, onWally, 5);

			c.fillRect (350, 200, 290, 100);


			c.setColor (co2);
			c.fillRect (390, 250, 250, 100);

			c.setColor (co2);
			c.fillArc (390, 200, 260, 100, 0, 180);

			c.setColor (co11);
			c.fillRect (410, 270, 210, 80);

			c.setColor (Color.black);
			c.fillRect (410, 330, 210, 20);

			c.drawLine (410, 280, 620, 280);
			c.drawLine (410, 300, 620, 300);
			c.drawLine (410, 320, 620, 320);

			//run away text
			textbox ();
			c.drawString ("you run away from the guard as fast as you can", 10, 425);
			c.drawString ("in the distance you see the garage and start to make", 10, 450);
			c.drawString ("your ways towards it.", 10, 475);

			delay (10000); //alter

			c.clear ();

			//garage grahics
			c.setColor (co2);
			c.fillRect (0, 0, 640, 500);

			c.setColor (co19);
			c.fillRect (50, 50, 540, 400);

			c.setColor (co18);
			c.fillRect (100, 100, 440, 300);

			c.setColor (co2);
			c.drawOval (220, 130, 30, 30);
			c.drawOval (470, 230, 30, 30);

			nails (120);
			nails (220);
			nails (320);



			c.setColor (co20);
			c.fillOval (220, 150, 30, 30);
			c.fillRect (230, 170, 10, 40);
			c.fillRect (240, 190, 10, 5);
			c.fillRect (240, 200, 10, 5);

			c.fillOval (470, 250, 30, 30);
			c.fillRect (480, 270, 10, 40);
			c.fillRect (490, 290, 10, 5);
			c.fillRect (490, 300, 10, 5);


			//garage text
			textbox ();
			c.drawString ("in the garage cars and planes are parked. to ensure your", 10, 425);
			c.drawString ("escape you grab a pair of keys as fast as you can do you ____", 10, 450);
			c.drawString ("1. grab car keys    2. grab plane keys", 10, 475);

			do
			{
			    c.setCursor (-10, -10);
			    choice10 = c.readInt ();
			}
			while (choice10 != 1 && choice10 != 2);

			if (choice10 == 1)
			{


			    //text
			    textbox ();
			    c.drawString ("you grab the car keys and burst out of the garage.", 10, 425);
			    c.drawString ("you make your way to the door, just before", 10, 450);
			    c.drawString ("the guards can close it you make your escape!", 10, 475);

			    delay (10000);


			    win ();

			    delay (10000);
			    break;

			}


			else
			{


			    //loss text
			    c.drawString ("you grab the plane keys and burst out of the garage.", 10, 425);
			    c.drawString ("you make your way up and over the wall.", 10, 450);
			    c.drawString ("before you can get far the guards shoot you down", 10, 475);

			    delay (10000);

			    loss ();

			    c.drawString ("your plane got blown up", 60, 400);

			    c.setFont (text);
			    lives--;

			    c.drawString ("you have " + lives + " lives left", 200, 480);

			    delay (10000);
			    continue;

			}
		    }

		}
		else
		{
		    //loss text
		    textbox ();
		    c.drawString ("you land on the concrete shattering every", 10, 425);
		    c.drawString ("bone in your body", 10, 450);

		    delay (10000);


		    loss ();

		    c.drawString ("you splat on the concrete", 40, 400);

		    c.setFont (text);
		    lives--;

		    c.drawString ("you have " + lives + " lives left", 200, 480);

		    delay (10000);
		    continue;

		}

	    }




	}

	if (lives == 0)
	{

	    c.clear ();


	    c.setColor (co22);
	    c.fillRect (0, 0, 640, 500);

	    c.setColor (co14);

	    //heart 1

	    int[] heartx2 = {10, 210, 110};
	    int[] hearty2 = {200, 200, 350};
	    c.fillPolygon (heartx2, hearty2, 3);
	    c.fillOval (10, 145, 105, 90);
	    c.fillOval (105, 145, 105, 90);

	    //heart 2

	    int[] heartx = {220, 420, 320};
	    int[] hearty = {200, 200, 350};
	    c.fillPolygon (heartx, hearty, 3);
	    c.fillOval (220, 145, 105, 90);
	    c.fillOval (315, 145, 105, 90);

	    //heart 3

	    int[] heartx3 = {430, 640, 550};
	    int[] hearty3 = {200, 200, 350};
	    c.fillPolygon (heartx3, hearty3, 3);
	    c.fillOval (430, 145, 105, 90);
	    c.fillOval (530, 145, 110, 95);


	    //heart 1

	    c.setColor (Color.black);

	    int[] Xx1 = {200, 220, 450, 430};
	    int[] Xy1 = {330, 330, 150, 150};

	    c.fillPolygon (Xx1, Xy1, 4);

	    int[] Xx2 = {200, 220, 450, 430};
	    int[] Xy2 = {150, 150, 330, 330};

	    c.fillPolygon (Xx2, Xy2, 4);

	    //heart 2

	    int[] Xx3 = {0, 20, 220, 200};
	    int[] Xy3 = {330, 330, 150, 150};

	    c.fillPolygon (Xx3, Xy3, 4);

	    int[] Xx4 = {0, 20, 220, 200};
	    int[] Xy4 = {150, 150, 330, 330};

	    c.fillPolygon (Xx4, Xy4, 4);

	    //heart 3

	    int[] Xx5 = {430, 450, 670, 650};
	    int[] Xy5 = {330, 330, 150, 150};

	    c.fillPolygon (Xx5, Xy5, 4);

	    int[] Xx6 = {430, 450, 670, 650};
	    int[] Xy6 = {150, 150, 330, 330};

	    c.fillPolygon (Xx6, Xy6, 4);

	    c.setFont (goal);

	    c.drawString ("you lost", 120, 450);





	}



	// Place your program here.  'c' is the output console
    } // main method


    public static void delay (int millisecs)  // Delay Method
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}


	catch (InterruptedException e)
	{
	}
    }


    public static void cell ()
    {

	//fonts and colours
	Color co1 = new Color (152, 157, 163); //prison wall
	Color co2 = new Color (117, 122, 128); //wall break
	Color co3 = new Color (151, 175, 204); //sky
	Color co4 = new Color (219, 161, 44); //text colour
	Color co15 = new Color (71, 74, 79); //bed frame


	//room
	c.setColor (co1);
	c.fillRect (0, 0, 640, 500);

	c.setColor (co2);
	c.fillRect (0, 300, 500, 4);
	c.fillRect (495, 0, 5, 300);
	int[] wallLine1 = {495, 500, 640, 635};
	int[] wallLine2 = {300, 300, 500, 500};
	c.fillPolygon (wallLine1, wallLine2, 4);

	//windows
	c.setColor (co3);
	c.fillRect (75, 130, 110, 60);
	c.fillRect (270, 130, 110, 60);
	c.setColor (co2);
	c.drawRect (75, 130, 110, 60);
	c.drawRect (270, 130, 110, 60);

	//bars
	int bars1 = 80;
	while (bars1 < 180)
	{
	    c.fillRect (bars1, 130, 5, 60);
	    bars1 += 15;
	}


	int bars2 = 275;
	while (bars2 < 375)
	{
	    c.fillRect (bars2, 130, 5, 60);
	    bars2 += 15;
	}


	//BED
	c.setColor (co2);
	int[] bedx = {395, 500, 640, 495};
	int[] bedy = {290, 290, 480, 480};
	c.fillPolygon (bedx, bedy, 4);

	c.setColor (Color.white);
	int[] pillowx = {405, 500, 540, 435};
	int[] pillowy = {295, 295, 350, 350};
	c.fillPolygon (pillowx, pillowy, 4);

	c.setColor (co15);
	c.fillRect (495, 480, 145, 20);

	int[] framex = {395, 395, 495, 495};
	int[] framey = {290, 310, 500, 480};

	c.fillPolygon (framex, framey, 4);


	//VENT

	c.setColor (co2);
	int[] ventx = {20, 80, 100, 40};
	int[] venty = {310, 310, 340, 340};

	c.fillPolygon (ventx, venty, 4);

	c.setColor (co15);




    }


    public static void textbox ()
    {
	Color co2 = new Color (117, 122, 128); //wall break

	c.setColor (co2);
	c.fillRoundRect (0, 395, 640, 100, 10, 10);
	c.setColor (Color.white);
	c.drawRoundRect (0, 395, 640, 100, 10, 10);


    }


    public static void room ()
    {


	Color co1 = new Color (152, 157, 163); //prison wall
	Color co5 = new Color (207, 198, 165); // hallway/room floor


	c.setColor (co5);
	c.fillRect (0, 350, 640, 150);
	c.setColor (co1);
	c.fillRect (0, 0, 640, 350);

    }


    public static void win ()
    {
	Color co13 = new Color (235, 191, 47);  //win lock
	Font win = new Font ("STENCIL", Font.PLAIN, 50);
	Color co14 = new Color (219, 161, 44); //star
	Color co1 = new Color (152, 157, 163); //prison wall
	Color co2 = new Color (117, 122, 128); //wall break
	Color co21 = new Color (240, 229, 105); // win background



	//win grahics
	c.clear ();


	c.setColor (co21);
	c.fillRect (0, 0, 640, 500);


	c.setColor (co2);
	c.fillOval (240, 80, 170, 200);

	c.setColor (co21);
	c.fillOval (255, 90, 140, 180);
	c.fillOval (200, 100, 80, 100);


	c.setColor (co13);
	c.fillRect (230, 190, 190, 200);



	c.setFont (win);

	c.setColor (co14);
	c.drawString ("Congratulations", 100, 100);
	c.drawString ("you escaped the prison", 10, 410);

    }


    public static void loss ()
    {


	//loss graphis
	Color co14 = new Color (232, 70, 86); //heart
	Color co1 = new Color (152, 157, 163); //prison wall
	Color co22 = new Color (150, 8, 8); //loss background
	Font loss = new Font ("STENCIL", Font.PLAIN, 40);




	c.clear ();


	c.setColor (co22);
	c.fillRect (0, 0, 640, 500);

	c.setColor (co14);

	int[] heartx = {230, 430, 330};
	int[] hearty = {200, 200, 350};
	c.fillPolygon (heartx, hearty, 3);
	c.fillOval (230, 145, 105, 90);
	c.fillOval (325, 145, 105, 90);


	c.setColor (Color.black);

	int[] Xx1 = {200, 220, 450, 430};
	int[] Xy1 = {330, 330, 150, 150};

	c.fillPolygon (Xx1, Xy1, 4);

	int[] Xx2 = {200, 220, 450, 430};
	int[] Xy2 = {150, 150, 330, 330};

	c.fillPolygon (Xx2, Xy2, 4);

	c.setFont (loss);
    }


    public static void farWindows (int x)
    {
	for (int i = 110 ; i < 260 ; i += 30)
	{
	    c.fillRect (i, x, 10, 10);
	}
    }


    public static void nails (int x)
    {
	Color co1 = new Color (152, 157, 163); //prison wall

	for (int b = 150 ; b < 520 ; b += 80)
	{
	    c.setColor (co1);
	    c.fillOval (b, x, 20, 20);
	}
    }


    public static void hallway ()
    {
	Color co1 = new Color (152, 157, 163); //prison wall
	Color co2 = new Color (117, 122, 128); //wall break
	Color co5 = new Color (207, 198, 165); // hallway/room floor
	Color co12 = new Color (79, 87, 94); //darker wall lines


	c.setColor (co1);
	c.fillRect (0, 0, 640, 500);

	c.setColor (co2);

	int[] wallLine3 = {0, 5, 310, 305};
	int[] wallLine4 = {500, 500, 200, 200};
	c.fillPolygon (wallLine3, wallLine4, 4);

	int[] wallLine5 = {330, 335, 640, 635};
	int[] wallLine6 = {200, 200, 500, 500};
	c.fillPolygon (wallLine5, wallLine6, 4);

	c.setColor (co5);

	int[] waterx = {5, 310, 330, 635};
	int[] watery = {500, 200, 200, 500};
	c.fillPolygon (waterx, watery, 4);


	c.setColor (co12);
	c.fillRect (305, 0, 5, 200);
	c.fillRect (330, 0, 5, 200);

	c.setColor (co2);
	c.fillRect (310, 0, 20, 200);

    }
} // CulminatingJailBreak class


