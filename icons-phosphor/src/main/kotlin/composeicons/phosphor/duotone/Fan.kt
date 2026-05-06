package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorDuotoneIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136.5 150.45c2.593 19.489-6.027 38.774-22.278 49.84-16.251 11.066-37.354 12.02-54.537 2.466C42.502 193.202 32.176 174.774 33 155.13l71.91-20.54h0c2.944 10.309 12.369 17.416 23.09 17.41 2.905 .004 5.786-.525 8.5-1.56ZM104.31 124.14h0c1.08-6.627 4.887-12.499 10.497-16.19 5.61-3.69 12.509-4.862 19.023-3.23h0L152 32.17C135.398 21.69 114.31 21.454 97.477 31.56 80.645 41.665 70.939 60.389 72.384 79.968c1.445 19.579 13.793 36.676 31.926 44.202ZM201 105.5c-18.285-10.562-41.142-9.016-57.84 3.91h0c5.195 4.249 8.374 10.478 8.765 17.178 .391 6.7-2.04 13.257-6.705 18.082h0l53.74 52c16.861-8.757 27.604-26.013 28.021-45.007 .417-18.995-9.56-36.705-26.021-46.193Z"),
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
                pathData = parseSvgPathData("M233 135C228.087 116.65 214.775 101.71 197.111 94.723c-17.665-6.987-37.594-5.197-53.731 4.827L159.77 34.11c.834-3.334-.555-6.828-3.45-8.68C137.793 13.731 114.362 13.062 95.198 23.685 76.033 34.307 64.183 54.532 64.286 76.443c.103 21.911 12.141 42.024 31.404 52.467L30.82 147.44c-3.305 .941-5.639 3.888-5.8 7.32-1.268 28.14 17.21 53.374 44.42 60.66 5.094 1.368 10.345 2.064 15.62 2.07 16.239-.043 31.768-6.659 43.049-18.339 11.281-11.68 17.353-27.431 16.831-43.661l48.48 46.92c2.472 2.392 6.197 2.936 9.25 1.35C227.66 190.794 240.274 162.197 233 135ZM112 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM80 76C79.995 60.931 87.701 46.908 100.425 38.834c12.723-8.074 28.693-9.075 42.325-2.654L127.77 96c-11.674 .088-22.375 6.526-27.92 16.8C87.434 104.681 79.966 90.835 80 76ZM107 195.57c-13.047 7.539-29.044 7.877-42.398 .896C51.249 189.485 42.396 176.156 41.14 161.14l59.31-16.94c5.737 9.774 16.217 15.784 27.55 15.8h.91c-.818 14.799-9.061 28.182-21.91 35.57ZM213.17 172.57c-3.237 5.615-7.676 10.444-13 14.14L155.85 143.82c5.777-10.147 5.551-22.639-.59-32.57 17.377-8.772 38.453-5.084 51.818 9.068 13.365 14.152 15.843 35.404 6.092 52.252Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
