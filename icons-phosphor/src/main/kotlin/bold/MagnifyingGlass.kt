package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorBoldIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 215.510 L 185.000 168.000 C 214.550 129.493 209.151 74.664 172.658 42.660 C 136.166 10.656 81.101 12.458 46.780 46.780 C 12.458 81.101 10.656 136.166 42.660 172.658 C 74.664 209.151 129.493 214.550 168.000 185.000 L 215.530 232.540 C 220.224 237.234 227.836 237.234 232.530 232.540 C 237.224 227.846 237.224 220.234 232.530 215.540 ZM 44.000 112.000 C 44.000 74.445 74.445 44.000 112.000 44.000 C 149.555 44.000 180.000 74.445 180.000 112.000 C 180.000 149.555 149.555 180.000 112.000 180.000 C 74.461 179.961 44.039 149.539 44.000 112.000 Z"),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
