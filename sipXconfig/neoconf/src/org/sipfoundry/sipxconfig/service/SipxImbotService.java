/*
 *
 *
 * Copyright (C) 2009 Pingtel Corp., certain elements licensed under a Contributor Agreement.
 * Contributors retain copyright to elements licensed under a Contributor Agreement.
 * Licensed to the User under the LGPL license.
 */
package org.sipfoundry.sipxconfig.service;

import org.springframework.beans.factory.annotation.Required;

import static org.apache.commons.lang.StringUtils.defaultIfEmpty;

public class SipxImbotService extends SipxService implements LoggingEntity {
    public static final String BEAN_ID = "sipxImbotService";

    public static final String LOG_SETTING = "imbot/log.level";
    public static final String PA_USER_NAME_SETTING = "imbot/imId";
    public static final String PA_PASSWORD_SETTING = "imbot/imPassword";
    public static final String HTTP_PORT = "imbot/httpPort";

    private String m_docDir;

    @Required
    public void setDocDir(String docDirectory) {
        m_docDir = docDirectory;
    }

    public String getDocDir() {
        return m_docDir;
    }

    @Override
    public String getLogSetting() {
        return LOG_SETTING;
    }

    @Override
    public void setLogLevel(String logLevel) {
        super.setLogLevel(logLevel);
    }

    @Override
    public String getLogLevel() {
        return super.getLogLevel();
    }

    @Override
    public String getLabelKey() {
        return super.getLabelKey();
    }

    public String getPersonalAssistantImId() {
        return getSettingValue(PA_USER_NAME_SETTING);
    }

    public String getPersonalAssistantImPassword() {
        return defaultIfEmpty(getSettingValue(PA_PASSWORD_SETTING), getPersonalAssistantImId());
    }

    public String getHttpPort() {
        return getSettingValue(HTTP_PORT);
    }
}
