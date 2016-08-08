package com.layer.messenger.flavor.customlayersdk;

import android.net.Uri;
import com.layer.sdk.changes.LayerChangeEvent;
import com.layer.sdk.listeners.LayerChangeEventListener;
import com.layer.sdk.query.ListViewController;
import com.layer.sdk.query.Query;
import com.layer.sdk.query.Queryable;
import com.layer.sdk.query.RecyclerViewController;

/**
 * Created by jiangkun on 16/8/8.
 */
public class RecyclerViewControllerImpl <Tquery extends Queryable> extends RecyclerViewController<Tquery> implements LayerChangeEventListener.BackgroundThread.Weak {
    private final Callback callback;

    public RecyclerViewControllerImpl(Callback callback) {
        this.callback = callback;
    }

    @Override
    public void onChangeEvent(LayerChangeEvent layerChangeEvent) {

    }

    @Override
    public ListViewController<Tquery> execute() {
        return null;
    }

    @Override
    public ListViewController<Tquery> setQuery(Query<Tquery> query) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public Tquery getItem(int i) {
        return null;
    }

    @Override
    public Uri getItemId(int i) {
        return null;
    }

    @Override
    public int getPosition(Tquery tquery) {
        return 0;
    }

    @Override
    public int getPosition(Tquery tquery, int i) {
        return 0;
    }

    @Override
    public void updateBoundPosition(int i) {

    }

    @Override
    public ListViewController<Tquery> setPreProcessCallback(PreProcessCallback<Tquery> preProcessCallback) {
        return null;
    }
}
