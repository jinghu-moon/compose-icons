package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorBoldIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 232.000 C 180.000 238.627 174.627 244.000 168.000 244.000 L 88.000 244.000 C 81.373 244.000 76.000 238.627 76.000 232.000 C 76.000 225.373 81.373 220.000 88.000 220.000 L 168.000 220.000 C 174.627 220.000 180.000 225.373 180.000 232.000 ZM 220.000 104.000 C 219.920 133.021 206.220 160.321 183.000 177.730 C 181.074 179.235 179.964 181.556 180.000 184.000 C 180.000 195.046 171.046 204.000 160.000 204.000 L 96.000 204.000 C 84.954 204.000 76.000 195.046 76.000 184.000 L 76.000 183.770 C 75.963 181.304 74.757 179.003 72.750 177.570 C 49.692 160.378 36.076 133.332 36.000 104.570 C 35.730 54.690 76.000 13.200 125.790 12.000 C 150.571 11.405 174.543 20.834 192.277 38.152 C 210.012 55.470 220.007 79.212 220.000 104.000 ZM 196.000 104.000 C 196.005 85.676 188.615 68.125 175.503 55.324 C 162.392 42.523 144.669 35.555 126.350 36.000 C 89.560 36.890 59.800 67.560 60.000 104.390 C 60.046 125.667 70.118 145.678 87.180 158.390 L 87.180 158.390 C 94.122 163.598 98.663 171.392 99.770 180.000 L 116.000 180.000 L 116.000 149.000 L 87.510 120.490 C 82.816 115.796 82.816 108.184 87.510 103.490 C 92.204 98.796 99.816 98.796 104.510 103.490 L 128.000 127.000 L 151.510 103.490 C 156.204 98.796 163.816 98.796 168.510 103.490 C 173.204 108.184 173.204 115.796 168.510 120.490 L 140.000 149.000 L 140.000 180.000 L 156.250 180.000 C 157.316 171.455 161.792 163.704 168.660 158.510 C 185.936 145.732 196.090 125.488 196.000 104.000 Z"),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
