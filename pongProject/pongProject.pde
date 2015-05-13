import ddf.minim.*;

Minim minim;
AudioPlayer player;
AudioInput input;

//Variables for Y1 and Y2 positions for Paddle 1 and Paddle 2
int y1Paddle1;
int y2Paddle1;
int y1Paddle2;
int y2Paddle2;

int y1RemotePaddle;
int y2RemotePaddle;

//Variables for both paddles
float pongX1 = random(50, 150);
float pongY1 = random(50, 150);
float pongX2 = 2;
float pongY2 = 2;

float pongBX1 = random(-1, 1); //Variable for changes in quadrants for pong ball
float pongBY1 = 1;
float pongBX2 = 1;
float pongBY2 = 1;

//Variables for player scores
int p1ScoreFinal = 0;
int p2ScoreFinal = 0;

void setup() {
  size(800, 500);
  background(0);
  
  if (pongBX1 == 0) {
    pongBX1 = 1;
  }
}

