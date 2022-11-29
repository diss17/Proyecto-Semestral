package GUI;

import javax.swing.*;

public class Botones extends JPanel {

    public Botones(InGame p) {
        JButton apagado = new JButton("[0]Apagar vehiculo");
        Aceleracion x3 = new Aceleracion("[1]Velocidad Maxima: 30", p);
        Aceleracion x5 = new Aceleracion("[2]Velocidad Maxima: 50", p);
        Aceleracion x10 = new Aceleracion("[3]Velocidad Maxima: 100", p);
        this.add(apagado);
        this.add(x3);
        this.add(x5);
        this.add(x10);
    }
}
