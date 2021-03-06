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
 */
package org.waveprotocol.wave.client.wavepanel.view;

import org.waveprotocol.wave.model.conversation.Conversation;
import org.waveprotocol.wave.model.wave.ParticipantId;

/**
 * View of a participant collection.
 *
 */
public interface ParticipantsView extends View, IntrinsicParticipantsView {

  /**
   * Appends a rendering of a participant. (the id alone is an insufficient
   * representation of the participation, hence a pair is required).
   *
   * @param conversation conversation in which the participant participates
   * @param participant participant to render
   */
  ParticipantView appendParticipant(Conversation conversation, ParticipantId participant);
}
