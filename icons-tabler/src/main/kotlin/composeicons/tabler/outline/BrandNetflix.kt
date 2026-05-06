package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNetflix: ImageVector
    get() {
        if (_brandNetflix != null) return _brandNetflix!!
        _brandNetflix = tablerOutlineIcon(
            name = "BrandNetflix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3 19 21h-4L5 3h4")
            addPathData("M5 3v18h4v-10.5")
            addPathData("M19 21v-18h-4v10.5")
        }
        return _brandNetflix!!
    }

private var _brandNetflix: ImageVector? = null
