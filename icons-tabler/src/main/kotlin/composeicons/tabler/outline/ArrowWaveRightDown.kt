package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowWaveRightDown: ImageVector
    get() {
        if (_arrowWaveRightDown != null) return _arrowWaveRightDown!!
        _arrowWaveRightDown = tablerOutlineIcon(
            name = "ArrowWaveRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 14h4v-4")
            addPathData("M3 12c.887 1.284 2.48 2.033 4 2 1.52 .033 3.113-.716 4-2 .887-1.284 2.48-2.033 4-2 1.52-.033 3 1 4 2l2 2")
        }
        return _arrowWaveRightDown!!
    }

private var _arrowWaveRightDown: ImageVector? = null
