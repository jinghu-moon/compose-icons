package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) return _arrowFatRight!!
        _arrowFatRight = phosphorRegularIcon(
            name = "ArrowFatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.660 122.340 L 141.660 26.340 C 139.372 24.049 135.929 23.364 132.938 24.603 C 129.947 25.842 127.997 28.762 128.000 32.000 L 128.000 72.000 L 48.000 72.000 C 39.163 72.000 32.000 79.163 32.000 88.000 L 32.000 168.000 C 32.000 176.837 39.163 184.000 48.000 184.000 L 128.000 184.000 L 128.000 224.000 C 127.997 227.238 129.947 230.158 132.938 231.397 C 135.929 232.636 139.372 231.951 141.660 229.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 ZM 144.000 204.690 L 144.000 176.000 C 144.000 171.582 140.418 168.000 136.000 168.000 L 48.000 168.000 L 48.000 88.000 L 136.000 88.000 C 140.418 88.000 144.000 84.418 144.000 80.000 L 144.000 51.310 L 220.690 128.000 Z"),
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
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null
