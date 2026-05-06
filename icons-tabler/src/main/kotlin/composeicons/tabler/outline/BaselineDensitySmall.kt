package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BaselineDensitySmall: ImageVector
    get() {
        if (_baselineDensitySmall != null) return _baselineDensitySmall!!
        _baselineDensitySmall = tablerOutlineIcon(
            name = "BaselineDensitySmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h16")
            addPathData("M4 9h16")
            addPathData("M4 15h16")
            addPathData("M4 21h16")
        }
        return _baselineDensitySmall!!
    }

private var _baselineDensitySmall: ImageVector? = null
