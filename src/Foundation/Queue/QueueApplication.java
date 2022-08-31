package Foundation.Queue;

public class QueueApplication {
    public static void main(String[] args) {

        QueueWithArray queueWithArray = new QueueWithArray(5);
        queueWithArray.addQueue(6);
        queueWithArray.addQueue(3);
        queueWithArray.addQueue(2);
        queueWithArray.addQueue(7);
        queueWithArray.showQueue();
        queueWithArray.removeQueue();
    }
}



class QueueWithArray{
    int start, end;
    int range;
    static int[] example;

    // constructor method that takes in an arg (size)
    public QueueWithArray(int size) {
        range = size;
        example = new int[range];
    }

    void addQueue(int value){
        if(end == range){
            System.out.println("queue max size reached");
        } else {
            example[end] = value;
            end++;
        }
    }

    // dequeue method
    void removeQueue(){
        if (end == 0){
            System.out.println("the queue is empty");
        } else {
            for (int i = 0; i < end - 1; i++){
                example[i] = example[i+1];
            }
            end--;
        }
    }

    // shows the current element on the queue
    void showQueue(){
        if (end == 0){
            System.out.println("oops, the queue is empty or has no elemnts");
        } else {
            for (int i = 0; i<end; i++){
                System.out.print(example[i]+ "");
            }
        }
    }
}
