package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorRegularIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 77.660 L 101.660 205.660 C 100.159 207.162 98.123 208.006 96.000 208.006 C 93.877 208.006 91.841 207.162 90.340 205.660 L 34.340 149.660 C 31.214 146.534 31.214 141.466 34.340 138.340 C 37.466 135.214 42.534 135.214 45.660 138.340 L 96.000 188.690 L 218.340 66.340 C 221.466 63.214 226.534 63.214 229.660 66.340 C 232.786 69.466 232.786 74.534 229.660 77.660 Z"),
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
        return _check!!
    }

private var _check: ImageVector? = null
