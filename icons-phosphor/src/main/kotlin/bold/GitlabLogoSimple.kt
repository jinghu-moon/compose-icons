package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorBoldIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.000 116.090 L 214.130 40.000 C 212.391 33.231 206.446 28.384 199.466 28.044 C 192.485 27.704 186.097 31.952 183.710 38.520 L 167.000 84.000 L 89.000 84.000 L 72.290 38.490 C 69.897 31.923 63.504 27.681 56.523 28.027 C 49.542 28.374 43.601 33.228 41.870 40.000 L 22.000 116.090 C 15.585 140.617 24.959 166.559 45.570 181.320 L 118.840 233.090 C 124.345 236.971 131.695 236.971 137.200 233.090 L 210.470 181.320 C 231.066 166.548 240.423 140.608 234.000 116.090 ZM 196.600 161.720 L 128.000 210.190 L 59.400 161.720 C 46.932 152.746 41.289 137.013 45.210 122.160 L 58.610 70.860 L 69.370 100.140 C 71.106 104.864 75.607 108.003 80.640 108.000 L 175.360 108.000 C 180.393 108.003 184.894 104.864 186.630 100.140 L 197.390 70.860 L 210.790 122.160 C 214.711 137.013 209.068 152.746 196.600 161.720 Z"),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
