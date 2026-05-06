package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowMergeLeft: ImageVector
    get() {
        if (_arrowMergeLeft != null) return _arrowMergeLeft!!
        _arrowMergeLeft = tablerOutlineIcon(
            name = "ArrowMergeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8 12 4l4 4")
            addPathData("M12 20v-16")
            addPathData("M6 18c4-1.333 6-4.667 6-10")
        }
        return _arrowMergeLeft!!
    }

private var _arrowMergeLeft: ImageVector? = null
