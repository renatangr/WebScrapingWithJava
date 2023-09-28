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



        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}


