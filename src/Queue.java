import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> a;
    Queue(){
        a =new ArrayList<>();
    }
    public void push(int x){
        a.add(x);
}
public int pop(){

        int q= a.get(0);
        a.remove(0);
        return q;

}

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
