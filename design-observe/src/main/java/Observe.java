/**
 * 观察者(订阅者)接口
 */
public interface Observe {

    /**
     * 通知观察者的方法（村长统一用打电话的方式通知）
     * @param content 通知内容
     */
    public void notifyMe(String content);

}
