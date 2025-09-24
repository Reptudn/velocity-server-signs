package de.reptudn.velocityServerSigns.config;

public class Config {

    private String path;
    private boolean showPlayerCount;
    private boolean showMaxPlayers;
    private boolean showMOTD;
    private boolean showServerVersion;
    private boolean showOnlineStatus;
    private boolean showWhitelistStatus;

    public Config(String path)
    {
        this.path = path;
        try {
            parseConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void parseConfig() throws Exception
    {

    }

}
