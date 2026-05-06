package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandItch: ImageVector
    get() {
        if (_brandItch != null) return _brandItch!!
        _brandItch = tablerOutlineIcon(
            name = "BrandItch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 7v1c0 1.087 1.078 2 2 2C5.107 10 6 9.09 6 8c0 1.09 .893 2 2 2 1.107 0 2-.91 2-2 0 1.09 .893 2 2 2 1.107 0 2-.91 2-2 0 1.09 .893 2 2 2 1.107 0 2-.91 2-2 0 1.09 .893 2 2 2 .922 0 2-.913 2-2v-1c-.009-.275-.538-.964-1.588-2.068C19.846 4.337 19.06 4 18.238 4h-12.476C4.94 4 4.154 4.337 3.588 4.932 2.538 6.036 2.008 6.725 2 7")
            addPathData("M4 10c-.117 6.28 .154 9.765 .814 10.456 1.534 .367 4.355 .535 7.186 .536 2.83-.001 5.652-.169 7.186-.536C20.176 19.419 20.084 10.897 20 10")
            addPathData("M10 16l2-2 2 2")
            addPathData("M12 14v4")
        }
        return _brandItch!!
    }

private var _brandItch: ImageVector? = null
