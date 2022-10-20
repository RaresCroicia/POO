public class MyQueue {
    MyArray obj;
    int INF = 9500;
    int head;
    int tail;
    int no_elements;
    public MyQueue(){
        obj = new MyArray();
        head = tail = 0;
        no_elements = 0;
    }

    public int getSize(){
        return no_elements;
    }

    public void enqueue(int value){
        if(no_elements == 0) {
            obj.set(head, value);
            no_elements++;
            return;
        }
            obj.set(++tail, value);
            no_elements++;
            return;
    }

    public int dequeue(){
        if(no_elements == 0)
            return INF;
        int ans = obj.get(head);
        head++;
        no_elements--;
        return ans;
    }

    public boolean isEmpty(){
        return (no_elements == 0);
    }

    public String toString(){
        if(no_elements == 0)
            return "";
        String ans = "";
        for(int i = head; i <= tail; i++){
            ans += obj.get(i) + " ";
        }
        return ans;
    }
}
