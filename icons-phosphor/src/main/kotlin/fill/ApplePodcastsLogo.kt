package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) return _applePodcastsLogo!!
        _applePodcastsLogo = phosphorFillIcon(
            name = "ApplePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 159.800 151.820 C 163.582 156.636 164.906 162.939 163.380 168.870 L 151.200 216.870 C 148.891 225.816 140.799 232.050 131.560 232.000 L 124.440 232.000 C 115.201 232.050 107.109 225.816 104.800 216.870 L 92.620 168.870 C 91.094 162.939 92.418 156.636 96.200 151.820 C 100.032 146.872 105.942 143.984 112.200 144.000 L 143.700 144.000 C 149.993 143.952 155.947 146.845 159.800 151.820 ZM 156.000 116.000 C 156.000 100.536 143.464 88.000 128.000 88.000 C 112.536 88.000 100.000 100.536 100.000 116.000 C 100.000 131.464 112.536 144.000 128.000 144.000 C 143.464 144.000 156.000 131.464 156.000 116.000 ZM 182.000 143.000 C 181.160 145.776 181.888 148.790 183.904 150.876 C 185.920 152.962 188.906 153.794 191.710 153.049 C 194.514 152.305 196.695 150.101 197.410 147.290 C 205.560 117.969 194.395 86.690 169.520 69.157 C 144.646 51.625 111.434 51.625 86.560 69.157 C 61.685 86.690 50.520 117.969 58.670 147.290 C 60.169 151.114 64.319 153.181 68.274 152.075 C 72.229 150.968 74.704 147.046 74.000 143.000 C 67.742 120.216 76.457 95.955 95.784 82.362 C 115.111 68.769 140.889 68.769 160.216 82.362 C 179.543 95.955 188.258 120.216 182.000 143.000 ZM 128.000 24.000 C 82.191 23.991 41.770 53.955 28.463 97.789 C 15.156 141.623 32.097 189.001 70.180 214.460 C 73.853 216.918 78.822 215.933 81.280 212.260 C 83.738 208.587 82.753 203.618 79.080 201.160 C 46.865 179.616 32.537 139.532 43.794 102.448 C 55.052 65.364 89.245 40.011 128.000 40.011 C 166.755 40.011 200.948 65.364 212.206 102.448 C 223.463 139.532 209.135 179.616 176.920 201.160 C 173.247 203.618 172.262 208.587 174.720 212.260 C 177.178 215.933 182.147 216.918 185.820 214.460 C 223.903 189.001 240.844 141.623 227.537 97.789 C 214.230 53.955 173.809 23.991 128.000 24.000 Z"),
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
