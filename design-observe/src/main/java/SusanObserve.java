/**
 * 村名：苏珊
 */
public class SusanObserve implements Observe {
    @Override
    public void notifyMe(String content) {
        System.out.println("苏珊收到报纸更新的通知："+content);
    }
}
