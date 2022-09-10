package Lesson_5;

public class Stuff {
    private String FIO;
    private String Position;
    private String Email;
    private String TelNumber;
    private int Salary;
    protected int Age;

    Stuff(){}

    Stuff(String FIO, String Position, String Email, String TelNumber, int Salary, int Age){
        this.FIO = FIO;
        this.Position = Position;
        this.Email = Email;
        this.TelNumber = TelNumber;
        this.Salary = Salary;
        this.Age = Age;
    }


    void getStuffInformation(){
        System.out.println("ФИО: " + FIO + " Должность: " + Position + " Email: " + Email + " Номер телефона: " + TelNumber + " Зарплата: " + Salary + " Возраст: " + Age);
    }
}
