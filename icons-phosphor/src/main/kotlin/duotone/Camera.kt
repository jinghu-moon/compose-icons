package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorDuotoneIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 64.000 L 176.000 64.000 L 160.000 40.000 L 96.000 40.000 L 80.000 64.000 L 48.000 64.000 C 39.163 64.000 32.000 71.163 32.000 80.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 L 208.000 208.000 C 216.837 208.000 224.000 200.837 224.000 192.000 L 224.000 80.000 C 224.000 71.163 216.837 64.000 208.000 64.000 ZM 128.000 168.000 C 108.118 168.000 92.000 151.882 92.000 132.000 C 92.000 112.118 108.118 96.000 128.000 96.000 C 147.882 96.000 164.000 112.118 164.000 132.000 C 164.000 151.882 147.882 168.000 128.000 168.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 56.000 L 180.280 56.000 L 166.650 35.560 C 165.167 33.337 162.672 32.002 160.000 32.000 L 96.000 32.000 C 93.328 32.002 90.833 33.337 89.350 35.560 L 75.710 56.000 L 48.000 56.000 C 34.745 56.000 24.000 66.745 24.000 80.000 L 24.000 192.000 C 24.000 205.255 34.745 216.000 48.000 216.000 L 208.000 216.000 C 221.255 216.000 232.000 205.255 232.000 192.000 L 232.000 80.000 C 232.000 66.745 221.255 56.000 208.000 56.000 ZM 216.000 192.000 C 216.000 196.418 212.418 200.000 208.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 L 40.000 80.000 C 40.000 75.582 43.582 72.000 48.000 72.000 L 80.000 72.000 C 82.676 72.002 85.175 70.666 86.660 68.440 L 100.280 48.000 L 155.710 48.000 L 169.340 68.440 C 170.825 70.666 173.324 72.002 176.000 72.000 L 208.000 72.000 C 212.418 72.000 216.000 75.582 216.000 80.000 ZM 128.000 88.000 C 103.699 88.000 84.000 107.699 84.000 132.000 C 84.000 156.301 103.699 176.000 128.000 176.000 C 152.301 176.000 172.000 156.301 172.000 132.000 C 171.972 107.711 152.289 88.028 128.000 88.000 ZM 128.000 160.000 C 112.536 160.000 100.000 147.464 100.000 132.000 C 100.000 116.536 112.536 104.000 128.000 104.000 C 143.464 104.000 156.000 116.536 156.000 132.000 C 156.000 147.464 143.464 160.000 128.000 160.000 Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
