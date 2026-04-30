public class WorkingWithStrings {
    public static void main(String[] args){
        /*tring bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: "+ titleLength);

        int maxLength = 20;
        String shortBookTitle = bookTitle.substring(0, 19);
        System.out.println("Original title: " + bookTitle);
        System.out.println("Shortened title: " + shortBookTitle);

        String searchWord = "Captain";

        boolean containsWord = bookTitle.contains(shortBookTitle);
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);*/

        String sentence = "Java Programming is fun and educational";
        String searchWord = "fun";
        boolean containsWord = sentence.contains(searchWord);

        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);

        String replacedWord = "awesome";
        String newSentence = sentence.replace("fun", replacedWord);

        System.out.println("The new sentence is " + newSentence);

        int lengthSentence = sentence.length();
        System.out.println("The Length of the sentence is " + lengthSentence);

        int maxLength = 17;

        String ShortSentence =  sentence.substring(0, 16);
        System.out.println("Shortened sentence: " + ShortSentence);

    }
}
