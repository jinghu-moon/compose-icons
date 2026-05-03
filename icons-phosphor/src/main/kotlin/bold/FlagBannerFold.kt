package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorBoldIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.090 41.500 C 239.880 38.071 236.080 35.999 232.000 36.000 L 152.000 36.000 C 147.304 35.996 143.037 38.731 141.080 43.000 L 133.360 60.000 L 28.000 60.000 C 23.251 60.000 18.949 62.802 17.027 67.145 C 15.106 71.488 15.926 76.555 19.120 80.070 L 51.780 116.000 L 19.120 151.930 C 15.926 155.445 15.106 160.512 17.027 164.855 C 18.949 169.198 23.251 172.000 28.000 172.000 L 101.090 172.000 C 105.783 172.001 110.045 169.266 112.000 165.000 L 119.710 148.000 L 173.340 148.000 L 141.060 219.000 C 138.299 225.036 140.954 232.169 146.990 234.930 C 153.026 237.691 160.159 235.036 162.920 229.000 L 242.920 53.000 C 244.624 49.276 244.311 44.941 242.090 41.500 ZM 55.130 148.000 L 76.880 124.070 C 81.038 119.494 81.038 112.506 76.880 107.930 L 55.130 84.000 L 122.450 84.000 L 93.360 148.000 ZM 184.270 124.000 L 130.640 124.000 L 159.730 60.000 L 213.360 60.000 Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
