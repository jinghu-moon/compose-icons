package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEtsy: ImageVector
    get() {
        if (_brandEtsy != null) return _brandEtsy!!
        _brandEtsy = tablerOutlineIcon(
            name = "BrandEtsy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12h-5")
            addPathData("M3 8C3 5.239 5.239 3 8 3h8c2.761 0 5 2.239 5 5v8c0 2.761-2.239 5-5 5h-8C5.239 21 3 18.761 3 16v-8")
            addPathData("M15 16h-5C9.448 16 9 15.552 9 15v-6C9 8.448 9.448 8 10 8h5")
        }
        return _brandEtsy!!
    }

private var _brandEtsy: ImageVector? = null
