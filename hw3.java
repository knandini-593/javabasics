class Employee{
    String name;
    double baseSalary;
    void displayBasicInfo(){
        System.out.println("name:" +name );
        System.out.println("baseSalary:" +baseSalary);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    void writeCode(){
        System.out.println("programmingLanguage:" +programmingLanguage);
    }
}
class Tester extends Employee{
    String testingTool;
    void runTests(){
        System.out.println("testingTool" +testingTool);
    }
}
public class hw3 {
    public static void main(String[] args){
        Developer d=new Developer();
        Tester t=new Tester();
        d.name="Nandini";
        d.baseSalary=50000;
        d.programmingLanguage="java";
        t.name="Priya";
        t.baseSalary=45000;
        t.testingTool="Selenium";
        t.displayBasicInfo();
        t.runTests();
    }

}
