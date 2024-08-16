import java.awt.*;
import java.io.*;
import java.util.*; 
public class Tech_For_Old 
{
    static Scanner br= new Scanner(System.in);
    
    public static void main()throws InterruptedException 
    {
        int b=1;
        System.out.println("Welcome to the  app \"Tech For Old\"");
        Thread.sleep(2000);

        System.out.println("We hope you are keeping well");
        Thread.sleep(2000);

        System.out.println("For Reference, here are some Emergency Numbers");

        System.out.println("National Emergency Number- 11\nPolice- 100\nFire- 101\nAmbulance- 102\nDisaster Management Services-108\nWomen Helpline-1091\nDomestic Abuse-181\nAir Ambulance9540161344");
        Thread.sleep(3000);

        System.out.print("\n");
        System.out.println("Enter your username");
        String q = br.nextLine();
        System.out.print("\n");

        while (b!=0)
        {
            System.out.println("Enter 1 to open MediQuik(Medical help)\nEnter 2 for spiritual purposes\nEnter 3 for Entertainment\nEnter 4 for Social services");
            System.out.print("your Choice :- ");
            int ch=br.nextInt();
            Thread.sleep(1000);

            switch(ch)
            {
                case 1:Tech_For_Old.mediQuik();
                break;
                case 2:Tech_For_Old.spiritual();
                break;
                case 3:Tech_For_Old.entertainment();
                break;
                case 4:Tech_For_Old.social();
                break;
                default:System.out.println("Enter a valid choice");
            }
            System.out.print("\n");
            System.out.println("Enter 0 to quit and any non zero number to continue");
            System.out.print("your Choice :- ");
            b=br.nextInt();
            System.out.print('\u000C');
        }

        System.out.println("THANK YOU "+q+" FOR USING OUR APPLICATION ");

    }

    public static void  mediQuik()throws InterruptedException 

    {
        System.out.print('\u000C');
        System.out.println("Enter 1 for for reminder for taking medicines \nEnter 2 for useful tips for diagnosed diseases\nEnter 3 for self diagonsis ");
        System.out.print("your Choice :- ");
        int ch=br.nextInt();
        Thread.sleep(1000);

        switch(ch)
        {
            case 1:
            int x,y,k,l, d,c,a;
            System.out.print("Enter number of hours after which medicene has to be taken  :- ");
            a=br.nextInt();
            System.out.println();
            System.out.print("Enter number of minutes after which medicene has to be taken  :- ");
            d=br.nextInt();
            System.out.println();
            c=0;

            for(x=a;x>=0;x--)
            {

                for(y=d;y>=0;y--)
                {

                    for(k=c;k>=0;k--)
                    {
                        System.out.print('\u000C');
                        System.out.print(x+":"+y+":"+k+" "); 
                        Thread.sleep(1000);

                    }
                    c=59;
                }
                d=59;
            }

            System.out.print("\n");
            System.out.println("Time to take medicene !!!");

            for(int v=99999;v>=0;v--)
            {
                Toolkit.getDefaultToolkit().beep();
            }
            break;

            case 2:
            System.out.println("To gain information about diseases, enter 1 for diabetes mellitus\n 2 for hypertension\n 3 for cataract\n 4 for presbyopia \n 5 for arthritis."); 
            int h=br.nextInt();
            switch(h)
            {
                case 1:
                System.out.println("1)Reduce your sugar,fat and carbohydrate intake \n2)Eat more fruits and vegetables\n3) stay active ");
                break;
                case 2:
                System.out.println("1) Reduce salt intake \n2) Stay active");
                break;
                case 3 :
                System.out.println("1)Show a doctor ");
                break ;
                case 4:
                System.out.println("1)Use convex lens of prescribed power ");
                break ;
                case 5:
                System.out.println("1)Stay active \n2)Do Joint Exercises");

            }

            System.out.println("Please take medication prescribed by the Doctor ");
            break;

            case 3:
            char ab;
            System.out.println("                DISCLAIMER               ");
            System.out.println("No diagonosis is 100% sure.This is just for self testing yourself\n so you can treat yourself at home. Hence, we strongly recommennd\n you to visit a doctor if the problem persists");
            Thread.sleep(3000);
            System.out.println("Enter  yes\nEnter  no");

            System.out.println("Do you have pain in your knees, which makes  walking difficult");
            ab=br.next().toLowerCase().charAt(0);

            if(ab=='y')
                System.out.println("You may have arthritis.Kindly take the appropriate medications.You can check the tips mentioned by us");
            else
            {
                System.out.println("Do you have difficulty in seeing close objects");
                ab=br.next().charAt(0);

                if(ab=='y')
                    System.out.println("You may have presbyopia. Kindly take the appropriate medications.You can check the tips mentioned by us");
                else
                {
                    System.out.println("Do you feel dizzy or have headache or nausea");
                    ab=br.next().charAt(0);

                    if(ab=='y')
                        System.out.println("You may have hypertension. Kindly take the appropriate medications.You can check the tips mentioned by us");
                    else
                    {
                        System.out.println("Do you frequently urinate,feel thirsty and have increased apetite");
                        ab=br.next().charAt(0);

                        if(ab=='y')
                            System.out.println("You may have diabetes mellitus.Kindly take the appropriate medications.You can check the tips mentioned by us");
                        else
                        {
                            System.out.println("Do you have a snowy vision");
                            ab=br.next().charAt(0);

                            if(ab=='y')
                                System.out.println("You may have a cataract in your eyes.Kindly take the appropriate medications.You can check the tips mentioned by us");
                            else
                                System.out.println("Kindly visit a doctor for diagonosis of your disease");
                        }
                        break; 
                    }
                }
            }
        } 
    }

    public static void spiritual()throws InterruptedException
    {  
        System.out.print('\u000C');
        System.out.println("Enter 1 for spiritual  channel\nEnter 2 for spiritual scriptures\nEnter 3 for Meditation/Yoga tips ");  System.out.print("your Choice :- ");
        int h=br.nextInt();
        Thread.sleep(1000);

        switch(h)
        {
            case 1:
            System.out.println(" Spiritual channels on Fastway are :-");
            System.out.println("Channel Number Channel Name\n399\t\tShri Bucho Sahib\n400\t\tFW Nanaksar\n401\t\tFW Anandpur\n402\t\tFW Shaheedan\n403\t\tFW Dukhniwaran\n404\t\tEk Onkar TV\n405\t\tFW Mix Live\n406\t\tDurgiana Live\n407\t\tPatiala Live"); 
            break;

            case 2:
            System.out.println("Read the sublime teachings of Jesus in the Bible on https://holyBible.com\nRead the teachings of Krishna in the भगवद ग    on https://gitarahasya.com\nRead about the life of Lord Ram in the रामायण  on https://ramacharitamanas.com\nRead the holy ਗੁਰੂ ਗਰੰਥ ਸਾਹਿਬ   on https://gurumaniyogranth.com\nRead the sublime doctrines of Islam in the  قرآن (Quran)on https://islamquran.com");
            break;

            case 3:
            System.out.println("1. Find Your Space\n2. Find Time\n3. Establish a Routine\n4. Be Comfortable\n5. Remember to Breathe\n6. Don't Be Attached\n7. Focus\n8. Observe\n9. Meditate\n10. Build Your Practice"); 
        }
    }

    public static void entertainment()throws InterruptedException
    {
        System.out.print('\u000C');
        System.out.println("Enter 1 for list of Fastway TV channels\nEnter 2 for  locations of recreational places\nEnter 3 for playing Hangman\nEnter 4 for playing Rock Paper Scissor");
        System.out.print("your Choice :- ");
        int h=br.nextInt();
        Thread.sleep(1000);

        switch(h)
        {
            case 1:
            System.out.println(" Enterainment channels on Fastway are :-");
            System.out.println("Channel Number Channel Name\n1 – Star Plus\n2 – Star Bharat\n3 – Sony\n4 – Colors\n5 – Zee TV"); 
            System.out.print("\n");
            System.out.println(" News channels on Fastway are :-");
            System.out.println("Channel Number Channel Name\n175 – PTC News\n176 – FW News\n178 – India TV\n179 – ABP News\n180 – R – Bharat");
            break;

            case 2:
            System.out.println("1. Piccadily Cinema-Sector 34\n2. Central Park-Sector 35A\n3. Sukhna Lake-Sector 1\n4. CP67 Mall-Sector 67\n5. Gulati Bhawan-45D");
            break;

            case 3:
            int game=1;
            String word="";

            while(game!=0)
            {
                String b="";
                System.out.println("Welcome to the Hangman Game");
                System.out.println("****************************");
                Thread.sleep(1000);
                System.out.println("Rules for Hangman:-\n1. A word would be chosen at random by the system.\n2. The user would get ten distinct chances for error(the same error would not be counted again).\n3. If the word is correctly guessed within the permissible limit of errors, the user wins the game.");
                System.out.println("****************************");

                int a=(int)(Math.random()*10);
                int n=0;

                switch(a)
                {
                    case 1:word="umbrella";
                    break;

                    case 2:word="racket";
                    break;

                    case 3:word="exclaimed";
                    break;

                    case 4:word="family";
                    break;

                    case 5:word="instilled";
                    break;

                    case 6:word="daring";
                    break;

                    case 7:word="estimate";
                    break;

                    case 8:word="cricket";
                    break;

                    case 9:word="meaningless";
                    break;

                    case 10:word="nocturnal";
                    break;

                    default:word="terrain";

                }
                char m[]=new char[word.length()];

                for(int x=0;x<word.length();x++)
                {
                    m[x]='_';
                    b+='_';
                }

                while(n<=10)
                {
                    String wrong="";
                    int s;
                    System.out.println("word:-"+b); 
                    System.out.print("Guess:-");

                    char c=br.next().charAt(0);
                    c=Character.toLowerCase(c);
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

                    if(word.indexOf(c)!=-1)
                    {
                        m[word.indexOf(c)]=c;
                        m[word.lastIndexOf(c)]=c;
                        b="";

                        for(int x=0;x<word.length();x++)
                        {
                            b+=m[x]; 
                        }
                    }
                    else
                    {
                        if(wrong.indexOf(c)==-1)
                        { n++;
                            wrong+=c;
                        }
                    }

                    if(b.equals(word))
                        break;
                }

                if(n>10)
                {
                    System.out.println("Sorry, you lost the game");
                    System.out.println("Word was:-"+word);
                }
                else
                    System.out.println("Congratulations,you won the game");
                System.out.println("Enter 0 to quit. Enter any other number to play again");
                game=br.nextInt(); 
            }
            break;

            case 4:
            int a=0,b=0,v=1;
            Scanner br=new Scanner (System.in);
            System.out.println("Welocme to Rock-Paper - Scissors game");
            Thread.sleep(1000);
            System.out.print("\n");
            System.out.println(" Rules of Rock Paper Scissors are as follows : \nRocks wins over Scissors \nPaper wins over Rock \nScissors wins over Rock\nIf it come same like Rock rock it’s draw"); 
            System.out.print("\n");

            while(v!=0)
            {
                System.out.println("Game Starts");
                a=0; b=0;
                System.out.println("Please enter you want to play for how any Rounds  ");
                int n= br.nextInt();

                for (int x=1; x<=n;x++)
                {
                    System.out.println(x+" Round");
                    System.out.println("Enter:-\nR for Rock\nP for Paper\nS for Scissors ");
                    char c=br.next().toUpperCase().charAt(0);
                    int e;

                    e=(int)( Math.random()*10);

                    char w='R';

                    switch(e)
                    {
                        case 0:
                        case 5 :

                        case 9:
                        w='R';

                        break;
                        case 3:
                        case 1:
                        case 4:
                        case 6:

                        w='P';
                        break;
                        case 7:
                        case 8:
                        case 2:
                        w='S';

                    }
                    System.out.println("Computer's Move "+ w);

                    if(c==w)
                        v++;
                    else if ((w=='R'&&c=='P')||(w=='P'&&c=='S')||(w=='S'&&c=='R'))
                        a++;
                    else if ((c=='R'&&w=='P')||(c=='P'&&w=='S')||(c=='S'&&w=='R'))
                        b++;

                    System.out.println("Your Score :-"+a);
                    System.out.println("Computer Score :-"+b);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-");

                }
                if (a>b) 
                    System.out.println("You Won");
                else if (a<b)
                    System.out.println("You Lost");
                else 
                    System.out.println("Draw");
                System.out.println("Enter 0 to Quit and any other number to continue");
                v=br.nextInt(); 

            } 
            break;
        }
    }

    public static void social()throws InterruptedException
    {
        System.out.print('\u000C');
        System.out.println("The contact numbers of the social services are as follows:- \nPlumber6555333478\nCarpenter-9172487859\nElectrician-7388754423\nDomestic Help Agency-4593222756");
        Thread.sleep(2000);
        System.out.print("\n");
        System.out.println("Some old age homes are:- \nName\t\tContact\t   Address\nVridha Sadan   8779443865  Sector-33D\nDukh Nivaran   7466394274  Sector-45C");
        Thread.sleep(2000);
        System.out.print("\n");
        System.out.println("Some helpline number of  transport   facilities are:-\nCab-9988334565\nBus6788955004\nTrain-6622458876\nAirlines-5543978845");
    } 
}