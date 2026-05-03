package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatLineRight: ImageVector
    get() {
        if (_arrowFatLineRight != null) return _arrowFatLineRight!!
        _arrowFatLineRight = phosphorFillIcon(
            name = "ArrowFatLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 48.000 80.000 L 48.000 176.000 C 48.000 180.418 44.418 184.000 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 80.000 C 32.000 75.582 35.582 72.000 40.000 72.000 C 44.418 72.000 48.000 75.582 48.000 80.000 ZM 237.660 122.340 L 141.660 26.340 C 139.372 24.049 135.929 23.364 132.938 24.603 C 129.947 25.842 127.997 28.762 128.000 32.000 L 128.000 72.000 L 72.000 72.000 C 67.582 72.000 64.000 75.582 64.000 80.000 L 64.000 176.000 C 64.000 180.418 67.582 184.000 72.000 184.000 L 128.000 184.000 L 128.000 224.000 C 127.997 227.238 129.947 230.158 132.938 231.397 C 135.929 232.636 139.372 231.951 141.660 229.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 Z"),
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
        return _arrowFatLineRight!!
    }

private var _arrowFatLineRight: ImageVector? = null
