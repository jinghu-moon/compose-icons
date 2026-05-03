package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorThinIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 131.580 86.210 C 130.903 84.852 129.517 83.994 128.000 83.994 C 126.483 83.994 125.097 84.852 124.420 86.210 L 52.420 230.210 C 51.431 232.187 52.233 234.591 54.210 235.580 C 56.187 236.569 58.591 235.767 59.580 233.790 L 74.470 204.000 L 181.530 204.000 L 196.420 233.790 C 197.098 235.145 198.484 236.001 200.000 236.000 C 200.621 235.997 201.233 235.853 201.790 235.580 C 202.740 235.106 203.462 234.273 203.798 233.266 C 204.134 232.259 204.055 231.159 203.580 230.210 ZM 128.000 96.940 L 161.530 164.000 L 94.470 164.000 ZM 78.470 196.000 L 90.470 172.000 L 165.530 172.000 L 177.530 196.000 ZM 163.420 94.450 C 163.809 92.322 164.003 90.163 164.000 88.000 C 164.000 68.118 147.882 52.000 128.000 52.000 C 108.118 52.000 92.000 68.118 92.000 88.000 C 91.997 90.163 92.191 92.322 92.580 94.450 C 92.975 96.626 91.531 98.710 89.355 99.105 C 87.179 99.500 85.095 98.056 84.700 95.880 C 84.237 93.279 84.002 90.642 84.000 88.000 C 84.000 63.699 103.699 44.000 128.000 44.000 C 152.301 44.000 172.000 63.699 172.000 88.000 C 171.998 90.642 171.763 93.279 171.300 95.880 C 170.956 97.786 169.297 99.172 167.360 99.170 C 167.122 99.166 166.884 99.143 166.650 99.100 C 165.605 98.913 164.677 98.317 164.071 97.445 C 163.465 96.572 163.231 95.495 163.420 94.450 ZM 67.340 133.790 C 43.693 102.461 47.794 58.277 76.804 31.835 C 105.813 5.393 150.187 5.393 179.197 31.835 C 208.206 58.277 212.307 102.461 188.660 133.790 C 187.818 134.981 186.393 135.619 184.943 135.455 C 183.494 135.290 182.249 134.350 181.694 133.000 C 181.140 131.650 181.364 130.106 182.280 128.970 C 203.433 100.937 199.761 61.408 173.805 37.752 C 147.850 14.097 108.150 14.097 82.195 37.752 C 56.239 61.408 52.567 100.937 73.720 128.970 C 74.636 130.106 74.860 131.650 74.306 133.000 C 73.752 134.350 72.506 135.290 71.057 135.455 C 69.607 135.619 68.182 134.981 67.340 133.790 Z"),
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
