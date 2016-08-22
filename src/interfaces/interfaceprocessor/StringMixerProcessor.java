package interfaces.interfaceprocessor;

/**
 * Created by Katsura on 2016-07-20.
 */
class StringMixerAdapter implements Processor {

    StringMixer stringMixer;
    public StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }

    @Override
    public String name() {
        return "StringMixerAdapter ";
    }

    @Override
    public String process(Object input) {
        return StringMixer.process((String)input);
    }
}

public class StringMixerProcessor {
    public static void main(String[] args) {
        String s = new String("shkdjadkhfahdha");
        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }
}
