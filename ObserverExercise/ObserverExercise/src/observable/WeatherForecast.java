package observable;

import java.util.HashSet;
import java.util.Set;

import observer.Observer;

public class WeatherForecast implements Observable{

	int temperature;
	int pressure;
	Set<Observer> registeredObserver = new HashSet<Observer>();
	
	public WeatherForecast(int temperature, int pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
	}

	@Override
	public void registerObserver(Observer observer) {
		
		registeredObserver.add(observer);
		}

	@Override
	public void unregisterObserver(Observer observer) {
		registeredObserver.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observer observer: registeredObserver) {
			observer.updateForecast(this);
		}
	}
	
	public void updateForecast(int temperature, int pressure){
		setTemperature(temperature);
		setPressure(pressure);
		
		notifyObservers();		
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
}
