require gstreamer1.0-plugins-bad.inc

SRC_URI = " \
    https://gstreamer.freedesktop.org/src/gst-plugins-bad/gst-plugins-bad-${PV}.tar.xz \
    file://0001-meson-build-gir-even-when-cross-compiling-if-introsp.patch \
    file://fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
    file://avoid-including-sys-poll.h-directly.patch \
    file://ensure-valid-sentinels-for-gst_structure_get-etc.patch \
    file://opencv-resolve-missing-opencv-data-dir-in-yocto-buil.patch \
"
SRC_URI[md5sum] = "ccc7404230afddec723bbdb63c89feec"
SRC_URI[sha256sum] = "f1cb7aa2389569a5343661aae473f0a940a90b872001824bc47fa8072a041e74"

S = "${WORKDIR}/gst-plugins-bad-${PV}"
