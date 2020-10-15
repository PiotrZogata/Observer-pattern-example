package observer;

import observable.WeatherForecast;

public class RadioNews implements Observer{

	@Override
	public void updateForecast(WeatherForecast weatherForecast) {

		System.out.println("Radio News informs: temperture is "+ weatherForecast.getTemperature() + ", pressure is "+ weatherForecast.getPressure());
		
	}

}
