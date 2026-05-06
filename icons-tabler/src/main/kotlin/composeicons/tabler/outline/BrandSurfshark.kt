package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSurfshark: ImageVector
    get() {
        if (_brandSurfshark != null) return _brandSurfshark!!
        _brandSurfshark = tablerOutlineIcon(
            name = "BrandSurfshark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.954 9.447c-.237-6.217 0-6.217-6-6.425C8.18 2.814 7.13 4.022 6.044 8.404 3.16 20.22 2.199 23.12 10.836 19.602c9.392-3.831 9.297-5.382 9.114-10.155h.004")
            addPathData("M8 16h.452c1.943 .007 3.526-1.461 3.543-3.286v-2.428C12.013 8.458 13.602 6.988 15.548 7h.452")
        }
        return _brandSurfshark!!
    }

private var _brandSurfshark: ImageVector? = null
