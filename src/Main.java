import model.User;

public class Main {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        User user = prompter.getUserInfo();
    }
}
