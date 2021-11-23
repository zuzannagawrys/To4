import java.util.ArrayList;
import java.util.HashMap;

public class StorageSnapshots {
    HashMap<Integer,People.Snapshot> snapshots;
    StorageSnapshots()
    {
        this.snapshots=new HashMap<>();
    }
    public void addSnapshot(int time,People.Snapshot snap)
    {
        this.snapshots.put(time,snap);
    }
    public People.Snapshot findByTime(int time)
    {
        return this.snapshots.get(time);
    }
}
