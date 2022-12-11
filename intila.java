import java.util.Scanner;

public class intila {

    public static void main(String[] args) {
        progra z = new progra(2, 252, "Sccsec"); 
    }
    
}

class progra{

    progra(int book_id,int page,String title){
       
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the Book id : ");
        book_id = ab.nextInt();

        Scanner ca = new Scanner(System.in);
        System.out.println("Enter the page : ");
        page = ca.nextInt();

        Scanner  va = new Scanner(System.in);
        System.out.println("Enter the Title : ");
        title = va.nextLine();

        System.out.println("Book is : "+book_id);
        System.out.println("Book Page is : "+page);
        System.out.println("Book Title is : "+title);
    }
}