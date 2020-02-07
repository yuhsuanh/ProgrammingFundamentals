/**
 * Write a description of class StudentRecordTestHarness here.
 *
 * @author Yu-Hsuan Huang
 * @version 1.0.0
 */
import java.util.Scanner;

public class StudentRecordTestHarness
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tempStr = ""; //template string
        
        //Student1
        StudentRecord studentRec1 = new StudentRecord("Yu-Hsuan", "Huang", 200443723, 98);
        studentRec1.showStudentInfo();
        
        //Student2 from user
        StudentRecord studentRec2 = new StudentRecord();
        
        System.out.print("Student Frist Name : ");
        studentRec2.setFirstName(input.nextLine());
        
        System.out.print("Student Last Name : ");
        studentRec2.setLastName(input.nextLine());
        
        System.out.print("Student ID (9 digits) : ");
        studentRec2.setStudentID(input.nextInt());
        
        System.out.print("Grade (bwtween 0 and 100) : ");
        studentRec2.setGradeCourseOne(input.nextInt());
        
        studentRec2.showStudentInfo();
        input.close();
    }
    
    /*
    public static boolean isNumber(String id) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(id);
        return isNum.matches();
    }
    */
}
