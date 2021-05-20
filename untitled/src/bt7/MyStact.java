package bt7;

public class MyStact {
        private int [] arr;
        private  int size;
        private int index;



    public MyStact( int size) {
        this.arr = new int[size];
        this.size = size;

    }
    public int size(){
        return index;
    }
    public boolean isempty(){
        if(index==0){
            return true;
        }
        return false;
    }
    public boolean isfull(){
        if(index == size){
            return true;
        }
        return false;
    }
    public void pushElement(int element){
        if(isfull()){
            System.out.println("the stact is full");
        }
        else {
            arr[index]= element;
            index++;
        }
    }
    public int pop() throws Exception{
        if(isempty()){
            System.out.println("Stact is empty");
        }
       return arr[--index];
    }



}
