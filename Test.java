
import java.awt.BorderLayout;
        import java.awt.Button;
        import java.awt.Color;
        import java.awt.Cursor;
        import java.awt.Font;
        import java.awt.Frame;
        import java.awt.GridLayout;
        import java.awt.Menu;
        import java.awt.MenuBar;
        import java.awt.MenuItem;
        import java.awt.Panel;
        import java.awt.TextField;
        import java.awt.Toolkit;
        import java.awt.datatransfer.Clipboard;
        import java.awt.datatransfer.StringSelection;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;

class calLisner extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

class cal implements ActionListener {

    Frame f1;
    Panel p1, p2,p3;
    Color c1, c2, c3, c4, c5, c6, c7;
    MenuItem mi1, mi2, mi3, mi4;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    TextField tf;
    String fv, sv, op;
    double fdv, sdv, tot;

    cal() {

        Font font1 = new Font("Poppins", Font.BOLD, 20);
//        Font font2 = new Font("Poppins", Font.BOLD, 25);
        Font font3 = new Font("Poppins", Font.PLAIN, 15);
        Font font4 = new Font("Poppins", Font.PLAIN, 30);

        c1 = new Color(102, 224, 255);//=
        c2 = new Color(64, 64, 64);//numbers background
        c3 = new Color(38, 38, 38);//background
        c4 = new Color(255, 255, 255);//bttn inside clr
        c5 = new Color(64, 64, 64);//textfield back ground
        c6 = new Color(247, 255, 0);//function rows
        c7 = new Color(255, 255, 255);//numbrs clrs


        f1 = new Frame();

        f1.setBounds(500, 250, 260, 330);
        f1.addWindowListener(new calLisner());
        f1.setTitle("Calculator");
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);


        MenuBar mbar = new MenuBar();

        mbar.setFont(font3);
        Menu m1 = new Menu("New");
        Menu m2 = new Menu("Copy");
        Menu m3 = new Menu("Theme");
        m1.setFont(font3);
        m2.setFont(font3);
        m3.setFont(font3);

        mi1 = new MenuItem("Light");
        mi2 = new MenuItem("Dark");
        mi3 = new MenuItem("Copy");
        mi4 = new MenuItem("New Window");
        mi1.setFont(font3);
        mi2.setFont(font3);
        mi3.setFont(font3);
        mi4.setFont(font3);

        m3.add(mi1);
        m3.add(mi2);
        m2.add(mi3);
        m1.add(mi4);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        f1.setMenuBar(mbar);

        p1 = new Panel();

        p2 = new Panel();

        p3 = new Panel();

        GridLayout g1 = new GridLayout(5, 5, 3, 3);

        GridLayout g2 = new GridLayout(1, 5,3, 3);



        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b11 = new Button("=");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("*");
        b15 = new Button("÷");
        b16 = new Button("AC");
        b17 = new Button(".");
        b18 = new Button("+/-");
        b19 = new Button("%");
        b20 = new Button("√");

        b0.setFont(font1);
        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b11.setFont(font1);
        b12.setFont(font1);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font1);
        b17.setFont(font1);
        b18.setFont(font1);
        b19.setFont(font1);
        b20.setFont(font1);
        b0.setCursor(cursor);
        b1.setCursor(cursor);
        b2.setCursor(cursor);
        b3.setCursor(cursor);
        b4.setCursor(cursor);
        b5.setCursor(cursor);
        b6.setCursor(cursor);
        b7.setCursor(cursor);
        b8.setCursor(cursor);
        b9.setCursor(cursor);
        b11.setCursor(cursor);
        b12.setCursor(cursor);
        b13.setCursor(cursor);
        b14.setCursor(cursor);
        b15.setCursor(cursor);
        b16.setCursor(cursor);
        b17.setCursor(cursor);
        b18.setCursor(cursor);
        b19.setCursor(cursor);
        b20.setCursor(cursor);

        tf = new TextField(10);
        tf.setSize(200, 50);
        tf.setEditable(false);
        tf.setFont(font4);


        theme();

        p3.add(b16);
        p3.add(b19);
        p3.add(b20);
        p3.add(b15);

        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b14);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b13);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b12);
        p2.add(b18);
        p2.add(b0);
        p2.add(b17);
        p2.add(b11);


        p1.add(tf);

        p2.setLayout(g1);
        p3.setLayout(g2);

        f1.add(p1);
        f1.add(p2);
        p2.add(p3);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p3,BorderLayout.CENTER);
        f1.add(p2, BorderLayout.PAGE_END);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        f1.setVisible(true);

    }

    public void theme() {

        f1.setBackground(c3);

        p1.setBackground(c3);
        p2.setBackground(c3);
        p3.setBackground(c3);

        b0.setBackground(c2);
        b1.setBackground(c2);
        b2.setBackground(c2);
        b3.setBackground(c2);
        b4.setBackground(c2);
        b5.setBackground(c2);
        b6.setBackground(c2);
        b7.setBackground(c2);
        b8.setBackground(c2);
        b9.setBackground(c2);
        b17.setBackground(c2);
        b18.setBackground(c2);

        b11.setBackground(c1);
        b12.setBackground(c6);
        b13.setBackground(c6);
        b14.setBackground(c6);
        b15.setBackground(c6);
        b16.setBackground(c6);
        b19.setBackground(c6);
        b20.setBackground(c6);

        b0.setForeground(c4);
        b1.setForeground(c4);
        b2.setForeground(c4);
        b3.setForeground(c4);
        b4.setForeground(c4);
        b5.setForeground(c4);
        b6.setForeground(c4);
        b7.setForeground(c4);
        b8.setForeground(c4);
        b9.setForeground(c4);
        b17.setForeground(c4);
        b18.setForeground(c4);

        b11.setForeground(c3);
        b12.setForeground(c3);
        b13.setForeground(c3);
        b14.setForeground(c3);
        b15.setForeground(c3);
        tf.setBackground(c5);
        tf.setForeground(c4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object o = e.getSource();

        if (o.equals(b0)) {

            tf.setText(tf.getText()
                    + b0.getLabel());

        } else if (o.equals(b1)) {

            tf.setText(tf.getText()
                    + b1.getLabel());

        } else if (o.equals(b2)) {

            tf.setText(tf.getText()
                    + b2.getLabel());

        } else if (o.equals(b3)) {

            tf.setText(tf.getText()
                    + b3.getLabel());

        } else if (o.equals(b4)) {

            tf.setText(tf.getText()
                    + b4.getLabel());

        } else if (o.equals(b5)) {

            tf.setText(tf.getText()
                    + b5.getLabel());

        } else if (o.equals(b6)) {

            tf.setText(tf.getText()
                    + b6.getLabel());

        } else if (o.equals(b7)) {

            tf.setText(tf.getText()
                    + b7.getLabel());

        } else if (o.equals(b8)) {

            tf.setText(tf.getText()
                    + b8.getLabel());

        } else if (o.equals(b9)) {

            tf.setText(tf.getText()
                    + b9.getLabel());

        } else if (o.equals(b17)) {

            tf.setText(tf.getText()
                    + b17.getLabel());

        }//+
        else if (o.equals(b12)) {

            fv = tf.getText();
            tf.setText("");
            op = b12.getLabel();

        }//-
        else if (o.equals(b13)) {

            fv = tf.getText();
            tf.setText("");
            op = b13.getLabel();

        }//*
        else if (o.equals(b14)) {

            fv = tf.getText();
            tf.setText("");
            op = b14.getLabel();

        }//÷
        else if (o.equals(b15)) {

            fv = tf.getText();
            tf.setText("");
            op = b15.getLabel();

        }//%
        else if (o.equals(b19)) {

            fv = tf.getText();
            tf.setText("");
            op = b19.getLabel();

        }//=
        else if (o.equals(b11)) {

            sv = tf.getText();
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("+")) {

                tot = fdv + sdv;
                tf.setText(tot + "");

            }
            if (op.equals("-")) {

                tot = fdv - sdv;
                tf.setText(tot + "");

            }
            if (op.equals("*")) {

                tot = fdv * sdv;
                tf.setText(tot + "");

            }
            if (op.equals("÷")) {

                tot = fdv / sdv;
                tf.setText(tot + "");

            }
            if (op.equals("%")) {

                tot = ((fdv) / 100) * sdv;
                tf.setText(tot + "");

            }

        }//AC
        else if (o.equals(b16)) {

            tf.setText("");
            fv = "";
            sv = "";

        }//√
        else if (o.equals(b20)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);

            tf.setText(Math.sqrt(fdv) + "");

        }// +/-
        else if (o.equals(b18)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            if (fdv > 0) {
                fdv = fdv * (-1);
                fv = Double.toString(fdv);

            }

            tf.setText(fv);

        }//copy
        else if (o.equals(mi3)) {

            String copytext = tf.getText();
            StringSelection StSel = new StringSelection(copytext);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(StSel, StSel);

        }//Dark
        else if (o.equals(mi2)) {

            c1 = new Color(102, 224, 255);//=
            c2 = new Color(64, 64, 64);//numbers background
            c3 = new Color(38, 38, 38);//background
            c4 = new Color(255, 255, 255);//bttn inside clr
            c5 = new Color(64, 64, 64);//textfield back ground
            c6 = new Color(247, 255, 0);//function rows
            c7 = new Color(255, 255, 255);//numbrs clrs

            theme();

        } //light
        else if (o.equals(mi1)) {
            c1 = new Color(102, 224, 255);//=
            c2 = new Color(255, 255, 255);//numbers background
            c3 = new Color(38, 38, 38);//background
            c4 = new Color(0, 0, 0);//bttn inside clr
            c5 = new Color(255, 255, 255);//textfield back ground
            c6 = new Color(247, 255, 0);//function rows
            c7 = new Color(255, 255, 255);//numbrs clrs

            theme();

        }// newWindow
        else if (o.equals(mi4)) {
            new cal();

        }
    }
}

public class Test {

    public static void main(String[] args) {

        new cal();
    }
}
