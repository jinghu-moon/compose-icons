package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BarrierBlockOff: ImageVector
    get() {
        if (_barrierBlockOff != null) return _barrierBlockOff!!
        _barrierBlockOff = tablerOutlineIcon(
            name = "BarrierBlockOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7h8c.552 0 1 .448 1 1v7c0 .27-.107 .516-.282 .696")
            addPathData("M16 16h-11C4.448 16 4 15.552 4 15v-7C4 7.448 4.448 7 5 7h2")
            addPathData("M7 16v4")
            addPathData("M7.5 16l4.244-4.244")
            addPathData("M13.745 9.755 16.5 7")
            addPathData("M13.5 16l1.249-1.249")
            addPathData("M16.741 12.759 20 9.5")
            addPathData("M4 13.5 8.752 8.748")
            addPathData("M17 17v3")
            addPathData("M5 20h4")
            addPathData("M15 20h4")
            addPathData("M17 7v-2")
            addPathData("M3 3 21 21")
        }
        return _barrierBlockOff!!
    }

private var _barrierBlockOff: ImageVector? = null
