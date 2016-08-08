package com.layer.messenger.flavor.customlayersdk;

import android.net.Uri;
import android.util.Log;
import com.layer.sdk.LayerClient;
import com.layer.sdk.listeners.LayerProgressListener;
import com.layer.sdk.listeners.LayerTypingIndicatorListener;
import com.layer.sdk.messaging.Conversation;
import com.layer.sdk.messaging.Message;
import com.layer.sdk.messaging.Metadata;

import java.util.List;

/**
 * Created by jiangkun on 16/8/8.
 */
public class ConversationImpl extends Conversation {
    @Override
    public void addParticipants(List<String> list) {

    }

    @Override
    public void removeParticipants(List<String> list) {

    }

    @Override
    public void delete(LayerClient.DeletionMode deletionMode) {

    }

    @Override
    public void putMetadataAtKeyPath(String s, String s1) {

    }

    @Override
    public void putMetadata(Metadata metadata, boolean b) {

    }

    @Override
    public void removeMetadataAtKeyPath(String s) {

    }

    @Override
    public void send(Message message) {

    }

    @Override
    public void send(LayerTypingIndicatorListener.TypingIndicator typingIndicator) {

    }

    @Override
    public  void send(Message message, LayerProgressListener layerProgressListener) {
        Log.d("ConversationImpl","send");
    }

    @Override
    public HistoricSyncStatus getHistoricSyncStatus() {
        return null;
    }

    @Override
    public void syncMoreHistoricMessages(int i) {

    }

    @Override
    public void syncFromEarliestUnreadMessage() {

    }

    @Override
    public void syncAllHistoricMessages() {

    }

    @Override
    public Uri getId() {
        return null;
    }

    @Override
    public List<String> getParticipants() {
        return null;
    }

    @Override
    public Message getLastMessage() {
        return null;
    }

    @Override
    public boolean isDeleted() {
        return false;
    }

    @Override
    public Metadata getMetadata() {
        return new MetadataImpl();
    }

    @Override
    public boolean isDeliveryReceiptsEnabled() {
        return false;
    }

    @Override
    public boolean isDistinct() {
        return false;
    }

    @Override
    public Integer getTotalMessageCount() {
        return null;
    }

    @Override
    public Integer getTotalUnreadMessageCount() {
        return null;
    }
}
