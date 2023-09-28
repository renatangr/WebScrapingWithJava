package application;

import data.Product;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário que insira a URL do produto NETSHOES desejado
        System.out.println("Digite a URL do produto NETSHOES que deseja: ");
        String url = scan.nextLine();
        
        // Fecha o Scanner após a leitura da entrada do usuário    
        scan.close();
        
        try {        
        // Conecta-se à URL especificada usando Jsoup para realizar a raspagem de dados
            Document doc = Jsoup.connect(url) 
                    .ignoreContentType(true)
                    .followRedirects(true) 
                    .timeout(12000) 
                    .userAgent("Mozilla/6.0 Chrome/19.0.1084.46 Safari/536.5") 
                    .execute() 
                    .parse();

            // Cria um objeto Product para armazenar os dados do produto
             Product marketplaceProduct = new Product();

            // Extrai o nome do produto, o preço, descrição e imagem da página da web
            Elements productElement = doc.select(".short-description h1");
            Elements priceElement = doc.select(".price strong");
            Elements descriptionElement = doc.select(".features p");
            Elements imageElement = doc.select(".photo figure");
            
            // Atribui a informação raspada ao atributo nome do objeto produto
            for (Element product : productElement) {
                String productName = product.text();
                marketplaceProduct.setName(productName);
            }
            
            // Atribui a informação raspada ao atributo preço do objeto produto
            for (Element product : priceElement) {
                String productPrice = product.text();
                marketplaceProduct.setPrice(productPrice);
            }
            
            // Atribui a informação raspada ao atributo descrição do objeto produto
            for (Element product : descriptionElement) {
                String productDescription = product.text();
                marketplaceProduct.setDescription(productDescription);
            }
            
            // Atribui a informação raspada ao atributo imagem do objeto produto
            for (Element product : imageElement) {
                marketplaceProduct.setImage(product.selectFirst("img").attr("src"));
            }

            try (FileWriter writer = new FileWriter("dadosDoProduto.txt")) {
                // Escreve os dados do produto no arquivo de saída
                writer.write("Abaixo toda a raspagem de dados: ");
                writer.append("\n-------------------------\n");
                writer.append(marketplaceProduct.toString());
                writer.append("\n\n Feito com <3 por @renatangr | Usando Java + Jsoup lib");
            
            } catch (IOException e) {
                e.printStackTrace();
                
            }
                        
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}


