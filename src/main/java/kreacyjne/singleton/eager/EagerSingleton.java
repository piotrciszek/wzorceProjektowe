package kreacyjne.singleton.eager;


public class EagerSingleton {

        private static final EagerSingleton  instance = new EagerSingleton ();

        //private constructor to avoid client applications to use constructor
        private EagerSingleton () {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public void getSomeThing() {
            System.out.println("I am here....");
        }

        public static EagerSingleton  getInstance() {
            return instance;
        }
    }

