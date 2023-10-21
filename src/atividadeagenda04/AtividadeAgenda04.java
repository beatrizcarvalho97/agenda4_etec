package atividadeagenda04;

import java.util.Scanner;

public class AtividadeAgenda04 {

    public static void main(String[] args) {
        
        String modelo;
        double valorDiaria;
        int qtDias;
        double kmPercorrido;
        double precoKm = 0.20;
        double resultado;
        
        System.out.println("Este programa irá coletar os dados do veículo alugado e apresentar o modelo do carro alugado e valor a ser pago.");
        Scanner informacoes = new Scanner(System.in);
        System.out.println("Digite o modelo do carro alugado:");
        modelo=informacoes.next();
        System.out.println("Digite o valor da diária:");
        valorDiaria=informacoes.nextDouble();
        System.out.println("Digite a quantidade de dias de locação:");
        qtDias = informacoes.nextInt();
        System.out.println("Digite a quantidade de Km percorridos:");
        kmPercorrido = informacoes.nextDouble();
        resultado = (valorDiaria * qtDias) + (precoKm * kmPercorrido);
        System.out.println("O valor total a pagar para o "+modelo+ " será de R$ " +resultado);
    }
    
}