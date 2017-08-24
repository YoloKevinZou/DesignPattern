import java.util.Random;

/**
 * Created by KZ on 8/23/17.
 */
public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ( winner == 0 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.winnerState);
        } else {
            gumballMachine.setState(gumballMachine.soldState);
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
