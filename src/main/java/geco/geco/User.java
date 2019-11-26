package geco.geco;

import geco.PasswordGeneration;

public class User {

    PasswordGeneration pg;

    public User(){
        pg = new PasswordGeneration();
    }

    public String getRandomPassword(){
        return pg.getRandomPassword();
    }
}
