/**
 * 顺序类表的描述
 *
 * @author changshengee
 * @date 2019/02/18
 **/
public class SqList<E> implements IList {
  private E[] items;
  private int length;

  @SuppressWarnings("unchecked")
  public SqList(int size) {
    length = 0;
    items = (E[]) (new Object[size]);
  }

  @Override
  public void clear() {
    length = 0;
  }

  @Override
  public boolean isEmpty() {
    return length == 0;
  }

  @Override
  public int size() {
    return this.length;
  }

  @Override
  public E get(int i) throws Exception {
    if (i < 0 || i > this.length) {
      throw new IndexOutOfBoundsException();
    }
    return items[i];
  }

  @Override
  public void insert(int i, Object e) throws Exception {
    if (length == items.length) {
      throw new Exception("顺序表已满");
    }
    if (i < 0 || i > length) {
      throw new Exception("插入位置不合法");
    }
    for (int j = length; j > i; j--) {
      items[j] = items[j - 1];
    }
    items[i] = (E)e;
    length++;
  }

  @Override
  public void remove() {

  }

  @Override
  public void display() {

  }
}
