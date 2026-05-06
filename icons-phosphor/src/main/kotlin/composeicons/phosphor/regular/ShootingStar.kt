package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorRegularIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.35 70.08c-1.667-5.202-6.323-8.873-11.77-9.28L190.64 57.88 176.43 24.22C174.308 19.237 169.416 16.003 164 16.003c-5.416 0-10.308 3.234-12.43 8.217L137.36 57.88l-36.94 2.92c-5.426 .4-10.07 4.043-11.751 9.217-1.681 5.174-.064 10.851 4.091 14.363l28.06 23.68-8.56 35.39c-1.273 5.242 .74 10.734 5.1 13.91 4.4 3.243 10.321 3.516 15 .69L164 139l31.65 19.06c4.681 2.818 10.597 2.545 15-.69 4.351-3.182 6.36-8.671 5.09-13.91l-8.56-35.39L235.24 84.39c4.157-3.488 5.783-9.148 4.11-14.31ZM193.08 99c-2.316 1.957-3.326 5.054-2.61 8l8.28 34.21L168.13 122.8c-2.538-1.527-5.712-1.527-8.25 0l-30.62 18.43L137.54 107c.714-2.948-.301-6.046-2.62-8L108 76.26l35.52-2.81c2.98-.236 5.58-2.115 6.74-4.87L164 35.91l13.79 32.67c1.16 2.755 3.76 4.633 6.74 4.87l35.53 2.81ZM88.08 123.18 29.66 181.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L76.79 111.89c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM98.89 173.05c3.122 3.124 3.122 8.186 0 11.31L45.66 237.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L87.61 173.08c3.124-3.122 8.186-3.122 11.31 0ZM171.89 172.05c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-54.28 54.28c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l54.29-54.28c1.503-1.513 3.549-2.363 5.682-2.361 2.133 .002 4.177 .856 5.678 2.371Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
