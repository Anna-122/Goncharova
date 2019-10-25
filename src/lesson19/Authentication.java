package lesson19;

/**
 * Created by Student on 25.10.2019.
 */
public class Authentication {
    public static void main(String[] args) {

        System.out.println(verify("login1", "password1", "Password1"));
        System.out.println(verify("login1", "password1gsxjshcbjshfjsbjdbcxhdbg", "Password1"));

    }


    public static boolean verify(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException(" wrong password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;

        } finally {
            System.out.printf("%s %s %s", login, password, confPassword);
        }
        return true;
    }
}
