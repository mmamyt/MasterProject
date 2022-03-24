package varargs;

public class University {
    String [] studentName;

    public University(String ... args) {
        this.studentName = args;
    }

    public static void main(String[] args) {
        University ui = new University("Ken", "Ross");
        System.out.println(ui.studentName[0]);

        University uw = new University("Monica", "Rachel");
        System.out.println(uw.studentName[1]);
    }
}
