/**
 * Created by SANJU on 5/5/2022.
 */
import java.util.Scanner;
public class studentReport {
    int reportId;
    String stuName;
    String grades;
    int english,sinhala,maths,science,history;
    int total;
    double average;


    public studentReport(int reportId,String stuName,String grades) {
        this.reportId = reportId;
        this.stuName= stuName;
        this.grades=grades;
    }

    public void makeReport(){

        Scanner x=new Scanner(System.in);
        System.out.println("enter english mark");
        english=x.nextInt();
        System.out.println("enter maths mark");
        maths=x.nextInt();
        System.out.println("enter science mark");
        science=x.nextInt();
        System.out.println("enter sinhala mark");
        sinhala=x.nextInt();
        System.out.println("enter history mark");
        history=x.nextInt();

        total=english+maths+science+sinhala+history;
        average=total/5;
        System.out.println("report was created");
    }

    public void printReport(){

        System.out.println("***********************");
        System.out.println("student name = " +stuName);
        System.out.println("Report id = "+reportId);
        System.out.println("Student grade = "+grades);
        System.out.println("***********************");
        System.out.println(" english mark = "+english);
        System.out.println(" sinhala mark = "+sinhala);
        System.out.println(" matha mark   = "+maths);
        System.out.println(" science mark = "+science);
        System.out.println(" history mark = "+history);
        System.out.println("***********************");
        System.out.println(" Total        = "+total);
        System.out.println(" Average      = "+average);


    }


}


