package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderInner: ImageVector
    get() {
        if (_borderInner != null) return _borderInner!!
        _borderInner = tablerOutlineIcon(
            name = "BorderInner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h16")
            addPathData("M12 4v16")
            addPathData("M4 4v.01")
            addPathData("M8 4v.01")
            addPathData("M16 4v.01")
            addPathData("M20 4v.01")
            addPathData("M4 8v.01")
            addPathData("M20 8v.01")
            addPathData("M4 16v.01")
            addPathData("M20 16v.01")
            addPathData("M4 20v.01")
            addPathData("M8 20v.01")
            addPathData("M16 20v.01")
            addPathData("M20 20v.01")
        }
        return _borderInner!!
    }

private var _borderInner: ImageVector? = null
