package lv.EdijsElijs_Skroders;

public class WeatherData {
    Coord coord;
    Main main;
//    public WeatherData() {}
}

class Coord {
    double lon;
    double lat;
}

class Main {
    double temp;
    int pressure;
    int humidity;
}

