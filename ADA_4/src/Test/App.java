package Test;
import Model.Archive;
import Model.DELinkList;
import Model.Movie;

public class App {
    public static void main(String[] args) throws Exception {
        DELinkList<Double> list = new DELinkList<Double>(); 
        list.insertFirst(2.99);
        list.insertFirst(4.99);
        list.insertFirst(6.99);
        list.insertFirst(8.99);
        //list.displayList(); 
        
        //list.deleteFirst();
        //list.deleteFirst();    

        list.displayList(); 

        System.out.println("First");
        list.getFirts().displayLink();
        System.out.println("");

        System.out.println("Last");
        list.getLast().displayLink();
        System.out.println("");

        System.out.println("Size: " + list.getSize());
        System.out.println("");

        System.out.println("Insert Before");
        list.insertBefore(102.0,2.99);
        list.displayList();

        System.out.println("Insert After");
        list.insertAfter(7.99,8.99);
        list.displayList();


        System.out.println("Delete Especific Element");
        list.deleteEspecificElement(102.0);
        list.displayList();

        System.out.println("Delete with Index");
        list.deleteWithIndex(5);
        list.displayList();

        System.out.println("Search Element and position");
        int searchValue = list.searchElement(4.99);
        if(searchValue == -1){
            System.out.println("Element not found: " + searchValue);
        }else{
            System.out.println("Element found in position: "+ searchValue);
        }
        list.displayList();


        System.out.println("Replace element in position");
        list.replaceWithIndex(10.99,2);
        list.displayList();

        System.out.println("Clean List");
        list.cleanList();
        list.displayList();


        System.out.println("Insert Ascending");
        list.insertAscending(25.0);
        list.insertAscending(1.0);
        list.insertAscending(30.0);
        list.insertAscending(12.0);
        list.insertAscending(2.0);
        list.insertAscending(100.0);
        list.insertAscending(1.0);
        list.insertAscending(3.0);
        list.insertAscending(7.0);
        list.insertAscending(28.0);
        list.insertAscending(99.0);
        list.insertAscending(278.0);
        list.displayList();



        System.out.println("Clean List");
        list.cleanList();
        list.displayList();


        System.out.println("Insert Descending");
        list.insertDescending(25.0);
        list.insertDescending(1.0);
        list.insertDescending(30.0);
        list.insertDescending(12.0);
        list.insertDescending(2.0);
        list.insertDescending(100.0);
        list.insertDescending(1.0);
        list.insertDescending(3.0);
        list.insertDescending(7.0);
        list.insertDescending(28.0);
        list.insertDescending(99.0);
        list.insertDescending(278.0);
        list.displayList();


        DELinkList<Movie> listMovies = new DELinkList<Movie>();
        Archive moviesFile = new Archive();
        for(int i = 0; i< 10; i++){
            listMovies.insertDescending(moviesFile.readMovie(i));
        }
        


        // Movie movie1 = new Movie("Marcianito 2");
        // Movie movie2 = new Movie("Chino la pelicula ");
        // Movie movie3 = new Movie("Aleluya");
        // Movie movie4 = new Movie("Ted 2");
        // Movie movie5 = new Movie("Amigo ven te invito una copa");
        // Movie movie6 = new Movie("Ted 1");

        // listMovies.insertDescending(movie1);
        // listMovies.insertDescending(movie2);
        // listMovies.insertDescending(movie3);
        // listMovies.insertDescending(movie4);
        // listMovies.insertDescending(movie5);
        // listMovies.insertDescending(movie6);
        

        listMovies.displayList();

        
        
        
    }
}
