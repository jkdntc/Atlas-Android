package com.layer.messenger.flavor.customlayersdk;

import android.net.Uri;
import com.layer.sdk.LayerClient;
import com.layer.sdk.messaging.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiangkun on 16/8/8.
 */
public class MessageImpl implements Message {
    private List<MessagePart> messagePartList;
    private Conversation conversation;

    public MessageImpl(Conversation conversation, List<MessagePart> messagePartList) {
        this.messagePartList = messagePartList;
        this.conversation = conversation;
    }

    @Override
    public void delete(LayerClient.DeletionMode deletionMode) {

    }

    @Override
    public void markAsRead() {

    }

    @Override
    public Uri getId() {
        return Uri.parse("uri");
    }

    @Override
    public long getPosition() {
        return 0;
    }

    @Override
    public Conversation getConversation() {
        return conversation;
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
        return new com.layer.sdk.lsdka.lsdkd.lsdka.a("", "jk");
    }

    @Override
    public Map<String, RecipientStatus> getRecipientStatus() {
        HashMap map = new HashMap();
        map.put("",RecipientStatus.READ);
        return map;
    }

    @Override
    public RecipientStatus getRecipientStatus(String s) {
        return RecipientStatus.DELIVERED;
    }

    @Override
    public MessageOptions getOptions() {
        return null;
    }
}
