public class Principal {
    public static void main(String[]args){
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1713);
        conta.setTitular("Luan Martins");
        conta.setSaldo(100);

        System.out.println("Saldo atual: "+conta.getSaldo());
    }
}
