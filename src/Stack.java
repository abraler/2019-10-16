import java.util.Arrays;

public class Stack {
    private int []a;
    private int top;

    public Stack() {
        a=new int [2];
        top=0;
    }
    public void AddLength(){
        if(top<a.length){
            return;
        }
        int newl=a.length*2;
        int []newa=new int[newl];
        for (int i = 0; i <top ; i++) {
            newa[i]=a[i];
        }
        a=newa;
    }
    public void push(int val){
        AddLength();
        a[top++]=val;
    }
    public void pop(){
        if(top<=0){
            System.out.println("空");
            return;
        }
        top--;
    }
    public  int top(){
        if(top<=0){
            System.out.println("空");
            return -1;
        }
        return a[top-1];
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top==0;
    }

    public static void main(String[] args) {
        Stack a=new Stack();
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        a.push(1);
        a.push(2);
        a.push(3);
        a.pop();
        System.out.println(a.top());
        System.out.println(a.size());
    }
}
