package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorRegularIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 72c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8ZM184 96h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM72 80h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM96 96h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 48v176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-72v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-72v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-176C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM120 192v-144h-72v144ZM136 192h72v-144h-72Z"),
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
