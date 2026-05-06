package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowMergeRight: ImageVector
    get() {
        if (_arrowMergeRight != null) return _arrowMergeRight!!
        _arrowMergeRight = tablerOutlineIcon(
            name = "ArrowMergeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 8 12 4 8 8")
            addPathData("M12 20v-16")
            addPathData("M18 18C14 16.667 12 13.333 12 8")
        }
        return _arrowMergeRight!!
    }

private var _arrowMergeRight: ImageVector? = null
