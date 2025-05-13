import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Stopwatch implements ActionListener {
    long startTime;
    boolean running = false;
    JLabel timeLabel, titleLabel;
    Thread timerThread;
    JFrame frame;
    JButton startBtn, resetBtn;

    Stopwatch() {
        createUI();
    }

    private void createUI() {
        frame = new JFrame("STOPWATCH");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        titleLabel = new JLabel("Stop Watch", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLUE);
        frame.add(titleLabel, BorderLayout.NORTH);

        timeLabel = new JLabel("00 : 00 : 00 . 00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        timeLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(timeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        startBtn = new JButton("Start");
        resetBtn = new JButton("Reset");

        startBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        buttonPanel.add(startBtn);
        buttonPanel.add(resetBtn);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            if (!running) {
                startTimer();
                startBtn.setText("Stop");
            } else {
                stopTimer();
                startBtn.setText("Start");
            }
        } else if (e.getSource() == resetBtn) {
            resetTimer();
        }
    }

    private void startTimer() {
        if (!running) {
            running = true;
            startTime = System.currentTimeMillis();

            timerThread = new Thread(() -> {
                while (running) {
                    final long elapsed = System.currentTimeMillis() - startTime;
                    SwingUtilities.invokeLater(() -> updateDisplay(elapsed));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            timerThread.start();
        }
    }

    private void stopTimer() {
        running = false;
    }

    private void resetTimer() {
        running = false;
        timeLabel.setText("00 : 00 : 00 . 00");
        startBtn.setText("Start");
    }

    private void updateDisplay(long millis) {
        long hours = millis / 3600000;
        long minutes = (millis % 3600000) / 60000;
        long seconds = (millis % 60000) / 1000;
        long hundredths = (millis % 1000) / 10;

        String time = String.format("%02d : %02d : %02d . %02d", hours, minutes, seconds, hundredths);
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}
