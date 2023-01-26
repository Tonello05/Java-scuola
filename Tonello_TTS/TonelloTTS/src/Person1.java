import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Synthesizer;

public class Person1 extends Thread{
    String[] phrase ={"Mi","ha","scortato","da","un","capo","all'altro","del","mondo","»","disse","«","con","una","fedeltà","che","neppure","il","piú","nobile","amico","avrebbe","potuto","dimostrare.","Adesso","io","sto","per","morire.","Anche","lui,","ormai sarà","terribilmente","vecchio","e","stanco.","Non","posso","tradirlo.","si","allontanò","da","bordo.","Ufficiali","e","marinai","lo","videro","scomparire","laggiú,","sul","placido","mare,","avvolto","dalle","ombre","della","notte.","C'era","in","cielo","una","falce","di","luna."};
    public Person1(String name){
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
