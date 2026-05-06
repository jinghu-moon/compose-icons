package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) return _redditLogo!!
        _redditLogo = phosphorFillIcon(
            name = "RedditLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 104C247.997 91.477 240.689 80.107 229.299 74.902c-11.39-5.205-24.77-3.287-34.239 4.908C178.31 70.91 158.3 65.53 137.4 64.28l5.19-31.17 17.72 2.72c1.856 11.541 11.757 20.066 23.445 20.188 11.688 .122 21.765-8.194 23.861-19.694C209.713 24.825 203.22 13.487 192.241 9.476 181.262 5.465 168.99 9.947 163.18 20.09l-26-4c-4.329-.667-8.389 2.27-9.11 6.59l-6.87 41.48C99.36 65.1 78.38 70.54 60.94 79.81 47.696 68.622 27.952 70.015 16.411 82.952 4.87 95.889 5.729 115.664 18.35 127.55 16.795 132.895 16.003 138.433 16 144c0 21.93 12 42.35 33.91 57.49C70.88 216 98.61 224 128 224c29.39 0 57.12-8 78.09-22.51C228 186.35 240 165.93 240 144c-.003-5.567-.795-11.105-2.35-16.45C244.226 121.482 247.976 112.948 248 104ZM72 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM163.75 183.07c-22.353 11.879-49.147 11.879-71.5 0-3.905-2.071-5.391-6.915-3.32-10.82 2.071-3.905 6.915-5.391 10.82-3.32 17.663 9.39 38.837 9.39 56.5 0 3.905-2.071 8.749-.585 10.82 3.32 2.071 3.905 .585 8.749-3.32 10.82ZM168 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _redditLogo!!
    }

private var _redditLogo: ImageVector? = null
