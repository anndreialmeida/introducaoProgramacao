package trabalhoArquivo;

import java.io.*;
import java.util.Scanner;

public class TrabalhoArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "D:\\Trabalho\\dadosVenda.txt";
        String[] nomeProduto = new String[50];
        Integer[] qtdProduto = new Integer[50];
        Double[] precoProduto = new Double[50];
        Double totalVendaProduto = 0.0;
        Double totalReceita = 0.0;
        int indice = 0;

        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader bufferLeitura = new BufferedReader(arquivo);
            Scanner input = new Scanner(bufferLeitura);
            int contador = 0;


            while (input.hasNextLine()) {
                String linha = input.nextLine();

                if (contador == 0) {
                    nomeProduto[indice] = linha;

                } else if (contador == 1) {
                    qtdProduto[indice] = Integer.valueOf(linha);

                } else if (contador == 2) {
                    precoProduto[indice] = Double.valueOf(linha);

                }
                contador++;
                if (contador > 2) {
                    contador = 0;
                    indice++;
                }

            }

            bufferLeitura.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }



        try {
            FileWriter arquivo = new FileWriter("D:\\Trabalho\\dadosReceita.txt");
            BufferedWriter bufferEscrita = new BufferedWriter(arquivo);
            for (int i = 0; i < indice; i++) {
                totalVendaProduto = precoProduto[i] * qtdProduto[i];
                bufferEscrita.write(nomeProduto[i] + " - " + totalVendaProduto + "\n");
            }
            bufferEscrita.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < indice; i++) {
            totalVendaProduto = precoProduto[i] * qtdProduto[i];

            totalReceita += totalVendaProduto;

        }

        System.out.println("Receita: Total " + totalReceita);

    }


}


