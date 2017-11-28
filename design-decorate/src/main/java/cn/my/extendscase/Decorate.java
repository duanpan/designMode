package cn.my.extendscase;

/**
 * 加工商
 */
public abstract  class Decorate extends  Component {

    //原料生产商
    public  Component component;

    /**
     * 原料加工
     */
    public  abstract void process();

}
