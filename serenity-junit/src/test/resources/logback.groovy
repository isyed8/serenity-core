import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.WARN

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %LOGGER{5} Groovy - %msg%n"
    }
}

root(WARN, ["STDOUT"])
logger("org.hibernate", WARN, ["STDOUT"])
