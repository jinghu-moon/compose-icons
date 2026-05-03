package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorFillIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 85.660 146.340 C 88.786 149.466 88.786 154.534 85.660 157.660 C 82.534 160.786 77.466 160.786 74.340 157.660 L 26.340 109.660 C 24.838 108.159 23.994 106.123 23.994 104.000 C 23.994 101.877 24.838 99.841 26.340 98.340 L 74.340 50.340 C 77.466 47.214 82.534 47.214 85.660 50.340 C 88.786 53.466 88.786 58.534 85.660 61.660 L 43.310 104.000 ZM 136.000 96.300 L 136.000 56.000 C 136.003 52.762 134.053 49.842 131.062 48.603 C 128.071 47.364 124.628 48.049 122.340 50.340 L 74.340 98.340 C 72.838 99.841 71.994 101.877 71.994 104.000 C 71.994 106.123 72.838 108.159 74.340 109.660 L 122.340 157.660 C 124.628 159.951 128.071 160.636 131.062 159.397 C 134.053 158.158 136.003 155.238 136.000 152.000 L 136.000 112.370 C 181.286 116.556 215.945 154.521 216.000 200.000 C 216.000 204.418 219.582 208.000 224.000 208.000 C 228.418 208.000 232.000 204.418 232.000 200.000 C 231.932 145.691 190.143 100.550 136.000 96.300 Z"),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
