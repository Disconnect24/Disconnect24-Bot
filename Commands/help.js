module.exports = {

    run: function(bot, config, msg, args, suffix, Discord, color) {

        let embed = new Discord.RichEmbed()
            .setTitle(`Disconnect24 Bot - Command List`)
            .setDescription(`https://github.com/Disconnect24/Disconnect24-Bot`)
            .addField(`${config.prefix}help`, `Sends this command list.`)
            .addField(`${config.prefix}ping`, `Checks the bots connection.`)
            .addField(`${config.prefix}error`, `Looks up error info for a specified error.`)
            .addField(`${config.prefix}dns`, `Sends the DNSes for Disconnect24.`)
            .addField(`${config.prefix}patchers`, `Sends patchers that can be used to connect to Disconnect24.`)
            .addField(`${config.prefix}info`, `Sends information related to the bot.`)
            .setColor(color)

        msg.author.send(embed)
        msg.react(`✅`)

    }
  
  }
  