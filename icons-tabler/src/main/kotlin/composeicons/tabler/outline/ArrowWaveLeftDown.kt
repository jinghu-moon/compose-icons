package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowWaveLeftDown: ImageVector
    get() {
        if (_arrowWaveLeftDown != null) return _arrowWaveLeftDown!!
        _arrowWaveLeftDown = tablerOutlineIcon(
            name = "ArrowWaveLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 14h-4v-4")
            addPathData("M21 12c-.887 1.284-2.48 2.033-4 2-1.52 .033-3.113-.716-4-2C12.113 10.716 10.52 9.967 9 10 7.48 9.967 6 11 5 12L3 14")
        }
        return _arrowWaveLeftDown!!
    }

private var _arrowWaveLeftDown: ImageVector? = null
