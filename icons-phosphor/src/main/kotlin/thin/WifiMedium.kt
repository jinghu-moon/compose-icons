package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorThinIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 204.000 C 136.000 208.418 132.418 212.000 128.000 212.000 C 123.582 212.000 120.000 208.418 120.000 204.000 C 120.000 199.582 123.582 196.000 128.000 196.000 C 132.418 196.000 136.000 199.582 136.000 204.000 ZM 202.480 125.910 C 158.829 91.341 97.131 91.341 53.480 125.910 C 51.749 127.291 51.464 129.814 52.845 131.545 C 54.226 133.276 56.749 133.561 58.480 132.180 C 99.209 99.951 156.751 99.951 197.480 132.180 C 199.211 133.561 201.734 133.276 203.115 131.545 C 204.496 129.814 204.211 127.291 202.480 125.910 ZM 170.350 161.770 C 145.102 143.407 110.898 143.407 85.650 161.770 C 84.437 162.589 83.768 164.005 83.905 165.462 C 84.043 166.919 84.966 168.185 86.311 168.762 C 87.656 169.339 89.209 169.135 90.360 168.230 C 112.800 151.912 143.200 151.912 165.640 168.230 C 166.791 169.135 168.344 169.339 169.689 168.762 C 171.034 168.185 171.957 166.919 172.095 165.462 C 172.232 164.005 171.563 162.589 170.350 161.770 Z"),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
