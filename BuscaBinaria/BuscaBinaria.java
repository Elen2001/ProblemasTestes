public class BuscaBinaria {

  public int busca(int[] array, int chave) {
    int i = -1;
    int a = 0;
    
    int b = array.length;

    int n = -2;


    while(a <= b) {
      int meio = (a +b) / 2;
    while(chave < 0){

   

      if(array[meio] < chave) {
        a = meio + 1;
      } else if(array[meio] > chave) {
        b = meio - 1;
      } else if(array[meio] == chave) {
        i = meio;

      } else if(array[chave] < 0){
        i = n;
      }
        break;

      }
    }

    return i;  
  }
}