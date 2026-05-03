package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorRegularIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 83.250 40.000 C 83.250 35.582 86.832 32.000 91.250 32.000 L 192.000 32.000 C 196.418 32.000 200.000 35.582 200.000 40.000 C 200.000 44.418 196.418 48.000 192.000 48.000 L 185.540 48.000 L 204.290 154.300 C 205.053 158.645 202.154 162.788 197.810 163.560 C 197.348 163.647 196.880 163.690 196.410 163.690 C 192.531 163.686 189.214 160.900 188.540 157.080 L 169.290 48.000 L 91.290 48.000 C 89.161 48.011 87.116 47.172 85.607 45.671 C 84.098 44.170 83.250 42.129 83.250 40.000 ZM 213.380 221.920 C 210.110 224.891 205.051 224.649 202.080 221.380 L 168.100 184.000 L 136.000 184.000 L 136.000 240.000 C 136.000 244.418 132.418 248.000 128.000 248.000 C 123.582 248.000 120.000 244.418 120.000 240.000 L 120.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 C 32.000 171.582 35.582 168.000 40.000 168.000 L 49.290 168.000 L 66.240 72.000 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 L 213.920 210.620 C 216.891 213.890 216.649 218.949 213.380 221.920 ZM 153.550 168.000 L 79.840 86.920 L 65.540 168.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
