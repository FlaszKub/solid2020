package pl.zzpj2020.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    WeatherInformant informant;

    public WeatherTracker(WeatherInformant informant) {
        this.informant = informant;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = informant.generateWeatherAlert(weatherDescription);
        System.out.print(alert);

    }
}
