package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockCancel: ImageVector
    get() {
        if (_clockCancel != null) return _clockCancel!!
        _clockCancel = tablerOutlineIcon(
            name = "ClockCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.997 12.25C21.1 8.563 18.942 5.187 15.554 3.73 12.165 2.274 8.231 3.033 5.627 5.645 3.023 8.257 2.276 12.194 3.743 15.578c1.467 3.384 4.85 5.531 8.536 5.417")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
            addPathData("M12 7v5l2 2")
        }
        return _clockCancel!!
    }

private var _clockCancel: ImageVector? = null
