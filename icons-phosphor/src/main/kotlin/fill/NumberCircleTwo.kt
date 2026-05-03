package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorFillIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 152.000 168.000 C 156.418 168.000 160.000 171.582 160.000 176.000 C 160.000 180.418 156.418 184.000 152.000 184.000 L 104.000 184.000 C 100.970 184.000 98.200 182.288 96.845 179.578 C 95.489 176.867 95.782 173.624 97.600 171.200 L 140.770 113.640 C 144.546 108.608 145.023 101.830 141.988 96.319 C 138.953 90.808 132.971 87.587 126.699 88.088 C 120.428 88.588 115.032 92.717 112.910 98.640 C 111.435 102.807 106.862 104.990 102.695 103.515 C 98.528 102.040 96.345 97.467 97.820 93.300 C 102.036 81.432 112.822 73.140 125.375 72.117 C 137.928 71.094 149.914 77.530 155.996 88.559 C 162.078 99.588 161.124 113.160 153.560 123.230 L 120.000 168.000 Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
