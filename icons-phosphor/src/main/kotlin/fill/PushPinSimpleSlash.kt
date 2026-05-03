package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorFillIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 79.250 38.690 C 78.180 37.513 77.910 35.814 78.560 34.363 C 79.211 32.912 80.660 31.984 82.250 32.000 L 192.000 32.000 C 194.217 31.995 196.336 32.910 197.853 34.527 C 199.369 36.144 200.147 38.318 200.000 40.530 C 199.633 44.805 196.021 48.068 191.730 48.000 L 185.540 48.000 L 206.700 167.910 C 207.013 169.665 206.126 171.416 204.526 172.202 C 202.926 172.988 200.998 172.620 199.800 171.300 ZM 213.920 210.620 L 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 66.240 72.000 L 49.290 168.000 L 40.000 168.000 C 35.582 168.000 32.000 171.582 32.000 176.000 C 32.000 180.418 35.582 184.000 40.000 184.000 L 120.000 184.000 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 184.000 L 168.100 184.000 L 202.100 221.380 C 204.012 223.535 206.935 224.496 209.753 223.895 C 212.570 223.294 214.847 221.225 215.714 218.478 C 216.581 215.730 215.903 212.729 213.940 210.620 Z"),
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
