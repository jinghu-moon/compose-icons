package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorDuotoneIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 56.000 L 200.000 200.000 L 72.000 200.000 C 63.163 200.000 56.000 192.837 56.000 184.000 L 56.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 213.380 221.920 C 210.110 224.891 205.051 224.649 202.080 221.380 L 136.000 148.690 L 136.000 192.000 L 160.000 192.000 C 164.418 192.000 168.000 195.582 168.000 200.000 C 168.000 204.418 164.418 208.000 160.000 208.000 L 96.000 208.000 C 91.582 208.000 88.000 204.418 88.000 200.000 C 88.000 195.582 91.582 192.000 96.000 192.000 L 120.000 192.000 L 120.000 131.090 L 64.000 69.490 L 64.000 88.000 C 64.000 92.418 60.418 96.000 56.000 96.000 C 51.582 96.000 48.000 92.418 48.000 88.000 L 48.000 56.000 C 48.001 54.858 48.246 53.729 48.720 52.690 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 L 213.920 210.620 C 216.891 213.890 216.649 218.949 213.380 221.920 ZM 105.790 64.000 L 120.000 64.000 L 120.000 80.430 C 120.000 84.848 123.582 88.430 128.000 88.430 C 132.418 88.430 136.000 84.848 136.000 80.430 L 136.000 64.000 L 192.000 64.000 L 192.000 88.000 C 192.000 92.418 195.582 96.000 200.000 96.000 C 204.418 96.000 208.000 92.418 208.000 88.000 L 208.000 56.000 C 208.000 51.582 204.418 48.000 200.000 48.000 L 105.790 48.000 C 101.372 48.000 97.790 51.582 97.790 56.000 C 97.790 60.418 101.372 64.000 105.790 64.000 Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
