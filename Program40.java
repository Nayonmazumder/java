class SharedObject {
    boolean flag = false;

    synchronized void waitForFlag() {
        while (!flag) {
            try {
                wait(); // Waits until flag is true
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Flag is now true");
    }

    synchronized void setFlag() {
        this.flag = true;
        notify(); // Notifies waiting threads that the flag is true
    }
}

public class InterthreadCommunicationExample {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        Thread waitingThread = new Thread(() -> {
            sharedObject.waitForFlag();
        });

        Thread notifyingThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulating some process
                sharedObject.setFlag();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        waitingThread.start();
        notifyingThread.start();
    }
}
