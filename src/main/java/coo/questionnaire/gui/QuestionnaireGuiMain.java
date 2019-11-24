package coo.questionnaire.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import coo.questionnaire.*;

public class QuestionnaireGuiMain {
    private JFrame f;

    public QuestionnaireGuiMain() {
    }

    public void createFrame() {
        this.f = new JFrame();
        JPanel pp = new JPanel();
        pp.setLayout(new GridLayout(5, 1));
        JScrollPane p = new JScrollPane(pp);
        this.f.setLayout(new BorderLayout(2, 1));
        this.f.getContentPane().add(p, "Center");
        this.f.setSize(800, 700);
        this.f.addWindowListener(new FermeWindowEvent((FermeWindowEvent)null));

        QuestionnaireFactory factory = new QuestionnaireFactory();
        String file = "questionnairetest.txt";
        try {
            Questionnaire questionnaire = factory.createQuestionnaire(file);
            questionnaire.askAllGui(pp);

        } catch (IOException except) {
            System.out.println(file + " : wrong file");
            System.exit(0);
        }

        JButton finished = new JButton("j'ai fini");
        finished.addActionListener(new FinishedActionListener((FinishedActionListener)null));
        this.f.add(finished, "South");
        this.f.setVisible(true);
    }

    public static void main(String[] args) {
        (new QuestionnaireGuiMain()).createFrame();
    }

    private class FermeWindowEvent extends WindowAdapter {
        private FermeWindowEvent(FermeWindowEvent fermeWindowEvent) {
        }

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    private class FinishedActionListener implements ActionListener {
        private FinishedActionListener(FinishedActionListener finishedActionListener) {
        }

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(QuestionnaireGuiMain.this.f, "Here you can announce user's score...", "Finished !", 1);
        }
    }
}
