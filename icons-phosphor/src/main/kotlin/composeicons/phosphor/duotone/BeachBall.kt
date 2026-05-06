package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorDuotoneIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M161.23 93.36C138.384 70.678 110.178 54.136 79.23 45.27 99.93 33.116 124.421 29.122 147.91 34.07c7.561 18.93 12.057 38.945 13.32 59.29ZM221.93 108.06C202.996 100.514 182.983 96.028 162.64 94.77c22.684 22.844 39.227 51.051 48.09 82 12.154-20.697 16.148-45.184 11.2-68.67ZM32.27 135.19c3.556 47.348 41.192 84.984 88.54 88.54 28.731-36.648 43.128-82.507 40.5-129C114.809 92.085 68.936 106.468 32.27 135.19Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM209.7 95.3C196.372 91.192 182.651 88.49 168.76 87.24 167.51 73.349 164.808 59.628 160.7 46.3c22.31 9.001 39.999 26.69 49 49ZM216 128c.004 9.208-1.44 18.36-4.28 27.12-7.254-17.966-17.076-34.785-29.16-49.93 11.015 1.924 21.83 4.853 32.31 8.75 .752 4.649 1.13 9.351 1.13 14.06ZM142.06 41.13c3.897 10.48 6.826 21.295 8.75 32.31C135.665 61.356 118.846 51.534 100.88 44.28c13.283-4.3 27.398-5.38 41.18-3.15ZM80.44 54c22.303 6.893 43.09 17.971 61.25 32.64C105.583 88.251 70.585 99.606 40.41 119.5 43.041 92.696 57.787 68.568 80.44 54ZM40.67 138.86c32.579-24.258 72.267-37.06 112.88-36.41 .65 40.613-12.152 80.301-36.41 112.88C77.177 210.297 45.703 178.823 40.67 138.86ZM136.5 215.59c19.898-30.174 31.256-65.172 32.87-101.28 14.666 18.16 25.74 38.947 32.63 61.25-14.568 22.653-38.696 37.399-65.5 40.03Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
