# DT228/DT282 Object Oriented Programming 2020-2021

# Teams Links for online classes:

- [Monday Class](https://teams.microsoft.com/l/meetup-join/19%3ameeting_YjUzNjZlMDMtOTNhZi00MDYyLThkODgtNzQxYjBjZDY3YTg0%40thread.v2/0?context=%7b%22Tid%22%3a%22766317cb-e948-4e5f-8cec-dabc8e2fd5da%22%2c%22Oid%22%3a%2261aab78b-a857-4647-9668-83d4cca5de03%22%7d)
- [Wednesday Labs](https://teams.microsoft.com/l/meetup-join/19%3ameeting_OWVjNDM4NTAtOGJhOC00MjEyLTkzMTMtNzA3OTgwOGNhZTYw%40thread.v2/0?context=%7b%22Tid%22%3a%22766317cb-e948-4e5f-8cec-dabc8e2fd5da%22%2c%22Oid%22%3a%2261aab78b-a857-4647-9668-83d4cca5de03%22%7d)
- [Thursday Tutorial](https://teams.microsoft.com/l/meetup-join/19%3ameeting_MGU3Mzg3N2YtMzkxZC00OThjLWFmNjItYzVlNDZhNWY5OWY2%40thread.v2/0?context=%7b%22Tid%22%3a%22766317cb-e948-4e5f-8cec-dabc8e2fd5da%22%2c%22Oid%22%3a%2261aab78b-a857-4647-9668-83d4cca5de03%22%7d)
- [Sign in Sheet for labs](https://docs.google.com/spreadsheets/d/1dpzq-iS3DPHBin2oT_txSlmsIEVo_zs524FemMm-2vI/edit?usp=sharing)

Resources
---------
- [Install the software you will need for this module](install.md)
* [The Java Tutorial from Oracle](http://docs.oracle.com/javase/tutorial/)
* [Games Fleadh](http://www.gamesfleadh.ie/)
* [The Nature of Code](http://natureofcode.com/)
* [The git manual - read the first three chapters](http://git-scm.com/documentation)
* [A video tutorial all about git/github](https://www.youtube.com/watch?v=p_PGUltnB6w)
* [The Processing language reference](http://processing.org/reference/)

## Contact the lecturer
* Email: bryan.duggan@dit.ie
* Twitter: [@skooter500](http://twitter.com/skooter500)

# Assessments

- [Assignments](assignments.md)

- Week 11 Lab Test 20% 
- Week 12 Assignment Submission - 30%
- End of Year exam - 50%

# Previous Years Lab Tests

- https://github.com/skooter500/OOP-LabTest-2020-Starter
- https://github.com/skooter500/OOP-LabTest-2020/
- https://github.com/skooter500/OOP-Test-2019-Starter
- https://github.com/skooter500/OOP-Test-2019-Solution
- https://github.com/skooter500/OOP-2018-Lab-Test-2
- https://github.com/skooter500/OOP_Labtest1_2017_Starter
- https://github.com/skooter500/OOP-LabTest1-2016

# Week 3 - Git, the if statement and loops in Java

# Tutorial 
- [Video of the tutorial going through the lab solution](https://web.microsoftstream.com/video/3dd5eda0-e34a-4e05-b442-990a0327cc45)

# Lecture 
- [Read the git manual](https://git-scm.com/docs/user-manual.html)
- The if statement
- While loops
- For loops
- [Video of the class](https://web.microsoftstream.com/video/11af5059-42a8-4321-99f1-ac2d8f4d78e2)
- [Markdown tutorial](https://github.com/skooter500/MusicVisuals)

## Lab
### Learning outcomes
- Practice procedural drawing with loops
- Develop computational thinking skills, by making variables and constructing algorithms

Update your forks of the repo to get the code we wrote on Monday and create a branch for your work today. Don't commit onto the master branch!

Complete the procedural drawing exercises below by editing the file Loops.java. You can check the value of the "which" variable which will be in the range 0-9 and use this to determine which exercise gets drawn. There are > 12 exercises so some of the numbers will have to draw more than one exercise. 

## Procedural drawing exercises:

### if statement 

- 3 exercises. Click the image for video:

[![YouTube](http://img.youtube.com/vi/18kMOeygmHA/0.jpg)](https://www.youtube.com/watch?v=18kMOeygmHA)

### for loops:

Use a loop, rect and the HSB colour space:

![Sketch](images/p31.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p35.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p36.png)

Use a loop, ellipse, and the HSB colour space:

![Sketch](images/p34.png)

Use a loop, ellipse and the HSB color space to draw this:

![Sketch](images/p33.png)

Use a nested loop to draw this:

![Sketch](images/p32.png)

Try and draw this using ONE for loop. You will need the [text](https://processing.org/reference/text_.html) and [textAlign](https://processing.org/reference/textAlign_.html) functions:

![Sketch](images/p27.png)

Use a nested loop to draw this:

![Sketch](images/p23.png)

Use sin and cos to draw this:

![Sketch](images/p30.png)

Use line, sin and cos to draw regular polygons like squares, pentagons, octogons etc:

![Sketch](images/p10.png)

Draw a procedural star like these:

![Sketch](images/p5.png)

# Week 2 - Hello Processing

## Tutorial
- [Solution to the lab video](https://web.microsoftstream.com/video/4129e73d-ed22-498b-afcc-0d1e3c3178fb)

## Lab

## Learning Outcomes
- Practice drawing stuff and working out co-ordinates
- Practice using variables and if statements in Java

This is a video of a silly game called Bugzap made in Java using the Processing libraries. Today we can make a part of this game in order to get some practice using variables in Java. 

[![YouTube](http://img.youtube.com/vi/s6PA8jtWneQ/0.jpg)](https://www.youtube.com/watch?v=s6PA8jtWneQ)

How you should do it:

Ok let's get the main game working first and not worry about the splash screen and the game over screen

- Update your fork of the repository from the master branch. To do this, cd to the folder where you have cloned *your* repository, (or clone it somewhere if you need to) and type:

```bash
git checkout master
git pull upstream master
```

- Create a branch for your work today by typing:

```
git checkout -b lab2
```

- Create a new class called BugZap.java in the ie.tudublin folder. Make it extend ```PApplet``` and add the ```settings```, ```setup``` and ```draw``` methods. Check out HelloProcessing2.java if you need examples for these. This class also has examples of the drawing methods with comments. You can also check out the [Processing reference]() if you are unsure about any of the methods.
- Call ```size``` in ```settings``` to set the size of the drawing window. 
- Edit the file Main.java so that it starts the BugZap class instead of the HelloProcessing2 class. I'll let you figure out how to do this :-)
- Make sure everything works by compiling and running your program before continuing!

Now we can draw the bug.

- Make fields of type ```float``` in the BugZap class for ```playerX```, ```playerY``` and ```playerWidth``` and give these default values. You can decide what these should be. There are built in variables called ```width``` and ```height``` that give the width and height of the drawing window. These only get assigned after size has been called, so if you want to use these to give values to playerX, playerY etc. put the code into the *setup* method. 
- Write a method called void ```void drawPlayer(float x, float y, float w)``` that draws the player character, centered around the parameters x, y. You can use the line method to do this. You can pass variables as parameters to this method and also things like ```x + 20```, ```w * 0.5f``` etc. I made an extra variable in this method called h for the height and set it to be half the w parameter. Don't forget to set the stroke color!
- Call this method from ```draw```, passing in the parameters playerX, playerY and playerWidth.
- Compile and run everything to make sure it's working before continuing.
- If everything is working ok, you should see the bug on the screen

Now lets get the player moving in response to the keys

Add this method to BugZap.java:

```Java
public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	
```

- If you compile and run the program again you will see that some messages get printed out when you press various keys. If you are running in Visual Studio Code, you will see these messages appear in the Debug Console
- Modify this method to increment and decrement the playerX variable instead and you should be able to get the player to move left and right
- You might want to add if statements to this method to stop the player moving off the left and right side of the screens. If statements in Java are almost the same as in C!
- When the player presses SPACE you will want to draw a line for the player's laser.

The Bug

- In a similar way to how you made the player, make the Bug. Make variables and drawBug method. Don't forget to call the method from draw()
- To move the bug you can add a random amount to it's x coordinate on intervals. To generate a random number you can use the [random](https://processing.org/reference/random_.html) function.  
- One way to make stuff happen on an interval rather than every frame is to use the frameCount variable. This variable is a field in PApplet and it gets incremented automatically every time draw is called. Because draw gets called 60 times a second, you can do something every second with this code:

```Java
if ((frameCount % 60) == 0)
{
    // Do something
}
```

- You can print text to the screen using the [text](https://processing.org/reference/text_.html) function.

Ok you should now have the basics working. See if you can figure out how to check to see if the player hits the bug, add scoring, splash screen, game over screen and sound.

## Lecture
- Check out the HelloProcessing2 class in the repo
- We drew the all seeing eye using the Processing drawing methods
- if statement exercises

![](https://github.com/skooter500/GP-2016-2017/blob/master/images/p1.2.png?raw=true)


# Week 1 - Introduction

## Tutorial
- [Coding Bat](https://codingbat.com/)

## Lab
## Learning outcomes
- Set up Java, Visual studio code and the Java Extensions
- Fork the repo, configure the upstream remotes
- Write your first Java code using command line tools
- Test out Visual Studio Code

## Part 1 - Installing Java

Install the software you will need for this module and set up your path to the Java Development Kit. [This document explains how to do it](install.md).

## Part 2 - Forking the repo

Firstly fork *this* repository by clicking the fork button above, so that you get your own copy of the course repo to work on this semester. Now create a new empty folder on your computer somewhere right click on the folder and choose git bash here. Alternatively you can start the bash and cd to the new folder. To clone the repository for your fork:

```bash
git clone https://github.com/YOURGITUSERNAME/OOP-2020-2021
```

Replace YOURGITUSERNAME with your github username. You can also copy the URL to the repo from your browser and paste it into the console. To paste into the bash on Windows is right click. You can use Cmd + C, Cmd + V on the Mac.

Now cd into the repo and check the origin and upstream remotes are set up correctly

```bash
cd OOP-2020-2021
git remote -v
```

You should see something like this:

```bash
origin  https://github.com/YOURGITUSERNAME/OOP-2020-2021 (fetch)
origin  https://github.com/YOURGITUSERNAME/OOP-2020-2021 (push)
upstream  https://github.com/skooter500/OOP-2020-2021 (fetch)
upstream  https://github.com/skooter500/OOP-2020-2021 (push)
```

If you don't see the upstream remote, you can set it up by typing

```bash
git remote add upstream https://github.com/skooter500/OOP-2020-2021
```
You can read more about forking a git repository and setting up the upstream remote in [this article](https://help.github.com/en/github/getting-started-with-github/fork-a-repo)

Once the upstream is setup, you will be able to push code to your own repo and also keep it up to date with the master branch of the changes I make each class.

If you already forked the repo before the lab, you may need to update your master branch from my master branch to get the changes I made:

```bash
git fetch
git checkout master
git pull upstream master
git push
```

## Part 3 - Compiling & running Java

To compile and run the Java code in the src folder, you should type:

```bash
cd java
javac src/ie/tudublin/*.java -d bin
java -cp bin ie.tudublin.Main
```

You should see

```
Hello world
Misty
TopCat
Garfield
Garfield
```

On the terminal. If you do, then congratulations! You have successfully compiled and run your first Java program using the command line tools. Now create a branch to store your changes today. Best not to modify the master branch so you can keep it up to date with my changes:

```bash
git checkout -b lab1
```

Use an editor (like Visual Studio code or notepad++) to open up the files in the folder src/ie/tudublin and study them to see if you can figure out what's happening. Modify the code as follows:

- Make a private ```int``` field on the Cat class called numLives.
- Write public accessors for the field (see how I did this for the name field on the Animal class)
- Set the value of this field to 9 in the Cat constructor  
- Write a method (functions are called methods in Java) on the Cat class called kill. It should subtract 1 from numLives if numLives is > 0 and print the message "Ouch!". If numLives is 0, you should just print the message "Dead"
- Create a new instance of the Cat class like this

    ```Java
    Cat ginger = new Cat("Ginger");
    ```
- In the Main class in a loop, call kill on ginger until ginger is dead.
- Compile and run your program until you have no bugs and you get the desired output.

Commit and push your changes:

```bash
git add .
git commit -m "killing the cat"
git push --set-upstream origin lab1
```

The "--set-upstream origin lab1" option is only required the first time you commit onto a new branch. After that you can just type "git push"

## Part 4 - Hello Processing

Checkout the branch HelloProcessing by typing

```
git checkout HelloProcessing from the bash
```

In Visual Studio Code, choose File | Open Folder and open the OOP-2020-2021 folder. Press F5 and if all goes well, you should see something that looks like this:

![Hello Processing](images/hello.png)

If you are done check out the references for classes, packages, constructors and accessors below.

Also! [Read the first three chapters of the git manual](https://git-scm.com/docs/user-manual).

## Lecture
- [Introduction slides](https://drive.google.com/open?id=1wdMcXJzaRBCSm4Ouj4_ZjWj9Mh292fQB)
- [hello world](java/src/ie/tudublin)
- [Classes](https://docs.oracle.com/javase/tutorial/java/concepts/class.html)
- [Packages](https://docs.oracle.com/javase/tutorial/java/package/packages.html)
- [Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Accessors](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

Some assignments from previous years:

[![YouTube](http://img.youtube.com/vi/NGQbYEESZEg/0.jpg)](https://www.youtube.com/watch?v=NGQbYEESZEg&list=PL1n0B6z4e_E7I2bIWWpH8NAa6kPx95sw5)

[![YouTube](http://img.youtube.com/vi/zLXon_nlibY/0.jpg)](https://www.youtube.com/watch?v=zLXon_nlibY)

[![YouTube](http://img.youtube.com/vi/vecMCz1eB1s/0.jpg)](https://www.youtube.com/watch?v=vecMCz1eB1s)

[![YouTube](http://img.youtube.com/vi/xlEudfLH6Fg/0.jpg)](https://www.youtube.com/watch?v=xlEudfLH6Fg)

[![YouTube](http://img.youtube.com/vi/uykz5mCjV0w/0.jpg)](https://www.youtube.com/watch?v=uykz5mCjV0w)

[![YouTube](http://img.youtube.com/vi/sPjZSRCmt1U/0.jpg)](https://www.youtube.com/watch?v=sPjZSRCmt1U)