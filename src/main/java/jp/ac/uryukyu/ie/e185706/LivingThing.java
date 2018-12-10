package jp.ac.uryukyu.ie.e185706;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     *
     * 任意のキャラクターの情報をLivingThingクラスの変数に入れ、
     * 初期情報として出力する。
     *
     * @param name 使用する名前
     * @param hitPoint　HP
     * @param attack　攻撃力
     *
     */
    public LivingThing(String name,int hitPoint,int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    /**
     *
     * LivingThingクラスで使われている変数deadを取得するためのメソッド。
     *
     * @return dead LivingThingクラスで使用されている変数
     */
    public boolean isDead(){
        return dead;
    }


    /**
     *
     * LivingThingクラスで使われている変数nameを取得するためのメソッド。
     *
     * @return name LivingThingクラスで使用されている変数
     */
    public String getName(){
        return name;
    }

    /**
     *
     * もしHero（Enemy）が死んでいないならば、相手に対して攻撃する。
     *
     * @param opponent　名前、HP、攻撃力の情報
     *
     */
    public void attack(LivingThing opponent){

        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     *
     * 与えたダメージをHPから引き、生存しているか確認する。
     *
     * @param damage　attackメソッドで攻撃して与えたダメージ
     *
     */

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }

    }

    /**
     *
     * LivingThingクラスで使われている変数hitPointに任意の数を設定するメソッド。
     *
     * @param hitPoint　設定したいint型の数（HP）
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     *
     * LivingThingクラスで使われている変数hitPointを取得するためのメソッド。
     *
     * @return hitPoint LivingThingクラスで使用されている変数
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     *
     * LivingThingクラスで使われている変数deadに任意の真偽を設定するメソッド。
     *
     * @param dead　設定したいdeadの真偽
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

}