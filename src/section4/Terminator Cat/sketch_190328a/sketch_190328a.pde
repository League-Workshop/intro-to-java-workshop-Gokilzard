int acceleration = 5;
b=1131;
c=445;


PImage catPic;
void setup(){
  size(1920,1080);
   catPic = loadImage("cat.jpg");

                catPic.resize(width, height);

background(catPic);
}
void draw(){
if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
 fill( #6C4343 );
noStroke();
 ellipse(783,430,175,175);
 ellipse(1131,445,175,175);
}


void mousePressed(){
  1131+=2*acceleration
}