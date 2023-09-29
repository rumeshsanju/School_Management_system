/**
 * Created by SANJU on 5/6/2022.
 */
public class teacher {
    int teacherId;
    String teacherName;
    int age;
    String gender;
    String phoneNum;

    public teacher() {
    }

    public teacher(int teacherId, String teacherName,int age, String gender, String phoneNum) {
        this.teacherId = teacherId;
        this.teacherName=teacherName;
        this.age=age;
        this.gender=gender;
        this.phoneNum=phoneNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String toString4() {
        return "teacherId = " + teacherId +"\n" +
                "teacherName = " + teacherName +"\n" +
                "age = " +age +"\n" +
                "gender = " + gender + "\n" +
                "phoneNum = " + phoneNum ;
    }


}
