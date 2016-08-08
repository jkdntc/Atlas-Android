package com.layer.messenger.flavor.customlayersdk;

import com.layer.sdk.lsdka.lsdkk.l;
import com.layer.sdk.messaging.Metadata;

import java.util.Set;

/**
 * Created by jiangkun on 16/8/8.
 */
public class MetadataImpl extends Metadata {
    @Override
    public void clear() {

    }

    @Override
    public boolean containsKey(String s) {
        return false;
    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    protected l.i a(l.c c) {
        return new l.h("conversationName");
    }

    @Override
    protected l.i a(l.c c, l.i i) {
        return null;
    }

    @Override
    protected l.i b(l.c c) {
        return null;
    }
}
