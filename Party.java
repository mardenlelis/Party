import java.awt.*;
import java.awt.event.*;

class Party {
    public void buildInvite() {
        Frame frm = new Frame();
        Label lbl = new Label("Party at Tim's");
        Button btnYes = new Button("You bet!");
        Button btnNo = new Button("Shoot me!");
        Panel pnl = new Panel();

        // Adiciona os componentes ao painel
        pnl.add(lbl);
        pnl.add(btnYes);
        pnl.add(btnNo);

        // Define o layout do painel como FlowLayout (por padrão)
        pnl.setLayout(new FlowLayout());

        // Adiciona o painel ao frame
        frm.add(pnl);

        // Adiciona um ouvinte de evento ao botão btnYes
        btnYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You bet! Party time!");
            }
        });

        // Adiciona um ouvinte de evento ao botão btnNo
        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Shoot me! No party...");
            }
        });

        // Configurações básicas do frame
        frm.setSize(250, 150);
        frm.setTitle("Party Invitation");
        frm.setVisible(true);

        // Adiciona um ouvinte de evento ao fechar o frame
        frm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Party party = new Party();
        party.buildInvite();
    }
}
