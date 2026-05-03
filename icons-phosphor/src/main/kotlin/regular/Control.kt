package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorRegularIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 125.660 C 204.159 127.162 202.123 128.006 200.000 128.006 C 197.877 128.006 195.841 127.162 194.340 125.660 L 128.000 59.310 L 61.660 125.660 C 58.534 128.786 53.466 128.786 50.340 125.660 C 47.214 122.534 47.214 117.466 50.340 114.340 L 122.340 42.340 C 123.841 40.838 125.877 39.994 128.000 39.994 C 130.123 39.994 132.159 40.838 133.660 42.340 L 205.660 114.340 C 207.162 115.841 208.006 117.877 208.006 120.000 C 208.006 122.123 207.162 124.159 205.660 125.660 Z"),
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
