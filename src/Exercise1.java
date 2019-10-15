/*
下面这些是关于哈希桶的get方法的实现
 */
public class Exercise1 {
    class Node {
        int key;
        int val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.next=null;
        }

    }

    private Node []a;
    private int size;
    public int get(int key){
        int index=key%a.length;
    Node cur=a[index];
        for (;cur!=null;cur=cur.next) {
            if(cur.key==key){
                return cur.val;
            }
        }
        return -1;
        }
}
