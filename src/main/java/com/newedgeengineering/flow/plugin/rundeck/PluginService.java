package com.newedgeengineering.flow.plugin.rundeck;

import net.xeoh.plugins.base.Plugin;
import org.activiti.engine.delegate.DelegateExecution;

public interface PluginService extends Plugin {
    void addGrailsAppContext(Object context);
    void triggerStep(DelegateExecution execution);
    void checkStatus(DelegateExecution execution);
    void updateFlowParameters(DelegateExecution execution);
}
