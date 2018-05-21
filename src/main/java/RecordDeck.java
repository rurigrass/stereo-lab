public class RecordDeck extends Component {

    private int playspeed;

    public RecordDeck(String make, String model, int playspeed){
        super(make, model);
        this.playspeed = playspeed;
    }


    public int getPlaySpeed() {
        return this.playspeed;
    }
}
