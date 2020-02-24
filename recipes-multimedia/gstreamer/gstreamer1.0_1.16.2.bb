require gstreamer1.0.inc

S = "${WORKDIR}/gstreamer-${PV}"

SRC_URI = " \
    https://gstreamer.freedesktop.org/src/gstreamer/gstreamer-${PV}.tar.xz \
    file://0001-gst-gstpluginloader.c-when-env-var-is-set-do-not-fal.patch \
    file://0002-meson-build-gir-even-when-cross-compiling-if-introsp.patch \
    file://0003-meson-Add-valgrind-feature.patch \
    file://0004-meson-Add-option-for-installed-tests.patch \
"
SRC_URI[md5sum] = "0e661ed5bdf1d8996e430228d022628e"
SRC_URI[sha256sum] = "e3f044246783fd685439647373fa13ba14f7ab0b346eadd06437092f8419e94e"
