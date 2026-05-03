package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorRegularIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.660 85.660 C 204.159 87.162 202.123 88.006 200.000 88.006 C 197.877 88.006 195.841 87.162 194.340 85.660 L 160.000 51.310 L 160.000 128.000 C 159.939 185.412 113.412 231.939 56.000 232.000 C 51.582 232.000 48.000 228.418 48.000 224.000 C 48.000 219.582 51.582 216.000 56.000 216.000 C 104.578 215.945 143.945 176.578 144.000 128.000 L 144.000 51.310 L 109.660 85.660 C 106.534 88.786 101.466 88.786 98.340 85.660 C 95.214 82.534 95.214 77.466 98.340 74.340 L 146.340 26.340 C 147.841 24.838 149.877 23.994 152.000 23.994 C 154.123 23.994 156.159 24.838 157.660 26.340 L 205.660 74.340 C 207.162 75.841 208.006 77.877 208.006 80.000 C 208.006 82.123 207.162 84.159 205.660 85.660 Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
