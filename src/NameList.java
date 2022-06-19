import java.util.Scanner;

public class NameList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumsu[];

        Student hong = new Student();
        Student seong = new Student("성춘향");
        Student elsa = new Student("엘사");
        Student so = new Student("소지섭","201603156");
        Student xman = new Student("엑스맨","201804434");


        hong.setName("홍길동");
        hong.setSno("201803129");
        hong.setAddr("경기도 평택시");
        hong.setCell("010-111-2222");
        hong.setDept("컴퓨터공학과");
        hong.setGrade(1);
        hong.setSex('M');

        System.out.println("성적을 입력하세요:");
        jumsu = new int[3];
        for(int i = 0; i<jumsu.length;i++) {
            jumsu[i] = in.nextInt();
        }
        hong.setScores(jumsu);
        System.out.print("학번:" + hong.getSno() + "\t" + "이름:" + hong.getName());
        System.out.println();
        System.out.print("주소:" + hong.getAddr() + "\t" + "전화번호:" + hong.getCell());
        System.out.println();
        System.out.print("학과:" + hong.getDept() + "\t" + "학년:" + hong.getGrade());
        System.out.println();
        System.out.print("성별:" + hong.getSex());
        System.out.println();

        System.out.print(hong.getName() + "'s 과목성적");
        for(int i = 0; i<jumsu.length;i++) {
            System.out.print("점수[" + (i+1) + "] " + hong.getScores()[i] + "\t" );
        }
        System.out.println();
        System.out.print(hong.getName() + "'s 평균 :" + hong.getAvg(hong.getScores()));
        System.out.println();

        seong.setSno("201705633");
        seong.setAddr("서울시 목동");
        seong.setCell("010-3333-6666");
        seong.setDept("패션디자인");
        seong.setGrade(2);
        seong.setSex('F');

        System.out.println("성적을 입력하세요:");
        jumsu = new int[3];
        for(int i = 0; i<jumsu.length;i++) {
            jumsu[i] = in.nextInt();
        }
        seong.setScores(jumsu);
        System.out.print("학번:" + seong.getSno() + "\t" + "이름:" + seong.getName());
        System.out.println();
        System.out.print("주소:" + seong.getAddr() + "\t" + "전화번호:" + seong.getCell());
        System.out.println();
        System.out.print("학과:" + seong.getDept() + "\t" + "학년:" + seong.getGrade());
        System.out.println();
        System.out.print("성별:" + seong.getSex());
        System.out.println();

        System.out.print(seong.getName() + "'s 과목성적");
        for(int i = 0; i<jumsu.length;i++) {
            System.out.print("점수[" + (i+1) + "] " + seong.getScores()[i] + "\t" );
        }
        System.out.println();
        System.out.print(seong.getName() + "'s 평균 :" + seong.getAvg(seong.getScores()));
        System.out.println();

        elsa.setSno("201823404");
        elsa.setAddr("미국 오레곤주");
        elsa.setCell("050-3333-4566");
        elsa.setDept("시각디자인");
        elsa.setGrade(1);
        elsa.setSex('F');

        System.out.println("성적을 입력하세요:");
        jumsu = new int[3];
        for(int i = 0; i<jumsu.length;i++) {
            jumsu[i] = in.nextInt();
        }
        elsa.setScores(jumsu);
        System.out.print("학번:" + elsa.getSno() + "\t" + "이름:" + elsa.getName());
        System.out.println();
        System.out.print("주소:" + elsa.getAddr() + "\t" + "전화번호:" + elsa.getCell());
        System.out.println();
        System.out.print("학과:" + elsa.getDept() + "\t" + "학년:" + elsa.getGrade());
        System.out.println();
        System.out.print("성별:" + elsa.getSex());
        System.out.println();

        System.out.print(elsa.getName() + "'s 과목성적");
        for(int i = 0; i<jumsu.length;i++) {
            System.out.print("점수[" + (i+1) + "] " + elsa.getScores()[i] + "\t" );
        }
        System.out.println();
        System.out.print(elsa.getName() + "'s 평균 :" + elsa.getAvg(elsa.getScores()));
        System.out.println();

        so.setAddr("서울시 강남구");
        so.setCell("010-8888-2222");
        so.setDept("데이터정보");
        so.setGrade(3);
        so.setSex('M');

        System.out.println("성적을 입력하세요:");
        jumsu = new int[3];
        for(int i = 0; i<jumsu.length;i++) {
            jumsu[i] = in.nextInt();
        }
        so.setScores(jumsu);
        System.out.print("학번:" + so.getSno() + "\t" + "이름:" + so.getName());
        System.out.println();
        System.out.print("주소:" + so.getAddr() + "\t" + "전화번호:" + so.getCell());
        System.out.println();
        System.out.print("학과:" + so.getDept() + "\t" + "학년:" + so.getGrade());
        System.out.println();
        System.out.print("성별:" + so.getSex());
        System.out.println();

        System.out.print(so.getName() + "'s 과목성적");
        for(int i = 0; i<jumsu.length;i++) {
            System.out.print("점수[" + (i+1) + "] " + so.getScores()[i] + "\t" );
        }
        System.out.println();
        System.out.print(so.getName() + "'s 평균 :" + so.getAvg(so.getScores()));
        System.out.println();

        xman.setAddr("영국 리딩");
        xman.setCell("056-3330-1111");
        xman.setDept("정보통신");
        xman.setGrade(1);
        xman.setSex('M');

        System.out.println("성적을 입력하세요:");
        jumsu = new int[3];
        for(int i = 0; i<jumsu.length;i++) {
            jumsu[i] = in.nextInt();
        }
        xman.setScores(jumsu);
        System.out.print("학번:" + xman.getSno() + "\t" + "이름:" + xman.getName());
        System.out.println();
        System.out.print("주소:" + xman.getAddr() + "\t" + "전화번호:" + xman.getCell());
        System.out.println();
        System.out.print("학과:" + xman.getDept() + "\t" + "학년:" + xman.getGrade());
        System.out.println();
        System.out.print("성별:" + xman.getSex());
        System.out.println();

        System.out.print(xman.getName() + "'s 과목성적");
        for(int i = 0; i<jumsu.length;i++) {
            System.out.print("점수[" + (i+1) + "] " + xman.getScores()[i] + "\t" );
        }
        System.out.println();
        System.out.print(xman.getName() + "'s 평균 :" + xman.getAvg(xman.getScores()));
        in.close();
    }

}
