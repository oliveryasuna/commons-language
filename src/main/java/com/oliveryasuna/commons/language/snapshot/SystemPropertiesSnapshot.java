package com.oliveryasuna.commons.language.snapshot;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;
import java.util.stream.Collectors;

public final class SystemPropertiesSnapshot {

  private final Map<Object, Object> properties;

  public SystemPropertiesSnapshot() {
    super();

    this.properties = System.getProperties().entrySet().stream()
        .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue));
  }

  public final Map<Object, Object> getProperties() {
    return properties;
  }

  public final Object getProperty(final Object key) {
    return properties.get(key);
  }

  @Override
  public final boolean equals(final Object other) {
    if(this == other) return true;
    if(other == null || getClass() != other.getClass()) return false;

    final SystemPropertiesSnapshot otherCasted = (SystemPropertiesSnapshot)other;

    return new EqualsBuilder()
        .append(properties, otherCasted.properties)
        .isEquals();
  }

  @Override
  public final int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(properties)
        .toHashCode();
  }

  @Override
  public final String toString() {
    return new ToStringBuilder(this)
        .append("properties", properties)
        .toString();
  }

}
