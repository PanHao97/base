public class ThreadDemo1 {
    public static void main(String[] args) {

        ThreadDemo2 th1 = new ThreadDemo2();
        ThreadDemo2 th2 = new ThreadDemo2();

        th1.setName("线程1");
        th2.setName("线程2");

        th1.start();
        th2.start();
    }
}
