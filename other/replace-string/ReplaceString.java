import java.util.Arrays;

/**
 * 替换空格
 *
 * @author changshengee
 * @date 2019/02/16
 **/
public class ReplaceString {
  public static void main(String[] args) {
    char[] str = new char[]{'a', ' ', 'b', ' ', 'd'};
    System.out.println("替换前：" + Arrays.toString(str));
    System.out.println("替换后：" + Arrays.toString(replace(str)));

  }

  private static char[] replace(char[] str) {
    int spaceNum = 0;
    for (char c : str) {
      if (c == ' ') {
        spaceNum++;
      }
    }
    int len = str.length + spaceNum * 2;
    char[] replace = new char[len];
    int i = str.length - 1;
    int j = len - 1;
    do {
      if (str[i] == ' ') {
        replace[j] = '0';
        replace[j-1] = '2';
        replace[j-2] = '%';
        i--;
        j=j-3;
      } else {
        replace[j] = str[i];
        j--;
        i--;
      }
    }while (i>=0&&j>=0);
    return replace;
  }
}
