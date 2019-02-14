import java.util.Arrays;

/**
 * 希尔排序java实现
 *
 * @author changshengee
 * @date 2019/02/12
 **/
public class ShellSort {

  public static void main(String[] args) {
    int[] arr1 = {1, 5, 3, 7, 9, 2};
    swapSort(arr1);
    System.out.println(Arrays.toString(arr1));
    int[] arr2 = {1, 5, 3, 7, 9, 2};
    moveSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }

  /**
   * 希尔排序，针对有序序列，在插入时采用移动法
   *
   * @param arr 数组
   */
  private static void moveSort(int[] arr) {
    int range = 2;
    //增量gap，并逐步缩小增量
    for (int gap = arr.length / range; gap > 0; gap /= range) {
      //从第gap个元素，逐个对其所在组直接进行直接插入排序
      for (int i = gap; i < arr.length; i++) {
        int j = i;
        int temp = arr[j];
        if (arr[j] < arr[j - gap]) {
          while (j - gap > 0 && temp < arr[j - gap]) {
            arr[j] = arr[j - gap];
            j -= gap;
          }
          arr[j] = temp;
        }
      }
    }


  }

  /**
   * 希尔排序，针对有序序列，在插入时采用交换法
   *
   * @param arr 数组
   */
  private static void swapSort(int[] arr) {
  //todo

  }


}
