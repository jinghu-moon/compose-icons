package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = phosphorRegularIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 40.000 C 126.668 40.026 96.206 58.862 81.290 88.670 C 57.575 85.211 33.915 95.292 19.981 114.792 C 6.048 134.291 4.177 159.941 15.132 181.256 C 26.088 202.572 48.034 215.980 72.000 216.000 L 160.000 216.000 C 208.601 216.000 248.000 176.601 248.000 128.000 C 248.000 79.399 208.601 40.000 160.000 40.000 ZM 160.000 200.000 L 72.000 200.000 C 45.490 200.000 24.000 178.510 24.000 152.000 C 24.000 125.490 45.490 104.000 72.000 104.000 C 73.100 104.000 74.200 104.000 75.290 104.110 C 73.102 111.885 71.995 119.923 72.000 128.000 C 72.000 132.418 75.582 136.000 80.000 136.000 C 84.418 136.000 88.000 132.418 88.000 128.000 C 88.000 88.235 120.235 56.000 160.000 56.000 C 199.764 56.000 232.000 88.235 232.000 128.000 C 232.000 167.764 199.764 200.000 160.000 200.000 Z"),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
