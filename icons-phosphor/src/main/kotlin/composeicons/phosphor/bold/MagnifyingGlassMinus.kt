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
                pathData = parseSvgPathData("M156 112c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM232.49 232.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L168 185C129.493 214.55 74.664 209.151 42.66 172.658 10.656 136.166 12.458 81.101 46.78 46.78 81.101 12.458 136.166 10.656 172.658 42.66 209.151 74.664 214.55 129.493 185 168l47.54 47.53c4.665 4.699 4.643 12.289-.05 16.96ZM112 180c37.555 0 68-30.445 68-68C180 74.445 149.555 44 112 44 74.445 44 44 74.445 44 112c.044 37.537 30.463 67.956 68 68Z"),
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
