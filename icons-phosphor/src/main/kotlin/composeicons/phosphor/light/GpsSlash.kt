package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorLightIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 128c0 3.314-2.686 6-6 6h-26.21c-.681 10.089-3.153 19.977-7.3 29.2-.967 2.161-3.113 3.551-5.48 3.55-.845 .001-1.681-.18-2.45-.53-3.016-1.363-4.359-4.912-3-7.93 12.016-26.858 6.99-58.283-12.803-80.054C162.963 56.465 132.158 48.478 104.28 57.89c-3.14 1.06-6.545-.625-7.605-3.765-1.06-3.14 .625-6.545 3.765-7.605 6.972-2.354 14.218-3.799 21.56-4.3v-26.22c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v26.23c42.729 3.05 76.72 37.041 79.77 79.77h26.23c3.314 0 6 2.686 6 6ZM212.44 212c2.231 2.452 2.052 6.249-.4 8.48-2.452 2.231-6.249 2.052-8.48-.4L181.26 195.54C167.702 206.238 151.23 212.592 134 213.77v26.23c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26.23C79.271 210.72 45.28 176.729 42.23 134h-26.23c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26.22C43.64 101.978 52 83.079 65.86 68.56L43.56 44c-1.865-2.484-1.526-5.981 .782-8.06 2.308-2.079 5.821-2.053 8.098 .06ZM173.17 186.6 74 77.48c-26.091 28.176-26.294 71.629-.466 100.048 25.827 28.419 69.101 32.359 99.636 9.072Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
