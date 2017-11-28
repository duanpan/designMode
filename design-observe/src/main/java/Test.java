
public class Test {

    public static void main(String[] args) {
        //村长家引进了报纸业务
        Subject newspaper=new Newspaper();

        //村名都来看热闹
        Observe jackObserve=new JackObserve();
        Observe susanObserve=new SusanObserve();
        Observe hanMeiMeiObserve=new HanMeiMeiObserve();

        //村名杰克、苏珊感觉很好玩就订阅了村长的报纸
        newspaper.register(jackObserve);
        newspaper.register(susanObserve);

        //村长通知村名的内容
        String Content;

        //村长报纸第一次更新后通知订阅了报纸的人
        System.out.println("-----------------------------第一次收到通知的人");
         Content="报纸已经更新了，请在今天下午一点到村长家领取";
        newspaper.update(Content);

        //韩梅梅按耐不住寂寞也订阅了村长的报纸
        newspaper.register(hanMeiMeiObserve);
        //村长报纸第二次更新后通知订阅了报纸的人
        System.out.println("-----------------------------第二次收到通知的人");
         Content="报纸已经更新了，请在今天上午10点到村长家领取";
        newspaper.update(Content);


        //杰克觉得村长的报纸很无聊，没有他想要的内容告诉村长他不再需要了
        newspaper.delete(jackObserve);
        //村长报纸第三次更新后通知订阅了报纸的人
        System.out.println("-----------------------------第三次收到通知的人");
        Content="报纸已经更新了，请在今天晚上8点到村长家领取";
        newspaper.update(Content);
    }
}
