package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorFillIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M64 80v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8h-40C3.582 176 0 172.418 0 168v-80C0 83.582 3.582 80 8 80h40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM256 88v80c0 4.418-3.582 8-8 8h-58.17c-2.853 4.942-8.123 7.991-13.83 8h-64c-5.707-.009-10.977-3.058-13.83-8h-14.17c-2.209 0-4-1.791-4-4v-88c0-2.209 1.791-4 4-4h14.17c2.853-4.942 8.123-7.991 13.83-8h64c5.707 .009 10.977 3.058 13.83 8h58.17c4.418 0 8 3.582 8 8ZM176 167.8v-31.8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-32h-64v80h64c0-.07 0-.13 0-.2Z"),
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
