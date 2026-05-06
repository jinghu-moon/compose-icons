package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorRegularIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 208c0 4.418-3.582 8-8 8h-16c-12.59 0-24.446-5.928-32-16-7.554 10.072-19.41 16-32 16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c13.255 0 24-10.745 24-24v-40h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-40C120 66.745 109.255 56 96 56h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c12.59 0 24.446 5.928 32 16 7.554-10.072 19.41-16 32-16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-13.255 0-24 10.745-24 24v40h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v40c0 13.255 10.745 24 24 24h16c4.418 0 8 3.582 8 8Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
