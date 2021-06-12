package aufgaben.aufgabe7;

import java.util.HashSet;
import java.util.Set;

public class Slack implements Publisher {

	private Set<Listener> listeners;
	private int nrOfMessages;

	public Slack()
	{
		this.listeners = new HashSet<>();
		this.nrOfMessages = 0;
	}

	@Override
	public boolean register(Listener listener) {

		/*if(this.listeners.contains(listener))return false;
	else
	{
		this.listeners.add(listener);
		return true;
	}*/

		return this.listeners.add(listener);
	}

	@Override
	public boolean unregister(Listener listener) {

		return this.listeners.remove(listener);
	}

	@Override
	public void notifyListeners() {

		for(Listener listener : this.listeners)
		{
			listener.update();
		}

	}

	@Override
	public String getUpdate(Listener listener) {
		String s = "Breaking News " + this.nrOfMessages;
		return s;
	}

	public void publishNews()
	{
		this.nrOfMessages++;
		this.notifyListeners();
	}
}
