public abstract class Hero extends Object{

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //有参的构造方法
    //默认的无参的构造方法就失效了

//    public  Hero(){
//        System.out.println("hero 构造方法");
//    }

//    public Hero(String name){
//        System.out.println("hero 有参构造方法");
//        this.name = name;
//    }

    public abstract void attack();

    public final void userItem(Item i){
        System.out.println("使用item");
    }

    @Override
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public static void main(String[] args) {


        }


    }
