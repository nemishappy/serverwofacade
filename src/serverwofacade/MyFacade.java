package serverwofacade;

public class MyFacade {
    private static MyFacade myFacade = null;
    private ScheduleServer scheduleServer = new ScheduleServer();
    private MyFacade() {}
    public static MyFacade getMyFacade() {
        if(myFacade == null){
            myFacade = new MyFacade();
        }
        return myFacade;
    }
    public void start() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
    }
    public void stop() {
        System.out.println("After work done.........");
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
        }
}
