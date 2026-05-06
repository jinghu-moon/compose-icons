package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) return _redditLogo!!
        _redditLogo = phosphorLightIcon(
            name = "RedditLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 104C245.995 92.014 238.857 81.18 227.844 76.448c-11.013-4.732-23.785-2.455-32.484 5.792C178 72.75 157 67.17 135.05 66.18l5.89-35.35 21.16 3.26c1.038 10.93 9.976 19.421 20.944 19.899 10.969 .478 20.611-7.205 22.595-18.003C207.623 25.187 201.342 14.579 190.92 11.126 180.498 7.673 169.126 12.433 164.27 22.28L136.91 18.07c-3.241-.5-6.283 1.696-6.83 4.93l-7.18 43.09c-22.64 .74-44.41 6.38-62.26 16.15C52.741 74.589 41.288 71.873 30.794 75.162 20.3 78.452 12.447 87.22 10.329 98.011c-2.118 10.792 1.839 21.877 10.311 28.889C18.896 132.433 18.006 138.199 18 144c0 21.26 11.74 41.09 33.05 55.84C71.68 214.13 99 222 128 222c29 0 56.32-7.87 76.95-22.16C226.26 185.09 238 165.26 238 144c-.003-5.801-.889-11.567-2.63-17.1C242.092 121.188 245.976 112.82 246 104ZM184 22c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10ZM225.15 119.51c-2.586 1.534-3.637 4.744-2.46 7.51 2.176 5.397 3.299 11.161 3.31 16.98 0 36.39-44 66-98 66C74 210 30 180.39 30 144c.012-5.805 1.132-11.555 3.3-16.94 1.203-2.774 .153-6.01-2.45-7.55-6.289-3.724-9.703-10.881-8.638-18.112C23.277 94.168 28.609 88.298 35.705 86.546c7.096-1.752 14.547 .96 18.855 6.864 1.79 2.46 5.138 3.19 7.79 1.7 .117-.061 .23-.127 .34-.2C80.7 84 103.89 78 128 78h0c24.1 0 47.28 6 65.29 16.9l.16 .11c2.675 1.641 6.162 .943 8-1.6 4.309-5.904 11.76-8.616 18.855-6.864 7.096 1.752 12.427 7.621 13.492 14.852 1.065 7.231-2.348 14.388-8.638 18.112ZM165.3 173.19c1.551 2.927 .437 6.558-2.49 8.11-21.767 11.559-47.853 11.559-69.62 0-2.856-1.587-3.918-5.168-2.387-8.055 1.531-2.887 5.09-4.018 8.007-2.545 18.251 9.7 40.129 9.7 58.38 0 2.927-1.551 6.558-.437 8.11 2.49ZM88 142c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM182 128c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
