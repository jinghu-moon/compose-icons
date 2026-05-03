package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorBoldIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 12.000 L 120.000 12.000 C 88.430 12.037 62.274 36.503 60.130 68.000 L 56.000 68.000 C 36.118 68.000 20.000 84.118 20.000 104.000 L 20.000 133.190 C 20.008 137.731 21.552 142.137 24.380 145.690 C 24.673 146.042 24.987 146.376 25.320 146.690 L 60.000 181.000 L 60.000 216.000 C 60.000 227.046 68.954 236.000 80.000 236.000 L 192.000 236.000 C 203.046 236.000 212.000 227.046 212.000 216.000 L 212.000 177.680 L 227.230 124.380 C 227.740 122.591 227.999 120.740 228.000 118.880 L 228.000 72.000 C 227.961 38.879 201.121 12.039 168.000 12.000 ZM 204.000 118.320 L 188.460 172.700 C 188.157 173.774 188.003 174.884 188.000 176.000 L 188.000 212.000 L 84.000 212.000 L 84.000 176.000 C 84.000 172.795 82.718 169.724 80.440 167.470 L 44.000 131.450 L 44.000 104.000 C 44.000 97.373 49.373 92.000 56.000 92.000 L 60.000 92.000 L 60.000 104.000 C 60.000 110.627 65.373 116.000 72.000 116.000 C 78.627 116.000 84.000 110.627 84.000 104.000 L 84.000 72.000 C 84.000 52.118 100.118 36.000 120.000 36.000 L 168.000 36.000 C 187.882 36.000 204.000 52.118 204.000 72.000 ZM 166.660 162.000 L 157.660 168.000 L 166.660 174.000 C 172.183 177.678 173.678 185.137 170.000 190.660 C 166.322 196.183 158.863 197.678 153.340 194.000 L 136.000 182.420 L 118.660 194.000 C 113.137 197.678 105.678 196.183 102.000 190.660 C 98.322 185.137 99.817 177.678 105.340 174.000 L 114.340 168.000 L 105.340 162.000 C 99.817 158.322 98.322 150.863 102.000 145.340 C 105.678 139.817 113.137 138.322 118.660 142.000 L 136.000 153.580 L 153.340 142.000 C 158.863 138.322 166.322 139.817 170.000 145.340 C 173.678 150.863 172.183 158.322 166.660 162.000 Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
