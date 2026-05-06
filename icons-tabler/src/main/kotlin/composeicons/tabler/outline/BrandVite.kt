package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVite: ImageVector
    get() {
        if (_brandVite != null) return _brandVite!!
        _brandVite = tablerOutlineIcon(
            name = "BrandVite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 4.5 16 3 14 9.5 16 9l-4 7v-5L9 12 10 4.5")
            addPathData("M15 6.5 22 5 12 22 2 5 9.741 6.5")
        }
        return _brandVite!!
    }

private var _brandVite: ImageVector? = null
