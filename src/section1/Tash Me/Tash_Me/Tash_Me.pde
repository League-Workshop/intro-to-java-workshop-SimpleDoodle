PImage mustache;
PImage friend;
void setup(){
friend=loadImage ("friend.jpg");
mustache=loadImage("stache.png");
size(800, 600);
friend.resize(width,height);


}
void draw(){
 background(friend);
 

  
  if(mousePressed){
image(mustache, mouseX, mouseY);
}
  
}
