package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorFillIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 159.070 169.740 C 157.004 173.644 152.165 175.135 148.260 173.070 C 135.609 166.270 120.391 166.270 107.740 173.070 C 103.850 175.026 99.111 173.512 97.075 169.663 C 95.039 165.815 96.455 161.045 100.260 158.930 C 117.614 149.751 138.386 149.751 155.740 158.930 C 159.644 160.996 161.135 165.835 159.070 169.740 ZM 175.070 141.740 C 172.993 145.639 168.149 147.116 164.250 145.040 C 141.597 132.971 114.423 132.971 91.770 145.040 C 87.883 147.025 83.122 145.529 81.070 141.676 C 79.018 137.824 80.433 133.037 84.250 130.920 C 111.600 116.335 144.420 116.335 171.770 130.920 C 173.646 131.919 175.047 133.624 175.664 135.657 C 176.281 137.691 176.064 139.887 175.060 141.760 ZM 191.070 113.740 C 190.071 115.613 188.368 117.012 186.337 117.629 C 184.306 118.246 182.112 118.031 180.240 117.030 C 147.613 99.554 108.407 99.554 75.780 117.030 C 71.881 119.112 67.032 117.639 64.950 113.740 C 62.868 109.841 64.341 104.992 68.240 102.910 C 105.581 82.926 150.439 82.926 187.780 102.910 C 189.657 103.911 191.058 105.618 191.673 107.654 C 192.289 109.690 192.068 111.887 191.060 113.760 Z"),
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
