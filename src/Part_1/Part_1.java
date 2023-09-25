package Part_1;

import java.util.Scanner;

//1.1 Class declaration
class MyNewClass {

}
//1.2 Class declaration with public method
class MyNewClassWithMethod{
    public void printString (String s){
        System.out.println(s);
    }
}

//1.3 Class declaration with private method
class MyNewClassWithPrivateMethod{
    static Scanner in = new Scanner(System.in);
    private String getUserString(String s){
        System.out.println(s);
        String answer = in.nextLine();
        return answer;
    }
}

//1.4 Constructor
class Constructur {
    public Constructur(){
        System.out.println("This is your customer information: ");
    }
}

//1.5 Public Properties
class CustomerInfo {
    public String name;
    public String surname;
    public char initial1;
    public char initial2;
    public int age;
    public double totalSpentMoney;
    public boolean VIP;

    public void outputInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + initial1 + "." + initial2);
        System.out.println("Age: " + age);
        System.out.println("Total amount of spent money: " + totalSpentMoney);
        System.out.println("Status VIP: " + VIP);
    }
}

//1.6 Private Properties
class Video {
    private String name;
    //1.7 Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private double time;
    //1.7 Getters and Setters
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    private int views;
    //1.7 Getters and Setters
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    private int likes;
    //1.7 Getters and Setters
    public void setLikes(int likes) {
        this.likes = likes;
    }
    private int dislikes;

    //1.7 Getters and Setters
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    private boolean popularity;

    // Public Method
    public boolean popularTF() {
        if (views > 250000) {
            popularity = true;
        } else popularity = false;
        return popularity;
    }
    // Public Method
    public void outputVideoInfo() {
        System.out.println("Likes: " + likes);
        System.out.println("Dislikes: " + dislikes);
        System.out.println("Popular: " + popularity);
    }
}

// 1.8 Constructor with arguments
class Film {
    private String name;
    private int year;
    private String authorName;
    private char initialAuthor;
    private double rating;

    public void outputFilmInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Director: " + authorName + " " + initialAuthor + ".");
        System.out.println("Rating: " + rating);
    }
    public Film(String name, int year, String authorName, char initialAuthor, double rating) {
        this.name = name;
        this.year = year;
        this.authorName = authorName;
        this.initialAuthor = initialAuthor;
        this.rating = rating;
    }
}

public class Part_1 {
    public static void main(String[] args) {
        //1.1 An object creation
        MyNewClass object1 = new MyNewClass();
        //1.2 Call an object of a class with a public method
        MyNewClassWithMethod object2 = new MyNewClassWithMethod();
        object2.printString("Hello!");
        //1.3 Call an object of a class with a private method
        MyNewClassWithPrivateMethod object3 = new MyNewClassWithPrivateMethod();
        //object3.getUserString("What is your name?");
        //1.4 Call an object of the use of a constructor
        Constructur object4 = new Constructur();
        //1.5 Call an object of public properties of a various data types
        CustomerInfo object5 = new CustomerInfo();
        object5.name = "Maria";
        object5.surname = "Smiths";
        object5.initial1 = 'M';
        object5.initial2 = 'S';
        object5.age = 23;
        object5.totalSpentMoney = 843.57;
        object5.VIP = false;
        object5.outputInfo();
        //1.6 Call an object of private properties
        Video object6 = new Video();
        //object6.name = "OOP";
        System.out.println(" ");
        System.out.println("Here is the video information: ");
        //1.7 Call an object with getters and setters
        object6.setName("What is the OOP in Java?");
        object6.setTime(17.37);
        object6.setViews(854672);
        System.out.println("Name: " + object6.getName());
        System.out.println("Part_1.Video time: " + object6.getTime() + "minutes");
        System.out.println("Views: " + object6.getViews());
        object6.setLikes(123456);
        object6.setDislikes(321);
        object6.popularTF();
        object6.outputVideoInfo();
        //1.8 Call an object of constructors with arguments
        System.out.println(" ");
        Film object7 = new Film("'Life'", 2006, "Smith", 'M', 7.8);
        object7.outputFilmInfo();
    }
}