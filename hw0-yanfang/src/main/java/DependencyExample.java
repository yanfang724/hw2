import java.io.StringReader;

import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;


public class DependencyExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
        //System.out.println()
        Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(args[0]));
        System.out.println(tokenizer.tokenize());
    }

}
