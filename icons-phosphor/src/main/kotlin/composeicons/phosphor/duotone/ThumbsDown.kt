package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorDuotoneIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 48v104h-48c-4.418 0-8-3.582-8-8v-88c0-4.418 3.582-8 8-8Z"),
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
                pathData = parseSvgPathData("M239.82 157l-12-96C226.308 48.997 216.098 39.996 204 40h-172C23.163 40 16 47.163 16 56v88c0 8.837 7.163 16 16 16h43.06l37.78 75.58c1.357 2.711 4.129 4.422 7.16 4.42 22.091 0 40-17.909 40-40v-16h56c6.889 .002 13.448-2.956 18.006-8.122 4.558-5.166 6.676-12.042 5.814-18.878ZM72 144h-40v-88h40ZM222 165.29c-1.509 1.736-3.7 2.725-6 2.71h-64c-4.418 0-8 3.582-8 8v24c.003 11.442-8.071 21.295-19.29 23.54L88 150.11v-94.11h116c4.033-.001 7.436 2.999 7.94 7l12 96c.303 2.279-.405 4.577-1.94 6.29Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
