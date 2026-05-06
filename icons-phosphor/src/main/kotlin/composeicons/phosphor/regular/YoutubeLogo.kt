package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorRegularIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.44 121.34l-48-32c-2.455-1.638-5.614-1.791-8.216-.398C105.622 90.335 103.998 93.048 104 96v64c-.002 2.952 1.622 5.665 4.224 7.058 2.602 1.393 5.76 1.24 8.216-.398l48-32c2.229-1.483 3.568-3.983 3.568-6.66 0-2.677-1.339-5.177-3.568-6.66ZM120 145.05v-34.05l25.58 17ZM234.33 69.52C232.418 62.041 227.026 55.938 219.84 53.12 185.56 39.88 131 40 128 40c-3 0-57.56-.12-91.84 13.12C28.974 55.938 23.582 62.041 21.67 69.52 19.08 79.5 16 97.74 16 128c0 30.26 3.08 48.5 5.67 58.48 1.909 7.483 7.301 13.59 14.49 16.41C69 215.56 120.4 216 127.34 216h1.32c6.94 0 58.37-.44 91.18-13.11 7.189-2.82 12.581-8.927 14.49-16.41C236.92 176.48 240 158.26 240 128c0-30.26-3.08-48.5-5.67-58.48ZM218.84 182.52c-.618 2.489-2.392 4.53-4.77 5.49-31.65 12.22-85.48 12-86 12h-.07c-.54 0-54.33 .2-86-12-2.378-.96-4.152-3.001-4.77-5.49C34.8 173.39 32 156.57 32 128 32 99.43 34.8 82.61 37.16 73.53c.607-2.504 2.382-4.562 4.77-5.53C72.45 56.21 123.59 56 127.78 56h.27c.54 0 54.38-.18 86 12 2.378 .96 4.152 3.001 4.77 5.49C221.2 82.61 224 99.43 224 128c0 28.57-2.8 45.39-5.16 54.47Z"),
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
