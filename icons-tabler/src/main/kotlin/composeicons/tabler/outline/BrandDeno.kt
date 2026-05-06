package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDeno: ImageVector
    get() {
        if (_brandDeno != null) return _brandDeno!!
        _brandDeno = tablerOutlineIcon(
            name = "BrandDeno",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M13.47 20.882 12 15C9.351 14.912 7 13.376 7 11.5 7 9.567 9.239 8 12 8c2.761 0 4 1 5 3 .024 .048 .69 2.215 2 6.5")
            addPathData("M12 11h.01")
        }
        return _brandDeno!!
    }

private var _brandDeno: ImageVector? = null
