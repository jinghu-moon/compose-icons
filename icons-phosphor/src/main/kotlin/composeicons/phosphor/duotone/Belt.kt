package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorDuotoneIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 88h96v80h-96ZM184 88v80h64v-80Z"),
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
                pathData = parseSvgPathData("M248 160h-56v-64h56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-58.16C186.985 75.055 181.71 72.006 176 72h-64c-5.71 .006-10.985 3.055-13.84 8h-34.16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8h-40C3.582 80 0 83.582 0 88c0 4.418 3.582 8 8 8h40v64h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8h34.16c2.855 4.945 8.13 7.994 13.84 8h64c5.71-.006 10.985-3.055 13.84-8h58.16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM64 96h32v64h-32ZM112 168v-80h64v32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v31.8c0 .07 0 .13 0 .2Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
