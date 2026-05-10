package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorFillIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 80v40c0 4.418-3.582 8-8 8-16.712 .039-33.183-3.98-48-11.71v39.71c0 41.974-34.026 76-76 76C58.026 232 24 197.974 24 156 24 119.1 50.91 86.48 86.6 80.12c2.331-.414 4.725 .225 6.539 1.746C94.954 83.387 96.001 85.633 96 88v42.69c.001 3.09-1.778 5.905-4.57 7.23-8.953 4.246-13.447 14.407-10.566 23.887 2.881 9.48 12.27 15.422 22.071 13.967C112.737 174.32 119.995 165.908 120 156v-132c0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 .028 26.498 21.502 47.972 48 48 4.418 0 8 3.582 8 8Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
