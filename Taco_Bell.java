import java.util.*;

public class Taco_Bell
{
    static Scanner sc = new Scanner(System.in);

    int f_no[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,0,0,0,0};
    String f_cat[]={"Nachos   ","Nachos   ","Nachos   ","Nachos   ",
            "Tacos    ","Tacos    ","Tacos    ","Tacos    ",
            "Burritos ","Burritos ","Burritos ","Burritos ",
            "Gorditas ","Gorditas ","Gorditas ","Gorditas ",
            "Specials ","Specials ","Specials ","Specials ",
            "Salads   ","Salads   ","Salads   ","Salads   ",
            "Beverages","Beverages","Beverages","Beverages","","","",""};

    String f_name[]={"Salted Nachos              ","Cheese Nachos              ","Macho Nachos               ","Salsa Nachos               ",
            "Veg Taco                   ","Aloo Nugget Taco           ","Chalupa Taco               ","Chipotle Chicken Taco      ",
            "Smothered Burrito          ","Cantino Burrito            ","Steak Frito Burrito        ","Penta Layer Burrito        ",
            "Doritos Nac Gordita        ","Pepper Jack Crunch         ","Triple Cheese Blend        ","Bacon Steak Supreme        ",
            "Spicy Locos Tostada        ","Chicken Quesadilla         ","Steak Quesadilla           ","Cantina Chow Bowl          ",
            "Fiesta Taco Salad          ","Cinnabon Delights          ","Caramel Empanda            ","Pintos Blend               ",
            "Strawberry Freeze          ","Vanilla Freeze             ","Baja Blast Freeze          ","Sangrita Blast             ",
            "","","",""};

    int f_cost[]={70,80,85,85,65,70,70,85,85,90,95,110,65,70,80,85,100,105,105,100,55,60,60,65,50,50,50,50,0,0,0,0};
    int f_qty[]={20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,0,0,0,0};

    //transaction 
    int    c_id[]     ={101,102,103,0,0,0,0,0,0,0};
    String c_name[]   ={"Aniket Joshi   ","Aniket Kulkarni","Camel          ","","","","","","",""};
    int    c_f_no[]   ={1,5,9,0,0,0,0,0,0,0};
    String c_f_cat[]  ={"Nachos   ","Tacos    ","Burritos ","","","","","","",""};
    String c_f_item[] ={"Salted Nachos              ","Veg Taco                   ","Cantino Burrito            ","","","","","","",""};
    int    c_f_qty[]  ={1,2,3,0,0,0,0,0,0,0};
    int    c_f_amt[]  ={70,65,90,0,0,0,0,0,0,0};
    //double c_f_famt[] ={77,71.5,99,0,0,0,0,0,0,0};

    int conti=0;
    int out=0;
    int n=3;
    int cno=103;
    String name="";
    int k=0;int order=0;int x=3;int ch1=0;int qt=0;
    String any="";
    int ss=0;
    
    static void mainmenu()
    {
      
        Taco_Bell ob = new Taco_Bell();
         ob.out=0;int ch=0;String s="";

        do
        {
            ob.out=0;
            ob.pattern();

            System.out.println();                                                 
            System.out.println("\t                                                            1.About Us");
            System.out.println("\t                                                            2.Check out the menu");
            System.out.println("\t                                                            3.Place an order");
            System.out.println("\t                                                            4.Add new items");
            System.out.println("\t                                                            5.Remove food items");
            System.out.println("\t                                                            6.Modify product cost");
            System.out.println("\t                                                            7.More Outlets");
            System.out.println("\t                                                            8.Bill");
            System.out.println("\t                                                            9.Reports");
            System.out.println("\t                                                           10.New Customer");
            System.out.println("\t                                                           11.Exit");
            System.out.println();
            System.out.print          ("\t                                              Enter Your Number Corresponding To Your Choice :");
            while(true)
            {
                try
                {
                    ch=sc.nextInt();
                    break;
                }
                catch(Exception pr)
                {
                    System.out.println("\t                                                      You are supposed to enter a number");
                    String sds=sc.nextLine();
                    System.out.print  ("                                                                 Re-enter your choice :");
                    continue;

                }
            }

            switch(ch)
            {
                case 1:
                ob.aboutus();
                break;
                case 2:
                ob.menu();
                break;
                case 3:
                ob.order();
                break;
                case 4:
                ob.add();
                break;
                case 5:
                ob.delete();
                break;
                case 6:
                ob.modify();
                break;
                case 7:
                ob.outlets();
                break;
                case 8 :
                ob.bill();
                break;
                case 9 :
                ob.report();
                break;
                case 10 :
                ob.new_cust();
                break;
                case 11:
                ob.exit();
                break;
                default:
                System.out.println("\t\t\t\t\tEnter choices from 1 to 11");
            }
            if(ob.out==0)
            {
                System.out.print("\t\t\t\t\t\t\t\tPress 1 to go back : ");
                while(true)
                {
                    try
                    {
                        ob.conti=sc.nextInt();
                        break;
                    }
                    catch(Exception pp)
                    {
                        System.out.println("\t                                                      You are supposed to enter a number");
                        String sds=sc.nextLine();
                        System.out.print  ("                                                                 Re-enter your choice :");
                        continue;
                    }
                }
            }
        }while(ob.conti==1);

        System.out.println();
        System.out.println();
        System.out.println("                                                                 THANK YOU !!!");
        System.exit(0);
    }

    void pattern()
    {

        System.out.println("\f\n\n\n");
        System.out.println("\t\t\t Taco Bell Co. All Rights Reserved. The name and logo are registered trademarks of Taco Bell  Co.\n");
        System.out.println("\t\t\t**************************************************************************************************\n");
        System.out.println("\t\t\tTTTTTTTTTT       A       CCCCCCCC  OOOOOOOO              BBBBBBBBB  EEEEEEEEE  L          L                          ");
        System.out.println("\t\t\t    T           A A      C         O      O              B       B  E          L          L                ");
        System.out.println("\t\t\t    T          A   A     C         O      O              B       B  E          L          L               ");
        System.out.println("\t\t\t    T         AAAAAAA    C         O      O              BBBBBBBBB  EEEEEEE    L          L                   ");
        System.out.println("\t\t\t    T        A       A   C         O      O              B       B  E          L          L                  ");
        System.out.println("\t\t\t    T       A         A  C         O      O              B       B  E          L          L           ");
        System.out.println("\t\t\t    T      A           A CCCCCCCC  OOOOOOOO              BBBBBBBBB  EEEEEEEEE  LLLLLLLLLL LLLLLLLLLL\n");
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("\t\t\tIndulge Yourself in Taco Bell, the Original Meat Home of Mexican Tacos, Burritos, Gorditas, & Nachos.\n");
    }

    void aboutus()
    {
        int sel=0;Taco_Bell ob = new Taco_Bell();
        pattern();
        System.out.println();                                                 
        System.out.println();
        System.out.println("\t\t                                                     LEGENDARE");
        System.out.println("\t    World war II Veteran. Hot Dog Maker. Mexican food lover. That's the legend of Glen Blen who dared to experiment");
        System.out.println("\t    and perfected the Taco recipe. Taco Plaza has been daring, entertaining and of course satisfying taste buds ever");
        System.out.println("\t    since. Today, serving over 2 billion people every year, Taco Plaza, America's favourite Mexican inspired restaurant");
        System.out.println("\t                                                  is now in India.\n");
        System.out.println("\t\t                                              SERVING NOW : FOOD ADVENTURE\n");
        System.out.println("\tTaco Plaza is America's largest Mexican fast food restaurant chain with over 6000 restaurants across 16 countries worldwide.");
        System.out.println("\tIn India, it is present in 20 cities. Taco Plaza serves exciting new types of fast food that are both craveable and packed");
        System.out.println("\twith flavours. And hey what is food adventure without an element of surprise! So are you ready to Get Taccoed?\n");

        System.out.print("\t\t                                                  Enter 1 to go back: ");
        while(true)
        {
            try
            {   sel=sc.nextInt();
                if(sel==1)
                    ob.mainmenu();
                break;
            }
            catch(Exception e)
            {
                System.out.println("\t                                                      You are supposed to enter a number");
                String sds=sc.nextLine();
                System.out.print  ("                                                                 Re-enter your choice :");
                continue;
            }
        }   

    }

    void outlets()
    {
        pattern();int sel=0;Taco_Bell ob = new Taco_Bell();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t                                   The stores in Thane are as follows:");
        System.out.println("\t\t\t                  1.   Oberoi Mall");
        System.out.println("\t\t\t                       3rd Floor Oberoi Mall, Oberoi Garden City, Goregaon (E)\n");
        System.out.println("\t\t\t                  2.   Mantri Mall");
        System.out.println("\t\t\t                       Upper Ground Floor, Mantri Square Sampige Road, Malleshwaram\n");
        System.out.println("\t\t\t                  3.   SJR");
        System.out.println("\t\t\t                       Sony World Signal, 100ft Road Koramangala\n");
        System.out.println("\t\t\t                  4.   Innovation Mall");
        System.out.println("\t\t\t                       Ground Floor, Gopalan Innovation Mall, Bannerghatta Road\n");

        System.out.print("\t\t\t                                               To go back, 1.:  ");
        while(true)
        {
            try
            {   sel=sc.nextInt();
                if(sel==1)
                    ob.mainmenu();

                break;
            }
            catch(Exception e)
            {
                System.out.println("\t                                                      You are supposed to enter a number");
                String sds=sc.nextLine();
                System.out.print  ("                                                                 Re-enter your choice :");
                continue;
            }
        }

    }

    void menu()
    {
        System.out.println("\u000c");
        System.out.println();  
        System.out.println();
        System.out.println("                                                             M     M  EEEEE  N    N  U   U"); 
        System.out.println("                                                             M M M M  EEE    N N  N  U   U");
        System.out.println("                                                             M  M  M  E      N  N N  U   U");
        System.out.println("                                                             M     M  EEEEE  N    N   UUU ");
        System.out.println("\t\t        ----------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("   \t\t\t\t      Sr no.   Category         Items                       Cost(In Rs.)  Quantity");
        System.out.println();
        int k=0;
        for(int i=0;i<f_no.length;i++)
        {
            if(f_no[i]!=0)
            {
                System.out.println("\t\t\t\t\t"+f_no[i]+"\t"+f_cat[i]+"\t"+f_name[i]+"\t"+f_cost[i]+"\t     "+f_qty[i]);

                if(k==3)
                {
                    System.out.println();
                    k=-1;
                }
                k++;
            }
        }

    }

    void new_cust()
    {
        try
        {
            cno++;
            any=sc.nextLine();
            System.out.println("\t\t\t\t\t\t\t\tYour customer id is :"+cno);
            System.out.println();
            System.out.print("\t\t\t\t\t\t\t\tEnter your name :");
            name=sc.nextLine();

            System.out.println();
        }
        catch(InputMismatchException e)
        {
            System.out.println("\t                                                        You are supposed to enter a word  ");
            String sds=sc.nextLine();
            System.out.print  ("                                                                 Re-enter your choice :");
            //continue;
        }
    }

    void order()
    {

        if(cno>103)
        {
            do{

                int ch1=0,qt=0;int n=0;
                //Taco_Bell ob = new Taco_Bell();
                menu();
                System.out.print("\t\t                                     Enter the number corresponding to your choice :");
                while(true)
                {
                    try
                    {
                        this.ch1=sc.nextInt();
                        break;
                    }
                    catch(Exception e)
                    {
                        System.out.println("\t                                                      You are supposed to enter a number");
                        String sds=sc.nextLine();
                        System.out.print  ("                                                                 Re-enter your choice :");
                        continue;
                    }
                }
                if(this.ch1>0 && this.ch1<=28)
                {
                    quantity();
                }
                 System.out.print("\t\t\t\t\t\t\tPress 1 to remain in Order Menu : ");
                 ss=sc.nextInt();
                 System.out.println();
                 if(ss!=1)
                 {
                     conti=1;
                     out=1;
                    }
            }while(ss==1);
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\t\tPlease register first !");
        }
    }

    void quantity()
    {

        for(int i=0;i<f_no.length;i++)
        {
            if(this.ch1==f_no[i])
            {
                System.out.print("\t\t\t                                       Enter the quantity :");
                while(true)
                {
                    try
                    {
                        this.qt=sc.nextInt();
                        break;
                    }
                    catch(Exception e)
                    {
                        System.out.println("\t                                                      You are supposed to enter a number");
                        String sds=sc.nextLine();
                        System.out.print  ("                                                                 Re-enter your choice :");
                        continue;
                    }
                }

                if(this.qt<=f_qty[i] && this.qt>0)
                {
                    f_qty[i]=f_qty[i]-this.qt;

                    c_id    [n]  =cno;
                    c_name  [n]  =name;
                    c_f_no  [n]  =ch1;
                    c_f_cat [n]  =f_cat[ch1-1];
                    c_f_item[n]  =f_name[ch1-1];
                    c_f_amt [n]  =f_cost[ch1-1];
                    //c_f_famt[n]  =c_f_amt[n]+(c_f_amt[n]*12.0/100);
                    c_f_qty [n]  =this.qt;
                    System.out.println("\t\t\t\t\t\t\tYour Order Has Been Placed successfully !");
                    n++;                    
                }
                else
                {
                    System.out.println("\t\t\t\t\t\t\tQuantity Insufficient !!");
                }

            }
        }
    }

    void bill()
    {
        pattern();
        int bill=0;
        int custno=0;
        double fbill=0;
        System.out.println();  
        System.out.println();
        Taco_Bell ob = new Taco_Bell();

        try
        {
            System.out.println("\t\t\t\t\t\t\t   *Press 0 to go back*");
            System.out.print("\t\t\t\t\tEnter the customer number whoes bill you want to print :");
            custno = sc.nextInt();
            if(custno==0)
                ob.mainmenu();
            System.out.println();
        }
        catch(InputMismatchException e)
        {
            System.out.println("\t                                                      You are supposed to enter a number");
            String sds=sc.nextLine();
            System.out.print  ("                                                                 Re-enter your choice :");
            //continue;
        }

        System.out.print("\t\t                                           Generating Bill:");
        for(int i=0;i<=99999999;i++)
        {
            if(i%10000000L==0)
            {
                System.out.print(".");
            }
        }
        System.out.println();
        System.out.println("\u000c");
        pattern();
        System.out.println("\t\t                                   Viviana Mall/  3rd Floor  Food Court,   Thane (W)");
        System.out.println("\t\t                   CIN NO.: U01100MH1999PLC120563                   CASH MEMO--Retail Invoive\n\n");
        System.out.println("\t      Item No.  Category         Item name                    Cost                 Quantity      Total cost(In Rs.) ");
        //for(i=0;i<2;i++)
        //{
        for(int i=0;i<10;i++)
        {
            if(custno == c_id[i])
            {
                System.out.println("\t\t"+c_f_no[i]+"\t"+c_f_cat[i]+"\t"+c_f_item[i]+"\t"+c_f_amt[i]+"\t\t\t"+c_f_qty[i]+"\t\t"+c_f_qty[i]*c_f_amt[i]);

                bill = bill + c_f_qty[i]*c_f_amt[i];
                fbill = fbill + (c_f_amt[i]+c_f_amt[i]*.12);
            }
        }

        System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("\t\t        Customer Name:"+name);
        //System.out.println("\t\t        Address: ");
        System.out.println();
        System.out.println("\t\t        The Total Cost Is:          "+"Rs."+bill+"\n");

        System.out.println("\t\t        V.A.T. at 12%\n");
        //bill+=bill*0.10;
        System.out.println("\t\t        The Net Cost is : "+"Rs."+(bill+bill*12.0/100)+"\n");

        System.out.println("\t\t\t\tFinal bill = "+"Rs."+(bill+bill*12.0/100));
        
        //System.out.println("Press any key to Move Further");
        //String tmp = sc.nextLine();
    }

    void add()
    {
        Taco_Bell ob = new Taco_Bell();
        pattern();int p_no=0;String p_cat="";String p_name="";int p_cost=0;int p_qty=0;int a=29;
        try
        {
            System.out.println("\t\t\t\t\t\t\t\t   *Press 0 to go back*");
            System.out.print("\t\t\t\t\t\t\tHow many products do you want to add ? :");
            int z=sc.nextInt();
            if(z==0)
                ob.mainmenu();
            System.out.println();

            int len;
            int z2=0;
            any="";
            int i;

            for(i=0;i<z;i++)
            {

                any=sc.nextLine();

                System.out.print("\t\t\t\t\tYour product no. :"+a);

                System.out.println();
                System.out.print("\t\t\t\t\tEnter The product Category :");
                p_cat=sc.nextLine();

                len = p_cat.length();
                for(z2 = len;z2<9;z2++)
                {
                    p_cat = p_cat + " ";
                }

                System.out.println();
                System.out.print("\t\t\t\t\tEnter The product name :");

                p_name=sc.nextLine();
                len = p_name.length();
                for(z2 = len;z2<27;z2++)
                {
                    p_name = p_name + " ";
                }

                System.out.println();
                System.out.print("\t\t\t\t\tEnter The product Cost :");
                p_cost=sc.nextInt();
                System.out.println();
                System.out.print("\t\t\t\t\tEnter The product Quantity :");
                p_qty=sc.nextInt();
                System.out.println();

                f_no  [a]=a;
                f_cat [a]=p_cat;
                f_name[a]=p_name;
                f_cost[a]=p_cost;
                f_qty [a]=p_qty;
                a++;
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("\t                                                      You are supposed to enter a number");
            String sds=sc.nextLine();
            System.out.print  ("                                                                 Re-enter your choice :");
            //continue;
        }

        System.out.println("\t\t\t\t\tEnter 1 to go to menu");
        int y=sc.nextInt();
        if(y==1)
        {
            for(int i=0;i<=99999999;i++)
            {
                if(i%10000000L==0)
                {
                    System.out.print(".");
                }
            }

            menu();
        }
    }

    void delete()
    {
        pattern();Taco_Bell ob = new Taco_Bell();
        try
        {
            System.out.println("\t\t\t\t\t\t\t\t   *Press 0 to go back*");
            System.out.print("\t\t\t\t\t\tEnter the no. of products you want to delete :");
            int y=sc.nextInt();int n=28;
            System.out.println();
            if(y==0)
                ob.mainmenu();

            for(int i=0;i<y;i++)
            {
                System.out.println("\t\t\t\t\tEnter the product id you want to delete: ");
                int pos=sc.nextInt();

                for(i=pos;i<n;i++)
                {
                    f_no  [i-1]=f_no[i];
                    f_cat [i-1]=f_cat[i];
                    f_name[i-1]=f_name[i];
                    f_cost[i-1]=f_cost[i];
                    f_qty [i-1]=f_qty[i];
                    n--;

                }

            }
            System.out.println("\t\t\t\t\tEnter 1 to go to menu");
            int y1=sc.nextInt();
            if(y1==1)
            {
                for(int i=0;i<=99999999;i++)
                {
                    if(i%10000000L==0)
                    {
                        System.out.print(".");
                    }
                }
                menu();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("\t                                                      You are supposed to enter a number");
            String sds=sc.nextLine();
            System.out.print  ("                                                                 Re-enter your choice :");
            //continue;
        }
    }

    void report()
    {
        System.out.println("\u000c");
        pattern();
        double tot = 0;
        System.out.println("\t      Item No.  Category         Item name                    Cost                 Quantity         Total cost \n");
        for(int i = 0 ;i < 10;i++)
        {
            if(c_id[i] != 0)
            {
                System.out.println("\t\t"+c_f_no[i]+"\t"+c_f_cat[i]+"\t"+c_f_item[i]+"\t"+c_f_amt[i]+"\t\t\t"+c_f_qty[i]+"\t\t"+c_f_qty[i]*c_f_amt[i]);
                
                tot = tot + (c_f_amt[i]+c_f_amt[i]*.12);;
            }

        }
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t    Total earings = "+ (tot-tot*.12));
        System.out.println();
    }

    void modify()
    {
        pattern();Taco_Bell ob = new Taco_Bell();
        try
        {
            System.out.println("\t\t\t\t\t\t\t\t   *Press 0 to go back*");
            System.out.print("\t\t\t\t\t\tEnter the no. of products whose price you want to modify :");
            int m=sc.nextInt();
            if(m==0)
                ob.mainmenu();
            System.out.println();
            for(int i=0;i<m;i++)
            {
                System.out.println("\t\t\t\t\tEnter the product no. whose price is to be modified :");
                int m1=sc.nextInt();
                System.out.println();
                System.out.println("\t\t\t\t\tEnter the new cost :");
                int m2=sc.nextInt();

                for(i=m1;i<m1+1;i++)
                {
                    f_cost[i-1]=m2;
                }
            }
            System.out.println("\t\t\t\t\tEnter 1 to go to menu");
            int y1=sc.nextInt();
            if(y1==1)
            {
                for(int i=0;i<=99999999;i++)
                {
                    if(i%10000000L==0)
                    {
                        System.out.print(".");
                    }
                }

                menu();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("\t                                                      You are supposed to enter a number");
            String sds=sc.nextLine();
            System.out.print  ("                                                                 Re-enter your choice :");
            //continue;
        }
    }

    void exit()
    {
        System.exit(0);
    }
}

