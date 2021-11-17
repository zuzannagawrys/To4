public class HealthyImmuneState implements State{
    private Pearson pearson;
    HealthyImmuneState(Pearson pearson)
    {
        this.pearson=pearson;
    }
    @Override
    public void contact(Pearson someone) {
        return;
    }


}
