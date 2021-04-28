
interface Polygon //Abstraction
{
    public int area();
}
class Rectangle implements Polygon
{
    protected int length;
    protected int breadth;
    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    //Encapsulation- Getters and Setters
    public int getLength()
        {return this.length;}
    public int getBreadth()
        {return this.breadth;}
    public void setLength()
        { this.length=length;}
    public void setBreadth()
        {this.breadth=breadth;}

    public int area()
    {
        return (this.length)*(this.breadth);
    }
}

class Square implements Polygon
{   
    private int side;
    Square(int side)
    {this.side =side;}
    
    public int area()
    {
        return side*side;
    }
}

class Plot extends Rectangle //Inheritance (Single Level Inheritance)
{
    private String type;
    Plot(int l,int b,String type)
    {   super(l,b);
        this.type=type;
    }
    
    //Polymorphism - Overriding
    public int area()
    {
        return (this.length)*(this.breadth)*247;
    }
}

class costCalculator
{  
     //Polymorphism- Overloading
    public String calCost(int ar)
    {
    //dummy logic
    if(ar>1000)
        return "60L"+" Method1";
    else
        return "30L"+" Method1";
    }

    public String calCost(String type)
    {
    //dummy logic
    if(type.equals("Residential"))
        return "80L"+" Method2";
    else
        return "40L"+" Method2";
    }
}
public class OOPS
{
	public static void main(String[] args) {
        //Overriding-area method of Polygon Interface
        Polygon p; 
        p=new Rectangle(10,3);
        System.out.println(p.area()+" Sqkms");
        p=new Square(3);
        System.out.println(p.area()+" Sqkms");
        
        //Overriding-area method of Rectangle Class
        Rectangle r;
        r=new Rectangle(10,3);
        System.out.println(r.area()+" Sqkms");

        String type="Residential";
        r=new Plot(10,3,type);
        int a=r.area();
        System.out.println(a+" acres");
        
        //Overloading
        costCalculator c=new costCalculator();
        System.out.println(c.calCost(a));
        System.out.println(c.calCost(type));
	}
}