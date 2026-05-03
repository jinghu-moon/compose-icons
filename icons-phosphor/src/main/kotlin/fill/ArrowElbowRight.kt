package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorFillIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 80.000 L 240.000 152.000 C 240.003 155.238 238.053 158.158 235.062 159.397 C 232.071 160.636 228.628 159.951 226.340 157.660 L 196.000 127.310 L 125.660 197.660 C 124.159 199.162 122.123 200.006 120.000 200.006 C 117.877 200.006 115.841 199.162 114.340 197.660 L 18.340 101.660 C 15.214 98.534 15.214 93.466 18.340 90.340 C 21.466 87.214 26.534 87.214 29.660 90.340 L 120.000 180.690 L 184.690 116.000 L 154.340 85.660 C 152.049 83.372 151.364 79.929 152.603 76.938 C 153.842 73.947 156.762 71.997 160.000 72.000 L 232.000 72.000 C 236.418 72.000 240.000 75.582 240.000 80.000 Z"),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
