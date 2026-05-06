package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftRight: ImageVector
    get() {
        if (_arrowLeftRight != null) return _arrowLeftRight!!
        _arrowLeftRight = tablerOutlineIcon(
            name = "ArrowLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 13 21 9 17 5")
            addPathData("M7 13 3 9 7 5")
            addPathData("M12 14c0-2.761 2.239-5 5-5h4")
            addPathData("M12 19v-5C12 11.239 9.761 9 7 9h-4")
        }
        return _arrowLeftRight!!
    }

private var _arrowLeftRight: ImageVector? = null
