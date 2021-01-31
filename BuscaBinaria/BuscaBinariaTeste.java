 import static org.junit.Assert.assertEquals;
 import org.junit.Test;


public class BuscaBinariaTeste {
  @Test
  
  public void Ninicio() {

    int [] array = {0,2,9,13,16,26};
    int chave = 0;

    BuscaBinaria ci = new BuscaBinaria();

    assertEquals(0, ci.busca(array, chave));

  }
  @Test

  public void Nmeio(){

    int[] array = {1,2,5,8,15,24,29};
    int chave = 8;

     BuscaBinaria cm = new BuscaBinaria();

      assertEquals(3, cm.busca(array, chave));
  }

  @Test 

  public void Nfinal(){

    int[] array = {2,5,10,21,32,49,55};
    int chave = 55;

    BuscaBinaria cf = new BuscaBinaria();

      assertEquals(6, cf.busca(array, chave));

  }

@Test 
 
  public void Ninexistente(){

    int[] array = {5,9,12,19,29,55,99,109};
    int chave = 3;

    BuscaBinaria ci = new BuscaBinaria();

      assertEquals(-1, ci.busca(array, chave));

  }

  @Test 

  //Retorna -2 para entradas negativas

  public void Nnegativo(){

    int[] array = {9,13,25,33,46,57};
    int chave = -3;

    BuscaBinaria cn = new BuscaBinaria();

      assertEquals(-2, cn.busca(array, chave));

  }






}

