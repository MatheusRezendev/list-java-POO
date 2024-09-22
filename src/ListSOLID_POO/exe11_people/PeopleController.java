package ListSOLID_POO.exe11_people;

public class PeopleController {

    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
    }

    public int calculateLeapYear(People p){
        int leapYearCount = 0;
        int currentYear = java.time.LocalDate.now().getYear();
        int birthYear = currentYear - p.getAge();

        for(int year = birthYear; year <+ currentYear; year++){
            if(isLeapYear(year)){
                leapYearCount++;
            }
        }
        return leapYearCount;
    }

    public void displayPeople(People p){
        System.out.print("Name: " + p.getName());
        System.out.print("\nAge: " + p.getAge());
        System.out.print("\nProfession: " + p.getProfession());
        System.out.print("\nAge in leap year: " + calculateLeapYear(p));
    }
}
