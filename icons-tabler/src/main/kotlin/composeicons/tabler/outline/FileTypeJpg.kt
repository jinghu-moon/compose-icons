package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeJpg: ImageVector
    get() {
        if (_fileTypeJpg != null) return _fileTypeJpg!!
        _fileTypeJpg = tablerOutlineIcon(
            name = "FileTypeJpg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M11 18h1.5C13.328 18 14 17.328 14 16.5 14 15.672 13.328 15 12.5 15h-1.5v6")
            addPathData("M20 15h-1c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h1v-3")
            addPathData("M5 15h3v4.5C8 20.328 7.328 21 6.5 21 5.672 21 5 20.328 5 19.5")
        }
        return _fileTypeJpg!!
    }

private var _fileTypeJpg: ImageVector? = null
