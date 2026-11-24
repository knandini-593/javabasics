class Student {
    private String name = "Nandini";
    private int rollnumber;

    public void getter() {
        System.out.println(name);
        System.out.println(rollnumber);
    }

    public void setter(int r) {
        rollnumber = r;
    }
}

public class getterandsetter {
    public static void main(String[] args) {
        Student s = new Student();
        s.getter();
        s.setter(40);
        s.getter();
    }
}