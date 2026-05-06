package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAzure: ImageVector
    get() {
        if (_brandAzure != null) return _brandAzure!!
        _brandAzure = tablerOutlineIcon(
            name = "BrandAzure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 7.5 2 17h4L12 2 6 7.5")
            addPathData("M22 20 15 5l-3 7 4 5L8 20h14")
        }
        return _brandAzure!!
    }

private var _brandAzure: ImageVector? = null
