package com.fasttrack.cvgt.transfer;

import javax.validation.constraints.NotNull;

public class AddMediaToMyGalleryRequest {

    @NotNull
    private Long mediaId;

    @NotNull
    private Long userId;

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AddMediaToCartRequest{" +
                "mediaId=" + mediaId +
                ", userId=" + userId +
                '}';
    }
}
