package ProgramCore;

/**
 * Created by Michal on 27.11.2014.
 */
public class Client {

    private Human NewHuman;

    public void Registration(int id, String Name, boolean VIP )   {
        NewHuman.setIdNumber(id);
        NewHuman.setHumansName(Name);
        NewHuman.setVIPFlag(VIP);

    }
}
