package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorBoldIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.09 67.41C249.233 62.924 244.855 59.999 240 60h-28.18C202.2 45.193 185.807 36.183 168.15 36c-13.703-.184-26.899 5.17-36.6 14.85C121.575 60.634 115.968 74.028 116 88v.78C79.17 77.21 49.62 47.88 49.3 47.55 46.013 44.237 41.103 43.131 36.712 44.714c-4.391 1.583-7.465 5.568-7.882 10.216-6.31 70.17 24.65 107.79 42.06 123.12C56.4 192.83 36 200.68 35.8 200.76c-3.436 1.279-6.099 4.059-7.229 7.547-1.13 3.488-.604 7.301 1.429 10.353C32 221.55 43.44 236 80 236c72.25 0 132.7-55.26 139.6-126.63L248.48 80.49c3.436-3.43 4.466-8.593 2.61-13.08ZM199.52 95.52c-2.069 2.06-3.31 4.806-3.49 7.72C192.14 164.23 141.18 212 80 212c-4.177 .024-8.35-.24-12.49-.79C78 204.55 89.72 195.07 98 182.66c1.831-2.746 2.45-6.124 1.712-9.34-.738-3.216-2.768-5.987-5.612-7.66-.12-.07-12.33-7.49-23.43-24.42C59.57 124.31 53.41 104.24 52.21 81.46 69.37 94.4 96 110.79 126 115.84c3.484 .589 7.051-.388 9.749-2.67 2.698-2.282 4.253-5.637 4.251-9.17v-16c-.017-7.55 3.015-14.788 8.41-20.07 5.152-5.153 12.164-8.012 19.45-7.93 11.13 .149 21.18 6.692 25.82 16.81 1.912 4.37 6.23 7.192 11 7.19h6.32Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
