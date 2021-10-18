/*
 * Copyright 2021 Oliver Yasuna
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without
 *      specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oliveryasuna.commons.language.snapshot;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class MemorySnapshot {

  private final long freeMemory;

  private final long maxMemory;

  private final long totalMemory;

  private final long presumableFreeMemory;

  public MemorySnapshot() {
    super();

    final Runtime runtime = Runtime.getRuntime();

    this.freeMemory = runtime.freeMemory();
    this.maxMemory = runtime.maxMemory();
    this.totalMemory = runtime.totalMemory();

    final long allocatedMemory = this.totalMemory - this.freeMemory;

    this.presumableFreeMemory = this.maxMemory - allocatedMemory;
  }

  public final long getFreeMemory() {
    return freeMemory;
  }

  public final long getMaxMemory() {
    return maxMemory;
  }

  public final long getTotalMemory() {
    return totalMemory;
  }

  public final long getPresumableFreeMemory() {
    return presumableFreeMemory;
  }

  @Override
  public final boolean equals(final Object other) {
    if(this == other) return true;
    if(other == null || getClass() != other.getClass()) return false;

    final MemorySnapshot otherCasted = (MemorySnapshot)other;

    return new EqualsBuilder()
        .append(freeMemory, otherCasted.freeMemory)
        .append(maxMemory, otherCasted.maxMemory)
        .append(totalMemory, otherCasted.totalMemory)
        .append(presumableFreeMemory, otherCasted.presumableFreeMemory)
        .isEquals();
  }

  @Override
  public final int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(freeMemory)
        .append(maxMemory)
        .append(totalMemory)
        .append(presumableFreeMemory)
        .toHashCode();
  }

  @Override
  public final String toString() {
    return new ToStringBuilder(this)
        .append("freeMemory", freeMemory)
        .append("maxMemory", maxMemory)
        .append("totalMemory", totalMemory)
        .append("presumableFreeMemory", presumableFreeMemory)
        .toString();
  }

}
