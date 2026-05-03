package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) return _arrowFatDown!!
        _arrowFatDown = phosphorFillIcon(
            name = "ArrowFatDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 141.660 L 133.660 237.660 C 132.159 239.162 130.123 240.006 128.000 240.006 C 125.877 240.006 123.841 239.162 122.340 237.660 L 26.340 141.660 C 24.049 139.372 23.364 135.929 24.603 132.938 C 25.842 129.947 28.762 127.997 32.000 128.000 L 72.000 128.000 L 72.000 48.000 C 72.000 39.163 79.163 32.000 88.000 32.000 L 168.000 32.000 C 176.837 32.000 184.000 39.163 184.000 48.000 L 184.000 128.000 L 224.000 128.000 C 227.238 127.997 230.158 129.947 231.397 132.938 C 232.636 135.929 231.951 139.372 229.660 141.660 Z"),
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
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null
