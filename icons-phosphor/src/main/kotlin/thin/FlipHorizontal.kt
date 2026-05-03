package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorThinIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 106.380 28.260 C 100.772 27.022 95.090 30.015 92.940 35.340 L 92.940 35.420 L 29.000 195.320 C 27.434 199.018 27.821 203.254 30.032 206.607 C 32.243 209.959 35.984 211.983 40.000 212.000 L 104.000 212.000 C 110.627 212.000 116.000 206.627 116.000 200.000 L 116.000 40.000 C 116.090 34.263 112.023 29.299 106.380 28.260 ZM 108.000 200.000 C 108.000 202.209 106.209 204.000 104.000 204.000 L 40.000 204.000 C 38.657 204.012 37.401 203.336 36.670 202.210 C 35.913 201.069 35.792 199.620 36.350 198.370 L 100.350 38.430 C 101.116 36.719 102.968 35.770 104.805 36.147 C 106.641 36.524 107.969 38.125 108.000 40.000 ZM 227.070 195.400 L 163.070 35.400 L 163.070 35.320 C 160.860 30.038 155.226 27.053 149.614 28.191 C 144.003 29.330 139.977 34.274 140.000 40.000 L 140.000 200.000 C 140.000 206.627 145.373 212.000 152.000 212.000 L 216.000 212.000 C 220.009 211.999 223.752 209.996 225.978 206.662 C 228.203 203.328 228.617 199.102 227.080 195.400 ZM 219.320 202.210 C 218.591 203.333 217.339 204.008 216.000 204.000 L 152.000 204.000 C 149.791 204.000 148.000 202.209 148.000 200.000 L 148.000 40.000 C 147.920 38.071 149.294 36.387 151.200 36.080 C 151.496 36.021 151.798 35.991 152.100 35.990 C 153.687 35.945 155.124 36.919 155.670 38.410 L 219.670 198.410 C 220.223 199.651 220.091 201.091 219.320 202.210 Z"),
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
