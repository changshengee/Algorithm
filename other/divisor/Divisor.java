/**
 * 最大公约数问题
 *
 * @author changshengee
 * @date 2019/02/13
 **/
public class Divisor {

  public static void main(String[] args) {

    System.out.println(divisor(30, 18));

  }

  private static int divisor(int a, int b) {
    int res;
    //如果a<b 交换a b
    if (a < b) {
      swap(a, b);
    }
    int residue = a % b;
    while (residue != 0) {
      a = b;
      b = residue;
      residue = a % b;
    }
    res = b;
    return res;
  }

  private static void swap(int a, int b) {
    int temp = a + b;
    a = temp - a;
    b = temp - b;
  }

}
