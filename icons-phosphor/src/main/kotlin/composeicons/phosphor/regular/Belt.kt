package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorRegularIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 160h-56v-64h56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-58.17C186.977 75.058 181.707 72.009 176 72h-64c-5.707 .009-10.977 3.058-13.83 8h-34.17c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8h-40C3.582 80 0 83.582 0 88c0 4.418 3.582 8 8 8h40v64h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8h34.17c2.853 4.942 8.123 7.991 13.83 8h64c5.707-.009 10.977-3.058 13.83-8h58.17c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM64 96h32v64h-32ZM112 168v-80h64v32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v31.8c0 .07 0 .13 0 .2Z"),
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
