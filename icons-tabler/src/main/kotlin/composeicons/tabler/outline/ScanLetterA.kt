package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScanLetterA: ImageVector
    get() {
        if (_scanLetterA != null) return _scanLetterA!!
        _scanLetterA = tablerOutlineIcon(
            name = "ScanLetterA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M9 16v-6C9 8.895 9.895 8 11 8h2c1.105 0 2 .895 2 2v6")
            addPathData("M9 13h6")
        }
        return _scanLetterA!!
    }

private var _scanLetterA: ImageVector? = null
