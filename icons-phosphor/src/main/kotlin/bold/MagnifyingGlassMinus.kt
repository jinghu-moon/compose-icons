package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorBoldIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 112.000 C 156.000 118.627 150.627 124.000 144.000 124.000 L 80.000 124.000 C 73.373 124.000 68.000 118.627 68.000 112.000 C 68.000 105.373 73.373 100.000 80.000 100.000 L 144.000 100.000 C 150.627 100.000 156.000 105.373 156.000 112.000 ZM 232.490 232.490 C 230.238 234.749 227.180 236.019 223.990 236.019 C 220.800 236.019 217.742 234.749 215.490 232.490 L 168.000 185.000 C 129.493 214.550 74.664 209.151 42.660 172.658 C 10.656 136.166 12.458 81.101 46.780 46.780 C 81.101 12.458 136.166 10.656 172.658 42.660 C 209.151 74.664 214.550 129.493 185.000 168.000 L 232.540 215.530 C 237.205 220.229 237.183 227.819 232.490 232.490 ZM 112.000 180.000 C 149.555 180.000 180.000 149.555 180.000 112.000 C 180.000 74.445 149.555 44.000 112.000 44.000 C 74.445 44.000 44.000 74.445 44.000 112.000 C 44.044 149.537 74.463 179.956 112.000 180.000 Z"),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
