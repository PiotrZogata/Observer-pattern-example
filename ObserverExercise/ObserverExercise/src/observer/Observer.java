package observer;

import observable.WeatherForecast;

public interface Observer {

	void updateForecast(WeatherForecast weatherForecast);
}
