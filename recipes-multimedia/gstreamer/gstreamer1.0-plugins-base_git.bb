require gstreamer1.0-plugins-base.inc
require gstreamer_git.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

SRC_URI = "gitsm://gitlab.freedesktop.org/gstreamer/gst-plugins-base.git;protocol=https;branch=master"

EXTRA_OEMESON_remove = "-Dgtk_doc=disabled"