package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorRegularIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 64c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8ZM40 136h120c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM112 184h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM247.66 126.3c-.61 2.04-2.008 3.753-3.885 4.759-1.877 1.006-4.078 1.222-6.115 .601L208 122.75v69.25c.023 14.513-9.709 27.231-23.724 31.001-14.015 3.77-28.815-2.348-36.076-14.915-7.261-12.566-5.172-28.444 5.094-38.704 10.265-10.26 26.144-12.341 38.707-5.073v-52.31c.001-2.529 1.197-4.908 3.226-6.417 2.029-1.509 4.652-1.97 7.074-1.243l40 12c4.23 1.271 6.629 5.73 5.36 9.96ZM192 192c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
