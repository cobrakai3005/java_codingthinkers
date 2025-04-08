package inheitence_;
class Publication {
    String title;
    int price;
    Publication(String title, int price){
        this.title = title;
        this.price = price;
    }
   
}

class CD extends Publication{
    int duration ;

    CD(String title, int price , int duration){
        super(title, price);
        this.duration = duration;
    }

    void putData(){
        System.out.println("Title: " +title+"Price: "+ price + " Duration in (mins) :"+ duration);
    }
}
class Book extends Publication{
    int pageCount ;
    String author ;

    Book(String title, int price , int pageCount, String author){
        super(title, price);
        this.pageCount = pageCount;
        this.author = author;
    }

    void putData(){
        System.out.println("Title: "+ title+" "+ "Price: "+ price + " Pages : "+ pageCount + " Author:" + author);
    }
}

public class PublicationClass {
 
    
    public static void main(String[] args) {
        Book book = new Book("JAVA Fundamentals", 250, 800, "James Gosling");


        CD cd = new CD("Chill Beats", 100, 120);


        book.putData();
        cd.putData();
    }
}
