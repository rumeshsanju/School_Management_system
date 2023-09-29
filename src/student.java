/**
 * Created by SANJU on 5/12/2022.
 */
public class student {
    int studentId;
    String studentName;
    String grades;
    String gender;
    String phoneNum;

    public student() {
    }

    public student(int studentId, String studentName,String grade, String gender, String phoneNum) {
        this.studentId = studentId;
        this.studentName=studentName;
        this.gender=gender;
        this.phoneNum=phoneNum;
    }

    public void setGrade(String grades) {
        this.grades = grades;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String toString5() {
        return  "studentId = " + studentId + "\n"+
                "studentName = " + studentName + "\n" +
                "grade = " +grades+ "\n"+
                "gender = " + gender + "\n" +
                "phoneNum = " + phoneNum ;
    }
}
