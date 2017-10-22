DESCRIPTION = "Qurlew is a simple Web Brower that picks URLs from standard input, one URL per line, until it closes."
SECTION = "browser"
DEPENDS = "qtwebengine"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/${PN}/${PN}.git"
SRCREV = "954aba2381e215e1666fe57a2747f0ee91a791c9"

S = "${WORKDIR}/git"

inherit qmake5
