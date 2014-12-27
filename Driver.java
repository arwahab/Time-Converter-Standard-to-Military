// Abdul Wahab

public class Driver {

    public static void main(String[] args) {

        TimeConverter tcObj = new TimeConverter();
        System.out.println(tcObj.toMilitary());
        System.out.println(tcObj.toString());

        tcObj.setTime(13, 27, 6);
        System.out.println(tcObj.toMilitary());
        System.out.println(tcObj.toString());

    }
}
