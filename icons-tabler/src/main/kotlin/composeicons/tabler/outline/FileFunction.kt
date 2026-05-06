package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileFunction: ImageVector
    get() {
        if (_fileFunction != null) return _fileFunction!!
        _fileFunction = tablerOutlineIcon(
            name = "FileFunction",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M10.5 17h.333c.474 0 .87-.323 .916-.746l.502-4.508c.047-.423 .443-.746 .916-.746h.333")
            addPathData("M10.5 14h3")
        }
        return _fileFunction!!
    }

private var _fileFunction: ImageVector? = null
