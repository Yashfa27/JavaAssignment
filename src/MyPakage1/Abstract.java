package MyPakage1;
//2. Write a Java class Shape that has an abstract method area(),
// and a concrete subclass Rectangle that extends Shape. The Rectangle class should have a
// constructor to initialize its width and height and should override the area() method
// to return the area of the rectangle.


abstract class shape{
    float width;
    float height;

  abstract float area();
}

class rectangle extends shape{
    @Override
     float area(){
        System.out.println("width :" + width);
        System.out.println("height " + height);
        System.out.println("Area of rectangle is:" + width*height);
        return width*height;
    }
    rectangle(float width, float height){
        this.width=width;
        this.height=height;
    }

}
public class Abstract {
    public static void main(String[] args) {
    shape shapeobj=new rectangle(10.5f,20.7f);
    shapeobj.area();

    }
}
