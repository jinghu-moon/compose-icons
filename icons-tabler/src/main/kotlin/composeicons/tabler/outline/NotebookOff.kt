package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NotebookOff: ImageVector
    get() {
        if (_notebookOff != null) return _notebookOff!!
        _notebookOff = tablerOutlineIcon(
            name = "NotebookOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h9c1.105 0 2 .895 2 2v9M18.821 18.828C18.496 19.542 17.784 20 17 20h-11C5.448 20 5 19.552 5 19v-14M9 4v1M9 9v13")
            addPathData("M13 8h2")
            addPathData("M3 3 21 21")
        }
        return _notebookOff!!
    }

private var _notebookOff: ImageVector? = null
