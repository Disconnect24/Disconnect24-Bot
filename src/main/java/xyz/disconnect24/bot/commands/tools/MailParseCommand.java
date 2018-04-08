package xyz.disconnect24.bot.commands.tools;

/*
 * The MIT License
 *
 * Copyright 2017 Disconnect24 and its contributors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

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
