package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorBoldIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 80.000 L 140.000 121.210 L 174.170 141.710 C 177.931 143.874 180.231 147.899 180.185 152.238 C 180.140 156.576 177.756 160.552 173.950 162.636 C 170.144 164.721 165.510 164.588 161.830 162.290 L 121.830 138.290 C 118.214 136.122 116.001 132.216 116.000 128.000 L 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 ZM 128.000 28.000 C 101.440 27.932 75.958 38.497 57.240 57.340 C 52.550 62.080 48.240 66.710 44.000 71.340 L 44.000 64.000 C 44.000 57.373 38.627 52.000 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 104.000 C 20.000 110.627 25.373 116.000 32.000 116.000 L 72.000 116.000 C 78.627 116.000 84.000 110.627 84.000 104.000 C 84.000 97.373 78.627 92.000 72.000 92.000 L 57.770 92.000 C 63.000 86.000 68.370 80.220 74.260 74.260 C 103.735 44.776 151.459 44.541 181.224 73.733 C 210.988 102.925 211.679 150.645 182.774 180.687 C 153.868 210.729 106.157 211.877 75.840 183.260 C 71.019 178.709 63.421 178.929 58.870 183.750 C 54.319 188.571 54.539 196.169 59.360 200.720 C 92.014 231.543 141.210 236.821 179.659 213.625 C 218.108 190.429 236.381 144.449 224.341 101.189 C 212.302 57.929 172.904 27.999 128.000 28.000 Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
