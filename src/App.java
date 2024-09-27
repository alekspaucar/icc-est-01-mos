public class App {
    public static void main(String[] args) throws Exception {
        metodosOrdenamiento mO = new metodosOrdenamiento();

        int [] arreglo = {10,5,8,2,0,};
        mO.sortBySeleccion(arreglo,true);
        mO.printlnArreglo(arreglo);
        System.out.println();
        mO.sortBySeleccion(arreglo,false);
        mO.printlnArreglo(arreglo);

    }
}
