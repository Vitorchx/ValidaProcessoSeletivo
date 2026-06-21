package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       analisarCandidato(1900.0);
       analisarCandidato(2200.0);
       analisarCandidato(2000.0);


    }
    static void analisarCandidato(double salarioPretendito){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendito) {
            System.out.println("Ligar para o Candidato");
        }
        else if (salarioBase ==salarioPretendito)
            System.out.println("Ligar para candidato com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}
