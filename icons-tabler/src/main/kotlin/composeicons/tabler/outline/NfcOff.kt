package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NfcOff: ImageVector
    get() {
        if (_nfcOff != null) return _nfcOff!!
        _nfcOff = tablerOutlineIcon(
            name = "NfcOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20C9.343 20 8 18.657 8 17v-9")
            addPathData("M13 4c1.657 0 3 1.343 3 3v5M16 16v2L11 13")
            addPathData("M8 4h9c1.657 0 3 1.343 3 3v9M19.127 19.116c-.562 .567-1.328 .885-2.127 .884h-10C5.343 20 4 18.657 4 17v-10C4 6.17 4.337 5.418 4.882 4.875")
            addPathData("M3 3 21 21")
        }
        return _nfcOff!!
    }

private var _nfcOff: ImageVector? = null
