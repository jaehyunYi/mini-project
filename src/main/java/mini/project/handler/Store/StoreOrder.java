package mini.project.handler.Store;

import java.util.ArrayList;
import java.util.Scanner;
import mini.project.Main.App;
import mini.project.Main.Dummies;


/**
 * 점포 - 2.고객 주문 조회 클래스
 *
 */
public class StoreOrder {

  private ArrayList<String> orderNum = new ArrayList<String>(); // 주문번호
  private ArrayList<String> orderName = new ArrayList<String>(); // 주문자명
  private ArrayList<String> orderPhone = new ArrayList<String>(); // 주문자 전화번호
  private ArrayList<String> orderAddress = new ArrayList<String>(); // 주문자 주소
  private ArrayList<String> orderMenu = new ArrayList<String>(); // 주문상품
  private ArrayList<String> orderPrice = new ArrayList<String>(); // 결제금액
  private ArrayList<String> orderResult = new ArrayList<String>(); // 배달 결과
  private ArrayList<String> orderID = new ArrayList<String>(); // 주문자 ID
  private ArrayList<String> list = new ArrayList<String>(); // 조회리스트 목록
  private String num_accept = "null";

  /**
   * 주문 조회 메인메소드
   */
  @SuppressWarnings("unused")
  public void main() {

    StoreMain storemain = new StoreMain();
    Scanner scan = new Scanner(System.in);
    int orderNum = 1;
    boolean loop = true;
    while (loop) {
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("\n\n\n\n\t\t== 고객 주문 조회 ==\n");
      System.out.print("\t\t(현재 주문목록보기를 원하시면 1번을 입력해주세yo)\n\n");
      System.out.println("\t(뒤로가기를 원하면 0번을 입력해주세yo)\n");
      System.out.print("\t\t입력 : ");
      String num_order = scan.nextLine();
      System.out.println("\n");

      if (num_order.equals("1")) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\t\t== 현재 주문목록 ==\n");
        System.out.println("주문번호\t주문자명\t주소\t\t전화번호\n");
        if (this.num_accept.equals("1")) {
          orderNum = 1;
          String name = "";
          for (int i = 0; i < Dummies.order.size(); i++) {
            String memberID = Dummies.nomember.get(i).getNomemberID();
            String ordernum = "";
            for(int j=0; j<this.orderNum.size(); j++) {
              if(this.list.get(j).contains(memberID)) {
                ordernum = this.orderNum.get(j);
              }
            }
            String slist = String.format("  %s\t\t%s\t%s\t%s\n", ordernum, this.orderName,
                this.orderAddress, this.orderPhone);
            System.out.println(slist);
            break;
          }
        }
      }else break;

      System.out.println("\t(뒤로가기를 원하면 엔터를 입력해주세yo)\n");
      System.out.print("\t\t상세보기\n\n");
      System.out.print("\t\t입력 : ");
      String num = scan.nextLine();
      System.out.println("\n");

      if (num.equals("0")) {
        loop = false;
      } else if (num.equals("1")) {
        findordernumber(false);
        App.pause();
        loop = false;
      }
    }
  }



  /**
   * 주문번호로 검색하여 조회해주는 메소드
   */
  public void findordernumber(boolean b) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("\t\t주문번호 : ");
    String num_order = scan.nextLine();
    System.out.println("\n");
    String id = "";
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list.get(i).contains(num_order)) {
        System.out.printf("\t\t주문번호 : %s\n\n", this.orderNum.get(i));
        System.out.printf("\t\t주문자명 : %s\n\n", this.orderName.get(i));
        System.out.printf("\t\t전화번호 : %s\n\n", this.orderPhone.get(i));
        System.out.printf("\t\t주소 : %s\n\n", this.orderAddress.get(i));
        System.out.printf("\t\t주문상품 : %s\n\n", this.orderMenu.get(i));
        System.out.printf("\t\t결제금액 : %,d원\n\n", Integer.parseInt(this.orderPrice.get(i)));
        id = this.orderID.get(i);
        break;
      }
    }
  }
}