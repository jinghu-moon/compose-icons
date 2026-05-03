package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorThinIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 203.610 201.710 C 202.950 203.106 201.545 203.998 200.000 204.000 C 199.408 204.003 198.822 203.870 198.290 203.610 L 46.290 131.610 C 44.893 130.948 44.002 129.541 44.002 127.995 C 44.002 126.449 44.893 125.042 46.290 124.380 L 198.290 52.380 C 200.276 51.493 202.607 52.356 203.537 54.322 C 204.467 56.288 203.655 58.637 201.710 59.610 L 57.340 128.000 L 201.710 196.380 C 202.669 196.835 203.408 197.652 203.764 198.651 C 204.121 199.651 204.065 200.751 203.610 201.710 Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
