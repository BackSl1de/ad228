package dimas;

import dimas.dao.UserDaoImpl;
import dimas.model.User;



public class Main {
    public static void main(String[] args) {
        UserDaoImpl ud = new UserDaoImpl();

        ud.delete(1);

    }
}
