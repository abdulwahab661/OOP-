public class Demo{

    public static void main(String[] args) {

        
        Principal principal = new Principal("Ali Naveed", 50, 25);

        
        School school = new School("Science Vertex School", "abc Street", principal);

        
        Teacher teacher1 = new Teacher("Abdul Wahab", 40, "T01", "Mathematics");
        Teacher teacher2 = new Teacher("Ahmad Akhtar", 35, "T02", "Science");

        
        Classroom class1 = new Classroom("Grade 10", "G10", teacher1);
        Classroom class2 = new Classroom("Grade 11", "G11", teacher2);

        
        school.addClassroom(class1);
        school.addClassroom(class2);

        
        Student s1 = new Student("Haris", 15, 101);
        Student s2 = new Student("Hammad", 15, 102);
        Student s3 = new Student("Baddar", 15, 103);
        Student s4 = new Student("Zainab", 15, 104);
        Student s5 = new Student("Amna", 15, 105);
        Student s6 = new Student("Sara", 15, 106); 

        
        class1.addStudent(s1);
        class1.addStudent(s2);
        class1.addStudent(s3);
        class1.addStudent(s4);
        class1.addStudent(s5);
        class1.addStudent(s6); 

        
        System.out.println("\n================ SCHOOL DETAILS ================\n");
        System.out.println(school);

        
        Student s7 = new Student("Waqar", 15, 19);
        Student s8 = new Student("Waqar", 15, 19);
        System.out.println("Comparing students: " + (s7.equals(s8) ? "Both are the same Student" : "Both are different Students"));

       
        Teacher t1 = new Teacher("Ayaan Ali", 40, "T03", "History");
        Teacher t2 = new Teacher("Ayaan Ali", 40, "T03", "History");
        System.out.println("Comparing teachers: " + (t1.equals(t2) ? "Both are the same Teacher" : "Both are different Teachers"));
    }
}