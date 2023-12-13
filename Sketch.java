import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Declare Variables
  PImage imgTurtleDance1;
  PImage imgTurtleDance2;
  boolean rPressed = false;
  boolean gPressed = false;
  boolean bPressed = false;
  boolean wPressed = false;
  String strMessage = "";

  public void settings() {
    // Size Call
    size(1200, 720);
  }

  public void setup() {
    // Initial Background
    background(148, 148, 148);

    // Import Drawings into Variables

    imgTurtleDance1 = loadImage("turtle-dance-pos-1.png");
    imgTurtleDance2 = loadImage("turtle-dance-pos-2.png");

    imgTurtleDance1.resize(width / 3, height / 3);
    imgTurtleDance2.resize(width / 3, height / 3);

  }

  public void draw() {
    // Background Colour Based on Keys Pressed & Released
    if (rPressed == true) {
      background(212, 25, 35);
    } else if (gPressed == true) {
      background(27, 143, 37);
    } else if (bPressed == true) {
      background(46, 74, 125);
    } else if (wPressed == true) {
      background(255, 255, 255);
    } else {
      background(148, 148, 148);
    }

    // Draw the turtles
	  if (mousePressed == true) {
      image(imgTurtleDance1, mouseX - 200, mouseY - 100);

    } else if (mousePressed == false) {
      image(imgTurtleDance2, mouseX - 200, mouseY - 100);
    }
  }

  // Checks if the specified keys are pressed
  public void keyPressed() {
    if (keyCode == 82) {
      rPressed = true;
    } else if (keyCode == 71) {
      gPressed = true;
    } else if (keyCode == 66) {
      bPressed = true;
    } else if (keyCode == 87) {
      wPressed = true;
    }
  }
  
  // Creates many other turtles if the mouse is dragged
  public void mouseDragged() {
    image(imgTurtleDance1, mouseX + 1000, mouseY - 100);
    image(imgTurtleDance1, mouseX + 800, mouseY - 100);
    image(imgTurtleDance1, mouseX + 600, mouseY - 100);
    image(imgTurtleDance1, mouseX + 400, mouseY - 100);
    image(imgTurtleDance1, mouseX + 200, mouseY - 100);
    image(imgTurtleDance1, mouseX, mouseY - 100);
    image(imgTurtleDance1, mouseX - 400, mouseY - 100);
    image(imgTurtleDance1, mouseX - 600, mouseY - 100);
    image(imgTurtleDance1, mouseX - 800, mouseY - 100);
    image(imgTurtleDance1, mouseX - 1000, mouseY - 100);
  }

  // Checks if the specified keys are released
  public void keyReleased() {
    if (keyCode == 82) {
      rPressed = false;
    } else if (keyCode == 71) {
      gPressed = false;
    } else if (keyCode == 66) {
      bPressed = false;
    } else if (keyCode == 87) {
      wPressed = false;
    }
  }
  
  // Keeps track of keys pressed for user history
  public void keyTyped() {
    strMessage += key;
    System.out.println(strMessage);
    strMessage = "";
  }
}