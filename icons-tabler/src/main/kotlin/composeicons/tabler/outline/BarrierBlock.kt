package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BarrierBlock: ImageVector
    get() {
        if (_barrierBlock != null) return _barrierBlock!!
        _barrierBlock = tablerOutlineIcon(
            name = "BarrierBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8C4 7.448 4.448 7 5 7h14c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-14C4.448 16 4 15.552 4 15v-7")
            addPathData("M7 16v4")
            addPathData("M7.5 16l9-9")
            addPathData("M13.5 16 20 9.5")
            addPathData("M4 13.5 10.5 7")
            addPathData("M17 16v4")
            addPathData("M5 20h4")
            addPathData("M15 20h4")
            addPathData("M17 7v-2")
            addPathData("M7 7v-2")
        }
        return _barrierBlock!!
    }

private var _barrierBlock: ImageVector? = null
