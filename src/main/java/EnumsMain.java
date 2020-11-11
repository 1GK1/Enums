
public class EnumsMain {

    public static void main(String[] args) {

        Transport car, plane;

//        for (Transport t : Transport.values()) {
//            System.out.println(t + " " + t.ordinal());
//            System.out.printf("%s %s km/h", t ,t.getSpeed());
//            System.out.println();
//        }

        car = Transport.CAR;
        plane = Transport.PLANE;

        System.out.println(car.compareTo(plane));


        if (car.compareTo(plane) < 0) {
            System.out.println("Car is before plane");
        } else {
            System.out.println("Car is after plane");
        };
    }
}




