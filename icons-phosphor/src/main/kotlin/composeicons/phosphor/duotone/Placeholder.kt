package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Placeholder: ImageVector
    get() {
        if (_placeholder != null) return _placeholder!!
        _placeholder = phosphorDuotoneIcon(
            name = "Placeholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v160c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 48c0-8.837-7.163-16-16-16h-160c-3.938 0-7.737 1.461-10.66 4.1-.452 .372-.868 .788-1.24 1.24C33.461 40.263 32 44.062 32 48v160c0 8.837 7.163 16 16 16h160c3.938-0 7.737-1.461 10.66-4.1 .228-.184 .445-.381 .65-.59 .209-.202 .403-.42 .58-.65 2.646-2.92 4.111-6.72 4.11-10.66ZM208 196.7 59.31 48h148.69ZM48 59.31 196.69 208h-148.69Z"),
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
        return _placeholder!!
    }

private var _placeholder: ImageVector? = null
