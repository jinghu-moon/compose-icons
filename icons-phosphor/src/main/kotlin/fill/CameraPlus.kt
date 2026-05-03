package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorFillIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 56.000 L 180.280 56.000 L 169.000 39.120 C 166.038 34.680 161.057 32.010 155.720 32.000 L 100.280 32.000 C 94.943 32.010 89.962 34.680 87.000 39.120 L 75.720 56.000 L 48.000 56.000 C 34.745 56.000 24.000 66.745 24.000 80.000 L 24.000 192.000 C 24.000 205.255 34.745 216.000 48.000 216.000 L 208.000 216.000 C 221.255 216.000 232.000 205.255 232.000 192.000 L 232.000 80.000 C 232.000 66.745 221.255 56.000 208.000 56.000 ZM 160.000 144.000 L 136.000 144.000 L 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 144.000 L 96.000 144.000 C 91.582 144.000 88.000 140.418 88.000 136.000 C 88.000 131.582 91.582 128.000 96.000 128.000 L 120.000 128.000 L 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 C 132.418 96.000 136.000 99.582 136.000 104.000 L 136.000 128.000 L 160.000 128.000 C 164.418 128.000 168.000 131.582 168.000 136.000 C 168.000 140.418 164.418 144.000 160.000 144.000 Z"),
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
