package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorThinIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 136.000 C 164.000 138.209 162.209 140.000 160.000 140.000 L 132.000 140.000 L 132.000 168.000 C 132.000 170.209 130.209 172.000 128.000 172.000 C 125.791 172.000 124.000 170.209 124.000 168.000 L 124.000 140.000 L 96.000 140.000 C 93.791 140.000 92.000 138.209 92.000 136.000 C 92.000 133.791 93.791 132.000 96.000 132.000 L 124.000 132.000 L 124.000 104.000 C 124.000 101.791 125.791 100.000 128.000 100.000 C 130.209 100.000 132.000 101.791 132.000 104.000 L 132.000 132.000 L 160.000 132.000 C 162.209 132.000 164.000 133.791 164.000 136.000 ZM 228.000 80.000 L 228.000 192.000 C 228.000 203.046 219.046 212.000 208.000 212.000 L 48.000 212.000 C 36.954 212.000 28.000 203.046 28.000 192.000 L 28.000 80.000 C 28.000 68.954 36.954 60.000 48.000 60.000 L 77.860 60.000 L 90.300 41.340 C 92.529 37.998 96.283 35.994 100.300 36.000 L 155.740 36.000 C 159.757 35.994 163.511 37.998 165.740 41.340 L 178.140 60.000 L 208.000 60.000 C 219.046 60.000 228.000 68.954 228.000 80.000 ZM 220.000 80.000 C 220.000 73.373 214.627 68.000 208.000 68.000 L 176.000 68.000 C 174.662 68.001 173.412 67.333 172.670 66.220 L 159.050 45.780 C 158.308 44.667 157.058 43.999 155.720 44.000 L 100.280 44.000 C 98.960 44.016 97.733 44.682 97.000 45.780 L 83.330 66.220 C 82.588 67.333 81.338 68.001 80.000 68.000 L 48.000 68.000 C 41.373 68.000 36.000 73.373 36.000 80.000 L 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 208.000 204.000 C 214.627 204.000 220.000 198.627 220.000 192.000 Z"),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
