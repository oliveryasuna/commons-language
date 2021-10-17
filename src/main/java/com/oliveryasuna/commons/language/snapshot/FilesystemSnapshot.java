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
