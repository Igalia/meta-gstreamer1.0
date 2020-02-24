require gstreamer1.0-plugins-bad.inc
require gstreamer_git.inc

SRC_URI = "gitsm://gitlab.freedesktop.org/gstreamer/gst-plugins-bad.git;protocol=https;branch=master"

EXTRA_OEMESON_remove = "-Dnvdec=disabled"
EXTRA_OEMESON_remove = "-Dnvenc=disabled"
EXTRA_OEMESON_remove = "-Dvdpau=disabled"

# FIXME: This is borken
FILES_${PN}-encodingprofiles += "${datadir}/gstreamer-1.0/encoding-profiles/online-services/*.gep \
                                  ${datadir}/gstreamer-1.0/encoding-profiles/file-extension/*.gep \
                                  ${datadir}/gstreamer-1.0/encoding-profiles/device/*.gep \
                                  /usr/share/gstreamer-1.0/encoding-profiles/file-extension/flv.gep \
                                  "
do_install_append() {
    rm -fr ${D}/${datadir}/gstreamer-1.0/encoding-profiles/;
}
