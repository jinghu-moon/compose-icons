package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorRegularIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 56.000 C 231.939 113.412 185.412 159.939 128.000 160.000 L 51.310 160.000 L 85.660 194.340 C 88.786 197.466 88.786 202.534 85.660 205.660 C 82.534 208.786 77.466 208.786 74.340 205.660 L 26.340 157.660 C 24.838 156.159 23.994 154.123 23.994 152.000 C 23.994 149.877 24.838 147.841 26.340 146.340 L 74.340 98.340 C 77.466 95.214 82.534 95.214 85.660 98.340 C 88.786 101.466 88.786 106.534 85.660 109.660 L 51.310 144.000 L 128.000 144.000 C 176.578 143.945 215.945 104.578 216.000 56.000 C 216.000 51.582 219.582 48.000 224.000 48.000 C 228.418 48.000 232.000 51.582 232.000 56.000 Z"),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
