package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Subtask: ImageVector
    get() {
        if (_subtask != null) return _subtask!!
        _subtask = tablerOutlineIcon(
            name = "Subtask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9h6")
            addPathData("M4 5h4")
            addPathData("M6 5v11c0 .552 .448 1 1 1h5")
            addPathData("M12 8c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-2")
            addPathData("M12 16c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-2")
        }
        return _subtask!!
    }

private var _subtask: ImageVector? = null
