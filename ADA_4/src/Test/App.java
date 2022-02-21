package Test;
import Model.Archive;
import Model.DELinkList;
import Model.Movie;

public class App {
    public static void main(String[] args) throws Exception {
       


        DELinkList<Movie> list = new DELinkList<Movie>();
        Archive moviesFile = new Archive();
        
        Movie movie1 = moviesFile.readMovie(30);
        Movie movie2 = moviesFile.readMovie(38);
        Movie movie3 = moviesFile.readMovie(44);
        Movie movie4 = moviesFile.readMovie(77);
        Movie movie5 = moviesFile.readMovie(123);
        Movie movie6 = moviesFile.readMovie(22);
        Movie movie7 = moviesFile.readMovie(66);
        Movie movie8 = moviesFile.readMovie(99);
        Movie movie9 = moviesFile.readMovie(100);



        list.insertFirst(movie1);
        list.insertFirst(movie2);
        list.insertFirst(movie3);
        list.insertFirst(movie4);
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
        list.insertBefore(movie5,movie2);
        list.displayList();

        System.out.println("Insert After");
        list.insertAfter(movie6,movie1);
        list.displayList();


        System.out.println("Delete Especific Element");
        list.deleteEspecificElement(movie2);
        list.displayList();

        System.out.println("Delete with Index");
        list.deleteWithIndex(5);
        list.displayList();

        System.out.println("Search Element and position");
        int searchValue = list.searchElement(movie4);
        if(searchValue == -1){
            System.out.println("Element not found: " + searchValue);
        }else{
            System.out.println("Element found in position: "+ searchValue);
        }
        list.displayList();


        System.out.println("Replace element in position");
        list.replaceWithIndex(movie7,2);
        list.displayList();

        System.out.println("Clean List");
        list.cleanList();
        list.displayList();


        System.out.println("Insert Ascending");
        for(int i = 1; i< 10; i++){
            list.insertAscending(moviesFile.readMovie(i));
        }
        list.displayList();



        System.out.println("Clean List");
        list.cleanList();
        list.displayList();


        System.out.println("Insert Descending");
        for(int i = 0; i< 64; i++){
            list.insertDescending(moviesFile.readMovie(i));
        }
        list.displayList();
        
        

        moviesFile.generarArchivoSalida(list.getFirts());

        
        
        
    }
}
