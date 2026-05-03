package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorLightIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 157.310 168.800 C 156.568 170.209 155.296 171.265 153.775 171.736 C 152.254 172.207 150.608 172.053 149.200 171.310 C 135.963 164.190 120.037 164.190 106.800 171.310 C 103.867 172.856 100.236 171.733 98.690 168.800 C 97.144 165.867 98.267 162.236 101.200 160.690 C 117.968 151.831 138.032 151.831 154.800 160.690 C 156.209 161.432 157.265 162.704 157.736 164.225 C 158.207 165.746 158.053 167.392 157.310 168.800 ZM 189.310 112.800 C 187.747 115.721 184.112 116.823 181.190 115.260 C 147.973 97.480 108.067 97.480 74.850 115.260 C 72.957 116.307 70.646 116.254 68.803 115.120 C 66.960 113.987 65.870 111.949 65.950 109.787 C 66.030 107.625 67.268 105.674 69.190 104.680 C 105.942 85.005 150.098 85.005 186.850 104.680 C 188.255 105.434 189.302 106.716 189.759 108.244 C 190.217 109.771 190.048 111.417 189.290 112.820 ZM 173.310 140.800 C 172.271 142.769 170.227 144.001 168.000 144.000 C 167.017 143.998 166.049 143.758 165.180 143.300 C 141.943 130.905 114.057 130.905 90.820 143.300 C 87.893 144.857 84.257 143.747 82.700 140.820 C 81.143 137.893 82.253 134.257 85.180 132.700 C 111.943 118.428 144.057 118.428 170.820 132.700 C 172.226 133.447 173.278 134.723 173.743 136.246 C 174.208 137.769 174.049 139.415 173.300 140.820 Z"),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
