package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpacingHorizontal: ImageVector
    get() {
        if (_spacingHorizontal != null) return _spacingHorizontal!!
        _spacingHorizontal = tablerOutlineIcon(
            name = "SpacingHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20h-2c-1.105 0-2-.895-2-2v-12c0-1.105 .895-2 2-2h2")
            addPathData("M4 20h2c1.105 0 2-.895 2-2v-12C8 4.895 7.105 4 6 4h-2")
            addPathData("M12 8v8")
        }
        return _spacingHorizontal!!
    }

private var _spacingHorizontal: ImageVector? = null
