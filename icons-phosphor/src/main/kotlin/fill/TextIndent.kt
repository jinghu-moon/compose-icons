package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorFillIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 112.000 136.000 C 107.582 136.000 104.000 132.418 104.000 128.000 C 104.000 123.582 107.582 120.000 112.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 112.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 68.418 224.000 64.000 C 224.000 59.582 220.418 56.000 216.000 56.000 L 112.000 56.000 C 107.582 56.000 104.000 59.582 104.000 64.000 C 104.000 68.418 107.582 72.000 112.000 72.000 ZM 216.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 C 224.000 187.582 220.418 184.000 216.000 184.000 ZM 36.940 143.390 C 39.929 144.630 43.371 143.947 45.660 141.660 L 85.660 101.660 C 87.162 100.159 88.006 98.123 88.006 96.000 C 88.006 93.877 87.162 91.841 85.660 90.340 L 45.660 50.340 C 43.372 48.049 39.929 47.364 36.938 48.603 C 33.947 49.842 31.997 52.762 32.000 56.000 L 32.000 136.000 C 32.001 139.236 33.950 142.152 36.940 143.390 Z"),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
