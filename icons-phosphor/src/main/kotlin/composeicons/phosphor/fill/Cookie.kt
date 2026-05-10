package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorFillIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 120c-22.091 0-40-17.909-40-40 0-4.418-3.582-8-8-8C153.909 72 136 54.091 136 32c0-4.418-3.582-8-8-8C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104 0-4.418-3.582-8-8-8ZM75.51 99.51c4.691-4.674 12.281-4.666 16.961 .02 4.68 4.685 4.68 12.276 0 16.961-4.68 4.685-12.27 4.694-16.961 .02-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5ZM100.51 172.51c-4.691 4.674-12.281 4.666-16.961-.02-4.68-4.685-4.68-12.276 0-16.961 4.68-4.685 12.27-4.694 16.961-.02 2.251 2.253 3.513 5.309 3.509 8.494-.004 3.185-1.273 6.238-3.529 8.486ZM123.51 132.51c-4.674-4.691-4.666-12.281 .02-16.961 4.685-4.68 12.276-4.68 16.961 0 4.685 4.68 4.694 12.27 .02 16.961-2.254 2.257-5.314 3.523-8.504 3.519-3.19-.004-6.247-1.277-8.496-3.539ZM164.51 180.51c-4.691 4.674-12.281 4.666-16.961-.02-4.68-4.685-4.68-12.276 0-16.961 4.68-4.685 12.27-4.694 16.961-.02 2.251 2.253 3.513 5.309 3.509 8.494-.004 3.185-1.273 6.238-3.529 8.486Z"),
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
