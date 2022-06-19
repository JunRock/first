public class Student {
    private	String sno;
    private	String name;
    private	String addr;
    private	String cell;
    private	String dept;
    private	int grade;
    private	char sex;
    private int[] scores;
    private double avg;
    static double max = 0 ;

    Student() {
        sno = "";
        name = "";
    }
    Student(String name) {
        this.name = name;
        sno = "";
    }
    Student(String name , String sno) {
        this.name = name;
        this.sno = sno;
    }
    public void setSno(String s) {
        sno = s;
    }
    public void setName(String n) {
        name = n;
    }
    public void setAddr(String a) {
        addr = a;
    }
    public void setCell(String c) {
        cell = c;
    }
    public void setDept(String d) {
        dept = d;
    }
    public void setGrade(int g) {
        grade = g;
    }
    public void setSex(char x) {
        sex = x;
    }
    public void setScores(int[] r) {
        scores = r;
    }
    public void setAddrCell(String a , String c) {
        addr = a;
        cell = c;
    }
    public void setGradeDept(String d,int g) {
        dept = d;
        grade = g;
    }
    public String getSno() {
        return sno;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
    public String getCell() {
        return cell;
    }
    public String getDept() {
        return dept;
    }
    public int getGrade() {
        return grade;
    }
    public char getSex() {
        return sex;
    }
    public int[] getScores() {
        return scores;
    }
    public double getAvg(int[] s) {
        double sum = 0;
        int count = 0;
        for(int i = 0; i<s.length; i++) {
            sum += getScores()[i];
            count++;
        }
        avg = sum / count;
        return avg;
    }

}
