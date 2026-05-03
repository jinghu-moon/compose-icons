package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorRegularIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 200.000 C 232.000 204.418 228.418 208.000 224.000 208.000 C 219.582 208.000 216.000 204.418 216.000 200.000 C 215.945 151.422 176.578 112.055 128.000 112.000 L 51.310 112.000 L 85.660 146.340 C 88.786 149.466 88.786 154.534 85.660 157.660 C 82.534 160.786 77.466 160.786 74.340 157.660 L 26.340 109.660 C 24.838 108.159 23.994 106.123 23.994 104.000 C 23.994 101.877 24.838 99.841 26.340 98.340 L 74.340 50.340 C 77.466 47.214 82.534 47.214 85.660 50.340 C 88.786 53.466 88.786 58.534 85.660 61.660 L 51.310 96.000 L 128.000 96.000 C 185.412 96.061 231.939 142.588 232.000 200.000 Z"),
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
