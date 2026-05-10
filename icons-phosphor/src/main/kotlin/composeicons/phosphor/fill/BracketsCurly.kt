package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorFillIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM88 155.84c.29 14.26 .41 20.16 16 20.16 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C72.73 192 72.28 169.57 72 156.16 71.71 141.9 71.59 136 56 136c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 15.59 0 15.71-5.9 16-20.16C72.28 86.43 72.73 64 104 64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C88.41 80 88.29 85.9 88 100.16c-.17 8.31-.41 20.09-8 27.84 7.59 7.75 7.83 19.53 8 27.84ZM200 136c-15.59 0-15.71 5.9-16 20.16-.28 13.41-.73 35.84-32 35.84-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 15.59 0 15.71-5.9 16-20.16 .17-8.31 .41-20.09 8-27.84-7.6-7.75-7.84-19.53-8-27.84C167.71 85.9 167.59 80 152 80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 31.27 0 31.72 22.43 32 35.84 .29 14.26 .41 20.16 16 20.16 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
