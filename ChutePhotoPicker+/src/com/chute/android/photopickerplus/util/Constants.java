/*
 *  Copyright (c) 2012 Chute Corporation

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.chute.android.photopickerplus.util;

public class Constants {

	@SuppressWarnings("unused")
	private static final String TAG = Constants.class.getSimpleName();

	public static final int DELAY_TIME = 500;
	public static final String CLIENT_SECRET = "0599436c911d8ee27d34d26c2dde73a1a342a8a0e0b20592ef00f90fe1ca5305";
	public static final String CLIENT_ID = "4f15d1f138ecef6af9000004";
	public static final String CALLBACK_URL = "http://tutorials.getchute.com";
	public static final String PERMISSIONS_SCOPE = "all_resources manage_resources profile resources";

	public static final int CAMERA_PIC_REQUEST = 2500;

	// Accounts
	public static final String BASE_AUTH_URL = "https://getchute.com";
	public static final String BASE_URL = "https://api.getchute.com";
	public static final String BASE_ACCOUNT_URL = "http://accounts.getchute.com";
	public static final String URL_ACCOUNTS = BASE_URL + "/v1/accounts";
	public static final String URL_ACCOUNTS_UNMUTE = BASE_URL + "/v1/accounts/%s/unmute";
	public static final String URL_ACCOUNTS_MUTE = BASE_URL + "/v1/accounts/%s/mute";
	public static final String URL_ACCOUNTS_AUTH = BASE_URL + "/v1/auth";

	public static final String URL_AUTHENTICATION_FACEBOOK = BASE_AUTH_URL + "/oauth/facebook";
	public static final String URL_AUTHENTICATION_EVERNOTE = BASE_AUTH_URL + "/oauth/evernote";
	public static final String URL_AUTHENTICATION_CHUTE = BASE_AUTH_URL + "/oauth/chute";
	public static final String URL_AUTHENTICATION_TWITTER = BASE_AUTH_URL + "/oauth/twitter";
	public static final String URL_AUTHENTICATION_FOURSQUARE = BASE_AUTH_URL + "/oauth/foursquare";
	public static final String URL_AUTHENTICATION_FLICKR = BASE_AUTH_URL + "/oauth/flickr";
	public static final String URL_AUTHENTICATION_INSTAGRAM = BASE_AUTH_URL + "/oauth/instagram";
	public static final String URL_AUTHENTICATION_PICASA = BASE_AUTH_URL + "/oauth/google";
	public static final String URL_AUTHENTICATION_TOKEN = BASE_AUTH_URL + "/oauth/access_token";

	public static final String URL_ACCOUNT_OBJECT = BASE_ACCOUNT_URL + "/v1/accounts/%s/objects";
	public static final String URL_ACCOUNT_OBJECT_MEDIA = BASE_ACCOUNT_URL + "/v1/accounts/%s/objects/%s/media";

}
