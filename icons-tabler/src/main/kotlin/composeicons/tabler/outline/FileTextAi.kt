package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTextAi: ImageVector
    get() {
        if (_fileTextAi != null) return _fileTextAi!!
        _fileTextAi = tablerOutlineIcon(
            name = "FileTextAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M10 21h-3C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v3.5")
            addPathData("M9 9h1")
            addPathData("M9 13h2.5")
            addPathData("M9 17h1")
            addPathData("M14 21v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M14 19h4")
            addPathData("M21 15v6")
        }
        return _fileTextAi!!
    }

private var _fileTextAi: ImageVector? = null
