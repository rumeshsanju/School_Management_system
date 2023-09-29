/**
 * Created by SANJU on 5/12/2022.
 */
public class bookStore {
    int bookId;
    String subject;
    int grade;
    String medium;
    int qty;

    public bookStore() {
    }

    public  bookStore(int bookId, String subject, int grade, String medium, int qty){
        this.bookId=bookId;
        this.subject=subject;
        this.grade=grade;
        this.medium=medium;
        this.qty=qty;

    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setAmount(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }


    public String toString1() {
        return  " bookId = " + bookId +"\n"+
                " subject = " + subject + "\n" +
                " grade = " + grade +"\n"+
                " medium = " + medium + "\n" +
                " qty = " + qty + "\n";
    }

    public void getBook(int take){
        qty-=take;
        System.out.println("get "+take+ " books");
        System.out.println("new book stock details,\n"+toString1());

    }

    public void storeBook(int store){
        qty+=store;
        System.out.println("store "+store+ " books");
        System.out.println("new book stock details,\n "+toString1());

    }

}
