package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorRegularIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
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
