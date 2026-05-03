package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorRegularIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.500 113.000 L 166.060 89.940 L 143.000 26.500 C 140.672 20.229 134.689 16.068 128.000 16.068 C 121.311 16.068 115.328 20.229 113.000 26.500 L 89.940 89.940 L 26.500 113.000 C 20.229 115.328 16.068 121.311 16.068 128.000 C 16.068 134.689 20.229 140.672 26.500 143.000 L 89.940 166.070 L 113.000 229.500 C 115.328 235.771 121.311 239.932 128.000 239.932 C 134.689 239.932 140.672 235.771 143.000 229.500 L 166.070 166.060 L 229.500 143.000 C 235.771 140.672 239.932 134.689 239.932 128.000 C 239.932 121.311 235.771 115.328 229.500 113.000 ZM 157.080 152.300 C 154.859 153.109 153.109 154.859 152.300 157.080 L 128.000 223.900 L 103.700 157.080 C 102.891 154.859 101.141 153.109 98.920 152.300 L 32.100 128.000 L 98.920 103.700 C 101.141 102.891 102.891 101.141 103.700 98.920 L 128.000 32.100 L 152.300 98.920 C 153.109 101.141 154.859 102.891 157.080 103.700 L 223.900 128.000 Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
