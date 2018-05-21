import java.util.ArrayList;

public class Radio extends Component {


    private ArrayList<Station> stations;


    public Radio(String make, String model){

        super(make, model);
        this.stations = new ArrayList<>();
    }


    public int countStations() {
        return this.stations.size();
    }

    public void addStation(Station station1) {
        this.stations.add(station1);
    }

    public void removeStation(Station station1) {
        this.stations.remove(station1);
    }
}
