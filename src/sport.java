/**
 * Created by SANJU on 5/6/2022.
 */
public class sport {
    int sportId;
    String sportName;
    String coachName;
    String coachPhNum;
    String time;
    String date;

    public sport() {
    }

    public sport(int sportId,String sportName, String coachName,String coachPhNum, String time, String date) {
        this.coachPhNum=coachPhNum;
        this.sportId= sportId;
        this.sportName = sportName;
        this.coachName=coachName;
        this.time=time;
        this.date=date;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void setCoachPhNum(String coachPhNum) {
        this.coachPhNum = coachPhNum;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String toString3() {
        return "sportId = " + sportId +"\n"+
                "sportName = " + sportName +"\n" +
                "coachName = " + coachName +"\n"  +
                "coach phone Number = " + coachPhNum+ "\n"+
                "time = " + time + "\n" +
                "date = " + date ;
    }
}
