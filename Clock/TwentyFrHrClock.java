class TwentyFrHrClock extends Time{
    public TwentyFrHrClock(int seconds, int minutes, int hour) throws Exception {
        super(seconds, minutes, hour);
    }
    @Override
    public void display() {
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}
