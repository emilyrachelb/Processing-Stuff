import gifAnimation.*;
import ddf.minim.*;

PImage img;
PImage[] animation;

Gif loopingGif;
Minim minim;
AudioPlayer player;
AudioInput input;

float counter = 0.0;

void setup() {
  size(1280, 700);
  rectMode(CENTER);
  imageMode(CENTER);
  frameRate(120);

  minim = new Minim(this);
  player = minim.loadFile("X-Files TRAP REMIX.mp3");

  img = loadImage("triangles.png");
  loopingGif = new Gif(this, "smoke weed everyday.gif");
  loopingGif.loop();
}

void draw() {
  float randomColourRed = random(0, 255);
  float randomColourBlue = random(0, 255);
  float randomColourGreen = random(0, 255);
  counter = counter + 50;

  background(randomColourRed, randomColourBlue, randomColourGreen);

  player.play();

  image(loopingGif, 920, 650);

  translate(width/2, height/2);
  rotate(counter*PI/360);
  translate(-img.width/2, -img.height/2);
  image(img, 125.5, 125);
}

