package mini.project.Main;

import java.util.Scanner;
import mini.project.handler.Rider.RiderMain;
import mini.project.handler.Store.StoreMain;
import mini.project.handler.nomember.NoMemberMain;

public class App {
  private static Scanner scan ;
  //1번 생성 후 아래 루프에서 계속적으로 활용가능.

  static { //정적생성자
    scan = new Scanner(System.in);
  }

  //프로그램의 시작을 담당하는 Main클래스의 main메소드
  public static void main(String[] args) {

    //불러오기
    Dummies dum = new Dummies();
    dum.dummy();


    // 업무
    System.out.println("\n\n\n\t\t\t비 트 배 달\n\n");

    hello();

    // 메뉴출력 > 항목선택 > 기능실행
    boolean loop = true;
    while(loop) {
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("\t\t\t1.  회원\n");
      System.out.println("\t\t\t2.  점포\n");
      System.out.println("\t\t\t3.  라이더\n");
      System.out.println("\n");


      System.out.println("\n\n\t   (종료를 원하시면 0을 입력해주세yo)");
      System.out.print("\n\t\t  이동할 화면 입력(숫자): ");
      String selNum = scan.nextLine();
      if (selNum.equals("1")) {
        //회원으로 이동
        NoMemberMain nm = new NoMemberMain();
        nm.nomemberMain();
      } else if (selNum.equals("2")) {
        StoreMain s = new StoreMain();
        s.storeMain();
      } else if (selNum.equals("3")) {
        //라이더로 이동
        RiderMain r = new RiderMain();
        r.ridermainmain();
      } else if (selNum.equals("0")) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\t\t\t  종료");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        loop = false;
      } else {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t올바르지 않은 접근입니다.");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t   계속하시려면 엔터키를 입력해주세요");
        scan.nextLine();
      }
    }





  }//main
  private static void hello() {
    System.out.println("\r\n\t      시키면.. 개발 잘할 수 있을까요..?\n\n");
    pause();
  }

  public static void pause() {
    // 일시정지
    System.out.println("\n\n\t      계속하시려면 엔터를 입력하세요");
    System.out.println("\t        PRESS ENTER TO CONTUNUE...");
    scan.nextLine();
  }


}//class