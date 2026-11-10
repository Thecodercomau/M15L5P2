class Animal{
    void eat(){
        System.out.println("eating...Animal class...eat method");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("roaring...Lion class...roar method");
    }
}
class Babylion extends Lion{
    void weep(){
        System.out.println("weeping...Babylon class...weep method");
    }
}
class Main{
    public static void main(String args[]){
        Babylion obj = new Babylion();
        obj.eat();
        obj.roar();
        obj.weep();
    }
}