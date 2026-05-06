package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilePhone: ImageVector
    get() {
        if (_filePhone != null) return _filePhone!!
        _filePhone = tablerOutlineIcon(
            name = "FilePhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M9 12c0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5v-1c0-.276-.224-.5-.5-.5C9.224 10.5 9 10.724 9 11v1c0 2.761 2.239 5 5 5h1c.276 0 .5-.224 .5-.5C15.5 16.224 15.276 16 15 16h-1c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5")
        }
        return _filePhone!!
    }

private var _filePhone: ImageVector? = null
