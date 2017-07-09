package za.co.mmagon.jwebswing.plugins.bluradmin.console;

import za.co.mmagon.jwebswing.plugins.bluradmin.layout.display.DisplayScreen;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentWidthOptions;
import za.co.mmagon.plugins.weblogappender.WebLogAppenderDiv;

/**
 *
 * @author Marc Magon
 * @since 23 Apr 2017
 */
public class ConsoleDisplayScreen extends DisplayScreen
{

    private static final long serialVersionUID = 1L;

    private WebLogAppenderDiv webLogger;

    /*
     * Constructs a new ConsoleDisplayScreen
     */
    public ConsoleDisplayScreen(String title)
    {
        webLogger = new ConsoleLogger();
        webLogger.addClass("auth-block");
        webLogger.addClass("col-offset-md-3");
        webLogger.addClass(BSComponentWidthOptions.col_md_6);
        webLogger.addClass(BSComponentWidthOptions.col_xs_12);
        webLogger.addAttribute("style", "overflow-y:auto;height:380px;");

        getContentTop().getHeader().setText(title);
        getContentDiv().add(webLogger);
    }

}
