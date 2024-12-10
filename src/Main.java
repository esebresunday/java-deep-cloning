//A java program to demonstrate deep cloning;
class Cat
{
    int j;
    Cat(int j)
    {
        this.j = j;
    }
}
class Dog implements Cloneable
{
    Cat c;
    int i;
    Dog(Cat c, int i)
    {
        this.c = c;
        this.i = i;
    }
    public Object clone()
    {
        Cat c1 = new Cat(this.c.j);
        return new Dog(c1,i);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Cat c = new Cat(2);
        Dog d = new Dog(c,3);
        Dog d1 = (Dog)d.clone();
        d1.i = 4;
        d1.c.j = 5;
        System.out.println("For the original copy:"+d.i + "..." + d.c.j);
        System.out.println("For the clone copy:"+d1.i + "..." + d1.c.j);
    }
}