/*Copyright 2020 Huawei Technologies Co., Ltd
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *
 *http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 *
 * */

package com.huaweicloud.sdk.iot.device.client.requests;

import com.google.gson.annotations.SerializedName;

/**
 * Obtains device shadow data.
 */
public class ShadowGet {

    /**
     * Indicates the ID of the device that wants to obtain the device shadow data. It is optional.
     */
    @SerializedName("object_device_id")
    private String deviceId;

    /**
     * Indicates the service ID corresponding to the device shadow data. It is optional. If it is set to NULL, the device shadow data of all serices are obtained.
     */
    @SerializedName("service_id")
    private String serviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
