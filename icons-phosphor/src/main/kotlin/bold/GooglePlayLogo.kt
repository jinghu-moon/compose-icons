package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorBoldIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.790 110.700 L 74.000 14.650 C 67.758 11.099 60.101 11.122 53.880 14.710 C 47.740 18.221 43.965 24.766 44.000 31.840 L 44.000 224.160 C 43.971 231.240 47.758 237.786 53.910 241.290 C 60.130 244.882 67.789 244.905 74.030 241.350 L 241.790 145.350 C 248.090 141.873 252.002 135.246 252.002 128.050 C 252.002 120.854 248.090 114.227 241.790 110.750 ZM 68.000 203.000 L 68.000 53.000 L 143.000 128.000 ZM 160.000 145.000 L 172.400 157.400 L 114.400 190.600 ZM 114.410 65.430 L 172.410 98.630 L 160.000 111.000 ZM 194.000 145.000 L 177.000 128.000 L 194.000 111.000 L 223.720 128.000 Z"),
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
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
