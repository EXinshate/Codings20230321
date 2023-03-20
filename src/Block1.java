public class Block1 {
    int a, b, c;
    int volume;

    Block1(int i, int k, int j){
        a = i;
        b = j;
        c = k;
        volume =  a * b * c;
    }

    boolean sameBlock(Block1 ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else  return  false;
    }

    boolean sameVolume(Block1 ob){
        if (ob.volume == volume) return true;
        else return false;
    }
}
class PassOb{
    public static void main(String[] args){
        Block1 ob1 = new Block1(10, 2, 5);
        Block1 ob2 = new Block1(10, 2, 5);
        Block1 ob3 = new Block1(4, 5, 5);

        System.out.println("ob1 same dimensions as ob1: " + ob1.sameBlock(ob1));
        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
    }
}