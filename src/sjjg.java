/*有一个整数单链表L，设计一个算法在第i个结点之前插入一个元素x，若参数错误返回false，否则插入后返回true。
例如，L=（1，2，3，4，5），i=0,x=6，插入后 L=（6，1，2，3，4，5）。
 */import java.util.LinkedList;


public class sjjg{
    public static void main(String[] args) {
        int[] L = {1,2,2,3,1};
        int x=2;
        LinkedList<Integer> text=new LinkedList<Integer>();
        for (int j : L) {
            text.add(j);
        }
        int ab= L.length;
        for(int i=0;i<ab;i++){
            int a= text.get(i);
            if(a==x) {
                text.remove(i);
                ab--;
                i--;
            }
        }
        System.out.print("删除后的结果：");
        for(int i=0;i<ab;i++) {
            System.out.print(text.get(i));
        }
            }
        }






