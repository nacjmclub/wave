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

package org.waveprotocol.wave.client.wavepanel.view;

/**
 * View of an anchor, which defines a location where a single inline thread may
 * sit.
 *
 */
public interface AnchorView extends View {

  /** @return the thread in this anchor, if there is one. */
  InlineThreadView getThread();

  /** Attaches a thread at this anchor. */
  void attach(InlineThreadView view);

  /** Detaches a thread from this anchor. */
  void detach(InlineThreadView view);

  /** The {@link BlipView} or {@link BlipMetaView} that holds this anchor. */
  View getParent();
}
