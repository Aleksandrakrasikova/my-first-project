package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;


import java.util.List;
import java.util.Map;


public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response; //null


    @Given("city ID is: {long}")
    public void set_city_id(long cityId) {
        this.cityId = cityId;
    }

    @When("we are requesting weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params) {
        Assertions.assertEquals(params.get("latitude"), response.getLat(), "Wrong Lat!");
        Assertions.assertEquals(params.get("longitude"), response.getLon(), "Wrong Lon!");

    }

    @Then("timezone information is:")
    public void check_timezone(Map<String, String> params) {
        Assertions.assertEquals(params.get("timezone"), response.getTimezone(), "Wrong timezone!");
        Assertions.assertEquals(params.get("timezone_offset"),response.getTimezoneOffset(), "Wrong timezone offset!");

    }

    @Then("current weather data is:")
    public void check_current_weather(Map<String, String> params) {
        //Assertions.assertEquals(params.get("time),response.get);

    }

    @Then("current weather is:")
    public void check_weather(Map<String, String> params) {

    }

    @Then("minute weather forecast is:")
    public void check_minute_weather(Map<String, String> params) {

    }

    @Then("hourly weather data is:")
    public void check_hourly_weather(Map<String, String> params) {

    }

    @Then("hourly weather is:")
    public void check_hour_weather(Map<String, String> params) {

    }

    @Then("daily weather data is:")
    public void check_daily_weather(Map<String, String> params) {

    }

    @Then("daily temperature is:")
    public void check_daily_temperature(Map<String, Double> params) {

    }

    @Then("daily feels like is:")
    public void check_daily_feels_like(Map<String, Double> params) {

    }

    @Then("daily weather is:")
    public void check_daily_current_weather(Map<String, String> params) {

    }


    @Then("alert Nr. {int} received:")
    public void check_alert (int index, Map<String, String> params) {

    }

    @Then("tags for an alert Nr. {int} are:")
    public void check_alert (int index, List<String> tags) {

    }
}
