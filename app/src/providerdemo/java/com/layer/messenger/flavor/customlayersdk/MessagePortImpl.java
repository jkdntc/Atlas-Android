package com.layer.messenger.flavor.customlayersdk;

import android.net.Uri;
import com.layer.sdk.listeners.LayerProgressListener;
import com.layer.sdk.lsdka.lsdkd.d;
import com.layer.sdk.messaging.LayerObject;
import com.layer.sdk.messaging.Message;
import com.layer.sdk.messaging.MessagePart;

import java.io.InputStream;

/**
 * Created by jiangkun on 16/8/9.
 */
public class MessagePortImpl extends MessagePart implements LayerObject {

    public MessagePortImpl() {
    }

    @Override
    public Uri getId() {
        return Uri.parse("mp3");
    }

    @Override
    public Message getMessage() {
        return null;
    }

    @Override
    public String getMimeType() {
        return "audio/mp3";
    }

    @Override
    public byte[] getData() {
        return new byte[0];
    }

    @Override
    public InputStream getDataStream() {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public TransferStatus getTransferStatus() {
        return null;
    }

    @Override
    public void download(LayerProgressListener layerProgressListener) {

    }

    @Override
    public boolean isContentReady() {
        return false;
    }

    @Override
    public void deleteLocalContent() {

    }
}
