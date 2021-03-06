/**
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/waveprotocol/wave/federation/federation_error.protodevel

package org.waveprotocol.wave.federation;

public final class FederationErrorProto {
  private FederationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class FederationError extends
      com.google.protobuf.GeneratedMessage {
    // Use FederationError.newBuilder() to construct.
    private FederationError() {
      initFields();
    }
    private FederationError(boolean noInit) {}
    
    private static final FederationError defaultInstance;
    public static FederationError getDefaultInstance() {
      return defaultInstance;
    }
    
    public FederationError getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.waveprotocol.wave.federation.FederationErrorProto.internal_static_federation_FederationError_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.waveprotocol.wave.federation.FederationErrorProto.internal_static_federation_FederationError_fieldAccessorTable;
    }
    
    public enum Code
        implements com.google.protobuf.ProtocolMessageEnum {
      OK(0, 0),
      BAD_REQUEST(1, 1),
      ITEM_NOT_FOUND(2, 2),
      NOT_ACCEPTABLE(3, 3),
      NOT_AUTHORIZED(4, 4),
      RESOURCE_CONSTRAINT(5, 5),
      UNDEFINED_CONDITION(6, 6),
      REMOTE_SERVER_TIMEOUT(7, 7),
      UNEXPECTED_REQUEST(8, 8),
      INTERNAL_SERVER_ERROR(9, 9),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static Code valueOf(int value) {
        switch (value) {
          case 0: return OK;
          case 1: return BAD_REQUEST;
          case 2: return ITEM_NOT_FOUND;
          case 3: return NOT_ACCEPTABLE;
          case 4: return NOT_AUTHORIZED;
          case 5: return RESOURCE_CONSTRAINT;
          case 6: return UNDEFINED_CONDITION;
          case 7: return REMOTE_SERVER_TIMEOUT;
          case 8: return UNEXPECTED_REQUEST;
          case 9: return INTERNAL_SERVER_ERROR;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Code>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Code>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Code>() {
              public Code findValueByNumber(int number) {
                return Code.valueOf(number)
      ;        }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.waveprotocol.wave.federation.FederationErrorProto.FederationError.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Code[] VALUES = {
        OK, BAD_REQUEST, ITEM_NOT_FOUND, NOT_ACCEPTABLE, NOT_AUTHORIZED, RESOURCE_CONSTRAINT, UNDEFINED_CONDITION, REMOTE_SERVER_TIMEOUT, UNEXPECTED_REQUEST, INTERNAL_SERVER_ERROR, 
      };
      public static Code valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private Code(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      static {
        org.waveprotocol.wave.federation.FederationErrorProto.getDescriptor();
      }
      
      // @@protoc_insertion_point(enum_scope:federation.FederationError.Code)
    }
    
    // required .federation.FederationError.Code error_code = 1;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    private boolean hasErrorCode;
    private org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code errorCode_;
    public boolean hasErrorCode() { return hasErrorCode; }
    public org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code getErrorCode() { return errorCode_; }
    
    // optional string error_message = 2;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private boolean hasErrorMessage;
    private java.lang.String errorMessage_ = "";
    public boolean hasErrorMessage() { return hasErrorMessage; }
    public java.lang.String getErrorMessage() { return errorMessage_; }
    
    private void initFields() {
      errorCode_ = org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code.OK;
    }
    public final boolean isInitialized() {
      if (!hasErrorCode) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasErrorCode()) {
        output.writeEnum(1, getErrorCode().getNumber());
      }
      if (hasErrorMessage()) {
        output.writeString(2, getErrorMessage());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasErrorCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, getErrorCode().getNumber());
      }
      if (hasErrorMessage()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getErrorMessage());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.waveprotocol.wave.federation.FederationErrorProto.FederationError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.waveprotocol.wave.federation.FederationErrorProto.FederationError prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.waveprotocol.wave.federation.FederationErrorProto.FederationError result;
      
      // Construct using org.waveprotocol.wave.federation.FederationErrorProto.FederationError.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.waveprotocol.wave.federation.FederationErrorProto.FederationError();
        return builder;
      }
      
      protected org.waveprotocol.wave.federation.FederationErrorProto.FederationError internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.waveprotocol.wave.federation.FederationErrorProto.FederationError();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.waveprotocol.wave.federation.FederationErrorProto.FederationError.getDescriptor();
      }
      
      public org.waveprotocol.wave.federation.FederationErrorProto.FederationError getDefaultInstanceForType() {
        return org.waveprotocol.wave.federation.FederationErrorProto.FederationError.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.waveprotocol.wave.federation.FederationErrorProto.FederationError build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.waveprotocol.wave.federation.FederationErrorProto.FederationError buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.waveprotocol.wave.federation.FederationErrorProto.FederationError buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        org.waveprotocol.wave.federation.FederationErrorProto.FederationError returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.waveprotocol.wave.federation.FederationErrorProto.FederationError) {
          return mergeFrom((org.waveprotocol.wave.federation.FederationErrorProto.FederationError)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.waveprotocol.wave.federation.FederationErrorProto.FederationError other) {
        if (other == org.waveprotocol.wave.federation.FederationErrorProto.FederationError.getDefaultInstance()) return this;
        if (other.hasErrorCode()) {
          setErrorCode(other.getErrorCode());
        }
        if (other.hasErrorMessage()) {
          setErrorMessage(other.getErrorMessage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code value = org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                setErrorCode(value);
              }
              break;
            }
            case 18: {
              setErrorMessage(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required .federation.FederationError.Code error_code = 1;
      public boolean hasErrorCode() {
        return result.hasErrorCode();
      }
      public org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code getErrorCode() {
        return result.getErrorCode();
      }
      public Builder setErrorCode(org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasErrorCode = true;
        result.errorCode_ = value;
        return this;
      }
      public Builder clearErrorCode() {
        result.hasErrorCode = false;
        result.errorCode_ = org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Code.OK;
        return this;
      }
      
      // optional string error_message = 2;
      public boolean hasErrorMessage() {
        return result.hasErrorMessage();
      }
      public java.lang.String getErrorMessage() {
        return result.getErrorMessage();
      }
      public Builder setErrorMessage(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasErrorMessage = true;
        result.errorMessage_ = value;
        return this;
      }
      public Builder clearErrorMessage() {
        result.hasErrorMessage = false;
        result.errorMessage_ = getDefaultInstance().getErrorMessage();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:federation.FederationError)
    }
    
    static {
      defaultInstance = new FederationError(true);
      org.waveprotocol.wave.federation.FederationErrorProto.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:federation.FederationError)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_federation_FederationError_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_federation_FederationError_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<org/waveprotocol/wave/federation/feder" +
      "ation_error.protodevel\022\nfederation\"\274\002\n\017F" +
      "ederationError\0224\n\nerror_code\030\001 \002(\0162 .fed" +
      "eration.FederationError.Code\022\025\n\rerror_me" +
      "ssage\030\002 \001(\t\"\333\001\n\004Code\022\006\n\002OK\020\000\022\017\n\013BAD_REQU" +
      "EST\020\001\022\022\n\016ITEM_NOT_FOUND\020\002\022\022\n\016NOT_ACCEPTA" +
      "BLE\020\003\022\022\n\016NOT_AUTHORIZED\020\004\022\027\n\023RESOURCE_CO" +
      "NSTRAINT\020\005\022\027\n\023UNDEFINED_CONDITION\020\006\022\031\n\025R" +
      "EMOTE_SERVER_TIMEOUT\020\007\022\026\n\022UNEXPECTED_REQ" +
      "UEST\020\010\022\031\n\025INTERNAL_SERVER_ERROR\020\tB8\n org",
      ".waveprotocol.wave.federationB\024Federatio" +
      "nErrorProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_federation_FederationError_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_federation_FederationError_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_federation_FederationError_descriptor,
              new java.lang.String[] { "ErrorCode", "ErrorMessage", },
              org.waveprotocol.wave.federation.FederationErrorProto.FederationError.class,
              org.waveprotocol.wave.federation.FederationErrorProto.FederationError.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
