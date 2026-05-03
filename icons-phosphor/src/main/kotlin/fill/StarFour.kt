package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorFillIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 128.000 C 240.052 134.726 235.838 140.747 229.500 143.000 L 166.060 166.070 L 143.000 229.500 C 140.672 235.771 134.689 239.932 128.000 239.932 C 121.311 239.932 115.328 235.771 113.000 229.500 L 89.940 166.060 L 26.500 143.000 C 20.229 140.672 16.068 134.689 16.068 128.000 C 16.068 121.311 20.229 115.328 26.500 113.000 L 89.940 89.940 L 113.000 26.500 C 115.328 20.229 121.311 16.068 128.000 16.068 C 134.689 16.068 140.672 20.229 143.000 26.500 L 166.070 89.940 L 229.500 113.000 C 235.838 115.253 240.052 121.274 240.000 128.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _starFour!!
    }

private var _starFour: ImageVector? = null
