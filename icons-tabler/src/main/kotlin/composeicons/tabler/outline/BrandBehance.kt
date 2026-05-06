package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBehance: ImageVector
    get() {
        if (_brandBehance != null) return _brandBehance!!
        _brandBehance = tablerOutlineIcon(
            name = "BrandBehance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 18v-12h4.5c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4.5")
            addPathData("M3 12h4.5")
            addPathData("M14 13h7C21 11.067 19.433 9.5 17.5 9.5 15.567 9.5 14 11.067 14 13v2c.212 1.538 1.411 2.752 2.946 2.983 1.535 .231 3.039-.576 3.694-1.983")
            addPathData("M16 6h3")
        }
        return _brandBehance!!
    }

private var _brandBehance: ImageVector? = null
