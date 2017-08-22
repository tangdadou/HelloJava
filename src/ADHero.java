/**
 * Created by zhangzhiwei on 10/4/17.
 */
public class ADHero extends Hero implements AD {

    @Override
    public void physicAttack() {
        System.out.println("物理攻击");

    }

//    public ADHero(){
//        super("");
//        System.out.println("adhero 构造方法");
//    }

    @Override
    public void attack() {

    }

    //    public ADHero(String name){
//        super(name);
//        System.out.println("adhero 有参构造方法");
//    }
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }




    public static void main(String[] args){
//        new ADHero("德莱文");
    }
}
