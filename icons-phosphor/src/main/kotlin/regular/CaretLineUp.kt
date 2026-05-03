package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorRegularIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 197.660 C 212.159 199.162 210.123 200.006 208.000 200.006 C 205.877 200.006 203.841 199.162 202.340 197.660 L 128.000 123.310 L 53.660 197.660 C 50.534 200.786 45.466 200.786 42.340 197.660 C 39.214 194.534 39.214 189.466 42.340 186.340 L 122.340 106.340 C 123.841 104.838 125.877 103.994 128.000 103.994 C 130.123 103.994 132.159 104.838 133.660 106.340 L 213.660 186.340 C 215.162 187.841 216.006 189.877 216.006 192.000 C 216.006 194.123 215.162 196.159 213.660 197.660 ZM 48.000 80.000 L 208.000 80.000 C 212.418 80.000 216.000 76.418 216.000 72.000 C 216.000 67.582 212.418 64.000 208.000 64.000 L 48.000 64.000 C 43.582 64.000 40.000 67.582 40.000 72.000 C 40.000 76.418 43.582 80.000 48.000 80.000 Z"),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
