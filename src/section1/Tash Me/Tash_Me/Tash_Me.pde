PImage mustache;
PImage person;
void setup() {
  person = loadImage("person.jpg");
  size(800, 400);
  person.resize(width,height);
  mustache = loadImage("mustache.jpg");
}

void draw() {
  background(person);
  image(mustache, 400, 200);
}
