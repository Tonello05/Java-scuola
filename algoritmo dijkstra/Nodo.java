import java.util.TreeMap;



public class Nodo {
    String label;
    int weight = Integer.MAX_VALUE;
    TreeMap<Nodo, Integer> links;
    Nodo prev = null;

    public Nodo(String label) {
        this.label = label;
        links = new TreeMap<>((a, b) -> a.label.compareTo(b.label));
    }

    public void link(Nodo nodo2, Integer weight) {
        links.put(nodo2, weight);
        nodo2.links.put(this, weight);
    }

    public int weightTo(Nodo n) {
        return weight + links.get(n);
    }

    public String getPath() {
        String weight = "";
        if (this.weight < Integer.MAX_VALUE)
        weight += this.weight;
        else
        weight = "inf";
        String out = "(" + label + "-" + weight + ")";
        if (prev != null)
        out = prev.getPath() + "-" + prev.links.get(this) + "->" + out;
        return out;
        }
}