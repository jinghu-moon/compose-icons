package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorRegularIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 194.340 C 208.786 197.466 208.786 202.534 205.660 205.660 C 202.534 208.786 197.466 208.786 194.340 205.660 L 128.000 139.310 L 61.660 205.660 C 58.534 208.786 53.466 208.786 50.340 205.660 C 47.214 202.534 47.214 197.466 50.340 194.340 L 116.690 128.000 L 50.340 61.660 C 47.214 58.534 47.214 53.466 50.340 50.340 C 53.466 47.214 58.534 47.214 61.660 50.340 L 128.000 116.690 L 194.340 50.340 C 197.466 47.214 202.534 47.214 205.660 50.340 C 208.786 53.466 208.786 58.534 205.660 61.660 L 139.310 128.000 Z"),
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
        return _x!!
    }

private var _x: ImageVector? = null
