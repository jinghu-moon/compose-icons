package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorFillIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v176c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h72v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h72v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-176c0-8.837-7.163-16-16-16ZM96 112h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM96 80h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM136 184c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 112h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 80h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
