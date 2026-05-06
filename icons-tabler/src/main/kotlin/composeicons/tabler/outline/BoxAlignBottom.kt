package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignBottom: ImageVector
    get() {
        if (_boxAlignBottom != null) return _boxAlignBottom!!
        _boxAlignBottom = tablerOutlineIcon(
            name = "BoxAlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14h16v5c0 .552-.448 1-1 1h-14C4.448 20 4 19.552 4 19v-5")
            addPathData("M4 9v.01")
            addPathData("M4 4v.01")
            addPathData("M9 4v.01")
            addPathData("M15 4v.01")
            addPathData("M20 4v.01")
            addPathData("M20 9v.01")
        }
        return _boxAlignBottom!!
    }

private var _boxAlignBottom: ImageVector? = null
