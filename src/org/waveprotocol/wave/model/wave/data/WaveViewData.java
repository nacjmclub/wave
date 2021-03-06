/**
 * Copyright 2009 Google Inc.
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

package org.waveprotocol.wave.model.wave.data;

import org.waveprotocol.wave.model.id.WaveId;
import org.waveprotocol.wave.model.id.WaveletId;

/**
 * Defines the abstract data type representing the state of a wave view. The
 * data type is "dumb", enforcing no constraints except self-consistency.
 */
public interface WaveViewData {

  /**
   * Gets the unique identifier of the wave in view.
   *
   * @return the unique identifier of the wave.
   */
  WaveId getWaveId();

  /**
   * Gets the wavelets in this wave view. The order of iteration is unspecified.
   *
   * @return wavelets in this wave view.
   */
  Iterable<? extends ObservableWaveletData> getWavelets();

  /**
   * Gets a wavelet from the view by id.
   *
   * @return the requested wavelet, or null if it is not in view.
   */
  ObservableWaveletData getWavelet(WaveletId waveletId);

  /**
   * Adds a new wavelet to the WaveView.
   *
   * @param wavelet the wavelet data to add, the ownership of the wavelet is
   *        transferred to this WaveViewData.
   */
  void addWavelet(ObservableWaveletData wavelet);

  /**
   * Removes a wavelet in the wave.
   *
   * @param waveletId id of the wavelet to remove, which must be present in the wave
   */
  void removeWavelet(WaveletId waveletId);
}
