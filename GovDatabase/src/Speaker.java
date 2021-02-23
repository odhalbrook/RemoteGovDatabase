import com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Speaker{

	
	public static void speak(String str) {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		if(voice != null) {
			voice.allocate();

			voice.speak(str);
			voice.deallocate();
		}
		else {
			System.out.println("Nope");
		}
	}
	
	
}