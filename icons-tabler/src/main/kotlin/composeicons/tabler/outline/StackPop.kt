package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StackPop: ImageVector
    get() {
        if (_stackPop != null) return _stackPop!!
        _stackPop = tablerOutlineIcon(
            name = "StackPop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 9.5 4 11l8 4 8-4L17 9.5")
            addPathData("M4 15l8 4 8-4")
            addPathData("M12 11v-7")
            addPathData("M9 7 12 4l3 3")
        }
        return _stackPop!!
    }

private var _stackPop: ImageVector? = null
