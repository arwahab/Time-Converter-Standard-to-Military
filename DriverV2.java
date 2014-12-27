
// Abdul Wahab

public class DriverV2 {

    public static void main(String[] args) {

        TimeConverterV2 TimeConverterV2Object = new TimeConverterV2();
        TimeConverterV2 TimeConverterV2Object2 = new TimeConverterV2(5);
        TimeConverterV2 TimeConverterV2Object3 = new TimeConverterV2(5, 13);
        TimeConverterV2 TimeConverterV2Object4 = new TimeConverterV2(5, 13, 46);

        System.out.printf("%s\n", TimeConverterV2Object.toMilitary());
        System.out.printf("%s\n", TimeConverterV2Object2.toMilitary());
        System.out.printf("%s\n", TimeConverterV2Object3.toMilitary());
        System.out.printf("%s\n", TimeConverterV2Object4.toMilitary());

    }

}
