package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorFillIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 135.160 84.420 C 133.807 81.705 131.034 79.989 128.000 79.989 C 124.966 79.989 122.193 81.705 120.840 84.420 L 48.840 228.420 C 46.863 232.372 48.463 237.178 52.415 239.155 C 56.367 241.132 61.173 239.532 63.150 235.580 L 77.000 208.000 L 179.100 208.000 L 192.890 235.580 C 194.238 238.275 196.987 239.983 200.000 240.000 C 202.772 239.999 205.346 238.562 206.803 236.203 C 208.259 233.844 208.391 230.899 207.150 228.420 ZM 128.000 105.890 L 155.060 160.000 L 100.940 160.000 ZM 159.490 93.740 C 161.743 81.147 156.279 68.423 145.596 61.384 C 134.914 54.346 121.066 54.346 110.384 61.384 C 99.701 68.423 94.237 81.147 96.490 93.740 C 97.071 96.582 96.068 99.516 93.868 101.408 C 91.669 103.300 88.617 103.852 85.894 102.852 C 83.171 101.852 81.202 99.456 80.750 96.590 C 77.322 77.682 85.501 58.551 101.539 47.966 C 117.577 37.381 138.383 37.381 154.421 47.966 C 170.459 58.551 178.638 77.682 175.210 96.590 C 174.524 100.394 171.216 103.164 167.350 103.170 C 166.871 103.166 166.392 103.122 165.920 103.040 C 161.578 102.245 158.700 98.083 159.490 93.740 ZM 64.150 136.210 C 39.255 103.232 43.571 56.721 74.108 28.887 C 104.645 1.052 151.355 1.052 181.892 28.887 C 212.429 56.721 216.745 103.232 191.850 136.210 C 189.161 139.655 184.204 140.304 180.718 137.668 C 177.232 135.032 176.507 130.086 179.090 126.560 C 198.996 100.176 195.538 62.974 171.110 40.711 C 146.681 18.448 109.319 18.448 84.890 40.711 C 60.462 62.974 57.004 100.176 76.910 126.560 C 79.493 130.086 78.768 135.032 75.282 137.668 C 71.796 140.304 66.839 139.655 64.150 136.210 Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
