package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = tablerOutlineIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 20.735C5.38 20.377 4.999 19.716 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2h-1")
            addPathData("M11 17c1.105 0 2 .895 2 2v2c0 .552-.448 1-1 1h-2C9.448 22 9 21.552 9 21v-2c0-1.105 .895-2 2-2")
            addPathData("M11 5h-1")
            addPathData("M13 7h-1")
            addPathData("M11 9h-1")
            addPathData("M13 11h-1")
            addPathData("M11 13h-1")
            addPathData("M13 15h-1")
        }
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
