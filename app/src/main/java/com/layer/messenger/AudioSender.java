package com.layer.messenger;

import com.layer.atlas.messagetypes.AttachmentSender;
import com.layer.atlas.util.Log;
import com.layer.sdk.listeners.LayerProgressListener;
import com.layer.sdk.messaging.Message;
import com.layer.sdk.messaging.MessageOptions;
import com.layer.sdk.messaging.MessagePart;
import com.layer.sdk.messaging.PushNotificationPayload;

/**
 * Created by jiangkun on 16/8/5.
 */
public class AudioSender extends AttachmentSender {
    public AudioSender(String title, Integer icon) {
        super(title, icon);
    }

    @Override
    public boolean requestSend() {

        // Create notification string
        String myName = "jk";//getParticipantProvider().getParticipant(getLayerClient().getAuthenticatedUserId()).getName();
        String notificationString = getContext().getString(com.layer.atlas.R.string.atlas_notification_text, myName, "mp3" + "…");

        // Send message
        MessagePart part = getLayerClient().newMessagePart("audio/mp3","mp3".getBytes());
        PushNotificationPayload payload = new PushNotificationPayload.Builder()
                .text(notificationString)
                .build();
        Message message = getLayerClient().newMessage(new MessageOptions().defaultPushNotificationPayload(payload), part);
        return send(message, new LayerProgressListener() {
            public void onProgressStart(MessagePart messagePart, Operation operation) {
                Log.d("onProgressStart");
            }
            public void onProgressUpdate(MessagePart messagePart, Operation operation, long l) {
                Log.d("onProgressUpdate");
            }
            public void onProgressComplete(MessagePart messagePart, Operation operation) {
                Log.d("onProgressComplete");
            }
            public void onProgressError(MessagePart messagePart, Operation operation, Throwable throwable) {
                Log.d("onProgressError");
            }
        });
    }
}
