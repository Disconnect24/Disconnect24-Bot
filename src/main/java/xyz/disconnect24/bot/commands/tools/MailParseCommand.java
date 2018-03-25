package xyz.disconnect24.bot.commands.tools;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.Permission;
import xyz.disconnect24.bot.commands.Categories;

public class MailParseCommand extends Command {
    public MailParseCommand() {
        this.name = "patch";
        this.help = "Lets you know where to patch your `nwc24msg.cfg` for use with Disconnect24.";
        this.category = Categories.TOOLS;
        this.botPermissions = new Permission[]{Permission.MESSAGE_WRITE};
        this.userPermissions = new Permission[]{Permission.MESSAGE_WRITE};
        this.ownerCommand = false;
        this.guildOnly = false;
    }

    @Override
    public void execute(CommandEvent event) {
        event.getAuthor().openPrivateChannel().queue(pc -> pc.sendMessage("Head on over to https://mail.disconnect24.xyz and I'll patch it!").queue(
                (success) -> event.reactSuccess(),
                (failure) -> event.replyError("Hey, " + event.getMember().getAsMention() + ": I couldn't DM you. Make sure your DMs are enabled.")
        ));
    }
}
