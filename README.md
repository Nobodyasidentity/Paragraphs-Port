# Paragraphs port
> Lets you type characters like §

based on <a target="_blank" href="https://github.com/yiyuyan/ParagraphsReborn">ParagraphsReborn</a>.  
for older Minecraft versions, use <a target="_blank" href="https://modrinth.com/mod/paragraphs">Paragraphs</a> by fungoza/hacker1337.  

Minecraft mod that allows you to write Section sign (§) in any text fields  
May be useful when you paste item NBT in command block or item editor mods  

Though not required, it is recommended to also have this mod on the server as most text inputs (like the chat or anvil renaming) will reject illegal characters.  
```
Client, no server:    limited
Client & server:      fully works
No client, server:    does nothing, vanilla
No client, no server: that's just vanilla
```

## Developer info
Everything inside `net/` is excluded from the final JAR as they are just there so that the Fabric compiler won't complain.
