package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Candle: ImageVector
    get() {
        if (_candle != null) return _candle!!
        _candle = tablerFilledIcon(
            name = "Candle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9c1.105 0 2 .895 2 2v10c0 .552-.448 1-1 1h-6C8.448 22 8 21.552 8 21v-10C8 9.895 8.895 9 10 9Z")
            addPathData("M11.254 1.334c.19-.212 .461-.333 .746-.333 .285 0 .556 .121 .745 .333l1.452 1.623c1.093 1.174 1.069 2.999-.054 4.144-1.123 1.145-2.947 1.205-4.142 .136C8.806 6.167 8.662 4.348 9.704 3.071Z")
        }
        return _candle!!
    }

private var _candle: ImageVector? = null
