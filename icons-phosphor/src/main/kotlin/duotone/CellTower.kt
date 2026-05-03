package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorDuotoneIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 88.000 C 200.001 115.272 184.593 140.203 160.200 152.400 L 128.000 88.000 L 95.800 152.400 C 64.061 136.530 48.618 99.903 59.412 66.099 C 70.207 32.296 104.020 11.398 139.083 16.860 C 174.145 22.322 199.999 52.515 200.000 88.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 135.160 84.420 C 133.807 81.705 131.034 79.989 128.000 79.989 C 124.966 79.989 122.193 81.705 120.840 84.420 L 48.840 228.420 C 46.863 232.372 48.463 237.178 52.415 239.155 C 56.367 241.132 61.173 239.532 63.150 235.580 L 77.000 208.000 L 179.100 208.000 L 192.890 235.580 C 194.238 238.275 196.987 239.983 200.000 240.000 C 202.772 239.999 205.346 238.562 206.803 236.203 C 208.259 233.844 208.391 230.899 207.150 228.420 ZM 128.000 105.890 L 155.060 160.000 L 100.940 160.000 ZM 85.000 192.000 L 93.000 176.000 L 163.100 176.000 L 171.100 192.000 ZM 159.540 93.740 C 161.793 81.147 156.329 68.423 145.646 61.384 C 134.964 54.346 121.116 54.346 110.434 61.384 C 99.751 68.423 94.287 81.147 96.540 93.740 C 97.121 96.582 96.118 99.516 93.918 101.408 C 91.719 103.300 88.667 103.852 85.944 102.852 C 83.221 101.852 81.252 99.456 80.800 96.590 C 77.372 77.682 85.551 58.551 101.589 47.966 C 117.627 37.381 138.433 37.381 154.471 47.966 C 170.509 58.551 178.688 77.682 175.260 96.590 C 174.574 100.394 171.266 103.164 167.400 103.170 C 166.921 103.166 166.442 103.122 165.970 103.040 C 163.876 102.670 162.015 101.481 160.799 99.736 C 159.583 97.991 159.112 95.833 159.490 93.740 ZM 64.150 136.210 C 39.255 103.232 43.571 56.721 74.108 28.887 C 104.645 1.052 151.355 1.052 181.892 28.887 C 212.429 56.721 216.745 103.232 191.850 136.210 C 189.161 139.655 184.204 140.304 180.718 137.668 C 177.232 135.032 176.507 130.086 179.090 126.560 C 198.996 100.176 195.538 62.974 171.110 40.711 C 146.681 18.448 109.319 18.448 84.890 40.711 C 60.462 62.974 57.004 100.176 76.910 126.560 C 79.493 130.086 78.768 135.032 75.282 137.668 C 71.796 140.304 66.839 139.655 64.150 136.210 Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
