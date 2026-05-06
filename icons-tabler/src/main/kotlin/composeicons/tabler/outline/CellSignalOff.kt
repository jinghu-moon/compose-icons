package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CellSignalOff: ImageVector
    get() {
        if (_cellSignalOff != null) return _cellSignalOff!!
        _cellSignalOff = tablerOutlineIcon(
            name = "CellSignalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20h-15.269c-.296 0-.563-.178-.677-.451-.113-.274-.05-.589 .16-.798l7.265-7.264M13.479 9.487 18.751 4.215c.209-.21 .524-.273 .798-.16 .274 .113 .452 .38 .451 .677v11.269")
            addPathData("M3 3 21 21")
        }
        return _cellSignalOff!!
    }

private var _cellSignalOff: ImageVector? = null
