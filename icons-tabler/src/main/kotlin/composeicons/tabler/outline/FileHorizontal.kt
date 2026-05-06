package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileHorizontal: ImageVector
    get() {
        if (_fileHorizontal != null) return _fileHorizontal!!
        _fileHorizontal = tablerOutlineIcon(
            name = "FileHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5v4c0 .552 .448 1 1 1h4")
            addPathData("M3 7v10c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-7L16 5h-11C3.895 5 3 5.895 3 7")
        }
        return _fileHorizontal!!
    }

private var _fileHorizontal: ImageVector? = null
