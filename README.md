# Raspagem de Dados com Java e Jsoup

Este é um projeto simples que demonstra como realizar a raspagem de dados de um produto usando Java e a biblioteca Jsoup. A raspagem de dados é feita a partir de uma URL fornecida pelo usuário e os resultados são armazenados em um arquivo de texto '.txt'.


## Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado em seu sistema:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [IDE NetBeans](https://netbeans.apache.org/download/index.html) (opcional, se desejar pode usar outra)

## Como Usar

Siga estas etapas para usar o código:

1. Clone este repositório para o seu sistema local:

   ```bash
   git clone https://github.com/renatangr/WebScrapingWithJava
   
2. Abra a pasta Source, entre no package application e rode o arquivo WebScraper.java
3. O programa solicitará que você insira a URL do produto NETSHOES desejado. Aqui estão algumas sugestões de URLs:
- [Jaqueta Adidas Brand Love Masculina Preto](https://www.netshoes.com.br/jaqueta-adidas-brand-love-masculina-preto-FB8-3644-006)
- [Tênis Bebê Batatinha Tiras Menina Rosa](https://www.netshoes.com.br/tenis-bebe-batatinha-tiras-menina-rosa-U62-0578-018)
- [Mochila Shoestock Grande Feminina Preto](https://www.netshoes.com.br/mochila-shoestock-grande-feminina-preto-O01-5426-006)
- [Boné Puma Metal Cat Aba Curva Preto](https://www.netshoes.com.br/bone-puma-metal-cat-aba-curva-preto-D14-3044-006)
- [Carteira Masculina Luxo Couro Legítimo com Porta Moedas/CNH Preto](https://www.netshoes.com.br/carteira-masculina-luxo-couro-legitimo-com-porta-moedascnh-preto-BO2-0012-006)
- [Sandália Anabela Griffe Espadrille Feminina Branco](https://www.netshoes.com.br/sandalia-anabela-griffe-espadrille-feminina-branco-BAV-0210-014)
- [Kit Meia Infantil Soquete Lupo 3 Pares Masculina Preto](https://www.netshoes.com.br/kit-meia-infantil-soquete-lupo-3-pares-masculina-preto-DCP-4822-006)
- [Regata Rainha Print Feminina Branco](https://www.netshoes.com.br/regata-rainha-print-feminina-branco-D50-2107-014)
- [Sandália Havaianas Top Max Cf Masculina Marinho](https://www.netshoes.com.br/sandalia-havaianas-top-max-cf-masculina-marinho-D53-0614-012)
- [Patins Gonew Fitness Bearing Abec7 70mm Cinza](https://www.netshoes.com.br/patins-gonew-fitness-bearing-abec7-70mm-cinza-C62-3461-010)
- [Necessaire Farm Tucanos Ponto Cruz Feminina Onça](https://www.netshoes.com.br/necessaire-farm-tucanos-ponto-cruz-feminina-onca-I98-6915-209)
- [Jibbitz Infantil Crocs New Holiday 3 Packs Colorido](https://www.netshoes.com.br/jibbitz-infantil-crocs-new-holiday-3-packs-colorido-FDT-0581-888)

    Após inserir a URL, o programa realizará a raspagem de dados e armazenará os resultados em um arquivo chamado dadosDoProduto.txt. 
