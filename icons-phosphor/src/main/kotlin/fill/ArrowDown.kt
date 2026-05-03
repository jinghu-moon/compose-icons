package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorFillIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.660 149.660 L 133.660 221.660 C 132.159 223.162 130.123 224.006 128.000 224.006 C 125.877 224.006 123.841 223.162 122.340 221.660 L 50.340 149.660 C 48.049 147.372 47.364 143.929 48.603 140.938 C 49.842 137.947 52.762 135.997 56.000 136.000 L 120.000 136.000 L 120.000 40.000 C 120.000 35.582 123.582 32.000 128.000 32.000 C 132.418 32.000 136.000 35.582 136.000 40.000 L 136.000 136.000 L 200.000 136.000 C 203.238 135.997 206.158 137.947 207.397 140.938 C 208.636 143.929 207.951 147.372 205.660 149.660 Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
