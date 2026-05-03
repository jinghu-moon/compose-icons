package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorRegularIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 136.000 C 168.000 140.418 164.418 144.000 160.000 144.000 L 136.000 144.000 L 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 144.000 L 96.000 144.000 C 91.582 144.000 88.000 140.418 88.000 136.000 C 88.000 131.582 91.582 128.000 96.000 128.000 L 120.000 128.000 L 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 C 132.418 96.000 136.000 99.582 136.000 104.000 L 136.000 128.000 L 160.000 128.000 C 164.418 128.000 168.000 131.582 168.000 136.000 ZM 232.000 80.000 L 232.000 192.000 C 232.000 205.255 221.255 216.000 208.000 216.000 L 48.000 216.000 C 34.745 216.000 24.000 205.255 24.000 192.000 L 24.000 80.000 C 24.000 66.745 34.745 56.000 48.000 56.000 L 75.720 56.000 L 87.000 39.120 C 89.962 34.680 94.943 32.010 100.280 32.000 L 155.720 32.000 C 161.057 32.010 166.038 34.680 169.000 39.120 L 180.280 56.000 L 208.000 56.000 C 221.255 56.000 232.000 66.745 232.000 80.000 ZM 216.000 80.000 C 216.000 75.582 212.418 72.000 208.000 72.000 L 176.000 72.000 C 173.324 72.002 170.825 70.666 169.340 68.440 L 155.720 48.000 L 100.280 48.000 L 86.660 68.440 C 85.175 70.666 82.676 72.002 80.000 72.000 L 48.000 72.000 C 43.582 72.000 40.000 75.582 40.000 80.000 L 40.000 192.000 C 40.000 196.418 43.582 200.000 48.000 200.000 L 208.000 200.000 C 212.418 200.000 216.000 196.418 216.000 192.000 Z"),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
