/* import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.control.ProgressIndicator;
public class CountDown {
    private double count = 0;
    boolean check = true;
    public CountDown(ProgressIndicator progressIndicator, Controller c) {        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println(count);
                    progressIndicator.setProgress(count);
                    if (count < 10){
                        count = count + 0.1;
                    

                    if (count > 0.9){
                                                System.out.println("fired");
                        c.check();
                        System.out.println("fired");
                        }
                    }
                }
            };
        timer.schedule(task, 0, 1000);
    }

    
}*/