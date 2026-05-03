package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorFillIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 215.390 163.060 C 214.152 166.050 211.236 167.999 208.000 168.000 L 48.000 168.000 C 44.762 168.003 41.842 166.053 40.603 163.062 C 39.364 160.071 40.049 156.628 42.340 154.340 L 122.340 74.340 C 123.841 72.838 125.877 71.994 128.000 71.994 C 130.123 71.994 132.159 72.838 133.660 74.340 L 213.660 154.340 C 215.947 156.629 216.630 160.071 215.390 163.060 Z"),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
