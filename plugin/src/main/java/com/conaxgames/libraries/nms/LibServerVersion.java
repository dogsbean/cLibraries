package com.conaxgames.libraries.nms;

public enum LibServerVersion {
    v1_8_R3,
    v1_9_R1,
    v1_12_R1,
    v1_16_R3,
    v1_17_R1,
    v1_18_R1,
    v1_18_R2,
    v1_19_R1,
    v1_19_R2,
    v1_19_R3,
    v1_19_R4;

    public boolean after(LibServerVersion serverVersion) {
        return this.ordinal() > serverVersion.ordinal();
    }

    public boolean before(LibServerVersion serverVersion) {
        return serverVersion.ordinal() > this.ordinal();
    }

}
