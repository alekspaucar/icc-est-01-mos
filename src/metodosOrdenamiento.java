public class metodosOrdenamiento {

    public int[] sortBySeleccion(int[] arreglo,boolean asendente ){
        int n=arreglo.length;
            //recorrer el arreglo
        for( int i = 0 ; i < n ; i ++ ) {
            //entontrar el indice del elemento mayor en el arreglo ordenado
            int indice = i;


            for(int j = i + 1 ; j < n ; j ++ ){
                if (asendente ?arreglo[j] < arreglo[indice]: arreglo[j] > arreglo[indice]){
                    indice=j;
                }
            }

             
            int temp = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = temp;
        }
 
        return arreglo;
    }


    public void printlnArreglo(int[] arreglo){
        for(int elem: arreglo){
            System.out.println(elem);

        }
    }
}
