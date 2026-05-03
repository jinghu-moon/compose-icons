package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorRegularIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 165.660 C 212.159 167.162 210.123 168.006 208.000 168.006 C 205.877 168.006 203.841 167.162 202.340 165.660 L 128.000 91.310 L 53.660 165.660 C 50.534 168.786 45.466 168.786 42.340 165.660 C 39.214 162.534 39.214 157.466 42.340 154.340 L 122.340 74.340 C 123.841 72.838 125.877 71.994 128.000 71.994 C 130.123 71.994 132.159 72.838 133.660 74.340 L 213.660 154.340 C 215.162 155.841 216.006 157.877 216.006 160.000 C 216.006 162.123 215.162 164.159 213.660 165.660 Z"),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
