package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypePhp: ImageVector
    get() {
        if (_fileTypePhp != null) return _fileTypePhp!!
        _fileTypePhp = tablerOutlineIcon(
            name = "FileTypePhp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M5 18h1.5C7.328 18 8 17.328 8 16.5 8 15.672 7.328 15 6.5 15h-1.5v6")
            addPathData("M17 18h1.5C19.328 18 20 17.328 20 16.5 20 15.672 19.328 15 18.5 15h-1.5v6")
            addPathData("M11 21v-6")
            addPathData("M14 15v6")
            addPathData("M11 18h3")
        }
        return _fileTypePhp!!
    }

private var _fileTypePhp: ImageVector? = null
