package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    public String toString() {
        return super.toString() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }
    public boolean jugarConLasManos() {
        return true;
    }
    public int compareTo(Object p) {
        int a = (int) this.golesRecibidos;
        Portero p1 = (Portero) p;
        int b = (int) p1.golesRecibidos;
        return Math.abs(a - b);
    }
}