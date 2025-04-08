package porlymorphism;
class Person{
    String name;
    String color;
    Person(String name, String color){
        this.name = name;
        this.color = color;
    }
    public String toString(){
        String det = "The Person " + name + " ";
        return det;
    }
}

class Actor extends Person{
    int noOfFilms ;
    int debut_year;
    Actor(String name, String color, int noOfFilms, int debut_year){
        super(name, color);
        this.debut_year = debut_year;
        this.noOfFilms = noOfFilms;
    }
    public String toString(){
        String det = super.toString()+ " is an Actor . He is  of colour "+color+ " has "+ noOfFilms+ " films . debuted in the year "+ debut_year;   
        return det;
    }
}
class Actress extends Person{
    int noOfFilms ;
    int debut_year;
    Actress(String name, String color, int noOfFilms, int debut_year){
        super(name, color);
        this.debut_year = debut_year;
        this.noOfFilms = noOfFilms;
       
    }
    public String toString(){
        String det =  "she is an Actress . She is  of colour "+color+ " has "+ noOfFilms+ " films . debuted in the year "+ debut_year; 
        return super.toString() + det;
    }
}

public class Actors {
public static void main(String[] args) {
 System.out.println("hello");  
 
 Actress me = new Actress("Shivani", "dusky", 10, 2016);
 System.out.println(me.toString());
}
}
