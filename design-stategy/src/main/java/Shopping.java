/**
 * 购物.
 */
public class Shopping implements SadStratege,HappyStrategy{
    @Override
    public void sad() {
        System.out.println("伤心的时候：我会疯狂的购物！");
    }

    @Override
    public void happy() {
        System.out.println("开心的时候：我会疯狂的购物");
    }
}
