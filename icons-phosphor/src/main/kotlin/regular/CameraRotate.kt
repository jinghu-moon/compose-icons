package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorRegularIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 56.000 L 180.280 56.000 L 166.650 35.560 C 165.167 33.337 162.672 32.002 160.000 32.000 L 96.000 32.000 C 93.328 32.002 90.833 33.337 89.350 35.560 L 75.710 56.000 L 48.000 56.000 C 34.745 56.000 24.000 66.745 24.000 80.000 L 24.000 192.000 C 24.000 205.255 34.745 216.000 48.000 216.000 L 208.000 216.000 C 221.255 216.000 232.000 205.255 232.000 192.000 L 232.000 80.000 C 232.000 66.745 221.255 56.000 208.000 56.000 ZM 216.000 192.000 C 216.000 196.418 212.418 200.000 208.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 L 40.000 80.000 C 40.000 75.582 43.582 72.000 48.000 72.000 L 80.000 72.000 C 82.676 72.002 85.175 70.666 86.660 68.440 L 100.280 48.000 L 155.710 48.000 L 169.340 68.440 C 170.825 70.666 173.324 72.002 176.000 72.000 L 208.000 72.000 C 212.418 72.000 216.000 75.582 216.000 80.000 ZM 176.000 96.000 L 176.000 120.000 C 176.000 124.418 172.418 128.000 168.000 128.000 L 144.000 128.000 C 139.582 128.000 136.000 124.418 136.000 120.000 C 136.000 115.582 139.582 112.000 144.000 112.000 L 149.150 112.000 C 137.763 102.024 120.956 101.353 108.810 110.390 C 105.278 113.046 100.261 112.337 97.605 108.805 C 94.949 105.273 95.658 100.256 99.190 97.600 C 117.521 83.953 142.916 85.051 160.000 100.230 L 160.000 96.000 C 160.000 91.582 163.582 88.000 168.000 88.000 C 172.418 88.000 176.000 91.582 176.000 96.000 ZM 158.390 155.200 C 161.045 158.729 160.338 163.743 156.810 166.400 C 138.479 180.047 113.084 178.949 96.000 163.770 L 96.000 168.000 C 96.000 172.418 92.418 176.000 88.000 176.000 C 83.582 176.000 80.000 172.418 80.000 168.000 L 80.000 144.000 C 80.000 139.582 83.582 136.000 88.000 136.000 L 112.000 136.000 C 116.418 136.000 120.000 139.582 120.000 144.000 C 120.000 148.418 116.418 152.000 112.000 152.000 L 106.850 152.000 C 118.237 161.976 135.044 162.647 147.190 153.610 C 150.722 150.957 155.736 151.669 158.390 155.200 Z"),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
