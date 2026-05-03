package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorThinIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 60.000 L 178.130 60.000 L 163.320 37.780 C 162.579 36.670 161.334 36.002 160.000 36.000 L 96.000 36.000 C 94.666 36.002 93.421 36.670 92.680 37.780 L 77.850 60.000 L 48.000 60.000 C 36.954 60.000 28.000 68.954 28.000 80.000 L 28.000 192.000 C 28.000 203.046 36.954 212.000 48.000 212.000 L 208.000 212.000 C 219.046 212.000 228.000 203.046 228.000 192.000 L 228.000 80.000 C 228.000 68.954 219.046 60.000 208.000 60.000 ZM 220.000 192.000 C 220.000 198.627 214.627 204.000 208.000 204.000 L 48.000 204.000 C 41.373 204.000 36.000 198.627 36.000 192.000 L 36.000 80.000 C 36.000 73.373 41.373 68.000 48.000 68.000 L 80.000 68.000 C 81.338 68.001 82.588 67.333 83.330 66.220 L 98.130 44.000 L 157.850 44.000 L 172.670 66.220 C 173.412 67.333 174.662 68.001 176.000 68.000 L 208.000 68.000 C 214.627 68.000 220.000 73.373 220.000 80.000 ZM 172.000 96.000 L 172.000 120.000 C 172.000 122.209 170.209 124.000 168.000 124.000 L 144.000 124.000 C 141.791 124.000 140.000 122.209 140.000 120.000 C 140.000 117.791 141.791 116.000 144.000 116.000 L 158.660 116.000 L 153.390 110.480 C 140.693 97.910 120.714 96.512 106.390 107.190 C 105.254 108.126 103.696 108.362 102.334 107.805 C 100.971 107.248 100.025 105.988 99.869 104.525 C 99.714 103.061 100.375 101.630 101.590 100.800 C 119.129 87.739 143.586 89.478 159.100 104.890 L 164.000 110.000 L 164.000 96.000 C 164.000 93.791 165.791 92.000 168.000 92.000 C 170.209 92.000 172.000 93.791 172.000 96.000 ZM 155.200 157.600 C 156.525 159.367 156.167 161.875 154.400 163.200 C 136.863 176.270 112.401 174.530 96.890 159.110 L 92.000 154.000 L 92.000 168.000 C 92.000 170.209 90.209 172.000 88.000 172.000 C 85.791 172.000 84.000 170.209 84.000 168.000 L 84.000 144.000 C 84.000 141.791 85.791 140.000 88.000 140.000 L 112.000 140.000 C 114.209 140.000 116.000 141.791 116.000 144.000 C 116.000 146.209 114.209 148.000 112.000 148.000 L 97.340 148.000 L 102.610 153.520 C 115.307 166.090 135.286 167.488 149.610 156.810 C 151.373 155.489 153.872 155.842 155.200 157.600 Z"),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
