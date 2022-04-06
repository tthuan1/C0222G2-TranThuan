package ss4_class_and_object_in_java.bai_tap.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();

        stopWatch.start();
        stopWatch.run();
        stopWatch.stop();
        System.out.print(stopWatch.toString());
    }
}
