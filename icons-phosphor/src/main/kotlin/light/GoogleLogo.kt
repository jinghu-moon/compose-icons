package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorLightIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 128.000 C 221.999 173.692 189.143 212.765 144.129 220.605 C 99.115 228.445 54.983 202.780 39.535 159.779 C 24.087 116.778 41.798 68.897 81.511 46.300 C 121.223 23.702 171.433 32.934 200.510 68.180 C 201.931 69.826 202.350 72.112 201.605 74.156 C 200.860 76.199 199.068 77.679 196.921 78.024 C 194.774 78.370 192.608 77.526 191.260 75.820 C 166.259 45.507 123.268 37.190 88.765 55.991 C 54.262 74.791 37.945 115.425 49.863 152.867 C 61.782 190.309 98.586 214.034 137.608 209.430 C 176.631 204.826 206.902 173.188 209.780 134.000 L 128.000 134.000 C 124.686 134.000 122.000 131.314 122.000 128.000 C 122.000 124.686 124.686 122.000 128.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
