abstract class Figure
{
    abstract void draw();
    abstract void erase();
}

class Circle extends Figure
{
    void draw()
    {
       System.out.println("Drawing Circle"); 
    }
    
    void erase()
    {
    
      System.out.println("Erasing Circle");
    }
}

class Rectangle extends Figure
{
    void draw()
    {
       System.out.println("Drawing Rectangle"); 
    }
    
    void erase()
    {
    
      System.out.println("Erasing Rectangle");
    }
}

class Square extends Figure
{
    void draw()
    {
       System.out.println("Drawing Square"); 
    }
    
    void erase()
    {
    
      System.out.println("Erasing Square");
    }
}

class Demo
{
   public static void main(String []args)
   {
      Figure ref;
      Circle ob1 = new Circle();
      ref = ob1;
      ref.draw();
      ref.erase();
      
      Rectangle ob2 = new Rectangle();
      ref = ob2;
      ref.draw();
      ref.erase();
      
      Square ob3 = new Square();
      ref = ob3;
      ref.draw();
      ref.erase();
   }
}
