package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorFillIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 194.340 C 215.951 196.628 216.636 200.071 215.397 203.062 C 214.158 206.053 211.238 208.003 208.000 208.000 L 48.000 208.000 C 44.762 208.003 41.842 206.053 40.603 203.062 C 39.364 200.071 40.049 196.628 42.340 194.340 L 108.690 128.000 L 48.000 128.000 C 44.762 128.003 41.842 126.053 40.603 123.062 C 39.364 120.071 40.049 116.628 42.340 114.340 L 122.340 34.340 C 123.841 32.838 125.877 31.994 128.000 31.994 C 130.123 31.994 132.159 32.838 133.660 34.340 L 213.660 114.340 C 215.951 116.628 216.636 120.071 215.397 123.062 C 214.158 126.053 211.238 128.003 208.000 128.000 L 147.310 128.000 Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
