package gs.mclo.api.response.insights;

public class Information extends Insight {
    /**
     * The label of this information e.g. "Minecraft Version"
     */
    protected String label;

    /**
     * The value of this information e.g. "1.12.2"
     */
    protected String value;

    /**
     * Get the label of this information
     * @return the label of this information
     */
    public String getLabel() {
        return label;
    }

    /**
     * Get the value of this information
     * @return the value of this information
     */
    public String getValue() {
        return value;
    }
}
