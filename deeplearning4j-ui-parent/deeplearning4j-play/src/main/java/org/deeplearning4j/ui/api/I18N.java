package org.deeplearning4j.ui.api;

/**
 * Interface to handle user interface internationalization.
 * Internationalization support is bulit into Play framework, but this doesn't seem to function with a Java + Maven
 * embedded server like we are using here.<br>
 * <p>
 * Basic idea: UI messages are available by specifying 2 values:<br>
 * (a) The ISO 639-1 language code, as a String ("en", "fr", "ja" etc)<br>
 * (b) A key for the message. For example, "index.home.title" or "histogram.nav.home"<br>
 * <p>
 * See <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes</a>
 *
 * @author Alex Black
 */
public interface I18N {

    /**
     * Get the specified message in the default language (according to {@link #getDefaultLanguage()}
     *
     * @param key Key value
     * @return Message for the given key, or null if none is found/available
     */
    String getMessage(String key);

    /**
     * Get the specified message for the specified language
     *
     * @param langCode ISO 639-1 language code: "en", "ja", etc
     * @param key      Key value for the message to retrieve
     * @return Message for the given key/language pair, or null if none is found
     */
    String getMessage(String langCode, String key);

    /**
     * Get the currently set default language as an ISO 639-1 code
     *
     * @return The current default language
     */
    String getDefaultLanguage();

    /**
     * Set the default language
     *
     * @param langCode Language code, as an ISO 639-1 code
     */
    void setDefaultLanguage(String langCode);

}
