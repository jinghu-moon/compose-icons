package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandUnity: ImageVector
    get() {
        if (_brandUnity != null) return _brandUnity!!
        _brandUnity = tablerOutlineIcon(
            name = "BrandUnity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3l6 4v7")
            addPathData("M18 17l-6 4L6 17")
            addPathData("M4 14v-7L10 3")
            addPathData("M4 7l8 5v9")
            addPathData("M20 7l-8 5")
        }
        return _brandUnity!!
    }

private var _brandUnity: ImageVector? = null
