package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorThinIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 119.750 97.400 L 95.750 161.400 C 95.168 162.968 93.672 164.008 92.000 164.008 C 90.328 164.008 88.832 162.968 88.250 161.400 L 64.250 97.400 C 63.477 95.329 64.529 93.023 66.600 92.250 C 68.671 91.477 70.977 92.529 71.750 94.600 L 92.000 148.600 L 112.250 94.600 C 113.023 92.529 115.329 91.477 117.400 92.250 C 119.471 93.023 120.523 95.329 119.750 97.400 ZM 252.000 128.000 C 251.956 169.955 217.955 203.956 176.000 204.000 L 80.000 204.000 C 38.026 204.000 4.000 169.974 4.000 128.000 C 4.000 86.026 38.026 52.000 80.000 52.000 L 176.000 52.000 C 217.955 52.044 251.956 86.045 252.000 128.000 ZM 244.000 128.000 C 243.961 90.461 213.539 60.039 176.000 60.000 L 80.000 60.000 C 42.445 60.000 12.000 90.445 12.000 128.000 C 12.000 165.555 42.445 196.000 80.000 196.000 L 176.000 196.000 C 213.539 195.961 243.961 165.539 244.000 128.000 ZM 175.500 137.060 L 187.500 158.060 C 188.591 159.977 187.924 162.415 186.010 163.510 C 185.403 163.863 184.712 164.046 184.010 164.040 C 182.579 164.042 181.256 163.279 180.540 162.040 L 167.790 139.700 C 166.536 139.897 165.269 139.997 164.000 140.000 L 148.000 140.000 L 148.000 160.000 C 148.000 162.209 146.209 164.000 144.000 164.000 C 141.791 164.000 140.000 162.209 140.000 160.000 L 140.000 96.000 C 140.000 93.791 141.791 92.000 144.000 92.000 L 164.000 92.000 C 174.965 92.004 184.533 99.440 187.245 110.065 C 189.956 120.690 185.122 131.801 175.500 137.060 ZM 180.000 116.000 C 180.000 107.163 172.837 100.000 164.000 100.000 L 148.000 100.000 L 148.000 132.000 L 164.000 132.000 C 172.837 132.000 180.000 124.837 180.000 116.000 Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
