package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorFillIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.390 83.060 C 206.152 86.050 203.236 87.999 200.000 88.000 L 160.000 88.000 L 160.000 128.000 C 159.939 185.412 113.412 231.939 56.000 232.000 C 51.582 232.000 48.000 228.418 48.000 224.000 C 48.000 219.582 51.582 216.000 56.000 216.000 C 104.578 215.945 143.945 176.578 144.000 128.000 L 144.000 88.000 L 104.000 88.000 C 100.762 88.003 97.842 86.053 96.603 83.062 C 95.364 80.071 96.049 76.628 98.340 74.340 L 146.340 26.340 C 147.841 24.838 149.877 23.994 152.000 23.994 C 154.123 23.994 156.159 24.838 157.660 26.340 L 205.660 74.340 C 207.947 76.629 208.630 80.071 207.390 83.060 Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
