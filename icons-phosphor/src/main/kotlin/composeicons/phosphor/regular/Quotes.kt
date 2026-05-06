package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorRegularIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 56h-60C31.163 56 24 63.163 24 72v64c0 8.837 7.163 16 16 16h60v8c0 17.673-14.327 32-32 32-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 26.498-.028 47.972-21.502 48-48v-88c0-8.837-7.163-16-16-16ZM100 136h-60v-64h60ZM216 56h-60c-8.837 0-16 7.163-16 16v64c0 8.837 7.163 16 16 16h60v8c0 17.673-14.327 32-32 32-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 26.498-.028 47.972-21.502 48-48v-88c0-8.837-7.163-16-16-16ZM216 136h-60v-64h60Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
