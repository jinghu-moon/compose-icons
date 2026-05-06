package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBumble: ImageVector
    get() {
        if (_brandBumble != null) return _brandBumble!!
        _brandBumble = tablerOutlineIcon(
            name = "BrandBumble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12h10")
            addPathData("M9 8h6")
            addPathData("M10 16h4")
            addPathData("M16.268 3h-8.536c-.527 .002-1.011 .288-1.268 .748L2.196 11.257c-.261 .461-.261 1.025 0 1.486l4.268 7.509c.26 .462 .744 .747 1.268 .748h8.536c.527-.002 1.011-.288 1.268-.748l4.268-7.509c.261-.461 .261-1.025 0-1.486L17.536 3.748C17.279 3.288 16.795 3.002 16.268 3")
        }
        return _brandBumble!!
    }

private var _brandBumble: ImageVector? = null
