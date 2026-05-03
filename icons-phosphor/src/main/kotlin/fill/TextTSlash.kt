package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorFillIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 128.000 72.000 L 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 L 184.000 96.000 C 184.000 100.418 180.418 104.000 176.000 104.000 C 171.582 104.000 168.000 100.418 168.000 96.000 L 168.000 88.000 L 128.000 88.000 C 123.582 88.000 120.000 84.418 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 ZM 189.270 198.000 C 187.673 199.398 185.587 200.104 183.470 199.964 C 181.352 199.823 179.378 198.847 177.980 197.250 L 135.980 149.250 L 135.980 176.000 L 147.980 176.000 C 152.398 176.000 155.980 179.582 155.980 184.000 C 155.980 188.418 152.398 192.000 147.980 192.000 L 108.000 192.000 C 103.582 192.000 100.000 188.418 100.000 184.000 C 100.000 179.582 103.582 176.000 108.000 176.000 L 120.000 176.000 L 120.000 131.000 L 88.000 94.430 L 88.000 96.000 C 88.000 100.418 84.418 104.000 80.000 104.000 C 75.582 104.000 72.000 100.418 72.000 96.000 L 72.000 80.000 C 72.001 78.925 72.215 77.861 72.630 76.870 L 66.000 69.270 C 63.401 65.929 63.855 61.141 67.035 58.347 C 70.216 55.554 75.022 55.722 78.000 58.730 L 190.000 186.730 C 192.903 190.046 192.576 195.086 189.270 198.000 Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
