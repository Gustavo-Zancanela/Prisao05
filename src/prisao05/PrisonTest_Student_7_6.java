package prisao05;


import prisao05.Cell;

//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest_Student_7_6 {
    public static void main(String[] args){
        
        System.out.println(Prisoner_Student_7_6.getPrisonerCount());
          
        
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);
        
        Prisoner_Student_7_6 bubba = new Prisoner_Student_7_6("Bubba", 2.08, 4, cellA1);
        bubba.display();
        
        Prisoner_Student_7_6 twitch = new Prisoner_Student_7_6("Twitch", 1.78, 3, cellB1);
        twitch.display();
    }
}
