import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import gifAnimation.*; 
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

//Import sound and animation libraries



//Create photo elements
PImage triangle;
PImage mlg;
PImage doritos;
PImage[] animation;

Gif gif;
Minim minim;
AudioPlayer player;
AudioInput input;

float triangleCounter = 0.0f; //Triangle photo rotation speed
float mlgCounter = 0.0f; //MLG Logo photo rotation speed
float programTimer = 2020;

public void setup() {
  size(1280, 700);
  frameRate(60);

  minim = new Minim(this);

  player = minim.loadFile("X-Files TRAP REMIX.mp3");

  //Load photo elements
  triangle = loadImage("triangles.png");
  mlg = loadImage("mlg.png");
  doritos = loadImage("doritos.png");

  //Load Snoop Dogg GIF
  gif = new Gif(this, "smoke weed everyday.gif");
  gif.loop();
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

  imageMode(CORNER);
  image(gif, 920, 450);

  imageMode(CENTER);
  pushMatrix();
  translate(125, 105);
  rotate(mlgCounter * PI / 360);
  image(mlg, 0, 0);
  popMatrix();

  pushMatrix();
  translate(1125, 105);
  rotate(mlgCounter * PI / 360);
  image(doritos, 0, 0, 167, 241.5f);
  popMatrix();

  pushMatrix();
  translate(640, 350);
  rotate(triangleCounter*PI/360);
  image(triangle, 0, 0);
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

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "dankestMemeEver" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
