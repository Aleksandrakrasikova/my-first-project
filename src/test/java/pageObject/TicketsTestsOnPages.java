package pageObject;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObject.model.FlightInfo;
import pageObject.model.Passenger;
import pageObject.pages.HomePage;
import pageObject.pages.PassengerInfoPage;
import pageObject.pages.SeatSelectionPage;
import pageObject.pages.SuccessfulRegistrationPage;

public class TicketsTestsOnPages {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest (){
        Passenger passenger = new Passenger("Aleksandra", "Krasikova");
        int seatNr = RandomUtils.nextInt(1, 35);

        FlightInfo info = new FlightInfo("SFO", "RIX", "AAAAA", 2, 2,
                4, "16-05-2018", seatNr);
        info.setPassenger(passenger);

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(info.getDeparture(), info.getDestination());

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(info);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");
        Assertions.assertEquals(info.getDeparture(), infoPage.getFirstFromAirport(), "Wrong departure airport!");
        Assertions.assertEquals(info.getDeparture(), infoPage.getSecondFromAirport(), "Wrong departure airport2!");
        Assertions.assertEquals(info.getDestination(), infoPage.getFirstToAirport(), "Wrong arrival airport!");
        Assertions.assertEquals(info.getDestination(), infoPage.getSecondToAirport(), "Wrong arrival airport2!");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Wrong price!");

        infoPage.book();

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNr);

        int selectSeat = seatSelectionPage.getSelectedSeatNr();
        Assertions.assertEquals(seatNr, selectSeat, "Wrong seat selected");

        seatSelectionPage.book();

        SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);
        Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(), "Wrong text on successful registration page");

    }
}
