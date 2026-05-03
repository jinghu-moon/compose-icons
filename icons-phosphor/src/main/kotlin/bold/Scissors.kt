package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorBoldIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.780 183.790 L 98.280 87.650 C 99.422 83.872 100.002 79.947 100.000 76.000 C 100.002 57.365 87.136 41.197 68.976 37.015 C 50.816 32.833 32.174 41.746 24.026 58.506 C 15.878 75.265 20.383 95.431 34.888 107.130 C 49.393 118.829 70.056 118.962 84.710 107.450 L 114.710 128.010 L 84.710 148.570 C 67.826 135.305 43.481 137.736 29.554 154.078 C 15.627 170.420 17.086 194.843 32.861 209.410 C 48.635 223.977 73.096 223.491 88.280 208.310 L 88.280 208.310 C 95.815 200.820 100.036 190.624 100.000 180.000 C 100.003 176.050 99.423 172.121 98.280 168.340 L 136.000 142.540 L 225.220 203.600 C 230.690 207.344 238.161 205.945 241.905 200.475 C 245.649 195.005 244.250 187.534 238.780 183.790 ZM 71.310 191.330 L 71.310 191.330 C 65.912 196.725 57.455 197.556 51.110 193.316 C 44.765 189.076 42.298 180.944 45.217 173.893 C 48.135 166.842 55.628 162.833 63.113 164.318 C 70.599 165.803 75.994 172.368 76.000 180.000 C 76.003 184.250 74.316 188.326 71.310 191.330 ZM 48.690 87.300 C 44.112 82.725 42.741 75.842 45.217 69.862 C 47.693 63.882 53.528 59.983 60.000 59.983 C 66.472 59.983 72.307 63.882 74.783 69.862 C 77.259 75.842 75.888 82.725 71.310 87.300 L 71.310 87.300 C 65.062 93.543 54.938 93.543 48.690 87.300 ZM 161.510 110.540 C 159.713 107.913 159.033 104.680 159.620 101.552 C 160.207 98.424 162.013 95.657 164.640 93.860 L 225.220 52.400 C 230.690 48.656 238.161 50.055 241.905 55.525 C 245.649 60.995 244.250 68.466 238.780 72.210 L 178.190 113.670 C 175.563 115.467 172.330 116.147 169.202 115.560 C 166.074 114.973 163.307 113.167 161.510 110.540 Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
