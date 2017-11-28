package cn.my.extendscase;



public class Test {


    public static void main(String[] args) {
        Decorate decorate;
        System.out.println("----------鲍勃想买个凳子，找到凳子商人----------");
        //凳子商人看到来订单了就联系了木材商进了一批木材
        decorate =new StoolProducers(new WoodProducers());
        //然后把木材加工成凳子卖给了鲍勃
        decorate.process();
        System.out.println("----------韩梅梅家新房转修想换个木地板，于是找到地板商----------");
        //地板商人接到订单后去找木材商人进货，结果自己联系的木材商最近两天休息没法生产
        // 没办法只好找隔壁的门商借点木材先用，门上碍于邻居的情面只好打电话给自己的木材生厂商进了点木材过来借给了地板商人
        decorate=new DoorProducers(new DoorProducers(new WoodProducers()));
        //然后把木材加工成地板卖给了韩梅梅
        decorate.process();
    }

}
