package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTether: ImageVector
    get() {
        if (_brandTether != null) return _brandTether!!
        _brandTether = tablerOutlineIcon(
            name = "BrandTether",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.08 20.188c-1.15 1.083-3.02 1.083-4.17 0L2.98 13.64C2.02 12.734 1.71 11.016 2.29 9.809L4.69 4.791C5.16 3.8 6.41 3 7.47 3h9.06c1.06 0 2.31 .802 2.78 1.79l2.4 5.019c.58 1.207 .26 2.925-.69 3.83-3.453 3.293-3.466 3.279-6.94 6.549")
            addPathData("M12 15v-7")
            addPathData("M8 8h8")
        }
        return _brandTether!!
    }

private var _brandTether: ImageVector? = null
