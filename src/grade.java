/**
 * Created by SANJU on 5/5/2022.
 */
public class grade {
    int gradeId;
    String gradeName;
    String classTeacherName;
    int numOfStudents;

    public grade() {
    }

    public grade(int gradeId,String gradeName, String classTeacherName, int numOfStudents) {
        this.gradeId=gradeId;
        this.gradeName=gradeName;
        this.classTeacherName=classTeacherName;
        this.numOfStudents=numOfStudents;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getGradeId() {
        return gradeId;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String toString2() {
        return "grade{" +
                "gradeId='" + gradeId + '\'' +
                ", classTeacherName='" + classTeacherName + '\'' +
                ", numOfStudents=" + numOfStudents +
                '}';
    }
}
