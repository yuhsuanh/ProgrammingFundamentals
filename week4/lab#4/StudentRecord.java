/**
 * Write a description of class StudentRecord here.
 *
 * @author Yu-Hsuan Huang
 * @version 1.0.0
 */
public class StudentRecord {
    private String firstName;
    private String lastName;
    private int studentID;
    private int gradeCourseOne;
    
    // Constructor : no argument
    public StudentRecord() {}
    
    /**
     * Constructor : 4 arguments  
     * @param firstName Student first name
     * @param lastName Student last name
     * @param studentID Student ID
     * @param gradeCourseOne 
     */
    public StudentRecord(String firstName, String lastName, int studentID, int gradeCourseOne) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.gradeCourseOne = gradeCourseOne;
    }

    // Getter and Setter 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGradeCourseOne() {
        return gradeCourseOne;
    }

    public void setGradeCourseOne(int gradeCourseOne) {
        this.gradeCourseOne = gradeCourseOne;
    }
    
    /**
     * Convert percent grade to letter grade
     * @param percentGrade from 0-100
     * @return
     */
    public String convertLetterGrade() {
        int percentGrade = gradeCourseOne;
        if (percentGrade >= 90) {
            return "A";
        } else if (percentGrade >= 80 && percentGrade < 90) {
            return "B";
        } else if (percentGrade >= 70 && percentGrade < 80) {
            return "C";
        } else if (percentGrade >= 60 && percentGrade < 70) {
            return "D";
        } else if (percentGrade >= 50 && percentGrade < 60) {
            return "E";
        } else {
            return "F";
        }
    }
    
    /**
     * Count How many Vowel on string (k), if the string length matched.
     * If no such value of k exists, then -1 is returned.
     * @param str
     * @param length
     * @return return
     */
    public int countVowels() {
        final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        int idxStr = 0;
        int idxVow = 0;
        
        if(firstName.length() != 5)
            return -1;
        
        String tempStr = firstName.toLowerCase();
        while(idxStr < tempStr.length()) {
            idxVow=0;
            while(idxVow < VOWELS.length) {
                if(tempStr.charAt(idxStr) == VOWELS[idxVow]) {
                    count++;
                }
                idxVow++;
            }
            idxStr++;
        }
        return count;
    }
    
    /**
     * Show Student Information
     * First Name, Last Name, Student ID
     * How many vowel on first name, if first name length is 5 
     * Grade Course One Information
     */
    public void showStudentInfo() {
        int tempInt = this.countVowels();
        
        System.out.println("\nFirst Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Student ID: " + studentID);
        System.out.print("How many vowel on first name (if first name length is 5)? ");
        if(tempInt != -1) {
            System.out.println(tempInt);
        } else {
            System.out.println("length is not 5");
        }
        System.out.println(gradeCourseOne + "\t" + this.convertLetterGrade());
        System.out.print("\n");
    }
    
}

