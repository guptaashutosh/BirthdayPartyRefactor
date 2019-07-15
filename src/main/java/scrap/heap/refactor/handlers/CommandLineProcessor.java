package scrap.heap.refactor.handlers;

import org.apache.commons.cli.*;
import scrap.heap.refactor.domain.constants.Constants;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommandLineProcessor {
    /**
     * Added to process the cmd line parameters for input
     *
     * @param args
     * @return
     * @throws IOException
     */
    public Map<String, String[]> inputProcessor(String... args) throws IOException, ParseException {
        // Using Scanner for Getting Input from User
        Map<String, String[]> orderMap = new HashMap<>();
        CommandLine cmd = validateAndFetchOptions(args);
        orderMap.put(Constants.BALLON_KEY, cmd.getOptionValues("b"));
        orderMap.put(Constants.CAKE_KEY, cmd.getOptionValues("c"));

        return orderMap;
    }

    private CommandLine validateAndFetchOptions(String[] args) throws ParseException {
        CommandLine cmd;
        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new DefaultParser();

        Option balloon = buildBalloonOption();
        Option cake = buildCakeOptions();
        Options options = new Options();
        options.addOption(balloon);
        options.addOption(cake);
        cmd = parser.parse(options, args);
        if (cmd.getOptions().length == 0) {
            formatter.printHelp("Birthday Cake order", options);
        }
        if (cmd.getOptionValues("c").length < 5) {
            throw new ParseException("Not enough cake's parameters provided to order.");
        }
        if (cmd.getOptionValues("b").length < 3) {
            throw new ParseException("Not enough balloon's parameters provided to order.");
        }
        return cmd;
    }

    private Option buildCakeOptions() {
        return Option.builder("c")
                .longOpt("cake-order")
                .argName("Flavor, Frosting Flavor, Shape, Size, Color")
                .desc("Birthday Cake Order")
                .valueSeparator(',')
                .hasArg()
                .numberOfArgs(5)// sets that number of arguments is unlimited
                .build();
    }

    private Option buildBalloonOption() {
        return Option.builder("b")
                .longOpt("balloon-order")
                .argName("Color, Material, Size")
                .desc("Birthday order")
                .valueSeparator(',')
                .hasArgs()
                .numberOfArgs(3)// sets that number of arguments is unlimited
                .build();
    }
}
