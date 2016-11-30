public class TimeoutMessage {

    private static class UpdaterThread extends Thread {
        private final int TIMEOUT = 3000;

        public void run() {
            while (true) {
                try {
                    Thread.sleep(TIMEOUT);
                  
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        try {
            Thread u = new UpdaterThread();
            u.start();
            while (true) {
            	  System.out.println("3 seconds passed");
                Thread.sleep(3000);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}