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

public class illuminatiMindcontrol extends PApplet {



PImage img;

Minim minim;
AudioPlayer player;
AudioInput input;

public void setup() {
  size(1280, 800);
  rectMode(CENTER);
  frameRate(60);

  minim = new Minim(this);
  player = minim.loadFile("X-Files TRAP REMIX.mp3");

  img = loadImage("triangles.png");
}

public void draw() {
  float randomColourRed = random(0, 255);
  float randomColourBlue = random(0, 255);
  float randomColourGreen = random(0, 255);

  background(randomColourRed, randomColourBlue, randomColourGreen);

  player.play();
  //imageMode(CENTER);
  image(img, 500, 250);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--hide-stop", "illuminatiMindcontrol" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
