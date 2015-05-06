int numFrames = 58;
int currentFrame = 0;
PImage[] images = new PImage [numFrames];

void setup() {
  size(120, 300);
  frameRate(24);
  
  for (int i = 0; i < numFrames; i++) {
    String imageName = "PT_anim" + nf(i, 4) + ".gif";
    images[i] = loadImage("smoke weed everyday.gif");
  }
}

void draw () {
  background(255);
  currentFrame = (currentFrame+1) % numFrames;
  int offset = 0;
  for (int x = -100; x < width; x += images[0].width) {
    image(images[(currentFrame + offset) % numFrames], x, -20);
    offset += 2;
    image(images[(currentFrame + offset) % numFrames], x, height/2);
  }
}
