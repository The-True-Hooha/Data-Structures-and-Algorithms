package Foundation.Queue;

public class QueueApplication {
    public static void main(String[] args) {

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

    void removeQueue(){
        if (end == 0){
            System.out.println("the queue is empty");
        } else {
            for (int i = 0; i < end - 1; end++){

            }
        }
    }
}
