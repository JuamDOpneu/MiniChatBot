import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String Resposta = "";
                MiniChat bot = new MiniChat();
                bot.Ola();
                while (!Resposta.equals("exit")) {
                    Resposta = scan.nextLine();
                }if (Resposta.toLowerCase().contains("oi") || Resposta.toLowerCase().contains("olá")) {
                    bot.ajuda();
                } else if (Resposta.toLowerCase().contains("Como voce está hoje?")) {
                    bot.comoEsta();
                } else if (Resposta.toLowerCase().contains("Voce Gosta de jogos de videogame?")) {
                    bot.Videgame();
                } else if (Resposta.toLowerCase().contains("Voce Gosta de esportes?")) {
                    bot.Esportes();
                } else if (Resposta.toLowerCase().contains("Quem é voce?")) {
                    bot.quemsou();
                } else if (Resposta.toLowerCase().contains("Sair")) {
                    bot.Sair();
                } else {
                    bot.NaoEntendi();
                }
            }
        }