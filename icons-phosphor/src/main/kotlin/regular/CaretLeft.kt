package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorRegularIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 165.660 202.340 C 168.786 205.466 168.786 210.534 165.660 213.660 C 162.534 216.786 157.466 216.786 154.340 213.660 L 74.340 133.660 C 72.838 132.159 71.994 130.123 71.994 128.000 C 71.994 125.877 72.838 123.841 74.340 122.340 L 154.340 42.340 C 157.466 39.214 162.534 39.214 165.660 42.340 C 168.786 45.466 168.786 50.534 165.660 53.660 L 91.310 128.000 Z"),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
