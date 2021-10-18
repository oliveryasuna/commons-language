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

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FilesystemSnapshot {

  private final Map<File, SnapshotDetails> snapshots;

  public FilesystemSnapshot() {
    super();

    snapshots = Arrays.stream(File.listRoots())
        .map(rootFile -> Map.entry(rootFile, new SnapshotDetails(rootFile.getTotalSpace(), rootFile.getFreeSpace(), rootFile.getUsableSpace())))
        .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue));
  }

  public Map<File, SnapshotDetails> getSnapshots() {
    return snapshots;
  }

  public SnapshotDetails getSnapshot(final File file) {
    return snapshots.get(file);
  }

  @Override
  public final boolean equals(final Object other) {
    if(this == other) return true;
    if(other == null || getClass() != other.getClass()) return false;

    final FilesystemSnapshot otherCasted = (FilesystemSnapshot)other;

    return new EqualsBuilder()
        .append(snapshots, otherCasted.snapshots)
        .isEquals();
  }

  @Override
  public final int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(snapshots)
        .toHashCode();
  }

  @Override
  public final String toString() {
    return new ToStringBuilder(this)
        .append("snapshots", snapshots)
        .toString();
  }

  public static final class SnapshotDetails {

    private final long totalSpace;

    private final long freeSpace;

    private final long usableSpace;

    public SnapshotDetails(final long totalSpace, final long freeSpace, final long usableSpace) {
      super();

      this.totalSpace = totalSpace;
      this.freeSpace = freeSpace;
      this.usableSpace = usableSpace;
    }

    public final long getTotalSpace() {
      return totalSpace;
    }

    public final long getFreeSpace() {
      return freeSpace;
    }

    public final long getUsableSpace() {
      return usableSpace;
    }

    @Override
    public final boolean equals(final Object other) {
      if(this == other) return true;
      if(other == null || getClass() != other.getClass()) return false;

      final SnapshotDetails otherCasted = (SnapshotDetails)other;

      return new EqualsBuilder()
          .append(totalSpace, otherCasted.totalSpace)
          .append(freeSpace, otherCasted.freeSpace)
          .append(usableSpace, otherCasted.usableSpace)
          .isEquals();
    }

    @Override
    public final int hashCode() {
      return new HashCodeBuilder(17, 37)
          .append(totalSpace)
          .append(freeSpace)
          .append(usableSpace)
          .toHashCode();
    }

    @Override
    public final String toString() {
      return new ToStringBuilder(this)
          .append("totalSpace", totalSpace)
          .append("freeSpace", freeSpace)
          .append("usableSpace", usableSpace)
          .toString();
    }

  }

}
