package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorLightIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 106.780 26.290 C 100.247 24.914 93.660 28.384 91.100 34.550 C 91.100 34.550 91.100 34.630 91.100 34.670 L 27.100 194.610 C 25.299 198.928 25.773 203.860 28.365 207.755 C 30.956 211.650 35.322 213.993 40.000 214.000 L 104.000 214.000 C 111.732 214.000 118.000 207.732 118.000 200.000 L 118.000 40.000 C 118.046 33.326 113.332 27.565 106.780 26.290 ZM 106.000 200.000 C 106.000 201.105 105.105 202.000 104.000 202.000 L 40.000 202.000 C 39.328 202.003 38.699 201.668 38.327 201.108 C 37.954 200.548 37.888 199.839 38.150 199.220 L 38.200 199.110 L 102.200 39.190 C 102.601 38.360 103.517 37.912 104.418 38.104 C 105.319 38.296 105.972 39.079 106.000 40.000 ZM 228.920 194.610 L 164.920 34.670 C 164.920 34.670 164.920 34.590 164.920 34.550 C 162.346 28.382 155.772 24.894 149.222 26.220 C 142.672 27.546 137.972 33.317 138.000 40.000 L 138.000 200.000 C 138.000 207.732 144.268 214.000 152.000 214.000 L 216.000 214.000 C 220.684 214.003 225.058 211.664 227.657 207.767 C 230.255 203.871 230.733 198.933 228.930 194.610 ZM 217.660 201.100 C 217.299 201.672 216.666 202.013 215.990 202.000 L 152.000 202.000 C 150.895 202.000 150.000 201.105 150.000 200.000 L 150.000 40.000 C 149.895 39.007 150.608 38.115 151.600 38.000 C 151.777 37.961 151.958 37.941 152.140 37.940 C 152.904 37.931 153.587 38.416 153.830 39.140 L 217.830 199.060 L 217.880 199.170 C 218.145 199.808 218.062 200.538 217.660 201.100 Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
