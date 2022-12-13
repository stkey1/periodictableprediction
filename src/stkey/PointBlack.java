package stkey;

import javax.swing.*;
import java.util.*;

import static javax.swing.JOptionPane.showInputDialog;

/**
 * @author stkey
 * @components JOptionPane
 * @since 13.12.2022
 */
public class PointBlack {

    int point = 0, trueValue = 0, wrongValue = 0;

    public void calculation() {
        HashMap<String, String> newHash = new HashMap<>();
        Definition definition = new Definition();
        newHash = definition.implementation();

        //Random value definition
        Set set = newHash.entrySet();
        System.out.println(set);
        Iterator itr = set.iterator();
        JOptionPane.showMessageDialog(null, "Please, enter value according to periodic key");

        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            String prediction = showInputDialog(me.getKey());

            if (prediction.equalsIgnoreCase(String.valueOf(me.getValue()))) {
                point += 10;
                trueValue++;
            } else {
                point -= 5;
                wrongValue++;
            }
        }
        JOptionPane.showMessageDialog(null, "Total Points:" + point + "\nTotal True Numbers:" + trueValue + "\n Total Wrong Numbers" + wrongValue);
    }
}
