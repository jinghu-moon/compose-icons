package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorRegularIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.49 163.51c4.674 4.691 4.666 12.281-.02 16.961-4.685 4.68-12.276 4.68-16.961 0-4.685-4.68-4.694-12.27-.02-16.961 2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM83.49 155.51c-4.674 4.691-4.666 12.281 .02 16.961 4.685 4.68 12.276 4.68 16.961 0 4.685-4.68 4.694-12.27 .02-16.961C98.239 153.257 95.185 151.991 92 151.991c-3.185 0-6.239 1.266-8.49 3.519ZM92.49 116.51c4.674-4.691 4.666-12.281-.02-16.961-4.685-4.68-12.276-4.68-16.961 0-4.685 4.68-4.694 12.27-.02 16.961 2.254 2.257 5.314 3.523 8.504 3.519 3.19-.004 6.247-1.277 8.496-3.539ZM140.49 115.51c-4.691-4.674-12.281-4.666-16.961 .02-4.68 4.685-4.68 12.276 0 16.961 4.68 4.685 12.27 4.694 16.961 .02 2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c4.418 0 8 3.582 8 8 0 22.091 17.909 40 40 40 4.418 0 8 3.582 8 8 0 22.091 17.909 40 40 40 4.418 0 8 3.582 8 8ZM215.69 135.39C191.082 131.655 171.872 112.161 168.5 87.5 143.839 84.128 124.345 64.918 120.61 40.31 74.089 44.231 38.727 83.798 40.035 130.465c1.308 46.667 38.832 84.191 85.499 85.499 46.667 1.308 86.234-34.054 90.155-80.575Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
