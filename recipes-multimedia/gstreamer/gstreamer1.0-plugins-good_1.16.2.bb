require gstreamer1.0-plugins-good.inc

SRC_URI = " \
            https://gstreamer.freedesktop.org/src/gst-plugins-good/gst-plugins-good-${PV}.tar.xz \
            "

SRC_URI[md5sum] = "bd025f8f14974f94b75ac69a9d1b9c93"
SRC_URI[sha256sum] = "40bb3bafda25c0b739c8fc36e48380fccf61c4d3f83747e97ac3f9b0171b1319"

S = "${WORKDIR}/gst-plugins-good-${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607 \
                    file://gst/replaygain/rganalysis.c;beginline=1;endline=23;md5=b60ebefd5b2f5a8e0cab6bfee391a5fe"
