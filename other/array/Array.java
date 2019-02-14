/**
 * 二维数组
 *
 * @author changshengee
 * @date 2019/02/14
 **/
public class Array {

  public static void main(String[] args) {
    int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
    int num = 11;
    System.out.println("暴力解题：" + directFind(arr, num));
  }

  /**
   * 暴力破解
   *
   * @param arr 二维数组
   * @param num 目标数
   * @return 布尔
   */
  private static boolean directFind(int[][] arr, int num) {
    boolean flag = false;
    for (int[] inner : arr) {
      for (int current : inner) {
        if (current == num) {
          flag = true;
        }
      }
    }
    return flag;
  }

}
