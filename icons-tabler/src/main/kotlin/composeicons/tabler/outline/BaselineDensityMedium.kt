package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BaselineDensityMedium: ImageVector
    get() {
        if (_baselineDensityMedium != null) return _baselineDensityMedium!!
        _baselineDensityMedium = tablerOutlineIcon(
            name = "BaselineDensityMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M4 12h16")
            addPathData("M4 4h16")
        }
        return _baselineDensityMedium!!
    }

private var _baselineDensityMedium: ImageVector? = null
