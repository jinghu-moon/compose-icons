package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CoinOff: ImageVector
    get() {
        if (_coinOff != null) return _coinOff!!
        _coinOff = tablerOutlineIcon(
            name = "CoinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.8 9C14.431 8.36 13.739 7.975 13 8h-1M9.18 9.171c-.282 .619-.23 1.339 .138 1.911 .368 .572 1.002 .918 1.682 .918h1M14.824 14.822C14.501 15.539 13.787 16 13 16h-2c-.739 .025-1.431-.36-1.8-1")
            addPathData("M20.042 16.045C21.79 12.576 21.115 8.378 18.368 5.632 15.622 2.885 11.424 2.21 7.955 3.958M5.637 5.635C3.332 7.902 2.42 11.231 3.248 14.356c.828 3.125 3.268 5.566 6.393 6.395 3.125 .829 6.454-.082 8.722-2.386")
            addPathData("M12 6v2M12 16v2")
            addPathData("M3 3 21 21")
        }
        return _coinOff!!
    }

private var _coinOff: ImageVector? = null
