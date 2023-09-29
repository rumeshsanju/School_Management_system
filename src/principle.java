/**
 * Created by SANJU on 5/14/2022.
 */
public class principle {
    int principleId;
    String principleName;
    int age;
    String gender;
    String phoneNum;

    public principle() {
    }

    public principle(int principleId, String principleName,int age, String gender, String phoneNum) {
        this.principleId = principleId;
        this.principleName=principleName;
        this.age=age;
        this.gender=gender;
        this.phoneNum=phoneNum;
    }

    public void setPrincipleId(int principleId) {
        this.principleId = principleId;
    }

    public int getPrincipleId() {
        return principleId;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String toString6() {
        return "principle{" +
                "principleId=" + principleId +
                ", principleName='" + principleName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
