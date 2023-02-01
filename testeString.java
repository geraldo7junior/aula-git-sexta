public class StringOperations {
  
  // FIXME: Corrigir método de concatenação
  public String concatenate(String a, String b) {
    return a + b;
  }
  
  // TODO: Adicionar método de comprimento de string
  public int length(String str) {
    return str.length();
  }
  
  // TODO: Adicionar método para extrair um pedaço da string
  public String substring(String str, int startIndex, int endIndex) {
    // FIXME: Verificar se startIndex e endIndex são válidos
    return str.substring(startIndex, endIndex);
  }
  
  // TODO: Adicionar método para verificar se duas strings são iguais
  public boolean equals(String a, String b) {
    return a.equals(b);
  }
}