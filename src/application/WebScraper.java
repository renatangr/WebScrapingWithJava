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
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a URL do produto NETSHOES que deseja: ");
        String url = scan.nextLine();
        scan.close();
        
        try {          
            Document doc = Jsoup.connect(url) 
                    .ignoreContentType(true)
                    .followRedirects(true) 
                    .timeout(12000) 
                    .userAgent("Mozilla/6.0 Chrome/19.0.1084.46 Safari/536.5") 
                    .execute() 
                    .parse();

            Product marketplaceProduct = new Product();

            Elements productElement = doc.select(".short-description h1");
            Elements priceElement = doc.select(".price strong");
            Elements descriptionElement = doc.select(".features p");
            Elements imageElement = doc.select(".photo figure");

            for (Element product : productElement) {
                String productName = product.text();
                marketplaceProduct.setName(productName);
            }

            for (Element product : priceElement) {
                String productPrice = product.text();
                marketplaceProduct.setPrice(productPrice);
            }

            for (Element product : descriptionElement) {
                String productDescription = product.text();
                marketplaceProduct.setDescription(productDescription);
            }

            for (Element product : imageElement) {
                marketplaceProduct.setImage(product.selectFirst("img").attr("src"));
            }

            try (FileWriter writer = new FileWriter("dadosDoProduto.txt")) {
                
                writer.write("Abaixo toda a raspagem de dados: ");
                writer.append("\n-------------------------\n");
                writer.append(marketplaceProduct.toString());
                writer.append("\n(Feito com <3 por @renatangr | Usando Java + Jsoup lib)");
            
            } catch (IOException e) {
                e.printStackTrace();
                
            }
                        
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}


