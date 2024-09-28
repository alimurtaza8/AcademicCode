package oopconecpts;

class TV{
	int channel = 1;
	int volume = 1;
	boolean on = false;
	
	public TV() {
		
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if(on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
	public void setVolume(int newVolume) {
		if(on && newVolume >= 1 && newVolume <= 7) {
			volume = newVolume;
		}
	}
	
	public void channelUp() {
		if(on && channel < 120) {
			channel++;
		}
	}
	
	public void channelDown() {
		if(on && channel > 1) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if(on && volume < 7) {
			volume++;
		}
	}
	
	public void volumeDown() {
		if(on && volume > 1) {
			volume--;
		}
	}
}


public class TestTV {

	public static void main(String[] args) {
		
		TV tv = new TV();
		tv.turnOn();
//		tv.setChannel(30);
//		tv.setVolume(3);
		
		TV tv1 = new TV();
		//tv1.turnOn();
		tv1.turnOff();
		tv1.channelUp();
		tv1.channelUp();
		tv1.volumeUp();
		
		System.out.println("tv1's channel is " + tv.channel+ " and volume level is " + tv.volume);
		System.out.println("tv2's channel is " + tv1.channel+ " and volume level is " + tv1.volume);

	}

}






