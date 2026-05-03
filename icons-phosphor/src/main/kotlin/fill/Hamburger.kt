package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorFillIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 35.580 98.060 C 32.524 94.300 31.336 89.358 32.350 84.620 C 39.780 49.500 80.000 24.000 128.000 24.000 C 176.000 24.000 216.220 49.500 223.650 84.620 C 224.675 89.362 223.493 94.312 220.437 98.080 C 217.381 101.847 212.781 104.025 207.930 104.000 L 48.070 104.000 C 43.222 104.015 38.628 101.830 35.580 98.060 ZM 229.260 152.480 L 188.130 167.480 L 151.000 152.570 C 149.093 151.808 146.967 151.808 145.060 152.570 L 108.060 167.380 L 71.000 152.570 C 69.176 151.841 67.147 151.809 65.300 152.480 L 21.300 168.480 C 17.441 170.179 15.562 174.581 17.007 178.543 C 18.452 182.504 22.723 184.664 26.770 183.480 L 40.000 178.690 L 40.000 184.000 C 40.000 206.091 57.909 224.000 80.000 224.000 L 176.000 224.000 C 198.091 224.000 216.000 206.091 216.000 184.000 L 216.000 174.330 L 234.730 167.520 C 237.592 166.682 239.751 164.322 240.330 161.397 C 240.910 158.471 239.814 155.466 237.488 153.601 C 235.161 151.735 231.990 151.319 229.260 152.520 ZM 24.000 136.000 L 232.000 136.000 C 236.418 136.000 240.000 132.418 240.000 128.000 C 240.000 123.582 236.418 120.000 232.000 120.000 L 24.000 120.000 C 19.582 120.000 16.000 123.582 16.000 128.000 C 16.000 132.418 19.582 136.000 24.000 136.000 Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
