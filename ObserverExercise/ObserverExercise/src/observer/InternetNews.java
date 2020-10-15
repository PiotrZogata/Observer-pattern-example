package observer;

import observable.WeatherForecast;

public class InternetNews implements Observer{

	@Override
	public void updateForecast(WeatherForecast weatherForecast) {
		System.out.println("Internet News informs: temperture is "+weatherForecast.getTemperature() + ", pressure is "+ weatherForecast.getPressure());
		
	}

}
