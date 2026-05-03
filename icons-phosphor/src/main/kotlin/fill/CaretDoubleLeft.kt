package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorFillIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 48.000 L 208.000 208.000 C 208.003 211.238 206.053 214.158 203.062 215.397 C 200.071 216.636 196.628 215.951 194.340 213.660 L 128.000 147.310 L 128.000 208.000 C 128.003 211.238 126.053 214.158 123.062 215.397 C 120.071 216.636 116.628 215.951 114.340 213.660 L 34.340 133.660 C 32.838 132.159 31.994 130.123 31.994 128.000 C 31.994 125.877 32.838 123.841 34.340 122.340 L 114.340 42.340 C 116.628 40.049 120.071 39.364 123.062 40.603 C 126.053 41.842 128.003 44.762 128.000 48.000 L 128.000 108.690 L 194.340 42.340 C 196.628 40.049 200.071 39.364 203.062 40.603 C 206.053 41.842 208.003 44.762 208.000 48.000 Z"),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
