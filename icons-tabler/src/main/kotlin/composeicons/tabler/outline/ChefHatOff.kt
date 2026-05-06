package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChefHatOff: ImageVector
    get() {
        if (_chefHatOff != null) return _chefHatOff!!
        _chefHatOff = tablerOutlineIcon(
            name = "ChefHatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.72 4.712C9.63 3.407 11.226 2.765 12.786 3.078c1.56 .312 2.786 1.519 3.124 3.073 2.133-.577 4.329 .684 4.906 2.816 .577 2.133-.684 4.329-2.816 4.906v.126M18 18v3h-12v-7.126C4.188 13.437 2.918 11.807 2.937 9.944 2.957 8.08 4.26 6.477 6.081 6.078")
            addPathData("M6.161 17.009 17 17")
            addPathData("M3 3 21 21")
        }
        return _chefHatOff!!
    }

private var _chefHatOff: ImageVector? = null
