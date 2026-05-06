package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDolbyDigital: ImageVector
    get() {
        if (_brandDolbyDigital != null) return _brandDolbyDigital!!
        _brandDolbyDigital = tablerOutlineIcon(
            name = "BrandDolbyDigital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 6v12h-.89c-3.34 0-6.047-2.686-6.047-6 0-3.314 2.707-6 6.046-6h.891")
            addPathData("M3.063 6v12h.891C7.294 18 10 15.314 10 12 10 8.686 7.293 6 3.954 6h-.89")
        }
        return _brandDolbyDigital!!
    }

private var _brandDolbyDigital: ImageVector? = null
