package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Nfc: ImageVector
    get() {
        if (_nfc != null) return _nfc!!
        _nfc = tablerOutlineIcon(
            name = "Nfc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20C9.343 20 8 18.657 8 17v-11l5 5")
            addPathData("M13 4c1.657 0 3 1.343 3 3v11L11 13")
            addPathData("M4 7C4 5.343 5.343 4 7 4h10c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-10C5.343 20 4 18.657 4 17v-10")
        }
        return _nfc!!
    }

private var _nfc: ImageVector? = null
