package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Asset: ImageVector
    get() {
        if (_asset != null) return _asset!!
        _asset = tablerOutlineIcon(
            name = "Asset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C15 11.686 12.314 9 9 9 5.686 9 3 11.686 3 15")
            addPathData("M7 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M17 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 3.895 20.105 3 19 3c-1.105 0-2 .895-2 2")
            addPathData("M14.218 17.975 20.837 5.801")
            addPathData("M6.079 9.756 18.296 3.125")
            addPathData("M7 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _asset!!
    }

private var _asset: ImageVector? = null
