package final2021;
import java.util.*;

public class info {
  
  public static void info(){
    System.out.println("===========");
    System.out.println("ゲーム開始");
    System.out.println("===========");
  }
  public static void infocnt(){
    int cnt=0;
    cnt++;
    System.out.printf("~~~ターン%d~~~\n",cnt);

  }
  public static int numinput(){
    System.out.println("爆弾のx座標を入力");
    int tmp=new java.util.Scanner(System.in).nextInt();
    if(tmp<=5){
      System.out.printf("入力内容:%d\n",tmp);
    }else{
      System.out.printf("５以下の数値にしてください");
    }
    System.out.println("爆弾のy座標を入力");
    int tmp2=new java.util.Scanner(System.in).nextInt();
    if(tmp2<=5){
      System.out.printf("入力内容:%d\n",tmp2);
    }else{
      System.out.printf("５以下の数値にしてください");
    }
    return tmp;
    // int N=num.next.Int();
  }
}
