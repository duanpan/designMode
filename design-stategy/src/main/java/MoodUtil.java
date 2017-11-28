/**
 * 心情工具类
 */
public class MoodUtil {

    /**
     * 开心时的行为表现
     * @param state
     */
    public static void happy(int state){
        if(state==1){
            System.out.println("开心的时候：我会大笑，哈哈哈哈！");
        }else if(state==2){
            System.out.println("开心的时候：我会疯狂的购物");
        }else if(state==3){
            System.out.println("开心的时候：我会唱歌！");
        }
    }

    /**
     * 难过时的行为表现
     * @param state
     */
    public static void sad(int state){
        if(state==1){
            System.out.println("伤心的时候：我会哭泣！");
        }else if(state==2){
            System.out.println("伤心的时候：我会睡觉！");
        }else if(state==3){
            System.out.println("开心的时候：我会疯狂的购物");
        }

    }

}
