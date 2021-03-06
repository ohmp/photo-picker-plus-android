/**
 * The MIT License (MIT)

 Copyright (c) 2013 Chute

 Permission is hereby granted, free of charge, to any person obtaining a copy of
 this software and associated documentation files (the "Software"), to deal in
 the Software without restriction, including without limitation the rights to
 use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 the Software, and to permit persons to whom the Software is furnished to do so,
 subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.getchute.android.photopickerplus.util.intent;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.chute.sdk.v2.model.AccountModel;
import com.chute.sdk.v2.model.AssetModel;
import com.getchute.android.photopickerplus.ui.activity.ServicesActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link PhotoPickerPlusIntentWrapper} is a wrapper class that wraps the
 * following parameters needed for the intent:
 * <ul>
 * <li>Account ID
 * <li>Album ID
 * <li>List of {@link AssetModel}s
 * </ul>
 */
public class PhotoPickerPlusIntentWrapper extends IntentWrapper {

  public static final int ACTIVITY_FOR_RESULT_KEY = 115;
  private static final String KEY_ALBUM_ID = "intent_key_album_id";
  private static final String KEY_PHOTO_COLLECTION = "intent_key_photo_collection";
  private static final String KEY_ACCOUNT_MODEL = "intent_key_account_model";

  public PhotoPickerPlusIntentWrapper(Context context) {
    super(context, ServicesActivity.class);
  }

  public PhotoPickerPlusIntentWrapper(Intent intent) {
    super(intent);
  }

  public String getAlbumId() {
    return getIntent().getExtras().getString(KEY_ALBUM_ID);
  }

  public void setAlbumId(String albumId) {
    getIntent().putExtra(KEY_ALBUM_ID, albumId);
  }

  @SuppressWarnings("unchecked")
  public ArrayList<AssetModel> getMediaCollection() {
    return (ArrayList<AssetModel>) getIntent().getExtras().getSerializable(
      KEY_PHOTO_COLLECTION);
  }

  public void setMediaCollection(List<AssetModel> mediaCollection) {
    getIntent().putExtra(KEY_PHOTO_COLLECTION,
      (ArrayList<AssetModel>) mediaCollection);
  }

  public AccountModel getAccountModel() {
    return getIntent().getExtras().getParcelable(KEY_ACCOUNT_MODEL);
  }

  public void setAccountModel(AccountModel accountModel) {
    getIntent().putExtra(KEY_ACCOUNT_MODEL, accountModel);
  }

  public void startActivityForResult(Activity context) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      context.startActivityForResult(getIntent(), ACTIVITY_FOR_RESULT_KEY, ActivityOptions.makeSceneTransitionAnimation(context).toBundle());
    } else {
      context.startActivityForResult(getIntent(), ACTIVITY_FOR_RESULT_KEY);
    }
  }


}
