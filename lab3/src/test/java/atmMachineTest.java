import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class atmMachineTest {
    atmMachine a;
    Deposit d;
    Withdrawal w;
    String s;

    @BeforeEach
    public void init() {
        a = new atmMachine();
        d = new Deposit();
        w = new Withdrawal();
    }

    class CollectMoney {
        int insert(int x) {
            if (x > 0)
                return x;
            else
                return 0;
        }
    }

    @Test
    public void FirstStub() {
        CollectMoney y = new CollectMoney();
        a.CompleteTransaction(1, y.insert(1000));
        assertEquals(a.balance, 1000.0);
    }

    @Test
    public void SecondStub() {
        CollectMoney y = new CollectMoney();
        double z = w.Withdrawal(4000, y.insert(5000));
        assertEquals(z, 1000.0);
    }

    @Test
    public void ThirdStub() {
        CollectMoney y = new CollectMoney();
        double z = d.deposit(200, y.insert(5000));
        assertEquals(z, 5200.0);
    }

    @AfterEach
    public void clean() {
        a = null;
    }

}

