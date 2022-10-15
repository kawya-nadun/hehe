class MethodOverloading {
    void display(int a, int b){
        System.out.println("12345");
    }
    void display(int a, double b, double c){
        System.out.println("123 and abc");
    }
    void display(int a){
        System.out.println("54abcd");
    }
    void display(int a, double b){
        System.out.println("3.89");
    }
    public static void main(String[] args) {
        MethodOverloading mol = new MethodOverloading();
        mol.display(1);
        mol.display( 2,4.67,7.87765);
        mol.display(1);
        mol.display(1,3.7);
    }
}