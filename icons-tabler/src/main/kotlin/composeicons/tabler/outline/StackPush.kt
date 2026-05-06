package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StackPush: ImageVector
    get() {
        if (_stackPush != null) return _stackPush!!
        _stackPush = tablerOutlineIcon(
            name = "StackPush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 10 4 11l8 4 8-4L18 10")
            addPathData("M4 15l8 4 8-4")
            addPathData("M12 4v7")
            addPathData("M15 8l-3 3L9 8")
        }
        return _stackPush!!
    }

private var _stackPush: ImageVector? = null
