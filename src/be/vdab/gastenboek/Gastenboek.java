package be.vdab.gastenboek;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Gastenboek implements Serializable {
    private static final long serialVersionUID = 1L;
    private final ArrayList<GastenboekEntry> gastenBoekEntries = new ArrayList<>();

    public void addEntry(GastenboekEntry entry){
        gastenBoekEntries.add(entry);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        for (var index = gastenBoekEntries.size() - 1; index >= 0; index--) {
            builder.append(gastenBoekEntries.get(index)).append("\n");
        }
        return builder.toString();

    }
}
