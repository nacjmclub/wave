/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.waveprotocol.box.server.persistence;

import org.waveprotocol.box.server.account.AccountData;
import org.waveprotocol.box.server.account.HumanAccountDataImpl;
import org.waveprotocol.box.server.authentication.PasswordDigest;
import org.waveprotocol.wave.model.util.CollectionUtils;
import org.waveprotocol.wave.model.wave.ParticipantId;

import java.util.Map;

/**
 * An account store which on-the-fly creates a userdata object for any account
 * requested. The created user has an empty password.
 *
 *  This class exists to ease development until persistence is in. It will be
 * removed once persistence works.
 *
 * @author josephg@gmail.com (Joseph Gentle)
 */
public class FakePermissiveAccountStore implements AccountStore {
  Map<ParticipantId, AccountData> accounts = CollectionUtils.newHashMap();

  @Override
  public AccountData getAccount(ParticipantId id) {
    AccountData account = accounts.get(id);

    if (account == null && !id.getAddress().startsWith("xxx")) {
      account = new HumanAccountDataImpl(id, new PasswordDigest("".toCharArray()));
      accounts.put(id, account);
    }

    return account;
  }

  @Override
  public void initializeAccountStore() {
    // Nothing to initialize.
  }

  @Override
  public void putAccount(AccountData account) {
    accounts.put(account.getId(), account);
  }

  @Override
  public void removeAccount(ParticipantId id) {
    accounts.remove(id);
  }
}
