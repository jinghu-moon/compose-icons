package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorBoldIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 100.000 L 219.220 100.000 C 213.218 54.202 174.189 19.955 128.000 19.955 C 81.811 19.955 42.782 54.202 36.780 100.000 L 32.000 100.000 C 25.373 100.000 20.000 105.373 20.000 112.000 C 20.073 151.392 41.514 187.642 76.000 206.680 L 76.000 208.000 C 76.000 219.046 84.954 228.000 96.000 228.000 L 160.000 228.000 C 171.046 228.000 180.000 219.046 180.000 208.000 L 180.000 206.680 C 214.486 187.642 235.927 151.392 236.000 112.000 C 236.000 105.373 230.627 100.000 224.000 100.000 ZM 170.290 60.060 C 151.944 68.304 136.804 82.333 127.190 100.000 L 106.000 100.000 C 117.061 75.685 141.288 60.056 168.000 60.000 C 168.760 60.000 169.520 60.000 170.290 60.060 ZM 187.510 79.140 C 191.108 85.639 193.612 92.687 194.920 100.000 L 156.130 100.000 C 164.413 90.226 175.292 82.994 187.510 79.140 ZM 128.000 44.000 C 128.830 44.000 129.650 44.000 130.480 44.060 C 106.603 54.761 88.389 75.094 80.370 100.000 L 61.080 100.000 C 66.927 67.617 95.093 44.047 128.000 44.000 ZM 163.000 188.390 C 158.734 190.345 155.999 194.607 156.000 199.300 L 156.000 204.000 L 100.000 204.000 L 100.000 199.300 C 100.001 194.607 97.266 190.345 93.000 188.390 C 67.099 176.448 48.991 152.222 44.870 124.000 L 211.130 124.000 C 207.009 152.222 188.901 176.448 163.000 188.390 Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
