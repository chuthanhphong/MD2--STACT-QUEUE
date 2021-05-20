package bt7;

public class main {
    public static void main(String[] args) throws Exception {
        MyStact myStact = new MyStact(5);
        myStact.pushElement(5);
        myStact.pushElement(4);
        myStact.pushElement(3);
        myStact.pushElement(2);
        myStact.pushElement(1);
        System.out.println("Stact sau khi thêm " + myStact.size());
        System.out.println("Xóa phần tử");
        while (!myStact.isempty()){
            System.out.println(" %d" + myStact.pop());
        }
        System.out.println("\n3. Size of stack after pop operations : " + myStact.size());
    }
}
