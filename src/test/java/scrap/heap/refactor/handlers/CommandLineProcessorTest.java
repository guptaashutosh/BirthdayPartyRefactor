package scrap.heap.refactor.handlers;

import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommandLineProcessorTest {

    @Test
    public void inputProcessor() {
    }

    @Test
    public void testInputProcessor() throws Exception {
        CommandLineProcessor classUnderTest = new CommandLineProcessor();
        String[] args = new String[2];
        args[0] = "-c=CHOCOLATE,CHOCOLATE,CIRCLE,SMALL,BROWN";
        args[1] = "-b=RED,mylar,6";

        Map<String, String[]> processor = classUnderTest.inputProcessor(args);
        assertFalse("app should have a greeting", processor.isEmpty());
        assertTrue(processor.size() == 2);
    }

    @Test(expected = ParseException.class)
    public void testInputProcessorFail() throws Exception {
        CommandLineProcessor classUnderTest = new CommandLineProcessor();
        String[] args = new String[2];
        args[0] = "-c=CHOCOLATE";
        args[1] = "-b=RED,mylar,6";

        Map<String, String[]> processor = classUnderTest.inputProcessor(args);
        assertFalse("app should have a greeting", processor.isEmpty());
        assertTrue(processor.size() == 2);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testInputProcessorUnrecognizeArgs() throws Exception {
        CommandLineProcessor classUnderTest = new CommandLineProcessor();
        String[] args = new String[2];
        args[0] = "-x=CHOCOLATE,CHOCOLATE,CIRCLE,SMALL,BROWN";
        args[1] = "-b=RED,mylar,6";

        Map<String, String[]> processor = classUnderTest.inputProcessor(args);
        assertFalse("app should have a greeting", processor.isEmpty());
        assertTrue(processor.size() == 2);
    }

    @Test(expected = MissingArgumentException.class)
    public void testInputProcessorUnrecognizeArg() throws Exception {
        CommandLineProcessor classUnderTest = new CommandLineProcessor();
        String[] args = new String[2];
        args[0] = "-c=CHOCOLATE,CHOCOLATE,CIRCLE,SMALL,BROWN";
        args[1] = "-b";

        Map<String, String[]> processor = classUnderTest.inputProcessor(args);
        assertFalse("app should have a greeting", processor.isEmpty());
        assertTrue(processor.size() == 2);
    }
}
