package tk.sherrao.discord.incitebot.chat.commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.MessageEmbed;
import net.dv8tion.jda.core.entities.TextChannel;
import tk.sherrao.discord.incitebot.chat.ChatCommand;
import tk.sherrao.discord.incitebot.chat.ChatCommandManager;

public class BindsCommand extends ChatCommand {

    private MessageEmbed message;
    
    public BindsCommand( ChatCommandManager manager ) {
        super( manager, "binds", "keybinds", "binds", "bind" );

        this.message = new EmbedBuilder()
                .setAuthor( "Incite's CS:GO Keybinds", null, manager.getBot().getIconURL() )
                .setColor( manager.getBot().getColour() )
                .setTitle( "pastebin.com/FHExgmwT",  "https://www.pastebin.com/FHExgmwT" )
              ///  .setFooter( "InciteBot | Developed by SherRao", null )
                .build();
        
    }

    @Override
    public void onExecute( Member author, TextChannel channel, String alias, String[] args ) {
        channel.sendMessage( message ).complete();
        
    }

}
