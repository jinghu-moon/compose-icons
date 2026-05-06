package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = phosphorThinIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-160C36.954 44 28 52.954 28 64v112c0 11.046 8.954 20 20 20h76v24h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-24h76c11.046 0 20-8.954 20-20v-112C228 52.954 219.046 44 208 44ZM48 52h160c6.627 0 12 5.373 12 12v84h-184v-84C36 57.373 41.373 52 48 52ZM208 188h-160c-6.627 0-12-5.373-12-12v-20h184v20c0 6.627-5.373 12-12 12Z"),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
