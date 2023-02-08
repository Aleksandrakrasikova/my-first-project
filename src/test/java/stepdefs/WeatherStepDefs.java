package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    @Given("city ID is: {long}")
    public void set_city_id(long id) {

    }

    @When("we are requesting weather forecast")
    public void request_weather() {

    }

    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params) {

    }

    @Then("timezone information is:")
    public void check_timezone(Map<String, String> params) {

    }

    @Then("current weather data is:")
    public void check_current_weather(Map<String, String> params) {

    }

    @Then("current weather Nr. {int} is:")
    public void check_weather(Map<String, String> params) {

    }

    @Then("minute weather forecast is:")
    public void check_minute_weather(Map<String, long> params) {

    }

    @Then("hourly weather data is:")
    public void check_hourly_weather(Map<String, long> params) {

    }

    @Then("hourly weather Nr. {int} is:")
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

    @Then("daily weather Nr. 3 is:")
    public void check_daily_current_weather(Map<String, String> params) {

    }


    @Then("alert Nr. {int} received:")
    public void check_alert (int index, Map<String, String> params) {

    }

    @Then("tags for an alert Nr. {int} are:")
    public void check_alert (int index, List<String> tags) {

    }
}
