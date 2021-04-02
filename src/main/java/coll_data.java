import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

//extra stuff




public class coll_data extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
            System.out.println(update);
            System.out.println(message + newLine);

            startMessage();

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public void startMessage() { //execute erlaubt statische einmischung nicht
        SendMessage startmsg = new SendMessage();
        startmsg.setChatId("325273066");
        startmsg.setText("Telegram_Java_Bot: I'm on");

        try {
            execute(startmsg); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    } //method can not be call


    @Override
    public String getBotUsername() {
        // TODO
        return null;
    }

    @Override
    public String getBotToken() {
        // TODO
        return null;
    }
}