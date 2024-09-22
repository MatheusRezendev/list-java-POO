package ListSOLID_POO.exe11_people;

public class Main {
    public static void main(String[] args) {

        People p = new People();
        PeopleController pc = new PeopleController();
        InputPeople i = new InputPeople();

        i.inputPeople(p);
        pc.displayPeople(p);
        pc.calculateLeapYear(p);
    }
}