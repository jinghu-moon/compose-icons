package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorBoldIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.650 29.530 C 216.177 26.438 207.578 28.151 201.860 33.870 C 201.660 34.070 201.470 34.270 201.290 34.480 L 186.290 51.780 C 150.310 30.727 105.770 30.727 69.790 51.780 L 54.790 34.480 C 54.610 34.270 54.420 34.070 54.220 33.870 C 48.509 28.096 39.873 26.348 32.367 29.448 C 24.860 32.547 19.973 39.879 20.000 48.000 L 20.000 136.000 C 20.000 191.140 68.450 236.000 128.000 236.000 C 187.550 236.000 236.000 191.140 236.000 136.000 L 236.000 48.000 C 235.996 39.913 231.122 32.623 223.650 29.530 ZM 212.000 136.000 C 212.000 174.220 180.650 205.930 140.000 211.210 L 140.000 197.000 L 152.490 184.510 C 157.184 179.816 157.184 172.204 152.490 167.510 C 147.796 162.816 140.184 162.816 135.490 167.510 L 128.000 175.000 L 120.490 167.480 C 115.796 162.786 108.184 162.786 103.490 167.480 C 98.796 172.174 98.796 179.786 103.490 184.480 L 116.000 197.000 L 116.000 211.240 C 75.350 205.960 44.000 174.240 44.000 136.030 L 44.000 58.740 L 58.540 75.470 C 62.654 80.201 69.717 80.968 74.750 77.230 C 81.257 72.419 88.411 68.551 96.000 65.740 L 96.000 88.000 C 96.000 94.627 101.373 100.000 108.000 100.000 C 114.627 100.000 120.000 94.627 120.000 88.000 L 120.000 60.350 Q 124.000 60.000 128.000 60.000 Q 132.000 60.000 136.000 60.350 L 136.000 88.000 C 136.000 94.627 141.373 100.000 148.000 100.000 C 154.627 100.000 160.000 94.627 160.000 88.000 L 160.000 65.740 C 167.588 68.554 174.741 72.422 181.250 77.230 C 186.283 80.968 193.346 80.201 197.460 75.470 L 212.000 58.740 ZM 100.000 140.000 C 100.000 148.837 92.837 156.000 84.000 156.000 C 75.163 156.000 68.000 148.837 68.000 140.000 C 68.000 131.163 75.163 124.000 84.000 124.000 C 92.837 124.000 100.000 131.163 100.000 140.000 ZM 188.000 140.000 C 188.000 148.837 180.837 156.000 172.000 156.000 C 163.163 156.000 156.000 148.837 156.000 140.000 C 156.000 131.163 163.163 124.000 172.000 124.000 C 180.837 124.000 188.000 131.163 188.000 140.000 Z"),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
