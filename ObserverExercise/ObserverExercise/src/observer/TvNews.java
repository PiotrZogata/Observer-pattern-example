package observer;

import observable.WeatherForecast;

public class TvNews implements Observer {

	@Override
	public void updateForecast(WeatherForecast weatherForecast) {

		System.out.println("Tv Newsws informs: temperture is "+ weatherForecast.getTemperature() + ", pressure is "+ weatherForecast.getPressure());
		
	}

}
