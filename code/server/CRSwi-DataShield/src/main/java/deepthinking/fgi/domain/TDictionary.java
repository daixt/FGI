package deepthinking.fgi.domain;

public class TDictionary {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary.dic_code
     *
     * @mbg.generated
     */
    private Integer dicCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary.dic_name
     *
     * @mbg.generated
     */
    private String dicName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary.dic_code
     *
     * @return the value of t_dictionary.dic_code
     *
     * @mbg.generated
     */
    public Integer getDicCode() {
        return dicCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary.dic_code
     *
     * @param dicCode the value for t_dictionary.dic_code
     *
     * @mbg.generated
     */
    public void setDicCode(Integer dicCode) {
        this.dicCode = dicCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary.dic_name
     *
     * @return the value of t_dictionary.dic_name
     *
     * @mbg.generated
     */
    public String getDicName() {
        return dicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary.dic_name
     *
     * @param dicName the value for t_dictionary.dic_name
     *
     * @mbg.generated
     */
    public void setDicName(String dicName) {
        this.dicName = dicName == null ? null : dicName.trim();
    }
}