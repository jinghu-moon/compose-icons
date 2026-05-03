package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorThinIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 155.540 167.870 C 155.045 168.810 154.196 169.514 153.181 169.827 C 152.166 170.140 151.069 170.037 150.130 169.540 C 136.312 162.110 119.688 162.110 105.870 169.540 C 105.292 169.841 104.651 169.998 104.000 170.000 C 102.159 170.004 100.553 168.750 100.110 166.963 C 99.667 165.176 100.501 163.317 102.130 162.460 C 118.317 153.910 137.683 153.910 153.870 162.460 C 154.810 162.955 155.514 163.804 155.827 164.819 C 156.140 165.834 156.037 166.931 155.540 167.870 ZM 187.540 111.870 C 186.501 113.819 184.080 114.558 182.130 113.520 C 148.320 95.420 107.700 95.420 73.890 113.520 C 71.946 114.513 69.566 113.764 68.540 111.838 C 67.514 109.912 68.222 107.519 70.130 106.460 C 106.290 87.105 149.730 87.105 185.890 106.460 C 187.836 107.502 188.569 109.923 187.530 111.870 ZM 171.540 139.870 C 170.501 141.819 168.080 142.558 166.130 141.520 C 142.305 128.812 113.715 128.812 89.890 141.520 C 87.946 142.513 85.566 141.764 84.540 139.838 C 83.514 137.912 84.222 135.519 86.130 134.460 C 112.305 120.501 143.715 120.501 169.890 134.460 C 170.827 134.960 171.527 135.813 171.834 136.830 C 172.142 137.847 172.032 138.944 171.530 139.880 Z"),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
