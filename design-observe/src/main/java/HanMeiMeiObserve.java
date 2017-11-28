/**
 * 村名：韩梅梅
 */
public class HanMeiMeiObserve implements Observe {


    @Override
    public void notifyMe(String content) {
        System.out.println("韩梅梅收到报纸更新的通知："+content);
    }
}
