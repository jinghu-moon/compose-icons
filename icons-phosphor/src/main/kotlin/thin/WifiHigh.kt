package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorThinIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 204.000 C 136.000 208.418 132.418 212.000 128.000 212.000 C 123.582 212.000 120.000 208.418 120.000 204.000 C 120.000 199.582 123.582 196.000 128.000 196.000 C 132.418 196.000 136.000 199.582 136.000 204.000 ZM 234.540 90.100 C 172.598 39.296 83.402 39.296 21.460 90.100 C 20.349 91.005 19.807 92.436 20.040 93.850 C 20.272 95.264 21.244 96.446 22.586 96.948 C 23.928 97.450 25.437 97.195 26.540 96.280 C 85.530 47.903 170.470 47.903 229.460 96.280 C 231.167 97.671 233.678 97.420 235.077 95.719 C 236.475 94.018 236.235 91.506 234.540 90.100 ZM 202.480 125.910 C 158.829 91.341 97.131 91.341 53.480 125.910 C 51.749 127.291 51.464 129.814 52.845 131.545 C 54.226 133.276 56.749 133.561 58.480 132.180 C 99.209 99.951 156.751 99.951 197.480 132.180 C 199.211 133.561 201.734 133.276 203.115 131.545 C 204.496 129.814 204.211 127.291 202.480 125.910 ZM 170.350 161.770 C 145.102 143.407 110.898 143.407 85.650 161.770 C 84.409 162.576 83.715 164.001 83.845 165.475 C 83.974 166.949 84.907 168.231 86.269 168.808 C 87.632 169.385 89.201 169.162 90.350 168.230 C 112.802 151.924 143.198 151.924 165.650 168.230 C 167.432 169.527 169.927 169.138 171.230 167.360 C 171.855 166.502 172.113 165.431 171.948 164.383 C 171.783 163.334 171.208 162.394 170.350 161.770 Z"),
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
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
