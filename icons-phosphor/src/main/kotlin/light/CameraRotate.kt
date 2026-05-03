package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorLightIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 58.000 L 179.210 58.000 L 165.000 36.670 C 163.885 34.999 162.008 33.997 160.000 34.000 L 96.000 34.000 C 93.991 33.997 92.115 34.999 91.000 36.670 L 76.780 58.000 L 48.000 58.000 C 35.850 58.000 26.000 67.850 26.000 80.000 L 26.000 192.000 C 26.000 204.150 35.850 214.000 48.000 214.000 L 208.000 214.000 C 220.150 214.000 230.000 204.150 230.000 192.000 L 230.000 80.000 C 230.000 67.850 220.150 58.000 208.000 58.000 ZM 218.000 192.000 C 218.000 197.523 213.523 202.000 208.000 202.000 L 48.000 202.000 C 42.477 202.000 38.000 197.523 38.000 192.000 L 38.000 80.000 C 38.000 74.477 42.477 70.000 48.000 70.000 L 80.000 70.000 C 82.009 70.003 83.885 69.001 85.000 67.330 L 99.210 46.000 L 156.780 46.000 L 171.000 67.330 C 172.115 69.001 173.992 70.003 176.000 70.000 L 208.000 70.000 C 213.523 70.000 218.000 74.477 218.000 80.000 ZM 174.000 96.000 L 174.000 120.000 C 174.000 123.314 171.314 126.000 168.000 126.000 L 144.000 126.000 C 140.686 126.000 138.000 123.314 138.000 120.000 C 138.000 116.686 140.686 114.000 144.000 114.000 L 154.000 114.000 L 152.000 111.910 C 140.012 100.042 121.151 98.716 107.620 108.790 C 104.972 110.784 101.209 110.253 99.215 107.605 C 97.221 104.957 97.752 101.194 100.400 99.200 C 118.741 85.544 144.312 87.360 160.540 103.470 C 160.568 103.508 160.602 103.542 160.640 103.570 L 162.000 105.000 L 162.000 96.000 C 162.000 92.686 164.686 90.000 168.000 90.000 C 171.314 90.000 174.000 92.686 174.000 96.000 ZM 156.800 156.400 C 158.790 159.048 158.258 162.809 155.610 164.800 C 137.272 178.465 111.694 176.648 95.470 160.530 L 95.370 160.430 L 94.000 159.000 L 94.000 168.000 C 94.000 171.314 91.314 174.000 88.000 174.000 C 84.686 174.000 82.000 171.314 82.000 168.000 L 82.000 144.000 C 82.000 140.686 84.686 138.000 88.000 138.000 L 112.000 138.000 C 115.314 138.000 118.000 140.686 118.000 144.000 C 118.000 147.314 115.314 150.000 112.000 150.000 L 102.000 150.000 L 104.000 152.090 C 115.988 163.958 134.849 165.284 148.380 155.210 C 149.653 154.248 151.257 153.832 152.837 154.056 C 154.417 154.279 155.843 155.123 156.800 156.400 Z"),
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
