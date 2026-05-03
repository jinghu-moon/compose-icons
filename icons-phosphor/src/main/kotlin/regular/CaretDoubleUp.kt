package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorRegularIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 194.340 C 216.786 197.466 216.786 202.534 213.660 205.660 C 210.534 208.786 205.466 208.786 202.340 205.660 L 128.000 131.310 L 53.660 205.660 C 50.534 208.786 45.466 208.786 42.340 205.660 C 39.214 202.534 39.214 197.466 42.340 194.340 L 122.340 114.340 C 123.841 112.838 125.877 111.994 128.000 111.994 C 130.123 111.994 132.159 112.838 133.660 114.340 ZM 53.660 125.660 L 128.000 51.310 L 202.340 125.660 C 205.466 128.786 210.534 128.786 213.660 125.660 C 216.786 122.534 216.786 117.466 213.660 114.340 L 133.660 34.340 C 132.159 32.838 130.123 31.994 128.000 31.994 C 125.877 31.994 123.841 32.838 122.340 34.340 L 42.340 114.340 C 39.214 117.466 39.214 122.534 42.340 125.660 C 45.466 128.786 50.534 128.786 53.660 125.660 Z"),
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
