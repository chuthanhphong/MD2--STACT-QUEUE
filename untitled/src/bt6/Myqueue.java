package bt6;

public class Myqueue {
    private int Capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentsize = 0;


    public Myqueue(int queuesize) {
        this.Capacity = queuesize;
        queueArr = new int[this.Capacity];

    }

    public boolean isQueuefull() {
        boolean result = true;
        if (currentsize == Capacity) {
            return result = true;
        } else return result = false;
    }

    public boolean isQueueempty() {
        if(currentsize == 0) {
            return true;
        }
        return false;
    }
    public void enQueue(int item ){
        if(isQueuefull()){
            System.out.println("Hàng đợi đầy " + item);
        }
        else {
            tail++;
            if(tail==Capacity-1){
                tail=0;
            }
            queueArr[tail]=item;
            currentsize++;
            System.out.println("Vị trí thứ " + item + " đã thêm vào hàng đợi");
        }
    }
    public void deQueue(int item){
        if(isQueuefull()){
            System.out.println("Hàng đợi đầy" + item);
        }
        else {
            head++;
            if(head==Capacity-1){
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head=0;
            }
            else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentsize--;
        }
    }

    public void enQueue() {
    }
}
