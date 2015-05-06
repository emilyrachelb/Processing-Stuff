import ddf.minim.*;

PImage img;

Minim minim;
AudioPlayer player;
AudioInput input;

void setup() {
  size(1280, 800);
  rectMode(CENTER);
  frameRate(60);

  minim = new Minim(this);
  player = minim.loadFile("X-Files TRAP REMIX.mp3");

  img = loadImage("triangles.png");
}

void draw() {
  float randomColourRed = random(0, 255);
  float randomColourBlue = random(0, 255);
  float randomColourGreen = random(0, 255);

  background(randomColourRed, randomColourBlue, randomColourGreen);

  player.play();
  //imageMode(CENTER);
  image(img, 500, 250);
}

