package RunnableInterface;

/**
 * ThreadCLass
 */
public class ThreadCLass implements Runnable {
    private String tname;

    public ThreadCLass(String tname) {
        this.tname = tname;
        System.out.println(tname);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " = = " + this.tname);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}