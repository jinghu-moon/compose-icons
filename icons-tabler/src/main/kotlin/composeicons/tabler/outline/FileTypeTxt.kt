package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeTxt: ImageVector
    get() {
        if (_fileTypeTxt != null) return _fileTypeTxt!!
        _fileTypeTxt = tablerOutlineIcon(
            name = "FileTypeTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M16.5 15h3")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M4.5 15h3")
            addPathData("M6 15v6")
            addPathData("M18 15v6")
            addPathData("M10 15l4 6")
            addPathData("M10 21l4-6")
        }
        return _fileTypeTxt!!
    }

private var _fileTypeTxt: ImageVector? = null
