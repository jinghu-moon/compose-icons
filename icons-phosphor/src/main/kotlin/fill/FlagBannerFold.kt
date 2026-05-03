package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorFillIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 131.790 69.650 L 88.160 165.650 C 87.513 167.080 86.089 167.998 84.520 168.000 L 28.230 168.000 C 25.668 168.042 23.234 166.884 21.650 164.870 C 19.295 161.799 19.476 157.483 22.080 154.620 L 57.190 116.000 L 22.080 77.380 C 19.471 74.515 19.290 70.193 21.650 67.120 C 23.238 65.112 25.671 63.959 28.230 64.000 L 128.150 64.000 C 129.508 64.001 130.773 64.692 131.509 65.834 C 132.244 66.976 132.350 68.413 131.790 69.650 ZM 237.560 42.240 C 235.992 40.772 233.917 39.970 231.770 40.000 L 168.000 40.000 C 164.864 40.001 162.018 41.835 160.720 44.690 L 118.150 138.340 C 117.585 139.578 117.689 141.019 118.425 142.164 C 119.161 143.308 120.429 144.000 121.790 144.000 L 179.580 144.000 L 144.720 220.690 C 143.446 223.305 143.692 226.406 145.362 228.787 C 147.032 231.169 149.863 232.457 152.756 232.149 C 155.649 231.842 158.147 229.989 159.280 227.310 L 239.280 51.310 C 240.685 48.227 239.996 44.594 237.560 42.240 Z"),
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
