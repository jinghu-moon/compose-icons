package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorThinIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 60.000 L 178.130 60.000 L 163.320 37.780 C 162.579 36.670 161.334 36.002 160.000 36.000 L 96.000 36.000 C 94.666 36.002 93.421 36.670 92.680 37.780 L 77.850 60.000 L 48.000 60.000 C 36.954 60.000 28.000 68.954 28.000 80.000 L 28.000 192.000 C 28.000 203.046 36.954 212.000 48.000 212.000 L 208.000 212.000 C 219.046 212.000 228.000 203.046 228.000 192.000 L 228.000 80.000 C 228.000 68.954 219.046 60.000 208.000 60.000 ZM 220.000 192.000 C 220.000 198.627 214.627 204.000 208.000 204.000 L 48.000 204.000 C 41.373 204.000 36.000 198.627 36.000 192.000 L 36.000 80.000 C 36.000 73.373 41.373 68.000 48.000 68.000 L 80.000 68.000 C 81.338 68.001 82.588 67.333 83.330 66.220 L 98.130 44.000 L 157.850 44.000 L 172.670 66.220 C 173.412 67.333 174.662 68.001 176.000 68.000 L 208.000 68.000 C 214.627 68.000 220.000 73.373 220.000 80.000 ZM 128.000 92.000 C 105.909 92.000 88.000 109.909 88.000 132.000 C 88.000 154.091 105.909 172.000 128.000 172.000 C 150.091 172.000 168.000 154.091 168.000 132.000 C 168.000 109.909 150.091 92.000 128.000 92.000 ZM 128.000 164.000 C 110.327 164.000 96.000 149.673 96.000 132.000 C 96.000 114.327 110.327 100.000 128.000 100.000 C 145.673 100.000 160.000 114.327 160.000 132.000 C 160.000 149.673 145.673 164.000 128.000 164.000 Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
