package no.need.to.think.of.creative.packagename;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterviewImplTest {

    @Test
    void implementation_prints_expected_comma_separated_cities() throws IOException {
        // Given:
        try (final var systemOutOutput = new ByteArrayOutputStream()) {
            final Charset charset = StandardCharsets.UTF_8;
            try (final var systemOut = new PrintStream(systemOutOutput, false, charset)) {
                System.setOut(systemOut);
                var impl = new InterviewImpl();

                // When:
                impl.printCommaSeparatedListOfCitiesToConsole();

                // Then:
                assertEquals("Oslo,Bergen,Mysen", systemOutOutput.toString(charset).trim());
            }
        }
    }

}