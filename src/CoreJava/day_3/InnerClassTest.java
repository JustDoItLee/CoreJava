package CoreJava.day_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author 李智
 * @date 2016/12/7
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        
        //选择0退出
        JOptionPane.showMessageDialog(null, "quit?");
        System.exit(0);
    }
}

class TalkingClock {
    private int interval;
    private boolean beep;

    //构造一个talkingClock
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    //开始这个计时器
    public void start() {
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    private class TimerPrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("now :" + now);
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}