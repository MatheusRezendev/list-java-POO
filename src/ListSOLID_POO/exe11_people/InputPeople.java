package ListSOLID_POO.exe11_people;

import java.util.Scanner;

public class InputPeople {

    Scanner sc = new Scanner(System.in);

    public void inputPeople(People p) {
        System.out.println("Enter the name of the people: ");
        p.setName(sc.next());

        System.out.println("Enter the age of the people: ");
        p.setAge(sc.nextInt());

        System.out.println("Enter the profession of the people: ");
        p.setProfession(sc.next());

    }
}
