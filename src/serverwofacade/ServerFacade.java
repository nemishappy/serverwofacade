package serverwofacade;

public class ServerFacade {
    public static void main(String[] args) {
        MyFacade obj = MyFacade.getMyFacade();
        obj.start();
        obj.stop();
    }
}
