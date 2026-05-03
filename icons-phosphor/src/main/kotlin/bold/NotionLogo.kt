package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorBoldIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 176.000 36.000 C 169.373 36.000 164.000 41.373 164.000 48.000 C 164.000 54.627 169.373 60.000 176.000 60.000 L 184.000 60.000 L 184.000 161.280 L 118.510 42.220 C 116.403 38.386 112.375 36.002 108.000 36.000 L 40.000 36.000 C 33.373 36.000 28.000 41.373 28.000 48.000 C 28.000 54.627 33.373 60.000 40.000 60.000 L 48.000 60.000 L 48.000 196.000 L 40.000 196.000 C 33.373 196.000 28.000 201.373 28.000 208.000 C 28.000 214.627 33.373 220.000 40.000 220.000 L 80.000 220.000 C 86.627 220.000 92.000 214.627 92.000 208.000 C 92.000 201.373 86.627 196.000 80.000 196.000 L 72.000 196.000 L 72.000 94.720 L 137.490 213.780 C 139.597 217.614 143.625 219.998 148.000 220.000 L 196.000 220.000 C 202.627 220.000 208.000 214.627 208.000 208.000 L 208.000 60.000 L 216.000 60.000 C 222.627 60.000 228.000 54.627 228.000 48.000 C 228.000 41.373 222.627 36.000 216.000 36.000 ZM 80.300 60.000 L 100.900 60.000 L 175.700 196.000 L 155.100 196.000 Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
