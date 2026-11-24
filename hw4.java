class UniversityMember{
    int memberid;
    void checkIn()
    {
        System.out.println("Member checked in");
    }
}
class Staff extends UniversityMember{
    String department;
    void attendMeeting()
    {
        System.out.println("Attending Meeting" +department);
    }
}
class Professor extends Staff{
    String Subject;
    void conductLecture()
    {
        System.out.println("Conducting lecture on" +Subject);
    }
}
class AdminOfficer extends Staff{
    String officeRoom;
    void processFiles(){
        System.out.println("Processing files in room" +officeRoom);
    
    }
}
class hw4{
    public static void main(String[] arg){
        Professor p=new Professor();
        p.memberid=101;
        p.department="CSE";
        p.Subject="java";
        p.attendMeeting();
        p.conductLecture();
        System.out.println();
        AdminOfficer a=new AdminOfficer();
        a.memberid=102;
        a.department="Admin";
        a.officeRoom="A-10";
        a.checkIn();
        a.attendMeeting();
        a.processFiles();
    }
}