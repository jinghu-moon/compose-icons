package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTextShield: ImageVector
    get() {
        if (_fileTextShield != null) return _fileTextShield!!
        _fileTextShield = tablerOutlineIcon(
            name = "FileTextShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 3v4c-.001 .265 .104 .52 .292 .708 .188 .188 .443 .293 .708 .292h4")
            addPathData("M11 21h-5C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h7l5 5v3.5")
            addPathData("M8 9h1")
            addPathData("M8 12.994h3")
            addPathData("M8 16.997h2")
            addPathData("M21 15.994c0 4-2.5 6-3.5 6-1 0-3.5-2-3.5-6 1 0 2.5-.5 3.5-1.5 1 1 2.5 1.5 3.5 1.5")
        }
        return _fileTextShield!!
    }

private var _fileTextShield: ImageVector? = null
