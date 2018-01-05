# Disconnect24 Bot
![License](https://img.shields.io/github/license/riiconnect24/rc24-bot.svg)
![Production List](https://img.shields.io/discord/397593815755522068.svg)

## How do I set this up?
Check out the following steps:
1. You'll need to have Redis and Gradle installed. (PowerTip: You can always stick with what version of gradle is being used currently by substituting all usages of `gradle` with `./gradlew` or `gradlew.bat`.)
2. We'll create the Redis structures as we go, so no need to set anything up.
3. `git clone` the repo somewhere and `cd` into it.
4. `gradle build`! And... tada! That's it. 🎉 You can find JAR(s) created in `build/libs`.
5. For running, double check you have redis started. Also, if `config.yml` can't be found, it'll copy a default copy to the current directory for you.