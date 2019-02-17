/**
 * p53 2.15
 *
 *
 * 给出一个算法来确定在整数A1<A2<A3<A4...<An 的数组中是否存在Ai使得Ai=i;
 *
 * @author changshengee
 * @date 2019/02/17
 **/
public class Practice2 {

  public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, 5};

    System.out.println(presence(arr));
  }

  /**
   * 运行时间 O(n)
   * @param arr 数组
   * @return 存在
   */
  private static boolean presence(int[] arr) {
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr.length) {
        break;
      }
      if (arr[i] == i-1) {
        flag = true;
      }
    }
    return flag;
  }

}
