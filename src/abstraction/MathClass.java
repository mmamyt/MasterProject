package abstraction;

import java.time.LocalDate;

public class MathClass extends Student implements StudentInfo{

    LocalDate ld = LocalDate.now();

    @Override
    public int attendeesNumber(int numberOfAttendees) {
        return numberOfAttendees;
    }
    @Override
    public String studentName(String studentName){
        return studentName;
    }

    @Override
    public void grade(char grade) {
        System.out.println(grade);
    }

    @Override
    public String instructorName(String name) {
        return name;
    }

    @Override
    public void classSchedule() {
        System.out.println(String.valueOf(ld.getDayOfWeek()));
    }

    @Override
    public String todayTopic(String topic) {
        return topic;
    }

    @Override
    public String lastName(String lastName) {
        return lastName;
    }

    @Override
    public String email(String email) {
        return email;
    }

    @Override
    public int age(int age) {
        return age;
    }
}
