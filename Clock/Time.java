abstract class Time {
    protected int seconds, minutes, hour;
    public Time() {
        seconds = minutes = hour = 0;
    }
    public Time(int seconds, int minutes, int hour) throws Exception{
        if(seconds >= 0 && seconds < 60 && minutes >=0 && minutes < 60 && hour >= 0 && hour < 24) {
            this.seconds = seconds;
            this.minutes = minutes;
            this.hour = hour;
        } else throw new Exception("Invalid time input");
    }
    public int getSeconds() {
        return seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getHour() {
        return hour;
    }
    public void display() {
        System.out.println("seconds=" + seconds + ",minutes=" + minutes + ",hour=" + hour);
    }
}
