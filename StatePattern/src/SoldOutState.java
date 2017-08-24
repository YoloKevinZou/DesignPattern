/**
 * Created by KZ on 8/23/17.
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        soldOut();
        quarterReturned();
    }

    @Override
    public void ejectQuarter() {
        quarterReturned();
    }

    @Override
    public void turnCrank() {
        soldOut();
    }

    @Override
    public void dispense() {
        soldOut();
    }

    private void quarterReturned() {
        System.out.println("Quarter returned");
    }

    private void soldOut() {
        System.out.println("Gumball sold out");
    }
}
