class TwelveHrClock extends Time{
    public TwelveHrClock(int seconds, int minutes, int hour) throws Exception{
        super(seconds, minutes, hour);
    }
    @Override
    public void display() {
        if(hour == 0) {
            System.out.println((hour + 12) + ":" + minutes + ":" + seconds + "am");
        }
        else if(hour == 12) {
            System.out.println(hour + ":" + minutes + ":" + seconds + "pm");
        }
        else if(hour >= 1 && hour < 12) {
            System.out.println(hour + ":" + minutes + ":" + seconds + "am");
        }
        else {
            System.out.println((hour - 12) + ":" + minutes + ":" + seconds + "pm"); 
        }
    }
}
