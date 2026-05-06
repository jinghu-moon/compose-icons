package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pinned: ImageVector
    get() {
        if (_pinned != null) return _pinned!!
        _pinned = tablerOutlineIcon(
            name = "Pinned",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4v6L7 14v2h10v-2L15 10v-6")
            addPathData("M12 16v5")
            addPathData("M8 4h8")
        }
        return _pinned!!
    }

private var _pinned: ImageVector? = null
