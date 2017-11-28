import java.util.HashSet;
import java.util.Set;

/**
 * 主题：报纸
 */
public class Newspaper implements Subject {

    //记录订阅了报纸的人（村长的笔记本）
    private Set<Observe> observSet;

    public Newspaper() {
        observSet = new HashSet<>();
    }

    /**
     * 有人订阅时把它记录到笔记本里面
     * @param observe 订阅对象
     */
    @Override
    public void register(Observe observe) {
        this.observSet.add(observe);
    }

    /**
     * 有人取消订阅时把它从记录到笔记本里面删除
     * @param observe 订阅对象
     */
    @Override
    public void delete(Observe observe) {
        this.observSet.remove(observe);
    }

    /**
     * 更新报纸时通知所有订阅报纸的人
     * @param content 通知内容
     */
    @Override
    public void update(String content) {
        if (observSet.size() > 0) {
            for (Observe observe : observSet) {
                observe.notifyMe(content);
            }
        }
    }
}
