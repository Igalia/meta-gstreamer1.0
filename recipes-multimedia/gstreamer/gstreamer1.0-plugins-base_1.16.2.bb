require gstreamer1.0-plugins-base.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607"

SRC_URI = " \
            https://gstreamer.freedesktop.org/src/gst-plugins-base/gst-plugins-base-${PV}.tar.xz \
            file://get-caps-from-src-pad-when-query-caps.patch \
            file://0001-meson-build-gir-even-when-cross-compiling-if-introsp.patch \
            file://0002-meson-Add-variables-for-gir-files.patch \
            file://0003-ssaparse-enhance-SSA-text-lines-parsing.patch \
            file://0005-viv-fb-Make-sure-config.h-is-included.patch \
            file://0009-glimagesink-Downrank-to-marginal.patch \
            "
SRC_URI[md5sum] = "3fdb32823535799a748c1fc14f978e2c"
SRC_URI[sha256sum] = "b13e73e2fe74a4166552f9577c3dcb24bed077021b9c7fa600d910ec6987816a"

S = "${WORKDIR}/gst-plugins-base-${PV}"
