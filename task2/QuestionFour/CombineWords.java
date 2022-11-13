package QuestionFour;

public class CombineWords {

    void combineWords(String sentence_one, String sentence_two) { // non static method
        System.out.println(sentence_one + sentence_two);
    }

    static String getSecondSentence() { // This is a static method
        return " an iPhone";
    }

    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;
        // call a static method
        sentence_one = "Must have";
        sentence_two = getSecondSentence();

        // using non-static method
        CombineWords objOfThisClass = new CombineWords();
        objOfThisClass.combineWords(sentence_one, sentence_two);
    }

}