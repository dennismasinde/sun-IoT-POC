package io.sunculture.EventhubToDynamo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IoTHub {

    private String connectionDeviceGenerationId;

    private String enqueuedTime;

    private String connectionDeviceId;

    private Object correlationId;

    private Object messageId;
}
