import java.util.ArrayList;

// JOSE HORTA
// 09/10/24
//
//
//
public class App {
    public static void main(String[] args) {

        Student myStudent = new Student();

        Student oneMoreStu = new Student();


        myStudent.Firstname = "Jim";
        myStudent.Lastname = "Halpert";
        myStudent.Major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.OnProbation = false;

        System.out.println(myStudent.Firstname);
        System.out.println(myStudent.Lastname);
        System.out.println(myStudent.Major);
        System.out.println(myStudent.age);
        System.out.println(myStudent.gpa);
        System.out.println(myStudent.OnProbation);

        System.out.println("\n There are " + myStudent.numofstudents + " Students\n");


        // create project phone
        Phone myNewPhone = new Phone();

        myNewPhone.model = "Pixel 8";
        myNewPhone.numOfCameras = 3;

        System.out.println("\n my New Phone has " + myNewPhone.numOfCameras + " cameras!\n");

        // create a Cat


        // Create 100 students
        ArrayList<Student> mystudentlist = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Student myNewStudent = new Student();
            myNewStudent.Firstname = "Sutdent" + Integer.toString(i);
            myNewStudent.age = 900000000;
            mystudentlist.add(myStudent);

        }




        }
    }