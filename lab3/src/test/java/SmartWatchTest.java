import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import static org.junit.Assert.*;

class SmartWatchTest {
    SmartWatch x;
    String s;
    @Nested
    class bottomUp {
        @BeforeEach
        public void init() {
            x = new SmartWatch();
        }
        @Test
        public void Driver1(){
            s = x.StatesTransition("a");
            System.out.println("Date:  "+ s);
            assertEquals("Date: "+ s,"Date: "+ x.year+"-"+x.month+"-"+x.day);
        }
        @Test
        public void Driver2(){
            s = x.StatesTransition("a");
            s = x.StatesTransition("a");
            System.out.println("Time:  "+ s);
            assertEquals("Time:  "+ s,"Time:  "+ x.hr+":"+x.min);
        }
        @Test
        public void Driver3(){
           SmartWatch x = new SmartWatch();
            String[][] times = new String[5][2];
            x.StatesTransition("c");
            for(int i = 0 ; i < 5 ; i ++) {
                System.out.print(x.State2);
                times[i][0] = (x.DisplayDate() + " " + x.DisplayTIME());
                x.StatesTransition("b");
                x.StatesTransition("a");
                times[i][1] = (x.DisplayDate() + " " + x.DisplayTIME());
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println();
            }}
        @AfterEach
        public void erase(){
            x=null ;
        }
    }


}