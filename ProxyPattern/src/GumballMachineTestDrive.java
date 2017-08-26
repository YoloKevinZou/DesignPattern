import java.rmi.Naming;

/**
 * Created by KZ on 8/26/17.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        String[] location = { "rmi://santafe.mightygumball.com/gumballmachine",
                              "rmi://boulder.mightygumball.com/gumballmachine",
                              "rmi://seattle.mightygumball.com/gumballmachine"
        };

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++){
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {

            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}