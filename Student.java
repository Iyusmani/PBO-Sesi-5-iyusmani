public class Student extends Person {
    private int numCourses;
    private String [] courses;
    private int [] grades;
    public Student(String name, String address){
        super(name, address);
        numCourses = 0;
        courses = new String[10];
        grades = new int[10];
    }
    public boolean addCourseGrade(String course, int grade){
        for(int i = 0; i < numCourses; i++){
            if(courses[i].equals(course)){
                grades[i] = grade;
                return true;
            }
        }
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
        return true;
    }
    public void printGrades(){
        for(int i = 0; i < numCourses; i++){
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }
    public double getAverageGrade(){
        int sum = 0;
        for(int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
        return (double)sum / numCourses;
    }
    public String toString(){
        return "Student: " + super.toString();
    }
}
