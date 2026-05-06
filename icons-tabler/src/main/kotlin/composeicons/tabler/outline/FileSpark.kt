package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileSpark: ImageVector
    get() {
        if (_fileSpark != null) return _fileSpark!!
        _fileSpark = tablerOutlineIcon(
            name = "FileSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M12 21h-5C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v3.5")
        }
        return _fileSpark!!
    }

private var _fileSpark: ImageVector? = null
