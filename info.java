package pkg0712;

public class info {
    public static int cnt=0;
  // public static void rn(){
    
  // }
  public static int ran(){
    Random random = new Random();
    int randomValue = random.nextInt(5);
    int randomValue2 = random.nextInt(5);
    int randomValue3 = random.nextInt(5);
    System.out.println(randomValue);
    System.out.println(randomValue2);

  }
  public static void info(){
    System.out.println("===========");
    System.out.println("ゲーム開始");
    System.out.println("===========");
  }
  public static void infocnt(){
    cnt+=1;
    System.out.printf("~~~ターン%d~~~\n",cnt);

  }
  public static void numinput(){
    System.out.println("爆弾のx座標を入力");
    int tmp=new java.util.Scanner(System.in).nextInt();
    if(tmp<=5){
      System.out.printf("入力内容:%d",tmp);
    }else{
      System.out.printf("５以下の数値にしてください");
    }
    System.out.println("爆弾のy座標を入力");
    int tmp2=new java.util.Scanner(System.in).nextInt();
    if(tmp2<=5){
      System.out.printf("入力内容:%d",tmp2);
    }else{
      System.out.printf("５以下の数値にしてください");
    }

    // int N=num.next.Int();
  }
}
