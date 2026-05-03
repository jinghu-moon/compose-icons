package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorFillIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 200.000 C 232.000 204.418 228.418 208.000 224.000 208.000 C 219.582 208.000 216.000 204.418 216.000 200.000 C 215.945 151.422 176.578 112.055 128.000 112.000 L 88.000 112.000 L 88.000 152.000 C 88.003 155.238 86.053 158.158 83.062 159.397 C 80.071 160.636 76.628 159.951 74.340 157.660 L 26.340 109.660 C 24.838 108.159 23.994 106.123 23.994 104.000 C 23.994 101.877 24.838 99.841 26.340 98.340 L 74.340 50.340 C 76.628 48.049 80.071 47.364 83.062 48.603 C 86.053 49.842 88.003 52.762 88.000 56.000 L 88.000 96.000 L 128.000 96.000 C 185.412 96.061 231.939 142.588 232.000 200.000 Z"),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
