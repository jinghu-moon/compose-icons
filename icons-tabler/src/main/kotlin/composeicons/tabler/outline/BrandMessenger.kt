package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMessenger: ImageVector
    get() {
        if (_brandMessenger != null) return _brandMessenger!!
        _brandMessenger = tablerOutlineIcon(
            name = "BrandMessenger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.207c3.255 2.776 3.695 7.266 1.029 10.501C16.608 19.942 11.659 20.922 7.7 19L3 20")
            addPathData("M8 13l3-2 2 2 3-2")
        }
        return _brandMessenger!!
    }

private var _brandMessenger: ImageVector? = null
