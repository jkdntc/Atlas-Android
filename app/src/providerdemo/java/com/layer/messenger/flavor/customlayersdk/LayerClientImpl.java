package com.layer.messenger.flavor.customlayersdk;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.layer.sdk.LayerClient;
import com.layer.sdk.listeners.*;
import com.layer.sdk.messaging.*;
import com.layer.sdk.policy.Policy;
import com.layer.sdk.query.ListViewController;
import com.layer.sdk.query.Query;
import com.layer.sdk.query.Queryable;
import com.layer.sdk.query.RecyclerViewController;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by jiangkun on 16/8/8.
 */
public class LayerClientImpl extends LayerClient {
    private RecyclerViewControllerImpl recyclerViewController;
    private ConversationImpl conversation = new ConversationImpl(this);
    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public void close() {

    }

    @Override
    public Conversation newConversation(ConversationOptions conversationOptions, List<String> list) {
        return null;
    }

    @Override
    public List<Uri> getConversationIds() {
        return null;
    }

    @Override
    public Conversation getConversation(Uri uri) {
        return conversation;
    }

    @Override
    public List<Conversation> getConversations(List<Uri> list) {
        return null;
    }

    @Override
    public List<Conversation> getConversations() {
        return null;
    }

    @Override
    public List<Conversation> getConversationsWithParticipants(List<String> list) {
        return null;
    }

    @Override
    public Message newMessage(MessageOptions messageOptions, List<MessagePart> list) {

        return new MessageImpl(conversation,list);
    }

    @Override
    public MessagePart newMessagePart(String s, byte[] bytes) {
        return new MessagePortImpl();
    }

    @Override
    public MessagePart newMessagePart(String s, InputStream inputStream, long l) {
        return null;
    }

    @Override
    public List<Uri> getMessageIds(Conversation conversation) {
        return null;
    }

    @Override
    public Message getMessage(Uri uri) {
        return null;
    }

    @Override
    public List<Message> getMessages(List<Uri> list) {
        return null;
    }

    @Override
    public List<Message> getMessages(Conversation conversation) {
        return null;
    }

    @Override
    public LayerClient registerProgressListener(MessagePart messagePart, LayerProgressListener layerProgressListener) {
        return null;
    }

    @Override
    public LayerClient unregisterProgressListener(MessagePart messagePart, LayerProgressListener layerProgressListener) {
        return null;
    }

    @Override
    public Queryable get(Uri uri) {
        return conversation.getLastMessage();
    }

    @Override
    public List executeQuery(Query<? extends Queryable> query, Query.ResultType resultType) {
        recyclerViewController.onChangeEvent(null);
        return null;
    }

    @Override
    public List<Uri> executeQueryForIds(Query<? extends Queryable> query) {
        return null;
    }

    @Override
    public List<? extends Queryable> executeQueryForObjects(Query<? extends Queryable> query) {
        return null;
    }

    @Override
    public Long executeQueryForCount(Query<? extends Queryable> query) {
        return null;
    }

    @Override
    public <T extends Queryable> RecyclerViewController<T> newRecyclerViewController(Query<T> query, Collection<String> collection, RecyclerViewController.Callback callback) {
        recyclerViewController = new RecyclerViewControllerImpl<T>(this,callback);
        return recyclerViewController;
    }

    @Override
    public <T extends Queryable> ListViewController<T> newListViewController(Query<T> query, Collection<String> collection, ListViewController.Callback callback) {
        return null;
    }

    @Override
    public LayerClient registerEventListener(LayerChangeEventListener layerChangeEventListener) {
        return null;
    }

    @Override
    public LayerClient unregisterEventListener(LayerChangeEventListener layerChangeEventListener) {
        return null;
    }

    @Override
    public String getAuthenticatedUserId() {
        return "";
    }

    @Override
    public boolean isAuthenticated() {
        return true; //已认证
    }

    @Override
    public LayerClient authenticate() {
        return this;
    }

    @Override
    public LayerClient deauthenticate() {
        return null;
    }

    @Override
    public LayerClient deauthenticate(DeauthenticationAction deauthenticationAction) {
        return null;
    }

    @Override
    public void answerAuthenticationChallenge(String s) {

    }

    @Override
    public LayerClient registerAuthenticationListener(LayerAuthenticationListener layerAuthenticationListener) {
        layerAuthenticationListener.onAuthenticated(this,"");
        return this;
    }

    @Override
    public LayerClient unregisterAuthenticationListener(LayerAuthenticationListener layerAuthenticationListener) {
        return null;
    }

    @Override
    public LayerClient connect() {
        return null;
    }

    @Override
    public LayerClient disconnect() {
        return null;
    }

    @Override
    public LayerClient registerConnectionListener(LayerConnectionListener layerConnectionListener) {
        return null;
    }

    @Override
    public LayerClient unregisterConnectionListener(LayerConnectionListener layerConnectionListener) {
        return null;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean isConnecting() {
        return false;
    }

    @Override
    public LayerClient registerSyncListener(LayerSyncListener layerSyncListener) {
        return null;
    }

    @Override
    public LayerClient unregisterSyncListener(LayerSyncListener layerSyncListener) {
        return null;
    }

    @Override
    public LayerClient setAutoDownloadSizeThreshold(long l) {
        return null;
    }

    @Override
    public long getAutoDownloadSizeThreshold() {
        return 0;
    }

    @Override
    public LayerClient setAutoDownloadMimeTypes(Collection<String> collection) {
        return null;
    }

    @Override
    public Set<String> getAutoDownloadMimeTypes() {
        return null;
    }

    @Override
    public LayerClient setDiskCapacity(long l) {
        return null;
    }

    @Override
    public long getDiskCapacity() {
        return 0;
    }

    @Override
    public long getDiskUtilization() {
        return 0;
    }

    @Override
    public LayerClient registerTypingIndicator(LayerTypingIndicatorListener layerTypingIndicatorListener) {
        return null;
    }

    @Override
    public LayerClient unregisterTypingIndicator(LayerTypingIndicatorListener layerTypingIndicatorListener) {
        return null;
    }

    @Override
    public Uri getAppId() {
        return null;
    }

    @Override
    public void setGcmRegistrationId(String s, String s1) {

    }

    @Override
    public List<Policy> getPolicies() {
        return null;
    }

    @Override
    public boolean validatePolicy(Policy policy) {
        return false;
    }

    @Override
    public boolean addPolicy(Policy policy) {
        return false;
    }

    @Override
    public boolean insertPolicy(Policy policy, int i) {
        return false;
    }

    @Override
    public boolean removePolicy(Policy policy) {
        return false;
    }

    @Override
    public LayerClient registerPolicyListener(LayerPolicyListener layerPolicyListener) {
        return null;
    }

    @Override
    public LayerClient unregisterPolicyListener(LayerPolicyListener layerPolicyListener) {
        return null;
    }

    @Override
    public LayerClient registerObjectExceptionListener(LayerObjectExceptionListener layerObjectExceptionListener) {
        return null;
    }

    @Override
    public LayerClient unregisterObjectExceptionListener(LayerObjectExceptionListener layerObjectExceptionListener) {
        return null;
    }

    @Override
    public void waitForContent(@NonNull Uri uri, @NonNull ContentAvailableCallback contentAvailableCallback) {

    }

    @Override
    public void waitForContent(@NonNull Uri uri, long l, @NonNull ContentAvailableCallback contentAvailableCallback) {

    }
}
