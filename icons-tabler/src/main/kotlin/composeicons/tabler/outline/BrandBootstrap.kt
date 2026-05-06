package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBootstrap: ImageVector
    get() {
        if (_brandBootstrap != null) return _brandBootstrap!!
        _brandBootstrap = tablerOutlineIcon(
            name = "BrandBootstrap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12c1.105 0 2-.895 2-2v-4C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v4c0 1.105 .895 2 2 2")
            addPathData("M2 12c1.105 0 2 .895 2 2v4c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-4c0-1.105 .895-2 2-2")
            addPathData("M9 16v-8h3.5c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-3.5 4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-4")
        }
        return _brandBootstrap!!
    }

private var _brandBootstrap: ImageVector? = null
