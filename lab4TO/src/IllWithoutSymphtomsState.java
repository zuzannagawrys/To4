public class IllWithoutSymphtomsState implements State{
    private Pearson pearson;

    public Pearson getPearson() {
        return pearson;
    }

    public void setPearson(Pearson pearson) {
        this.pearson = pearson;
    }

    IllWithoutSymphtomsState(Pearson pearson)
    {
        this.pearson=pearson;
    }
    @Override
    public void contact(Pearson someone) {
        return;
    }


}