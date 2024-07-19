import java.util.*;
class Project
{
     static ArrayList<Hotel> al=new ArrayList<Hotel>();
     public static void menu(int n)
     {
          Scanner sc=new Scanner(System.in);
          switch(n)
          {
               case 1: //for status of book
                    System.out.println("Enter your name");
                    String title=sc.nextLine();
                    System.out.println("Etner roome type");
                    String publisher=sc.nextLine();
                    System.out.println("Enter range");
                    int edition=sc.nextInt();
                    for(Hotel b:al)
                    {
                         if(b..equals(title)&&b.publisher.equals(publisher)&& b.edition==edition)
                         {
                              System.out.println("Book is available in shelf: "+b.shelf);
                              break;
                         }
                    }
                    System.out.println("Book is not available");
                    break;
               case 2: //adding a new book in arraylist
                    System.out.println("Enter book detail");
                    System.out.println("Enter Book Title");
                    title=sc.nextLine();
                    System.out.println("Enter Book publisher");
                    publisher=sc.nextLine();
                    System.out.println("Enter Book Price");
                    int price=sc.nextInt();
                    System.out.println("Enter shelf number");
                    int shelf=sc.nextInt();
                    System.out.println("Enter Book Edition");
                    edition=sc.nextInt();
                    Book ob1=new Book(title,price,publisher,edition,shelf);
                    al.add(ob1);
                    break;
          }
     }
     public static void main(String args[])
     {
          int n=0;
          Scanner sc=new Scanner(System.in);
          while(n>=0){
               System.out.println("Enter 1 for finding book");
               System.out.println("Enter 2 for adding a new book");
               System.out.println("Enter your choise");
               n=sc.nextInt();
               sc.nextLine();
               Project.menu(n);
          }
     }
}
class Hotel
{
     String name;
     int price;
     String rtype;
     int days;
     Hotel(String t,int p,String pu,int s)
     {
          name =t;
          price=p;
          rtype=pu;
          days=s;
     }
}