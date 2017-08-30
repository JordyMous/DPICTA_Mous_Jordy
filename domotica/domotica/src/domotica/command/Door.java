package domotica.command;

import domotica.model.*;

public class Door {

    private String message = "You closed the door of all the rooms!";

    public void setAllDoorsClosed (House house) {
        Living living = house.getLiving ();
        Kitchen kitchen = house.getKitchen();
        Bathroom bathroom = house.getBathroom();
        Bedroom bedroom = house.getBedroom();

        living.closeRoom();
        kitchen.closeRoom();
        bathroom.closeRoom();
        bedroom.closeRoom();
    }

    public void setAllDoorOpen (House house) {
        Living living = house.getLiving ();
        Kitchen kitchen = house.getKitchen();
        Bathroom bathroom = house.getBathroom();
        Bedroom bedroom = house.getBedroom();

        living.openRoom();
        kitchen.openRoom();
        bathroom.openRoom();
        bedroom.openRoom();
    }
}
