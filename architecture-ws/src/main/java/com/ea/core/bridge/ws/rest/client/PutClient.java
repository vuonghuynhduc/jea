/**
 * Copyright 2014 伊永飞
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ea.core.bridge.ws.rest.client;

import java.net.URL;

import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;

public class PutClient extends AbstractRestClient{

	public PutClient(URL httpUrl) {
		super(httpUrl);
	}

	@Override
	protected HttpRequestBase getMethod(String url) {
		// TODO Auto-generated method stub
		return new HttpPut(url);
	}
	
}
