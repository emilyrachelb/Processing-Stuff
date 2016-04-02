import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class dankestMemeEver extends PApplet {

//Import sound libraries



//Create photo elements
PImage triangle;
PImage triangle2;
PImage spaceweed1;
PImage spaceweed2;
PImage spaceweed3;
PImage spaceweed4;
PImage mlg;
PImage doritos;
PImage[] animation;


Minim minim;
AudioPlayer player;
AudioInput input;

float triangleCounter = 0.0f; //Triangle photo rotation speed
float mlgCounter = 0.0f; //MLG Logo photo rotation speed
float programTimer = 2020;

public void setup() {
  
  frameRate(420);

  minim = new Minim(this);

  player = minim.loadFile("X-Files TRAP REMIX.mp3");
  
  PFont meme;
  meme = loadFont("memefont.vlw");
  textFont(meme, 48);
  
  //Load photo elements
  triangle = loadImage("triangles.png");
  triangle2 = loadImage("triangles.png");
  spaceweed1 = loadImage("spaceweed.png");
  spaceweed2 = loadImage("spaceweed.png");
  spaceweed3 = loadImage("spaceweed.png");
  spaceweed4 = loadImage("spaceweed.png");
  //mlg = loadImage("mlg.png");
  //doritos = loadImage("doritos.png");
}


public void draw() {
  float randomColourR = random(0, 255);
  float randomColourG = random(0, 255);
  float randomColourB = random(0, 255); 
  
  background(randomColourR, randomColourG, randomColourB);

  player.play();
  programTimer = programTimer - 1;
  print(programTimer);

  triangleCounter = triangleCounter + 60;
  mlgCounter = mlgCounter + 35;

  text("ted cruz is the zodiac killer", 350, 250);
  text("ted cruz ate my son", 400, 350);
  text("blaze weed m9", 450, 450);
  imageMode(CORNER);

  imageMode(CENTER);
  /*pushMatrix();
  translate(125, 105);
  rotate(mlgCounter * PI / 360);
  image(mlg, 0, 0);
  popMatrix();

  pushMatrix();
  translate(1125, 105);
  rotate(mlgCounter * PI / 360);
  image(doritos, 0, 0, 167, 241.5);
  popMatrix();
*/
  pushMatrix();
  translate(10, 350);
  rotate(triangleCounter*PI/360);
  image(triangle, 0, 0);
  popMatrix();
  
  pushMatrix();
  translate(1270, 350);
  rotate(triangleCounter*PI/360);
  image(triangle2, 0, 0);
  popMatrix();
  
  pushMatrix();
  translate(1270, 50);
  rotate(triangleCounter*PI/360);
  image(spaceweed1, 0, 0);
  popMatrix();
  
  pushMatrix();
  translate(1270, 550);
  rotate(triangleCounter*PI/360);
  image(spaceweed1, 0, 0);
  popMatrix();
  
  pushMatrix();
  translate(10, 50);
  rotate(triangleCounter*PI/360);
  image(spaceweed1, 0, 0);
  popMatrix();
  
  pushMatrix();
  translate(10, 550);
  rotate(triangleCounter*PI/360);
  image(spaceweed1, 0, 0);
  popMatrix();
  
  if (programTimer <= 0) {
    noLoop();
    exit();
  }
}

public void stop() {
  minim.stop();
  super.stop();
  exit();
  super.exit();
}
  public void settings() {  size(1280, 700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "dankestMemeEver" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
