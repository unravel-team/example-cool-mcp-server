# tech.unravel/example-cool-mcp-server

I'm an MCP server generator template for Clojure programmers. Use me on Github for creating your cool new MCP servers.

Here is how you should use this template:

1. [ ] Click the 'Use this template' button to create your server project
2. [ ] Replace `tech.unravel` with your group-id throughout the project, and in the directory structure as well
3. [ ] Replace `example-cool-mcp-server` with the actual name of your server throughout the project
4. [ ] Replace `/Users/vedang/repo-name` with the full-path on your local disk, when testing your server
5. [ ] Add the logic of your server in `src/tech/unravel/example_cool_mcp_server.clj` file (Remember that you will have changed the name of this file). This file contains a full stub already, to help you get started.

## Usage

### Building the Uberjar

1. `make clean && make build`

### Running the MCP server
Some example commands you can try in Claude Desktop or Inspector:

1. Visualize this data for me using ...
2. Add the prompts you would use to test your server in this section

#### Before running the MCP server
Remember:
1. Replace the full-path to the `tech.unravel/example-cool-mcp-server` JAR with the correct path on your system (i.e. replace `/Users/vedang/repo-name` below with the correct path)
2. Other notes specific to your server should go here.

#### In Claude Desktop

```json
    "example_cool_mcp_server": {
      "command": "java",
      "args": [
        "-Dclojure.tools.logging.factory=clojure.tools.logging.impl/log4j2-factory",
        "-Dorg.eclipse.jetty.util.log.class=org.eclipse.jetty.util.log.Slf4jLog",
        "-Dlog4j2.contextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector",
        "-Dlog4j2.configurationFile=log4j2-mcp.xml",
        "-Dbabashka.json.provider=metosin/jsonista",
        "-Dlogging.level=INFO",
        "-cp",
        "/Users/vedang/repo-name/target/tech.unravel/example-cool-mcp-server-1.0.0.jar",
        "tech.unravel.example-cool-mcp-server"
      ]
    }
```

#### In MCP Inspector
Remember to use the full-path to the `tech.unravel/example-cool-mcp-server` JAR on your system.

```shell
npx @modelcontextprotocol/inspector java -Dclojure.tools.logging.factory=clojure.tools.logging.impl/log4j2-factory -Dorg.eclipse.jetty.util.log.class=org.eclipse.jetty.util.log.Slf4jLog -Dlog4j2.contextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector -Dlog4j2.configurationFile=log4j2-mcp.xml -Dbabashka.json.provider=metosin/jsonista -Dlogging.level=INFO -cp /Users/vedang/repo-name/target/tech.unravel/example-cool-mcp-server-1.0.0.jar tech.unravel.example-cool-mcp-server
```

## License

Copyright © 2025 Unravel.tech Engineering

Distributed under the MIT License
