package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = tablerOutlineIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12l5 5L22 7")
            addPathData("M2 12l5 5M12 12 17 7")
        }
        return _checks!!
    }

private var _checks: ImageVector? = null
