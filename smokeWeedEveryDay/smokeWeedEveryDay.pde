import gifAnimation.*;
//PImage [] allFrames = Gif.getPImages(this, "smoke weed everyday.gif");

Gif myAnimation;

void setup () {
  size(300,500);
  myAnimation = new Gif(this, "smoke weed everyday.gif");
  myAnimation.play();
}

void draw(){
  background(255);
  image(myAnimation, 150,700);
}
