package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorLightIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 26.220 94.410 C 26.076 94.928 26.002 95.463 26.000 96.000 L 26.000 112.000 C 25.995 124.316 31.958 135.870 42.000 143.000 L 42.000 216.000 C 42.000 219.314 44.686 222.000 48.000 222.000 L 208.000 222.000 C 211.314 222.000 214.000 219.314 214.000 216.000 L 214.000 143.000 C 224.042 135.870 230.005 124.316 230.000 112.000 L 230.000 96.000 C 230.001 95.445 229.923 94.893 229.770 94.360 L 215.430 44.150 C 213.694 38.166 208.230 34.037 202.000 34.000 L 54.000 34.000 C 47.770 34.037 42.306 38.166 40.570 44.150 ZM 52.110 47.410 C 52.366 46.579 53.130 46.009 54.000 46.000 L 202.000 46.000 C 202.892 46.001 203.675 46.593 203.920 47.450 L 216.050 90.000 L 40.000 90.000 ZM 102.000 102.000 L 154.000 102.000 L 154.000 112.000 C 154.000 126.359 142.359 138.000 128.000 138.000 C 113.641 138.000 102.000 126.359 102.000 112.000 ZM 38.000 102.000 L 90.000 102.000 L 90.000 112.000 C 90.010 121.127 85.234 129.591 77.416 134.301 C 69.598 139.010 59.883 139.276 51.820 135.000 C 51.328 134.580 50.770 134.242 50.170 134.000 C 42.602 129.246 38.006 120.938 38.000 112.000 ZM 202.000 210.000 L 54.000 210.000 L 54.000 148.660 C 70.039 153.024 87.052 146.457 96.000 132.450 C 102.969 143.381 115.036 149.999 128.000 149.999 C 140.964 149.999 153.031 143.381 160.000 132.450 C 168.948 146.457 185.962 153.024 202.000 148.660 ZM 205.830 134.000 C 205.230 134.242 204.672 134.580 204.180 135.000 C 196.117 139.276 186.402 139.010 178.584 134.301 C 170.766 129.591 165.990 121.127 166.000 112.000 L 166.000 102.000 L 218.000 102.000 L 218.000 112.000 C 217.994 120.938 213.398 129.246 205.830 134.000 Z"),
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
        return _storefront!!
    }

private var _storefront: ImageVector? = null
