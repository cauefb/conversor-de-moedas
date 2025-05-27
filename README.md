# 💱 Conversor de Moedas em Java

Este é um projeto simples em Java que permite converter valores entre diferentes moedas utilizando uma API de câmbio em tempo real.

---

## 📋 Funcionalidades

- Conversão entre:
    - Dólar (USD) ↔ Peso argentino (ARS)
    - Dólar (USD) ↔ Real brasileiro (BRL)
    - Dólar (USD) ↔ Peso colombiano (COP)
- Interface simples no terminal
- Integração com a [ExchangeRate API](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas

---

## 📦 Estrutura dos Arquivos

- `Principal.java`: Classe principal que inicia o programa.
- `ConversaoMonetaria.java`: Classe responsável por exibir o menu e gerenciar as conversões.
- `ExchangeRateService.java`: Classe que faz a requisição HTTP para obter as taxas de câmbio.

---

## 🔧 Pré-requisitos

- Java 17 ou superior
- [Gson](https://github.com/google/gson) (para parsear JSON)
- Conexão com a internet (para acessar a API)

---

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   cd conversor-moedas-java

2. Adicione sua API key da ExchangeRate API no arquivo ExchangeRateService.java:
    ```bash
   private static final String API_KEY = "sua key aqui";

3. Compile os arquivos Java:
   ```bash
     javac Principal.java ConversaoMonetaria.java ExchangeRateService.java

4.Execute o programa:
   ```bash
    java Principal

```

## 🧪 Exemplo de uso
```bash 
*******************************************************
Seja bem-vindo/a ao Conversor de Moeda =]

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
*******************************************************
Escolha uma opção válida: 3
Digite o valor para conversão: 100
Resultado: 100.00 USD = 495.60 BRL
````

## ⚠️ Observações
Certifique-se de que a sua chave da API seja válida.

A API gratuita da ExchangeRate possui um limite de requisições diárias.

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

## 👨‍💻 Autor

Desenvolvido por [Cauê Ferreira](https://github.com/cauefb)