public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Book_name",30.5,"nasser");

        b1.setName("Java101");
        b1.setPrice(50);
        b1.setName("Feras");
        System.out.println("by : "+b1.getAuthor());
        System.out.println(b1.toString());

        Movie m1 = new Movie("Movie_name",70.5,"Ahmed");

        m1.setName("The Movie...");
        m1.setDirector("khalid");
        System.out.println(m1.toString());

    }
}