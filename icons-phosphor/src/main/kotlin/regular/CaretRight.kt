package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = phosphorRegularIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 181.660 133.660 L 101.660 213.660 C 98.534 216.786 93.466 216.786 90.340 213.660 C 87.214 210.534 87.214 205.466 90.340 202.340 L 164.690 128.000 L 90.340 53.660 C 87.214 50.534 87.214 45.466 90.340 42.340 C 93.466 39.214 98.534 39.214 101.660 42.340 L 181.660 122.340 C 183.162 123.841 184.006 125.877 184.006 128.000 C 184.006 130.123 183.162 132.159 181.660 133.660 Z"),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
