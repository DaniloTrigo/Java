public class ElipseApp {
    public static void main (String[] args) {
        Elipse elip1 = new Elipse(2,2, 25,25);
        elip1.print();
    }
}
class Elipse {
    int x, y;
    int diaw, diah;
    Elipse (int x, int y, int diaw, int diah) {
        this.x = x;
        this.y = y;
        this.diaw = diaw;
        this.diah = diah;
    }
    void print () {
        System.out.format("Diametros (%d,%d) na posicao (%d,%d).\n",
            this.diaw, this.diah, this.x, this.y);
    }
}