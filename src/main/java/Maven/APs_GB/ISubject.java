package Maven.APs_GB;

public interface ISubject {

	void register(IObserver o);
	void unregister(IObserver o);
	void notifyObservers();
	
}
