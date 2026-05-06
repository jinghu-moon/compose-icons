package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeDocx: ImageVector
    get() {
        if (_fileTypeDocx != null) return _fileTypeDocx!!
        _fileTypeDocx = tablerOutlineIcon(
            name = "FileTypeDocx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M2 15v6h1c1.105 0 2-.895 2-2v-2C5 15.895 4.105 15 3 15h-1")
            addPathData("M17 16.5C17 15.672 16.328 15 15.5 15 14.672 15 14 15.672 14 16.5v3c0 .828 .672 1.5 1.5 1.5C16.328 21 17 20.328 17 19.5")
            addPathData("M9.5 15c.828 0 1.5 .672 1.5 1.5v3C11 20.328 10.328 21 9.5 21 8.672 21 8 20.328 8 19.5v-3C8 15.672 8.672 15 9.5 15")
            addPathData("M19.5 15l3 6")
            addPathData("M19.5 21l3-6")
        }
        return _fileTypeDocx!!
    }

private var _fileTypeDocx: ImageVector? = null
