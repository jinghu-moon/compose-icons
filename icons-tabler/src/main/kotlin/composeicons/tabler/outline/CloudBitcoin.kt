package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudBitcoin: ImageVector
    get() {
        if (_cloudBitcoin != null) return _cloudBitcoin!!
        _cloudBitcoin = tablerOutlineIcon(
            name = "CloudBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 21v-6M19 15v-1.5M19 22.5v-1.5M17 18h3M19 18h.5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-3.5M19 18h.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-3.5")
            addPathData("M13.5 18.004h-6.843C4.085 18 2 15.993 2 13.517 2 11.041 4.085 9.035 6.657 9.035 7.05 7.273 8.451 5.835 10.332 5.262c1.88-.572 3.956-.193 5.444 1 1.28 1.023 1.957 2.51 1.873 4.027")
        }
        return _cloudBitcoin!!
    }

private var _cloudBitcoin: ImageVector? = null
