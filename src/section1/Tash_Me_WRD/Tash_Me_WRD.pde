PImage mustache;
PImage friend;
void setup(){
  friend = loadImage("Friend.jpg");
  mustache = loadImage("Mustache.jpg")  
  size(800,800);


friend.resize(width,height);



}
void draw(){
  background(friend);
}