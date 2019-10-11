package lesson16;

import java.util.Objects;
public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public void createQuery() {
        class Query {
            public void print() {
                System.out.printf("User  with login '%s' and password '%s'" + "sent query\n", login, password);
            }

        }
        Query query = new Query();
        query.print();
    }

    public static void main(String[] args) {
        User user =new User("login1","password1");
        user.createQuery();
    }
}