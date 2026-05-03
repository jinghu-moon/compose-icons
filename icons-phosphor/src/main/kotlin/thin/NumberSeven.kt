package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorThinIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 171.830 49.150 L 123.830 209.150 C 123.322 210.841 121.766 212.000 120.000 212.000 C 119.610 212.002 119.222 211.945 118.850 211.830 C 117.830 211.525 116.973 210.826 116.470 209.887 C 115.967 208.949 115.859 207.848 116.170 206.830 L 162.620 52.000 L 88.000 52.000 C 85.791 52.000 84.000 50.209 84.000 48.000 C 84.000 45.791 85.791 44.000 88.000 44.000 L 168.000 44.000 C 169.264 44.000 170.454 44.598 171.209 45.613 C 171.963 46.628 172.193 47.939 171.830 49.150 Z"),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
