package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCss3: ImageVector
    get() {
        if (_brandCss3 != null) return _brandCss3!!
        _brandCss3 = tablerOutlineIcon(
            name = "BrandCss3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4 18 18.5l-6 2-6-2L4 4h16")
            addPathData("M8.5 8h7L11 12h4l-.5 3.5L12 16.25 9.5 15.5 9.4 15")
        }
        return _brandCss3!!
    }

private var _brandCss3: ImageVector? = null
