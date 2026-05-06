package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Emphasis: ImageVector
    get() {
        if (_emphasis != null) return _emphasis!!
        _emphasis = tablerOutlineIcon(
            name = "Emphasis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5h-8v10h8M15 10h-7")
            addPathData("M6 20v.01")
            addPathData("M10 20v.01")
            addPathData("M14 20v.01")
            addPathData("M18 20v.01")
        }
        return _emphasis!!
    }

private var _emphasis: ImageVector? = null
