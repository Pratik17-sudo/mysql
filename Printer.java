//Encapsulation Course Challenge code

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100)
        {
            this.tonerLevel=tonerLevel;
        }
        else
        {
          this.tonerLevel=-1;
        }

        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int toneramount)
    {
        tonerLevel=tonerLevel+toneramount;
        if(tonerLevel>100)
        {
            return -1;
        }
        if(tonerLevel<0)
        {
            return -1;
        }
        else
        {
            return tonerLevel;
        }
    }

    public int printPages(int pages)
    {
        int totalPages=1;
        if(duplex)
        {
            System.out.println("It is a duplex printer");
            totalPages=pages*2;
            return totalPages;
        }

        else
        {
            System.out.println("It is not a duplex printer");
            return pages;
        }
    }


    public static void main(String[] args) {
        Printer p1=new Printer(60,10,false);
        System.out.println(p1.printPages(10));
        System.out.println(p1.addToner(50));
    }

}