
public class ServerNameGenerator {
    public static  String randomString(String[] strings) {
        int randomElement = (int) (Math.random() * strings.length);
        return strings[randomElement];
    }


    public static void main(String[] args) {
        String[] adjectives = {"agreeable", "brave", "calm", "delightful", "eager", "faithful", "gentle", "happy", "good", "young"};

        String[] nouns = {"man", "mountain", "state", "ocean", "country", "cat", "airline", "building", "love", "wealth"};

        String serverName = randomString(adjectives) + "-" + randomString(nouns);

        System.out.println("Your server name is " + serverName);

    }
}
