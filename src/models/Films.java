package models;

import java.util.Scanner;

public class Films {
    String title;
    String yearOfRelease;
    String genres;
    String synopsis;
    String duration;

    public void add(){

        Scanner get = new Scanner(System.in);
        System.out.println("What's the title of movie? ");
        title = get.nextLine();

        System.out.println("What's the year of movie was released? ");
        yearOfRelease = get.nextLine();

        System.out.println("What's the genre of movie? ");
        genres = get.nextLine();

        System.out.println("What's the synopsis of movie? ");
        synopsis = get.nextLine();

        System.out.println("What's the duration of movie? ");
        duration = get.nextLine();

        get.close();

    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Year of release: "+yearOfRelease);
        System.out.println("Genre: "+genres);
        System.out.println("Synopsis: "+synopsis);
        System.out.println("Duration: "+duration);

    }
}
