package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorRegularIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.660 202.340 C 208.786 205.466 208.786 210.534 205.660 213.660 C 202.534 216.786 197.466 216.786 194.340 213.660 L 114.340 133.660 C 112.838 132.159 111.994 130.123 111.994 128.000 C 111.994 125.877 112.838 123.841 114.340 122.340 L 194.340 42.340 C 197.466 39.214 202.534 39.214 205.660 42.340 C 208.786 45.466 208.786 50.534 205.660 53.660 L 131.310 128.000 ZM 51.310 128.000 L 125.660 53.660 C 128.786 50.534 128.786 45.466 125.660 42.340 C 122.534 39.214 117.466 39.214 114.340 42.340 L 34.340 122.340 C 32.838 123.841 31.994 125.877 31.994 128.000 C 31.994 130.123 32.838 132.159 34.340 133.660 L 114.340 213.660 C 117.466 216.786 122.534 216.786 125.660 213.660 C 128.786 210.534 128.786 205.466 125.660 202.340 Z"),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
