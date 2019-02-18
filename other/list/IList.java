/**
 * 线性表的抽象数据类型描述
 *
 * @author changshengee
 * @date 2019/02/18
 **/
public interface IList<E> {

  public void clear();
  public boolean isEmpty();
  public int size();
  public E get(int i) throws Exception;
  public void insert(int i,E e)throws Exception;
  public void remove();
  public void display();


}
