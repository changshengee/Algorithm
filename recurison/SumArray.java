import org.junit.Test;

/**
 * 数组求和递归算法
 *
 * @author changshengee
 * @date 2019/02/19
 **/
public class SumArray {

  /**
   * 数组 前n个数 求和算法 线性递归版
   *
   * @param arr 数组
   * @param n   求和个数
   * @return 求和值
   */
  public int sum(int[] arr, int n) {
    if (n < 1) {
      // 平凡情况，递归基 -》直接计算
      return 0;
    } else {
      //一般情况 计算前n-1项之和，再加上第n项（arr[n-1]）
      return sum(arr, n - 1) + arr[n - 1];
    }
  }
  @Test
 public void test(){
    int[] arr={1,2,3,4,5};
    System.out.println(sum(arr,3));
  }
}
