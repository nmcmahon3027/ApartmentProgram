package helloPackage;

public class OneBedApartment implements RoomType {


    @Override
    public void roomStudio(String roomPrice) {
        System.out.println("The price of a studio is " + roomPrice);

    }

    @Override
    public void roomOne(String roomPrice) {
        System.out.println("The price of a one bedroom is " + roomPrice);

    }

    @Override
    public void roomTwo(String roomPrice) {
        System.out.println("The price of a two bedroom is " + roomPrice);

    }

    @Override
    public void roomThree(String roomPrice) {
        System.out.println("The price of a three bedroom is " + roomPrice);

    }
}


