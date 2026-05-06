package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileCertificate: ImageVector
    get() {
        if (_fileCertificate != null) return _fileCertificate!!
        _fileCertificate = tablerOutlineIcon(
            name = "FileCertificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 8v-3C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2h-5")
            addPathData("M3 14c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 12.343 7.657 11 6 11 4.343 11 3 12.343 3 14")
            addPathData("M4.5 17 3 22 6 20.5 9 22 7.5 17")
        }
        return _fileCertificate!!
    }

private var _fileCertificate: ImageVector? = null
