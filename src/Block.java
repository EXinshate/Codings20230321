class Block{
        int a, b;

        Block(int i, int j){
            a = j;
            b = j;
        }
        void change(Block ob){
            ob.a = ob.a + ob.b;
            ob.b = -ob.b;
        }
}
        class passObRef{
            public static void main(String[] args) {
                Block ob = new Block(15, 20);
                System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
                ob.change(ob);
                System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
            }
        }

