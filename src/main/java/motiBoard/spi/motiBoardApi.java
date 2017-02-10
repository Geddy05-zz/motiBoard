package motiBoard.spi;

/**
 * Created by Geddy on 10-2-2017.
 */

import com.google.api.server.spi.config.Api;
import motiBoard.Constants;

@Api(name = "conference", version = "v1", scopes = { Constants.EMAIL_SCOPE }, clientIds = {
        Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID }, description = "API for the Conference Central Backend application.")
public class motiBoardApi {
}
