package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = phosphorLightIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.05 69.33c-2.934 1.499-6.527 .351-8.05-2.57C207.197 51.352 195.382 38.335 180.8 29.08c-2.762-1.784-3.573-5.459-1.819-8.24 1.754-2.781 5.419-3.633 8.219-1.91 16.33 10.446 29.587 25.049 38.41 42.31 .733 1.412 .876 3.058 .396 4.575-.48 1.517-1.543 2.781-2.956 3.515ZM41 66.76C48.803 51.352 60.618 38.335 75.2 29.08c2.762-1.784 3.573-5.459 1.819-8.24C75.266 18.059 71.6 17.207 68.8 18.93 52.47 29.376 39.213 43.979 30.39 61.24c-1.203 1.914-1.229 4.341-.066 6.28 1.163 1.939 3.317 3.059 5.572 2.899 2.255-.161 4.228-1.575 5.105-3.659ZM220 176.94c2.521 4.316 2.549 9.649 .075 13.991-2.474 4.343-7.076 7.037-12.075 7.069h-42.5c-3.01 18.37-18.885 31.856-37.5 31.856C109.385 229.856 93.51 216.37 90.5 198h-42.5c-5.009-.011-9.63-2.696-12.12-7.043-2.489-4.347-2.466-9.692 .06-14.017C45.13 161.09 50 138.63 50 112 50 68.922 84.922 34 128 34c43.078 0 78 34.922 78 78 0 27 4.74 48.86 14.08 64.94ZM153.29 198h-50.58c2.793 11.706 13.255 19.965 25.29 19.965 12.035 0 22.497-8.259 25.29-19.965ZM209.71 183C199.29 165 194 141.15 194 112 194 75.549 164.451 46 128 46 91.549 46 62 75.549 62 112c0 29.16-5.29 53-15.71 71-.357 .619-.357 1.381 0 2 .336 .624 .991 1.01 1.7 1h160.01c.709 .01 1.364-.376 1.7-1 .36-.617 .364-1.379 .01-2Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
