package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorFillIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.390 123.060 C 206.152 126.050 203.236 127.999 200.000 128.000 L 56.000 128.000 C 52.762 128.003 49.842 126.053 48.603 123.062 C 47.364 120.071 48.049 116.628 50.340 114.340 L 122.340 42.340 C 123.841 40.838 125.877 39.994 128.000 39.994 C 130.123 39.994 132.159 40.838 133.660 42.340 L 205.660 114.340 C 207.947 116.629 208.630 120.071 207.390 123.060 Z"),
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
        return _control!!
    }

private var _control: ImageVector? = null
