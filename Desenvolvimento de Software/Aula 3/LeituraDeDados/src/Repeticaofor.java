public class Repeticaofor {
    public static void main(String[] args)  {
        for (int cont = 0; cont <= 100; cont++){
            System.out.println(cont);
        }
        String nomes[] = {"João", "Maria", "José"};
        String procura = "José";
        boolean encontrou = false;
        for(int i = 0; i<nomes.length; i++){
            if(nomes[i].equals(procura)){
                encontrou = true;
                break;
            }
            System.out.println("Visitamos esse lugar");
        }
        if(encontrou){
            System.out.println(procura + " encontrado!");
        }
        else{
            System.out.println(procura + "Não encontrado!");
        }
    }
}