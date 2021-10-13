import java.util.Scanner;

  public class Circle{
    public static void main(String[] args) {

    // 標準入力からデータを読み込む準備
    Scanner sc = new Scanner(System.in);

    double r = sc.nextDouble();
    double pi = Math.PI;
    double area = r*r*pi;
    double length = r*2*pi;

    System.out.printf("%f %f",area, length);
    sc.close();
}
}



