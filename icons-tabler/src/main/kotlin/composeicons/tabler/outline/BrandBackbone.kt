package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBackbone: ImageVector
    get() {
        if (_brandBackbone != null) return _brandBackbone!!
        _brandBackbone = tablerOutlineIcon(
            name = "BrandBackbone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 20 19 12 5 4v16")
            addPathData("M19 20 5 12 19 4v16")
        }
        return _brandBackbone!!
    }

private var _brandBackbone: ImageVector? = null
