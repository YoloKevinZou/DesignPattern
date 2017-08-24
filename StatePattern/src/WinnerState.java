/**
 * Created by KZ on 8/23/17.
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Error inserting quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Error ejecting quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Error turning crank");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count == 0) {
            gumballMachine.setState(gumballMachine.soldOutState);
        } else {
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if (gumballMachine.count > 0) {
                gumballMachine.setState((gumballMachine.noQuarterState));
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.soldOutState);
            }
        }
    }
}
