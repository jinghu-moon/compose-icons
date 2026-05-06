package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CellSignal3: ImageVector
    get() {
        if (_cellSignal3 != null) return _cellSignal3!!
        _cellSignal3 = tablerOutlineIcon(
            name = "CellSignal3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20h-15.269c-.296 0-.563-.178-.677-.451-.113-.274-.05-.589 .16-.798L18.751 4.214c.209-.21 .524-.273 .798-.16 .274 .113 .452 .38 .451 .677v15.269")
            addPathData("M12 20v-9")
        }
        return _cellSignal3!!
    }

private var _cellSignal3: ImageVector? = null
