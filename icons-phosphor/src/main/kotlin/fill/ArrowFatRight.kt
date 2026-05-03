package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) return _arrowFatRight!!
        _arrowFatRight = phosphorFillIcon(
            name = "ArrowFatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 133.660 L 141.660 229.660 C 139.372 231.951 135.929 232.636 132.938 231.397 C 129.947 230.158 127.997 227.238 128.000 224.000 L 128.000 184.000 L 48.000 184.000 C 39.163 184.000 32.000 176.837 32.000 168.000 L 32.000 88.000 C 32.000 79.163 39.163 72.000 48.000 72.000 L 128.000 72.000 L 128.000 32.000 C 127.997 28.762 129.947 25.842 132.938 24.603 C 135.929 23.364 139.372 24.049 141.660 26.340 L 237.660 122.340 C 239.162 123.841 240.006 125.877 240.006 128.000 C 240.006 130.123 239.162 132.159 237.660 133.660 Z"),
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
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null
