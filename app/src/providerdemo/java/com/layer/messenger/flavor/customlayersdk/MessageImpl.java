package com.layer.messenger.flavor.customlayersdk;

import android.net.Uri;
import android.webkit.WebMessagePort;
import com.layer.sdk.LayerClient;
import com.layer.sdk.messaging.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by jiangkun on 16/8/8.
 */
public class MessageImpl implements Message{
    private List<MessagePart>  messagePartList;

    public MessageImpl(List<MessagePart>  messagePartList) {
        this.messagePartList = messagePartList;
    }

    @Override
    public void delete(LayerClient.DeletionMode deletionMode) {

    }

    @Override
    public void markAsRead() {

    }

    @Override
    public Uri getId() {
        return null;
    }

    @Override
    public long getPosition() {
        return 0;
    }

    @Override
    public Conversation getConversation() {
        return null;
    }

    @Override
    public List<MessagePart> getMessageParts() {
        return messagePartList;
    }

    @Override
    public boolean isSent() {
        return false;
    }

    @Override
    public boolean isDeleted() {
        return false;
    }

    @Override
    public Date getSentAt() {
        return null;
    }

    @Override
    public Date getReceivedAt() {
        return null;
    }

    @Override
    public Actor getSender() {
        return null;
    }

    @Override
    public Map<String, RecipientStatus> getRecipientStatus() {
        return null;
    }

    @Override
    public RecipientStatus getRecipientStatus(String s) {
        return null;
    }

    @Override
    public MessageOptions getOptions() {
        return null;
    }
}
