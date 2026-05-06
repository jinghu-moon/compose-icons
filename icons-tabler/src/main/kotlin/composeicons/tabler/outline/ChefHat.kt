package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = tablerOutlineIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c1.918 0 3.52 1.35 3.91 3.151 2.133-.577 4.329 .684 4.906 2.816 .577 2.133-.684 4.329-2.816 4.906v7.126h-12v-7.126C3.867 13.296 2.607 11.099 3.184 8.967 3.762 6.834 5.959 5.573 8.092 6.151 8.491 4.312 10.118 3 12 3")
            addPathData("M6.161 17.009 18 17")
        }
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
