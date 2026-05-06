package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorFillIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 192h-32v-24h24c2.463-0 4.789-1.135 6.305-3.077 1.516-1.942 2.053-4.473 1.455-6.863l-32-128c-.892-3.559-4.091-6.055-7.76-6.055-3.669 0-6.868 2.496-7.76 6.055l-32 128c-.597 2.39-.061 4.921 1.455 6.863 1.516 1.942 3.842 3.077 6.305 3.077h24v24h-64v-16h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-16h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v16h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v16h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h208c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM104 192h-40v-16h40ZM104 160h-40v-16h40ZM116 96c15.464 0 28-12.536 28-28C144 52.536 131.464 40 116 40 100.536 40 88 52.536 88 68c0 15.464 12.536 28 28 28ZM116 56c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null
