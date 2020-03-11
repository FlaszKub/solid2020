package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Emiailer implements WeatherInformant {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
