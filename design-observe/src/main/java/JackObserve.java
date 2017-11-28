/**
 * 村名：杰克
 */
public class JackObserve implements Observe {

    @Override
    public void notifyMe(String content) {
        System.out.println("杰克收到报纸更新的通知："+content);
    }
}
