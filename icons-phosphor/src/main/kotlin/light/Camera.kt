package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorLightIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 58.000 L 179.210 58.000 L 165.000 36.670 C 163.885 34.999 162.008 33.997 160.000 34.000 L 96.000 34.000 C 93.991 33.997 92.115 34.999 91.000 36.670 L 76.780 58.000 L 48.000 58.000 C 35.850 58.000 26.000 67.850 26.000 80.000 L 26.000 192.000 C 26.000 204.150 35.850 214.000 48.000 214.000 L 208.000 214.000 C 220.150 214.000 230.000 204.150 230.000 192.000 L 230.000 80.000 C 230.000 67.850 220.150 58.000 208.000 58.000 ZM 218.000 192.000 C 218.000 197.523 213.523 202.000 208.000 202.000 L 48.000 202.000 C 42.477 202.000 38.000 197.523 38.000 192.000 L 38.000 80.000 C 38.000 74.477 42.477 70.000 48.000 70.000 L 80.000 70.000 C 82.009 70.003 83.885 69.001 85.000 67.330 L 99.210 46.000 L 156.780 46.000 L 171.000 67.330 C 172.115 69.001 173.992 70.003 176.000 70.000 L 208.000 70.000 C 213.523 70.000 218.000 74.477 218.000 80.000 ZM 128.000 90.000 C 104.804 90.000 86.000 108.804 86.000 132.000 C 86.000 155.196 104.804 174.000 128.000 174.000 C 151.196 174.000 170.000 155.196 170.000 132.000 C 170.000 108.804 151.196 90.000 128.000 90.000 ZM 128.000 162.000 C 111.431 162.000 98.000 148.569 98.000 132.000 C 98.000 115.431 111.431 102.000 128.000 102.000 C 144.569 102.000 158.000 115.431 158.000 132.000 C 158.000 148.569 144.569 162.000 128.000 162.000 Z"),
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
