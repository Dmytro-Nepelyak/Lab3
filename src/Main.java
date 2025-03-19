public class Main {
    public static void main(String[] args) {
        String sentence = "";
        for (String arg : args) {
            sentence += arg + " ";
        }
        System.out.println("Речення: " + sentence);

        String consonants = "бвгґджзйклмнпрстфхцчшщБВГҐДЖЗЙКЛМНПРСТФХЦЧШЩ";

        String result = "";

        for (char c : sentence.toCharArray()) {
            if (consonants.indexOf(c) != -1) {
                if (Character.isUpperCase(c)) {
                    result += Character.toString(Character.toLowerCase(c));
                } else {
                    result += Character.toString(Character.toUpperCase(c));
                }
            } else {
                result += Character.toString(c);
            }
        }
        System.out.println("Результат: " + result);

        System.out.println("Завдання №2: ");
        zavd2();
    }

    public static void zavd2() {
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

