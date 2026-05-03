package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorLightIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 136.000 C 166.000 139.314 163.314 142.000 160.000 142.000 L 134.000 142.000 L 134.000 168.000 C 134.000 171.314 131.314 174.000 128.000 174.000 C 124.686 174.000 122.000 171.314 122.000 168.000 L 122.000 142.000 L 96.000 142.000 C 92.686 142.000 90.000 139.314 90.000 136.000 C 90.000 132.686 92.686 130.000 96.000 130.000 L 122.000 130.000 L 122.000 104.000 C 122.000 100.686 124.686 98.000 128.000 98.000 C 131.314 98.000 134.000 100.686 134.000 104.000 L 134.000 130.000 L 160.000 130.000 C 163.314 130.000 166.000 132.686 166.000 136.000 ZM 230.000 80.000 L 230.000 192.000 C 230.000 204.150 220.150 214.000 208.000 214.000 L 48.000 214.000 C 35.850 214.000 26.000 204.150 26.000 192.000 L 26.000 80.000 C 26.000 67.850 35.850 58.000 48.000 58.000 L 76.790 58.000 L 88.630 40.230 C 91.228 36.336 95.599 33.999 100.280 34.000 L 155.720 34.000 C 160.401 33.999 164.772 36.336 167.370 40.230 L 179.210 58.000 L 208.000 58.000 C 220.150 58.000 230.000 67.850 230.000 80.000 ZM 218.000 80.000 C 218.000 74.477 213.523 70.000 208.000 70.000 L 176.000 70.000 C 173.992 70.003 172.115 69.001 171.000 67.330 L 157.380 46.890 C 157.010 46.335 156.387 46.001 155.720 46.000 L 100.280 46.000 C 99.613 46.001 98.990 46.335 98.620 46.890 L 85.000 67.330 C 83.885 69.001 82.009 70.003 80.000 70.000 L 48.000 70.000 C 42.477 70.000 38.000 74.477 38.000 80.000 L 38.000 192.000 C 38.000 197.523 42.477 202.000 48.000 202.000 L 208.000 202.000 C 213.523 202.000 218.000 197.523 218.000 192.000 Z"),
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
