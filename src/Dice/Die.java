package Dice;


public class Die 
{
    int num = 0;  
    public Die()
    {
            num = 1;
    }        
    public Die(int num)
    {
        this.num = num;
    }   
    public static int roll()
    {
        return (int)Math.floor(6 * Math.random() + 1);
    }
    public int getSide()
    {
        return num;
    }
    public void setSide(int num)
    {
        this.num = num;
    }
    public String toString()
    {
        return "Die{" + "num=" + num + '}';
    }
}
