require gstreamer1.0.inc
require gstreamer_git.inc

SRC_URI = "gitsm://gitlab.freedesktop.org/gstreamer/gstreamer.git;protocol=https;branch=master \
    file://0003-meson-Add-valgrind-feature.patch \
    file://0004-meson-Add-option-for-installed-tests.patch \
"
