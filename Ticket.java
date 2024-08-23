import java.util.*;
class Ticket
{
    String name;
    String gender;
    int age;
    String movie_name_ ;
    int choice;
    static int Available_tickets_balcony = 20;
    static int Available_tickets_normal  = 100;
    static int Available_tickets_floor   = 20;
    static int total = 140;
     


    void Movie_name()
    {
        System.out.println("enter the movie name");
        Scanner sc = new Scanner(System.in);
        movie_name_ = sc.nextLine();
        //sc.close();
    }


    void Select_theater()
    {
        System.out.println("Available theaters are "+"\n"+"1.Bramaramba Theater "+ "\n" + "2.Sandhya 70mm Theater " + "\n"+ "3.Sudharsan Theater" + "\n" + "4.Srinivasa Theater");
        
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("You have selected 1.Bramaramba Theater");
            break;
            case 2: System.out.println("You have selected 2.Sandhya 70mm Theater ");
            break;
            case 3 : System.out.println("You have selected 3.Sudharsan Theater "); 
            break;
            default : System.out.println(" Sorry the movie is available only in the above theaters"); 
            break;
        }
        //sc.close();

    }
   
    void Screen()
    {
        if(choice == 1 )
        {
            System.out.println("You have selected 1.Bramaramba Theater and select your sereen among"+"\n"+"1.screen 1"+"\n"+"2.screen 2" + "\n" + "3.screen 3");
            int screen_num;
            Scanner sc = new Scanner(System.in);
            screen_num = sc.nextInt();
            System.out.println("you have selected"+ screen_num);
            //sc.close();
        }
        else if (choice == 2)
        {
            System.out.println("Sandhya 70mm Theater  is a single screen");
        }
        else if(choice == 3)
        {
            System.out.println("Sudharsan Theater is a single screen");
        }
    }


    void booking()
    {
        System.out.println("Enter which type of seating do you want to book");
        System.out.println("1.balcony "+"\n" + "2.normal"+"\n"+"3.floor");
        int booking_area_num;
        Scanner sc = new Scanner(System.in);
        booking_area_num = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the date   "+"\n"+"(eg : 12/3/2024)");
        String date = sc.nextLine();
        System.out.println("type the show that you want to book i.e;"+"\n"+("morning show,afternoon show,midnight show"));
        String show = sc.nextLine();
        

        if(booking_area_num == 1)
        {
        System.out.println("the  available tickets in the balcony are" +  Available_tickets_balcony );
        System.out.println("enter the number of tickets do you want to book");
        int book_tickets = sc.nextInt();
        
        if(Available_tickets_balcony < book_tickets || total < book_tickets )
        {
            System.out.println("sorry the  balcony tickets are not available");
        }
        else
        {
            System.out.println("tickets are booked  successfully");
            System.out.println("The total tickets that you have booked is  " + book_tickets+"  on  "+date+"  for  "+show);
            Available_tickets_balcony = Available_tickets_balcony - book_tickets ;
            total = total - book_tickets;
            System.out.println("At present the Available balcony tickets are "+ Available_tickets_balcony +"\n"+ "and total tickets are"+ total);
        
        }

        }


        else if (booking_area_num == 2)
        {
            System.out.println("the  available tickets in the balcony are" +  Available_tickets_normal );
        System.out.println("enter the number of tickets do you want to book");
        int book_tickets = sc.nextInt();
        
        if(Available_tickets_normal < book_tickets || total < book_tickets )
        {
            System.out.println("sorry the  balcony tickets are not available");
        }
        else
        {
            System.out.println("tickets are booked  successfully");
            System.out.println("The total tickets that you have booked is  " + book_tickets+"on"+date+"for"+show);
            Available_tickets_normal = Available_tickets_normal - book_tickets ;
            total = total - book_tickets;
            System.out.println("At present the Available normaltickets are "+ Available_tickets_normal +"\n"+ "and total tickets are"+ total);
        
        }

        }


        else if(booking_area_num == 3)
        {
            System.out.println("the  available tickets in the balcony are" + Available_tickets_floor );
        System.out.println("enter the number of tickets do you want to book");
        int book_tickets = sc.nextInt();
        
        if(Available_tickets_floor < book_tickets || total < book_tickets )
        {
            System.out.println("sorry the  balcony tickets are not available");
        }
        else
        {
            System.out.println("tickets are booked  successfully");
            System.out.println("The total tickets that you have booked is  " + book_tickets+"on"+date+"for"+show);
            Available_tickets_floor = Available_tickets_floor- book_tickets ;
            total = total - book_tickets;
            System.out.println("At present the Available normaltickets are "+ Available_tickets_floor +"\n"+ "and total tickets are"+ total);
        
        }
        }
        sc.close();
       
        
        
    }
    void thankyou_message()
    {
       System.out.println("THANK YOU SOO MUCH FOR BOOKING TICKETS");
    }

    public static void main(String args[])
    {
        Ticket t1 = new Ticket();
        t1.Movie_name();
        t1.Select_theater();
        t1.Screen();
        t1.booking();


    }



     
}






// import java.util.*;

// class Ticket {
//     String name;
//     String gender;
//     int age;
//     String movie_name_;
//     int choice;
//     static int Available_tickets_balcony = 20;
//     static int Available_tickets_normal = 100;
//     static int Available_tickets_floor = 20;
//     static int total = 140;

//     void Movie_name() {
//         System.out.println("Enter the movie name:");
//         Scanner sc = new Scanner(System.in);
//         movie_name_ = sc.nextLine();
//     }

//     void Select_theater() {
//         System.out.println("Available theaters are:" + "\n" + "1.Bramaramba Theater" + "\n" + "2.Sandhya 70mm Theater" + "\n" + "3.Sudharsan Theater" + "\n" + "4.Srinivasa Theater");

//         Scanner sc = new Scanner(System.in);
//         choice = sc.nextInt();
//         switch (choice) {
//             case 1:
//                 System.out.println("You have selected 1.Bramaramba Theater");
//                 break;
//             case 2:
//                 System.out.println("You have selected 2.Sandhya 70mm Theater ");
//                 break;
//             case 3:
//                 System.out.println("You have selected 3.Sudharsan Theater ");
//                 break;
//             default:
//                 System.out.println("Sorry, the movie is available only in the above theaters");
//                 break;
//         }
//     }

//     void Screen() {
//         if (choice == 1) {
//             System.out.println("You have selected 1.Bramaramba Theater. Select your screen among:" + "\n" + "1.screen 1" + "\n" + "2.screen 2" + "\n" + "3.screen 3");
//             int screen_num;
//             Scanner sc = new Scanner(System.in);
//             screen_num = sc.nextInt();
//             System.out.println("You have selected screen " + screen_num);
//         } else if (choice == 2) {
//             System.out.println("Sandhya 70mm Theater is a single screen");
//         } else if (choice == 3) {
//             System.out.println("Sudharsan Theater is a single screen");
//         }
//     }

//     void booking() {
//         System.out.println("Enter the type of seating you want to book:");
//         System.out.println("1.Balcony" + "\n" + "2.Normal" + "\n" + "3.Floor");
//         int booking_area_num;
//         Scanner sc = new Scanner(System.in);
//         booking_area_num = sc.nextInt();
//         sc.nextLine(); // Consume the leftover newline
//         System.out.println("Enter the date (e.g., 12/3/2024):");
//         String date = sc.nextLine();
//         System.out.println("Type the show that you want to book (e.g., morning show, afternoon show, midnight show):");
//         String show = sc.nextLine();

//         if (booking_area_num == 1) {
//             System.out.println("The available tickets in the balcony are " + Available_tickets_balcony);
//             System.out.println("Enter the number of tickets you want to book:");
//             int book_tickets = sc.nextInt();

//             if (Available_tickets_balcony < book_tickets || total < book_tickets) {
//                 System.out.println("Sorry, the balcony tickets are not available");
//             } else {
//                 System.out.println("Tickets are booked successfully");
//                 System.out.println("The total tickets that you have booked is " + book_tickets + " on " + date + " for " + show);
//                 Available_tickets_balcony -= book_tickets;
//                 total -= book_tickets;
//                 System.out.println("At present, the available balcony tickets are " + Available_tickets_balcony + "\n" + "and total tickets are " + total);
//             }

//         } else if (booking_area_num == 2) {
//             System.out.println("The available tickets in normal are " + Available_tickets_normal);
//             System.out.println("Enter the number of tickets you want to book:");
//             int book_tickets = sc.nextInt();

//             if (Available_tickets_normal < book_tickets || total < book_tickets) {
//                 System.out.println("Sorry, the normal tickets are not available");
//             } else {
//                 System.out.println("Tickets are booked successfully");
//                 System.out.println("The total tickets that you have booked is " + book_tickets + " on " + date + " for " + show);
//                 Available_tickets_normal -= book_tickets;
//                 total -= book_tickets;
//                 System.out.println("At present, the available normal tickets are " + Available_tickets_normal + "\n" + "and total tickets are " + total);
//             }

//         } else if (booking_area_num == 3) {
//             System.out.println("The available tickets on the floor are " + Available_tickets_floor);
//             System.out.println("Enter the number of tickets you want to book:");
//             int book_tickets = sc.nextInt();

//             if (Available_tickets_floor < book_tickets || total < book_tickets) {
//                 System.out.println("Sorry, the floor tickets are not available");
//             } else {
//                 System.out.println("Tickets are booked successfully");
//                 System.out.println("The total tickets that you have booked is " + book_tickets + " on " + date + " for " + show);
//                 Available_tickets_floor -= book_tickets;
//                 total -= book_tickets;
//                 System.out.println("At present, the available floor tickets are " + Available_tickets_floor + "\n" + "and total tickets are " + total);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         Ticket t1 = new Ticket();
//         t1.Movie_name();
//         t1.Select_theater();
//         t1.Screen();
//         t1.booking();
//     }
// }
