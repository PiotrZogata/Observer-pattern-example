package main;

import observable.WeatherForecast;
import observer.InternetNews;
import observer.RadioNews;
import observer.TvNews;

public class Main {

	public static void main(String[] args) {


		WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
		
		RadioNews radioNews = new RadioNews();
		InternetNews internetNews = new InternetNews();
		TvNews tvNews = new TvNews();
		
		weatherForecast.registerObserver(radioNews);
		weatherForecast.registerObserver(internetNews);
		weatherForecast.registerObserver(tvNews);
		
		weatherForecast.notifyObservers();
		
		weatherForecast.unregisterObserver(tvNews);
		weatherForecast.unregisterObserver(radioNews);
		
		System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego");
		
		weatherForecast.updateForecast(10, 1007);
	}

}
