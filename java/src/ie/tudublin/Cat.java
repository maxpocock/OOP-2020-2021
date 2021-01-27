package ie.tudublin;

public class Cat extends Animal {
    


    int numlives;
    
    public int setlives()
    {
        return numlives;
    }

    public void setlives(int numlives)
    {
        numlives = 9;
    }

    public Cat(String name)
    {
        super(name);
    }

      static void kill(Cat){
        numlives = (numlives-1);

        if (numlives > 0)
        {
            System.out.println("Ouch");
        }

        if (numlives == 0)
        {
            System.out.println("Dead");
        }
    }

}