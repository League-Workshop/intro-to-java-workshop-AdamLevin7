

void setup() {
  size(600,600);
}

void draw() {
  ellipse(300,300,300,300);
  if(mousePressed) {
    fill(255,0,255);
  } else  {
    fill(0,255,0);      
  }
}
