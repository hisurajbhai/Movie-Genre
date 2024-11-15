import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Movie theMovie=new Adventure("Star War");
//        Movie theMovie=Movie.getMovie("S","Star War");
//        theMovie.watchMovie();
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.print("Enter type(A for Adventure , C for Comedy"+
                    "S for ScienceFiction , or Q for Quit):");
            String type=sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title=sc.nextLine();
            Movie movie=Movie.getMovie(type,title);
            movie.watchMovie();
        }

    }
}