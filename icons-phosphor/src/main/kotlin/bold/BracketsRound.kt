package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorBoldIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 82.330 222.190 C 80.688 224.925 78.025 226.893 74.929 227.660 C 71.833 228.428 68.559 227.931 65.830 226.280 C 64.000 225.160 20.000 198.000 20.000 128.000 C 20.000 58.000 64.000 30.840 65.830 29.720 C 71.480 26.530 78.642 28.410 81.999 33.962 C 85.355 39.515 83.690 46.730 78.240 50.250 C 76.710 51.210 44.000 72.310 44.000 128.000 C 44.000 183.690 76.850 204.880 78.250 205.750 C 83.906 209.171 85.730 216.522 82.330 222.190 ZM 190.170 29.720 C 186.498 27.390 181.854 27.229 178.030 29.299 C 174.205 31.368 171.800 35.344 171.742 39.692 C 171.684 44.040 173.982 48.079 177.750 50.250 C 179.150 51.120 212.000 72.190 212.000 128.000 C 212.000 183.810 179.150 204.880 177.830 205.700 C 174.069 207.864 171.769 211.889 171.815 216.228 C 171.860 220.566 174.244 224.542 178.050 226.626 C 181.856 228.711 186.490 228.578 190.170 226.280 C 192.000 225.160 236.000 198.000 236.000 128.000 C 236.000 58.000 192.000 30.840 190.170 29.720 Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
