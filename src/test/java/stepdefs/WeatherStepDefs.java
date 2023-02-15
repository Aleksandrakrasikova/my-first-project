package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Current;
import model.WeatherResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;


import java.util.List;
import java.util.Map;


public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response; //null
    ;
    //private Current current;




    @Given("city ID is: {long}")
    public void set_city_id(long cityId) {
        this.cityId = cityId;
    }

    @When("we are requesting weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
        //current = requester.requestCurrent(cityId);
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
        /*Assertions.assertEquals(params.get("dt"), current.getDt(),"Wrong dt!");
        Assertions.assertEquals(params.get("sunrise"), current.getSunrise(), "Wrong sunrise!");
        Assertions.assertEquals(params.get("sunset"), current.getSunset(), "Wrong sunset!");
        Assertions.assertEquals(params.get("temperature"), current.getTemp(), "Wrong temperature!");
        Assertions.assertEquals(params.get("feels_like"), current.getFeelsLike(), "Wrong feels like!");
        Assertions.assertEquals(params.get("pressure"), current.getPressure(), "Wrong pressure!");
        Assertions.assertEquals(params.get("humidity"), current.getHumidity(), "Wrong humidity!");
        Assertions.assertEquals(params.get("dew_point"), current.getDewPoint(), "Wrong dew point!");
        Assertions.assertEquals(params.get("uvi"), current.getUvi(), "Wrong uvi!");
        Assertions.assertEquals(params.get("clouds"), current.getClouds(), "Wrong clouds!");
        Assertions.assertEquals(params.get("visibility"), current.getVisibility(), "Wrong visibility!");
        Assertions.assertEquals(params.get("wind_speed"), current.getWindSpeed(), "Wrong wind speed!");
        Assertions.assertEquals(params.get("wind_deg"), current.getWindDeg(),"Wrong wind deg!");
        Assertions.assertEquals(params.get("wind_gust"), current.getWindGust(), "Wrong wind gust!");
*/
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
