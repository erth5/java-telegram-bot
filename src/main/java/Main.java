import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

//Webhooks
//long pooling

// Example taken from https://github.com/rubenlagus/TelegramBotsExample
public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new coll_data());

            /*
            telegramBotsApi.registerBot(new ChannelHandlers());
            telegramBotsApi.registerBot(new DirectionsHandlers());
            telegramBotsApi.registerBot(new RaeHandlers());
            telegramBotsApi.registerBot(new WeatherHandlers());
            telegramBotsApi.registerBot(new TransifexHandlers());
            telegramBotsApi.registerBot(new FilesHandlers());
            */

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}