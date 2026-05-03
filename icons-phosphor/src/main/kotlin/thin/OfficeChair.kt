package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorThinIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 128.000 C 244.000 130.209 242.209 132.000 240.000 132.000 L 219.820 132.000 C 217.725 154.644 198.740 171.973 176.000 172.000 L 132.000 172.000 L 132.000 204.000 L 160.000 204.000 C 175.464 204.000 188.000 216.536 188.000 232.000 C 188.000 234.209 186.209 236.000 184.000 236.000 C 181.791 236.000 180.000 234.209 180.000 232.000 C 180.000 220.954 171.046 212.000 160.000 212.000 L 132.000 212.000 L 132.000 232.000 C 132.000 234.209 130.209 236.000 128.000 236.000 C 125.791 236.000 124.000 234.209 124.000 232.000 L 124.000 212.000 L 96.000 212.000 C 84.954 212.000 76.000 220.954 76.000 232.000 C 76.000 234.209 74.209 236.000 72.000 236.000 C 69.791 236.000 68.000 234.209 68.000 232.000 C 68.000 216.536 80.536 204.000 96.000 204.000 L 124.000 204.000 L 124.000 172.000 L 80.000 172.000 C 57.260 171.973 38.275 154.644 36.180 132.000 L 16.000 132.000 C 13.791 132.000 12.000 130.209 12.000 128.000 C 12.000 125.791 13.791 124.000 16.000 124.000 L 40.000 124.000 C 42.209 124.000 44.000 125.791 44.000 128.000 C 44.000 147.882 60.118 164.000 80.000 164.000 L 176.000 164.000 C 195.882 164.000 212.000 147.882 212.000 128.000 C 212.000 125.791 213.791 124.000 216.000 124.000 L 240.000 124.000 C 242.209 124.000 244.000 125.791 244.000 128.000 ZM 70.940 135.860 C 68.658 133.233 67.630 129.745 68.120 126.300 L 81.840 30.300 C 82.710 24.402 87.759 20.025 93.720 20.000 L 162.280 20.000 C 168.241 20.025 173.290 24.402 174.160 30.300 L 187.880 126.300 C 188.373 129.744 187.347 133.233 185.067 135.862 C 182.788 138.490 179.479 140.000 176.000 140.000 L 80.000 140.000 C 76.523 139.998 73.218 138.487 70.940 135.860 ZM 76.940 130.620 C 77.702 131.514 78.825 132.021 80.000 132.000 L 176.000 132.000 C 177.154 132.003 178.251 131.498 179.000 130.620 C 179.761 129.743 180.104 128.579 179.940 127.430 L 166.220 31.430 C 165.934 29.446 164.224 27.980 162.220 28.000 L 93.720 28.000 C 91.716 27.980 90.006 29.446 89.720 31.430 L 76.000 127.430 C 75.852 128.588 76.217 129.754 77.000 130.620 Z"),
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
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
