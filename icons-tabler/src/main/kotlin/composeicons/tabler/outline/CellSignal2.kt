package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CellSignal2: ImageVector
    get() {
        if (_cellSignal2 != null) return _cellSignal2!!
        _cellSignal2 = tablerOutlineIcon(
            name = "CellSignal2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20h-15.269c-.296 0-.563-.178-.677-.451-.113-.274-.05-.589 .16-.798L18.751 4.214c.209-.21 .524-.273 .798-.16 .274 .113 .452 .38 .451 .677v15.269")
            addPathData("M8 20v-5")
        }
        return _cellSignal2!!
    }

private var _cellSignal2: ImageVector? = null
