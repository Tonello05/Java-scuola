import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Synthesizer;

public class Person2 extends Thread{
    String[] phrase ={"Invece","io","ti","interrompo","a","caso","perchè","voglio","rimanere","ignorante"};
    public Person2(String name){
        super(name);
    }
    public void run(){

        try {
            System.setProperty("freetts.voices","com.sun.speech.freetts.en.us"+ ".cmu_us_kal.KevinVoiceDirectory");
            Central.registerEngineCentral("com.sun.speech.freetts"+ ".jsapi.FreeTTSEngineCentral");
            Synthesizer synthesizer= Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
            synthesizer.allocate();
            synthesizer.resume();

            for (String string : phrase) {
                synthesizer.speakPlainText(string, null);
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
}
