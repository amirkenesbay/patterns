package example_of_inheritance.example3;

public class Programmer extends OutsourcingCompany implements Employee{
    @Override
    public void doWork() {
        System.out.println("Programmer - writing a code;");
    }
}
