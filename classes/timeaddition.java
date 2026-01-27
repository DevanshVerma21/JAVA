class Time {

    int h;
    int m;
    int s;

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;

    }

    Time add(Time t) {
        int sec = this.s + t.s;
        int min = this.m + t.m + sec / 60;
        int hr = this.h + t.h + min / 60;

        sec = sec % 60;
        min = min % 60;

        return new Time(hr, min, sec);

    }

    void print() {
        System.out.println(h + "h " + m + "m " + s + "s");

    }
}

public class timeaddition {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);

        Time t3 = t1.add(t2);

        t3.print();

    }

}
