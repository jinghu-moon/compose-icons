package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileBarcode: ImageVector
    get() {
        if (_fileBarcode != null) return _fileBarcode!!
        _fileBarcode = tablerOutlineIcon(
            name = "FileBarcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M8 13h1v3h-1v-3")
            addPathData("M12 13v3")
            addPathData("M15 13h1v3h-1v-3")
        }
        return _fileBarcode!!
    }

private var _fileBarcode: ImageVector? = null
