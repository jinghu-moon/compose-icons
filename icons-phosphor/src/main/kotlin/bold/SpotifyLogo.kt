package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorBoldIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 194.590 127.640 C 193.090 130.447 190.537 132.544 187.491 133.469 C 184.445 134.393 181.157 134.070 178.350 132.570 C 146.894 115.734 109.106 115.734 77.650 132.570 C 75.915 133.510 73.973 134.002 72.000 134.000 C 66.497 133.999 61.701 130.255 60.363 124.918 C 59.025 119.580 61.488 114.017 66.340 111.420 C 104.854 90.799 151.126 90.799 189.640 111.420 C 195.482 114.535 197.697 121.794 194.590 127.640 ZM 178.590 163.640 C 177.102 166.457 174.556 168.567 171.512 169.505 C 168.467 170.443 165.175 170.132 162.360 168.640 C 140.886 157.184 115.114 157.184 93.640 168.640 C 87.809 171.618 80.668 169.373 77.590 163.594 C 74.512 157.815 76.635 150.636 82.360 147.460 C 110.886 132.249 145.114 132.249 173.640 147.460 C 179.459 150.575 181.670 157.803 178.590 163.640 Z"),
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
