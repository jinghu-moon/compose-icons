package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorFillIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 64h-240C3.582 64 0 67.582 0 72c0 4.418 3.582 8 8 8h8v112c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h192v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-112h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM80 112h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM136 120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 112h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
