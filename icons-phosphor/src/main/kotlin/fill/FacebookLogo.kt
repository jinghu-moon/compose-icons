package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorFillIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 128.000 C 231.932 180.598 192.661 224.892 140.450 231.260 C 139.314 231.389 138.176 231.025 137.326 230.260 C 136.475 229.496 135.993 228.404 136.000 227.260 L 136.000 152.000 L 160.000 152.000 C 162.217 152.005 164.336 151.090 165.853 149.473 C 167.369 147.856 168.147 145.682 168.000 143.470 C 167.633 139.202 164.033 135.942 159.750 136.000 L 136.000 136.000 L 136.000 112.000 C 136.000 103.163 143.163 96.000 152.000 96.000 L 168.000 96.000 C 170.217 96.005 172.336 95.090 173.853 93.473 C 175.369 91.856 176.147 89.682 176.000 87.470 C 175.633 83.195 172.021 79.932 167.730 80.000 L 152.000 80.000 C 134.327 80.000 120.000 94.327 120.000 112.000 L 120.000 136.000 L 96.000 136.000 C 93.783 135.995 91.664 136.910 90.147 138.527 C 88.631 140.144 87.853 142.318 88.000 144.530 C 88.367 148.805 91.979 152.068 96.270 152.000 L 120.000 152.000 L 120.000 227.280 C 120.007 228.422 119.526 229.512 118.677 230.276 C 117.829 231.040 116.695 231.406 115.560 231.280 C 61.850 224.739 22.094 178.161 24.070 124.090 C 26.070 70.090 69.810 26.190 123.850 24.090 C 152.119 22.995 179.617 33.450 200.018 53.051 C 220.418 72.652 231.964 99.709 232.000 128.000 Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
