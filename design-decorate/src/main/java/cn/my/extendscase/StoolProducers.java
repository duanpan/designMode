package cn.my.extendscase;

/**
 * 凳子生产商
 */
public class StoolProducers extends  Decorate {

    /**
     * 找到一个原料生产商（这里是木材商）
     * @param component
     */
    public StoolProducers(Component component){
        super.component=component;
    }

    /**
     * 把生产木头的任务交给木材商
     */
    @Override
    public void production() {
        super.component.production();
    }

    /**
     * 加工
     */
    @Override
    public void process() {
        production();
        System.out.println("凳匠：把木头加工制作成了凳子");
    }
}
