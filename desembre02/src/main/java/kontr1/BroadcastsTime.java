package kontr1;


class BroadcastsTime implements Comparable<kontr1.BroadcastsTime> {
    private byte hour;
    private byte minutes;

    public BroadcastsTime(byte hour, byte minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public byte getHour() {
        return hour;
    }

    public byte getMinutes() {
        return minutes;
    }

    public boolean after(BroadcastsTime t) {
        return (hour > t.getHour()) || (hour == t.getHour() && minutes > t.getMinutes());
    }

    public boolean before(BroadcastsTime t) {
        return (hour < t.getHour()) || (hour == t.getHour() && minutes < t.getMinutes());
    }

    public boolean between(BroadcastsTime t1, BroadcastsTime t2) {
        return (this.after(t1) && this.before(t2)) || (this.equals(t1) || this.equals(t2));
    }

    @Override
    public int compareTo(BroadcastsTime o) {
        int hourComparison = Integer.compare(this.getHour(), o.getHour());
        if (hourComparison != 0) {
            return hourComparison;
        }

        return Integer.compare(this.getMinutes(), o.getMinutes());
    }
    @Override
    public String toString() {
        return hour + ":" + minutes;
    }


}
