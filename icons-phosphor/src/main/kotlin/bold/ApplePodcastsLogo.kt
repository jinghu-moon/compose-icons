package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) return _applePodcastsLogo!!
        _applePodcastsLogo = phosphorBoldIcon(
            name = "ApplePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 161.360 130.000 C 172.410 113.298 169.405 90.997 154.328 77.816 C 139.251 64.634 116.749 64.634 101.672 77.816 C 86.595 90.997 83.590 113.298 94.640 130.000 C 92.968 131.328 91.452 132.841 90.120 134.510 C 84.789 141.156 82.792 149.876 84.700 158.180 L 97.450 214.180 C 100.295 226.972 111.666 236.054 124.770 236.000 L 131.230 236.000 C 144.325 236.057 155.693 226.990 158.550 214.210 L 171.300 158.210 C 173.208 149.906 171.211 141.186 165.880 134.540 C 164.550 132.861 163.033 131.338 161.360 130.000 ZM 128.000 92.000 C 136.837 92.000 144.000 99.163 144.000 108.000 C 144.000 116.837 136.837 124.000 128.000 124.000 C 119.163 124.000 112.000 116.837 112.000 108.000 C 112.000 99.163 119.163 92.000 128.000 92.000 ZM 147.890 152.880 L 135.150 208.880 C 134.737 210.711 133.107 212.008 131.230 212.000 L 124.770 212.000 C 122.893 212.008 121.263 210.711 120.850 208.880 L 108.110 152.880 C 107.831 151.698 108.115 150.453 108.880 149.510 C 109.637 148.559 110.785 148.003 112.000 148.000 L 144.000 148.000 C 145.226 147.994 146.387 148.551 147.150 149.510 C 147.904 150.459 148.178 151.703 147.890 152.880 ZM 236.000 128.000 C 236.006 159.651 222.113 189.708 198.000 210.210 C 192.931 213.916 185.861 213.088 181.787 208.310 C 177.712 203.532 178.010 196.420 182.470 192.000 C 209.266 169.175 218.989 132.064 206.827 99.032 C 194.666 66.001 163.199 44.055 128.000 44.055 C 92.801 44.055 61.334 66.001 49.173 99.032 C 37.011 132.064 46.734 169.175 73.530 192.000 C 77.990 196.420 78.288 203.532 74.213 208.310 C 70.139 213.088 63.069 213.916 58.000 210.210 C 19.953 177.827 9.084 123.575 31.721 79.035 C 54.357 34.495 104.588 11.296 153.174 22.941 C 201.760 34.587 236.016 78.038 236.000 128.000 Z"),
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
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
