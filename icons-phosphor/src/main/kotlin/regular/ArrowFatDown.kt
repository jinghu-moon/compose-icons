package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) return _arrowFatDown!!
        _arrowFatDown = phosphorRegularIcon(
            name = "ArrowFatDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.390 132.940 C 230.152 129.950 227.236 128.001 224.000 128.000 L 184.000 128.000 L 184.000 48.000 C 184.000 39.163 176.837 32.000 168.000 32.000 L 88.000 32.000 C 79.163 32.000 72.000 39.163 72.000 48.000 L 72.000 128.000 L 32.000 128.000 C 28.762 127.997 25.842 129.947 24.603 132.938 C 23.364 135.929 24.049 139.372 26.340 141.660 L 122.340 237.660 C 123.841 239.162 125.877 240.006 128.000 240.006 C 130.123 240.006 132.159 239.162 133.660 237.660 L 229.660 141.660 C 231.947 139.371 232.630 135.929 231.390 132.940 ZM 128.000 220.690 L 51.310 144.000 L 80.000 144.000 C 84.418 144.000 88.000 140.418 88.000 136.000 L 88.000 48.000 L 168.000 48.000 L 168.000 136.000 C 168.000 140.418 171.582 144.000 176.000 144.000 L 204.690 144.000 Z"),
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
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null
