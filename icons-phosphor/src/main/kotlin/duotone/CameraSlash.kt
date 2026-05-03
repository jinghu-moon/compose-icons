package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorDuotoneIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 64.000 L 176.000 64.000 L 160.000 40.000 L 96.000 40.000 L 80.000 64.000 L 48.000 64.000 C 39.163 64.000 32.000 71.163 32.000 80.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 L 208.000 208.000 C 216.837 208.000 224.000 200.837 224.000 192.000 L 224.000 80.000 C 224.000 71.163 216.837 64.000 208.000 64.000 ZM 128.000 168.000 C 108.118 168.000 92.000 151.882 92.000 132.000 C 92.000 112.118 108.118 96.000 128.000 96.000 C 147.882 96.000 164.000 112.118 164.000 132.000 C 164.000 151.882 147.882 168.000 128.000 168.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 51.730 56.000 L 48.000 56.000 C 34.745 56.000 24.000 66.745 24.000 80.000 L 24.000 192.000 C 24.000 205.255 34.745 216.000 48.000 216.000 L 197.190 216.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 105.580 115.230 L 142.580 155.920 C 138.193 158.607 133.145 160.020 128.000 160.000 C 117.402 159.999 107.712 154.014 102.966 144.538 C 98.221 135.061 99.232 123.717 105.580 115.230 ZM 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 L 40.000 80.000 C 40.000 75.582 43.582 72.000 48.000 72.000 L 66.280 72.000 L 94.690 103.260 C 83.451 116.289 80.838 134.675 88.002 150.320 C 95.166 165.964 110.793 175.997 128.000 176.000 C 137.114 175.980 146.000 173.144 153.440 167.880 L 182.640 200.000 ZM 232.000 80.000 L 232.000 186.000 C 232.000 190.418 228.418 194.000 224.000 194.000 C 219.582 194.000 216.000 190.418 216.000 186.000 L 216.000 80.000 C 216.000 75.582 212.418 72.000 208.000 72.000 L 176.000 72.000 C 173.328 71.998 170.833 70.663 169.350 68.440 L 155.710 48.000 L 100.240 48.000 C 97.561 51.323 92.745 51.957 89.297 49.441 C 85.849 46.925 84.983 42.145 87.330 38.580 L 89.330 35.580 C 90.812 33.344 93.317 31.999 96.000 32.000 L 160.000 32.000 C 162.676 31.998 165.175 33.334 166.660 35.560 L 180.280 56.000 L 208.000 56.000 C 221.255 56.000 232.000 66.745 232.000 80.000 Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
