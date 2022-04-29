package pramudito.rh.data;

public class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

//class FacebookClone extends Facebook {} ERROR karena tidak bisa extends dari final class

class FacebookClone extends Facebook{
/*  Error karena final method
    void login(String usernmae, String password) {

    }*/
}
