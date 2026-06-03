public class Analise {
 String query; 
    
 public Analise(String query) {
        this.query = query;
    }

public void executarQuery() { 
    System.out.println("executando query: " + this.query);
}

public static void main(String[] args) {
    Analise analise = new Analise("select * from dados");
    analise.executarQuery();

}
}

