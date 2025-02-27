package mpo.dayon.assistant.gui;

import javax.swing.*;

class AssistantActions {

    private Action ipAddressAction;
    private Action networkConfigurationAction;
    private Action captureEngineConfigurationAction;
    private Action compressionEngineConfigurationAction;
    private Action resetAction;
    private Action lookAndFeelAction;
    private Action remoteClipboardRequestAction;
    private Action remoteClipboardSetAction;
    private Action startAction;
    private Action stopAction;

    public Action getIpAddressAction() {
        return ipAddressAction;
    }

    public void setIpAddressAction(Action ipAddressAction) {
        this.ipAddressAction = ipAddressAction;
    }

    public Action getNetworkConfigurationAction() {
        return networkConfigurationAction;
    }

    public void setNetworkConfigurationAction(Action networkConfigurationAction) {
        this.networkConfigurationAction = networkConfigurationAction;
    }

    public Action getCaptureEngineConfigurationAction() {
        return captureEngineConfigurationAction;
    }

    public void setCaptureEngineConfigurationAction(Action captureEngineConfigurationAction) {
        this.captureEngineConfigurationAction = captureEngineConfigurationAction;
    }

    public Action getCompressionEngineConfigurationAction() {
        return compressionEngineConfigurationAction;
    }

    public void setCompressionEngineConfigurationAction(Action compressionEngineConfigurationAction) {
        this.compressionEngineConfigurationAction = compressionEngineConfigurationAction;
    }

    public Action getResetAction() {
        return resetAction;
    }

    public void setResetAction(Action resetAction) {
        this.resetAction = resetAction;
    }

    public Action getLookAndFeelAction() {
        return lookAndFeelAction;
    }

    public void setLookAndFeelAction(Action lookAndFeelAction) {
        this.lookAndFeelAction = lookAndFeelAction;
    }

    public Action getRemoteClipboardRequestAction() {
        return remoteClipboardRequestAction;
    }

    public void setRemoteClipboardRequestAction(Action remoteClipboardRequestAction) {
        this.remoteClipboardRequestAction = remoteClipboardRequestAction;
    }

    public Action getRemoteClipboardSetAction() {
        return remoteClipboardSetAction;
    }

    public void setRemoteClipboardSetAction(Action remoteClipboardSetAction) {
        this.remoteClipboardSetAction = remoteClipboardSetAction;
    }

    public Action getStartAction() {
        return startAction;
    }

    public void setStartAction(Action startAction) {
        this.startAction = startAction;
    }

    public Action getStopAction() {
        return stopAction;
    }

    public void setStopAction(Action stopAction) {
        this.stopAction = stopAction;
    }
}
