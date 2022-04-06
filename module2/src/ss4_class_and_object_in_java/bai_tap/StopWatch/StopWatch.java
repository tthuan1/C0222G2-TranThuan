package ss4_class_and_object_in_java.bai_tap.StopWatch;
//Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
//
//Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
//
//        Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
//
//        Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
//
//        Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

//    public StopWatch() {
//    }

//    public StopWatch(int startTime, int endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    int[] array=new int[100000];
    public int[] run(){
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        return array;
    }
    public void start(){
        this.setStartTime(System.currentTimeMillis());
    }
    public void stop(){
        this.setEndTime(System.currentTimeMillis());
    }
    public long getElapsedTime(){
        return -this.startTime+this.endTime;
    }

    @Override
    public String toString() {
        return "startTime=" + startTime +
                ", endTime=" + endTime +
                "\nElapsed Time= "+getElapsedTime();
    }
}
