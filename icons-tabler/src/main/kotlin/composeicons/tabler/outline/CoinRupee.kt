package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CoinRupee: ImageVector
    get() {
        if (_coinRupee != null) return _coinRupee!!
        _coinRupee = tablerOutlineIcon(
            name = "CoinRupee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M15 8h-6 1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-1l3 3")
            addPathData("M9 11h6")
        }
        return _coinRupee!!
    }

private var _coinRupee: ImageVector? = null
