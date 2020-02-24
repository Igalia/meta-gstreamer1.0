require gstreamer1.0-libav.inc

SRC_URI = "https://gstreamer.freedesktop.org/src/gst-libav/gst-libav-${PV}.tar.xz \
           "
SRC_URI[md5sum] = "eacebd0136ede3a9bd3672eeb338806b"
SRC_URI[sha256sum] = "c724f612700c15a933c7356fbeabb0bb9571fb5538f8b1b54d4d2d94188deef2"

S = "${WORKDIR}/gst-libav-${PV}"
