package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandInertia: ImageVector
    get() {
        if (_brandInertia != null) return _brandInertia!!
        _brandInertia = tablerOutlineIcon(
            name = "BrandInertia",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 8l4 4-4 4h4.5l4-4L17 8h-4.5")
            addPathData("M3.5 8l4 4-4 4h4.5l4-4L8 8h-4.5")
        }
        return _brandInertia!!
    }

private var _brandInertia: ImageVector? = null
