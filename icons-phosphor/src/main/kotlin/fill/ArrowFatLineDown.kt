package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatLineDown: ImageVector
    get() {
        if (_arrowFatLineDown != null) return _arrowFatLineDown!!
        _arrowFatLineDown = phosphorFillIcon(
            name = "ArrowFatLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 72.000 40.000 C 72.000 35.582 75.582 32.000 80.000 32.000 L 176.000 32.000 C 180.418 32.000 184.000 35.582 184.000 40.000 C 184.000 44.418 180.418 48.000 176.000 48.000 L 80.000 48.000 C 75.582 48.000 72.000 44.418 72.000 40.000 ZM 231.390 132.940 C 230.152 129.950 227.236 128.001 224.000 128.000 L 184.000 128.000 L 184.000 72.000 C 184.000 67.582 180.418 64.000 176.000 64.000 L 80.000 64.000 C 75.582 64.000 72.000 67.582 72.000 72.000 L 72.000 128.000 L 32.000 128.000 C 28.762 127.997 25.842 129.947 24.603 132.938 C 23.364 135.929 24.049 139.372 26.340 141.660 L 122.340 237.660 C 123.841 239.162 125.877 240.006 128.000 240.006 C 130.123 240.006 132.159 239.162 133.660 237.660 L 229.660 141.660 C 231.947 139.371 232.630 135.929 231.390 132.940 Z"),
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
        return _arrowFatLineDown!!
    }

private var _arrowFatLineDown: ImageVector? = null
