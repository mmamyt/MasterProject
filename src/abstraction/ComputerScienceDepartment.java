package abstraction;

public class ComputerScienceDepartment {
    public static void main(String[] args) {

        MathClass math = new MathClass();
        int studentAttendees = math.attendeesNumber(55);
        math.studentName("Jack");
        math.grade('A');
        math.classSchedule();
        String name = math.instructorName("John Sparks");
        String topic = math.todayTopic("Math");

        System.out.println(studentAttendees);
        System.out.println(name);
        System.out.println(topic);
        System.out.println(math.lastName("DeNiro"));
        System.out.println(math.email("deniro@gmail.com"));


    }
}
