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
