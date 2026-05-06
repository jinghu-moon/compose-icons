package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorThinIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M162.22 124.67l-48-32c-1.228-.819-2.807-.896-4.108-.199-1.301 .697-2.113 2.053-2.112 3.529v64c-.002 1.476 .809 2.833 2.11 3.53 1.302 .697 2.882 .62 4.11-.2l48-32c1.114-.742 1.784-1.991 1.784-3.33 0-1.339-.67-2.588-1.784-3.33ZM116 152.53v-49.06L152.79 128ZM230.46 70.53C228.874 64.296 224.386 59.205 218.4 56.85 184.6 43.79 130.27 44 128 44c-2.27 0-56.6-.21-90.4 12.85C31.616 59.203 27.129 64.29 25.54 70.52 23 80.27 20 98.16 20 128c0 29.84 3 47.73 5.54 57.48 1.589 6.23 6.076 11.317 12.06 13.67C71.4 212.21 125.73 212 128 212h.71c6.89 0 57.58-.43 89.72-12.85 5.984-2.353 10.471-7.44 12.06-13.67C233 175.72 236 157.84 236 128c0-29.84-3-47.73-5.54-57.48ZM222.72 183.53c-.943 3.739-3.625 6.798-7.21 8.22C183.14 204.19 128.57 204 128 204c-.57 0-55.11 .19-87.48-12.31-3.585-1.422-6.267-4.481-7.21-8.22C30.87 174.17 28 157 28 128 28 99 30.87 81.83 33.28 72.53c.943-3.739 3.625-6.798 7.21-8.22C72.86 51.81 127.43 52 128 52c.57 0 55.11-.2 87.48 12.31 3.585 1.422 6.267 4.481 7.21 8.22C225.13 81.83 228 99 228 128c0 29-2.87 46.17-5.28 55.47Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
