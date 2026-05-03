package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorBoldIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.490 175.510 C 242.749 177.762 244.019 180.820 244.019 184.010 C 244.019 187.200 242.749 190.258 240.490 192.510 L 216.490 216.510 C 211.796 221.204 204.184 221.204 199.490 216.510 C 194.796 211.816 194.796 204.204 199.490 199.510 L 203.000 196.000 L 168.000 196.000 C 164.131 196.004 160.497 194.143 158.240 191.000 L 81.820 84.000 L 32.000 84.000 C 25.373 84.000 20.000 78.627 20.000 72.000 C 20.000 65.373 25.373 60.000 32.000 60.000 L 88.000 60.000 C 91.869 59.996 95.503 61.857 97.760 65.000 L 174.180 172.000 L 203.000 172.000 L 199.480 168.490 C 194.786 163.796 194.786 156.184 199.480 151.490 C 204.174 146.796 211.786 146.796 216.480 151.490 ZM 110.400 152.640 C 107.810 150.790 104.592 150.045 101.452 150.568 C 98.313 151.091 95.510 152.840 93.660 155.430 L 81.820 172.000 L 32.000 172.000 C 25.373 172.000 20.000 177.373 20.000 184.000 C 20.000 190.627 25.373 196.000 32.000 196.000 L 88.000 196.000 C 91.869 196.004 95.503 194.143 97.760 191.000 L 113.190 169.410 C 115.049 166.818 115.800 163.592 115.277 160.446 C 114.753 157.299 112.998 154.490 110.400 152.640 ZM 145.600 103.360 C 148.190 105.210 151.408 105.955 154.548 105.432 C 157.687 104.909 160.490 103.160 162.340 100.570 L 174.180 84.000 L 203.000 84.000 L 199.480 87.510 C 194.786 92.204 194.786 99.816 199.480 104.510 C 204.174 109.204 211.786 109.204 216.480 104.510 L 240.480 80.510 C 242.739 78.258 244.009 75.200 244.009 72.010 C 244.009 68.820 242.739 65.762 240.480 63.510 L 216.480 39.510 C 211.786 34.816 204.174 34.816 199.480 39.510 C 194.786 44.204 194.786 51.816 199.480 56.510 L 203.000 60.000 L 168.000 60.000 C 164.131 59.996 160.497 61.857 158.240 65.000 L 142.810 86.600 C 140.954 89.191 140.205 92.415 140.728 95.559 C 141.251 98.703 143.004 101.510 145.600 103.360 Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
