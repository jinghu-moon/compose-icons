package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFlutter: ImageVector
    get() {
        if (_brandFlutter != null) return _brandFlutter!!
        _brandFlutter = tablerOutlineIcon(
            name = "BrandFlutter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 14 4 11 12 3h6L7 14")
            addPathData("M14 21 9 16l5-5h5l-5 5 5 5h-5")
        }
        return _brandFlutter!!
    }

private var _brandFlutter: ImageVector? = null
