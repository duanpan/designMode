package cn.my.extendscase;

/**
 * 地板生产商
 */
public class FloorProducers  extends Decorate{

    /**
     * 找到一个原料生产商（这里是木材商）
     * @param component
     */
    public FloorProducers(Component component){
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
        System.out.println("地板商：把木头加工制作成了地板");
    }

}
