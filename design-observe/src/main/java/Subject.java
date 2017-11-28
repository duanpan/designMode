/**
 * 主题接口
 */
public interface Subject {

    /**
     * 注册订阅者
     * @param observe 订阅对象
     */
    public void register(Observe observe);

    /**
     * 取消订阅
     * @param observe 取消订阅的人
     */
    public void delete(Observe observe);

    /**
     * 更新主题
     * @param content 通知内容
     */
    public void update(String content);

}
