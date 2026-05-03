package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorRegularIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 101.660 L 133.660 181.660 C 132.159 183.162 130.123 184.006 128.000 184.006 C 125.877 184.006 123.841 183.162 122.340 181.660 L 42.340 101.660 C 39.214 98.534 39.214 93.466 42.340 90.340 C 45.466 87.214 50.534 87.214 53.660 90.340 L 128.000 164.690 L 202.340 90.340 C 205.466 87.214 210.534 87.214 213.660 90.340 C 216.786 93.466 216.786 98.534 213.660 101.660 Z"),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
