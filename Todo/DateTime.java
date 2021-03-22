public class DateTime {
    int year, month, day, hours, mins;

    public DateTime(int year, int month, int day, int hours, int mins) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hours = hours;
        this.mins = mins;
    }
    
    public DateTime(String dateTime) {
        year = Integer.parseInt(dateTime.substring(0, 4));
        month = Integer.parseInt(dateTime.substring(5, 7));
        day = Integer.parseInt(dateTime.substring(8, 10));
        hours = Integer.parseInt(dateTime.substring(11, 13));
        mins = Integer.parseInt(dateTime.substring(14, 16));
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getHours() {
        return hours;
    }
    public int getMins() {
        return mins;
    }
    @Override
    public String toString() {
        String syear = "" + year;
        while(syear.length() < 4) {
            syear = "0".concat(syear);
        }
        String smonth = (month < 10) ? "0" + month : "" + month;
        String sday = (day < 10) ? "0" + day : "" + day;
        String shours = (hours < 10) ? "0" + hours : "" + hours;
        String smins = (mins < 10) ? "0" + mins : "" + mins;
        return syear + "-" + smonth + "-" + sday + "@" + shours + ":" + smins;
    }
    public int compare(DateTime dateTime) {
        if(year == dateTime.year && month == dateTime.month && day == dateTime.day && hours == dateTime.hours && mins == dateTime.mins)
            return 0;
        if(year < dateTime.year) return -1;
        else if(month < dateTime.month) return -1;
        else if(day < dateTime.day) return -1;
        else if(hours < dateTime.hours) return -1;
        else if(mins < dateTime.mins) return -1;
        else return 1;
    }
    public boolean equals(Object obj) {
        if(obj instanceof DateTime) {
            DateTime dateTime = (DateTime) obj;
            return this.compare(dateTime) == 0;
        }
        return false;
    }
}