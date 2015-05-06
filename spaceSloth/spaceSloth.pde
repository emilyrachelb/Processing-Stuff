import ddf.minim.*;
PImage img;
Minim minim;
AudioPlayer player;
AudioInput input;

void start() {
size(552, 704);
rectMode(CENTER);
frameRate(60);

boolean isPlaying;
isPlaying = false;

minim = new Minim(this);
player = minim.loadFile("2001spaceodysseytrap.mp3");
img = loadImage("spacesloth.jpg");
}

void draw() {
  player.play();
  image(img, 0, 0);
  delay(60);
}

void stop() {
  if (player.isPlaying()==false) {
    player.rewind();
    player.play();
  } else {
    player.play();
  }
}


