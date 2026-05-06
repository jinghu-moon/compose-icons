package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorRegularIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 4.418-3.582 8-8 8h-40.07c9.19 7.11 16.07 17.2 16.07 32 0 13.34-7 25.7-19.75 34.79C160.33 211.31 144.61 216 128 216c-16.61 0-32.33-4.69-44.25-13.21C71 193.7 64 181.34 64 168c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 17.35 22 32 48 32 26 0 48-14.65 48-32 0-14.85-10.54-23.58-38.77-32h-97.23c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM76.33 104c2.565 .002 4.976-1.226 6.483-3.302 1.506-2.077 1.926-4.75 1.127-7.188C83.367 91.73 83.087 89.869 83.11 88 83.11 69.76 102.41 56 128 56c18.84 0 34.16 7.42 41 19.85 2.244 3.615 6.924 4.841 10.652 2.791 3.728-2.05 5.199-6.66 3.348-10.491C173.33 50.52 152.77 40 128 40 93.29 40 67.11 60.63 67.11 88c-.017 3.56 .53 7.101 1.62 10.49 1.076 3.286 4.142 5.509 7.6 5.51Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
