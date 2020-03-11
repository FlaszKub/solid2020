package pl.zzpj2020.solid.ocp.usa.solution;

public class StateGA implements State {
    private static final int GA_MAX_SPEED = 0;

    @Override
    public int getMaxSpeed() {
        return GA_MAX_SPEED;
    }
}
