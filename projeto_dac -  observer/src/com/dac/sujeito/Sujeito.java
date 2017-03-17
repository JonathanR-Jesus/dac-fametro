package com.dac.sujeito;

import com.dac.observer.Observer;

public interface Sujeito {
	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver();
	
	
}
