/**
 * Created by SANJU on 5/13/2022.
 */
import java.util.Scanner;
public class systemTest {

    public static void main(String[] args) {
        String position;
        int input, method, qty;

        student[] s = new student[100];
        teacher[] t = new teacher[50];
        studentReport[] r = new studentReport[100];
        grade[] g = new grade[30];
        bookStore[] b = new bookStore[20];
        sport[] sp = new sport[20];
        principle[] p = new principle[5];

         /*sample object creating ,we can create any num of objects as need ,but for testing
           created one object to each class,also we can change array size as need*/
        principle p1 = new principle(1, "S.T Ranasinha",34, "male", "077 987654");
        p[0] = p1;
        teacher t1 = new teacher(1, "S.S perera",34, "male", "077 87654");
        t[0] = t1;
        student s1 = new student(1, "R.S nuwan","10A", "male", "071 234567");
        s[0] = s1;
        sport sp1 = new sport(1, "cricket", "T.S ranathunga","071 234567", "2.00 p.m - 5.00 p.m", "monday");
        sp[0] = sp1;
        grade g1 = new grade(1, "6A", "T.S wijeerathna", 46);
        g[0] = g1;
        bookStore b1 = new bookStore(1, "maths", 6, "sinhala", 250);
        b[0] = b1;
        studentReport r1 = new studentReport(1, "R.S nuwan","10A");
        r[0] = r1;

        System.out.println("select principle,teacher or student?");
        Scanner z = new Scanner(System.in);
        position = z.nextLine();

        if("principle".compareTo(position) == 0) {
            System.out.println("select a number corresponding to the given funtions\n" +
                    " 1.view teachers data\n 2.view students data\n" +
                    " 3.view grade details\n 4.get Books from bookstore\n 5.store book\n 6.view bookstore details");
            method = z.nextInt();
            if (method == 1) {
                System.out.println("enter valid teacher id");
                input = z.nextInt();
                System.out.println(t[input - 1].toString4());
            } else if (method == 2) {
                System.out.println("enter valid student id");
                input = z.nextInt();
                System.out.println(s[input - 1].toString5());
            } else if (method == 3) {
                System.out.println("enter grade id");
                input = z.nextInt();
                System.out.println(g[input - 1].toString2());
            } else if (method == 4) {
                System.out.println("enter valid bookStore id");
                input = z.nextInt();
                System.out.println("enter qty of book need to get?");
                qty = z.nextInt();
                b[input - 1].getBook(qty);
            } else if (method == 5) {
                System.out.println("enter valid bookStorre id");
                input = z.nextInt();
                System.out.println("enter store qty of book?");
                qty = z.nextInt();
                b[input - 1].storeBook(qty);

            } else if (method == 6) {
                System.out.println("enter valid bookStore id");
                input = z.nextInt();
                System.out.println(b[input - 1].toString1());

            }

        }
        else  if ("teacher".compareTo(position) == 0) {
             System.out.println("select a number corresponding to the given funtions\n" +
                    " 1.makeReport and printReport\n 2.view students data\n" +
                    " 3.view grade details\n 4.View principle details\n 5.view bookstore details");
             method = z.nextInt();

             if (method == 1) {
                 System.out.println("enter valid report id");
                input = z.nextInt();
                r[input - 1].makeReport();
                System.out.println();
                r[input - 1].printReport();
             }
              else if (method == 2) {
                System.out.println("enter valid student id");
                input = z.nextInt();
                System.out.println(s[input - 1].toString5());
             }
              else if (method == 3) {
                System.out.println("enter grade id");
                input = z.nextInt();
                System.out.println(g[input - 1].toString2());
             }
              else if (method == 4) {
                System.out.println("enter valid principle id");
                input = z.nextInt();
                p[input - 1].toString6();
             }
              else if (method == 5) {
                System.out.println("enter valid bookStore id");
                input = z.nextInt();
                System.out.println(b[input - 1].toString1());
             }
        } else if ("student".compareTo(position) == 0) {
             System.out.println("select a number corresponding to the given funtions\n" +
                    " 1.printReport\n 2.View teachers data\n" +
                    " 3.view grade details\n 4.view sport details\n 5.view Principle details");
             method = z.nextInt();
              if (method == 1) {
                 System.out.println("enter valid report id");
                input = z.nextInt();
                r[input - 1].printReport();
             }
              else if (method == 2) {
                System.out.println("enter valid teacher id");
                input = z.nextInt();
                System.out.println(t[input - 1].toString4());
             }
              else if (method == 3) {
                System.out.println("enter valid grade id");
                input = z.nextInt();
                System.out.println(g[input - 1].toString2());
             }
              else if (method == 4) {
                System.out.println("enter valid sport id");
                input = z.nextInt();
                System.out.println(sp[input - 1].toString3());
             }
              else if (method == 5) {
                System.out.println("enter principle id");
                input = z.nextInt();
                System.out.println(p[input - 1].toString6());

            }

        }


    }

}