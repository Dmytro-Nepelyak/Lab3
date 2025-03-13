//Дано речення, слова в якому розділені пропусками (одним або декількома).
// Змінити кожне слово в рядку, вилучивши з нього всі наступні
// входження першої букви цього слова (кількість пропусків між словами не змінювати).

public class Main {
    public static void main(String[] args) {
        String sentence = "Як умру, то    поховайте Мене на могилі,  Серед степу широкого, На   Вкраїні милій";
        String[] words = sentence.split(" ");
        String newSentence = "";
        for (String word : words) {
            if (word.isEmpty()) {
              newSentence = newSentence.concat(" ");
                continue;
            }
            word = word.charAt(0) + word.replaceAll(String.valueOf(word.charAt(0)), "");
            newSentence = newSentence.concat(word + ' ');
        }
        System.out.println(newSentence);
    }
}
