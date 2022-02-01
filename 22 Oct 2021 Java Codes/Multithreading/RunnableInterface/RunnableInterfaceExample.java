package RunnableInterface;

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        ThreadCLass td1 = new ThreadCLass("Thread-1");
        ThreadCLass td2 = new ThreadCLass("Thread-2");
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
    }

}
