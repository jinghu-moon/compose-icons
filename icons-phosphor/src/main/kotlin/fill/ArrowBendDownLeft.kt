package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorFillIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 56.000 C 231.939 113.412 185.412 159.939 128.000 160.000 L 88.000 160.000 L 88.000 200.000 C 88.003 203.238 86.053 206.158 83.062 207.397 C 80.071 208.636 76.628 207.951 74.340 205.660 L 26.340 157.660 C 24.838 156.159 23.994 154.123 23.994 152.000 C 23.994 149.877 24.838 147.841 26.340 146.340 L 74.340 98.340 C 76.628 96.049 80.071 95.364 83.062 96.603 C 86.053 97.842 88.003 100.762 88.000 104.000 L 88.000 144.000 L 128.000 144.000 C 176.578 143.945 215.945 104.578 216.000 56.000 C 216.000 51.582 219.582 48.000 224.000 48.000 C 228.418 48.000 232.000 51.582 232.000 56.000 Z"),
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
