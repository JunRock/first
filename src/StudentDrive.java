
import java.util.Scanner;

public class StudentDrive {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student student[] ;
        int number = 0;

        System.out.println("총 학생수를 입력하시오: ");
        number = in.nextInt();

        student = new Student[number];
        for(int i = 0; i<student.length; i++) {
            student[i] = new Student();
        }
        for(int i = 0; i<student.length; i++) {
            System.out.println("신상정보를 입력하시오.");
            System.out.print("학번을 입력하시오: ");
            String sno = in.next();
            student[i].setSno(sno);
            System.out.print("이름을 입력하시오: ");
            String name = in.next();
            student[i].setName(name);
            System.out.print("전화번호를 입력하시오: ");
            String cell = in.next();
            student[i].setCell(cell);
            System.out.print("학과를 입력하시오: ");
            String dept = in.next();
            student[i].setDept(dept);
            System.out.print("학년을 입력하시오: ");
            int grade = in.nextInt();
            student[i].setGrade(grade);

            System.out.println("과목점수들을 입력하시오: ");
            int jumsu[] = new int[3];
            for(int j = 0; j<jumsu.length;j++) {
                jumsu[j] = in.nextInt();
            }
            student[i].setScores(jumsu);
            System.out.print("학번:" + student[i].getSno() + "\t" + "이름:" + student[i].getName());
            System.out.println();
            System.out.print("전화번호:" +student[i].getCell());
            System.out.println();
            System.out.print("학과:" + student[i].getDept() + "\t" + "학년:" + student[i].getGrade());
            System.out.println();

            System.out.print(student[i].getName() + "'s 과목성적");
            for(int k = 0; k<jumsu.length;k++) {
                System.out.print("점수[" + (k+1) + "] " + student[i].getScores()[k] + "\t" );
            }
            System.out.println();
            System.out.print(student[i].getName() + "'s 평균 :" + student[i].getAvg(student[i].getScores()));
            System.out.println();
        }

        System.out.print("성적이 가장 좋은 학생의 정보는 "+get1stStudent(student));
        in.close();
    }
    static String get1stStudent(Student[] student) { //성적이 제일 높은 학생을 반환해주는 클래스
        double max = 0; int i;
        for(i = 0; i<student.length;i++) {
            if(max<student[i].getAvg(student[i].getScores())) {
                max = student[i].getAvg(student[i].getScores());
            }
        }
        for(int j = 0; j<student.length;j++) {
            if(max == student[j].getAvg(student[j].getScores())) {
                //기존 형 코드
                //System.out.println("학번: "+ student[j].getSno() + "\t" + "이름: " + student[j].getName() + "\t" + "전화번호: "+ student[j].getCell() + "\t" + "학과: " + student[j].getDept() + "\t" + "학년: " + student[j].getGrade());

                //String객체를 새로 만든 후 거기에 String형으로 저장하여 해당 변수를 반환해주는 방법 1
                String str="학번: "+ student[j].getSno() + "\t" + "이름: " + student[j].getName() + "\t" + "전화번호: "+ student[j].getCell() + "\t" + "학과: " + student[j].getDept() + "\t" + "학년: " + student[j].getGrade();

               //변수선언없이 바로 return 해주는 방법
                //return "학번: "+ student[j].getSno() + "\t" + "이름: " + student[j].getName() + "\t" + "전화번호: "+ student[j].getCell() + "\t" + "학과: " + student[j].getDept() + "\t" + "학년: " + student[j].getGrade();

                return str;//1번 방법 사용, 난 1번 사용
            }
        }
        return null; //이 문장이 없으면 메서드 전체에서 반환해주는 문장이 없기 때문에 에러 발생
    }
}
