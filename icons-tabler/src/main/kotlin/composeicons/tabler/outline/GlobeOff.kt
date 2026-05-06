package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlobeOff: ImageVector
    get() {
        if (_globeOff != null) return _globeOff!!
        _globeOff = tablerOutlineIcon(
            name = "GlobeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.353 7.355c-.685 1.516-.36 3.298 .816 4.474 1.176 1.177 2.958 1.503 4.474 .819M14.65 10.639c.683-1.517 .355-3.299-.824-4.474C12.648 4.99 10.865 4.668 9.35 5.355")
            addPathData("M5.75 15c2.756 2.394 6.782 2.623 9.792 .557M17.562 13.559c1.296-1.843 1.756-4.145 1.269-6.345C18.343 5.015 16.953 3.123 15 2")
            addPathData("M11 17v4")
            addPathData("M7 21h8")
            addPathData("M3 3 21 21")
        }
        return _globeOff!!
    }

private var _globeOff: ImageVector? = null
