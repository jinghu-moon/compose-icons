package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCucumber: ImageVector
    get() {
        if (_brandCucumber != null) return _brandCucumber!!
        _brandCucumber = tablerOutlineIcon(
            name = "BrandCucumber",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10.99c-.01 5.52-4.48 10-10 10.01v-2.26l-.01-.01C5.71 17.62 3.13 13.26 4.23 8.98 4.757 6.924 6.08 5.163 7.907 4.082 9.733 3.002 11.915 2.692 13.97 3.22 17.5 4.13 20 7.35 20 11v-.01")
            addPathData("M10.5 8 10 7")
            addPathData("M13.5 14 14 15")
            addPathData("M9 12.5 8 13")
            addPathData("M11 14l-.5 1")
            addPathData("M13 8l.5-1")
            addPathData("M16 12.5 15 12")
            addPathData("M9 10 8 9.5")
        }
        return _brandCucumber!!
    }

private var _brandCucumber: ImageVector? = null
