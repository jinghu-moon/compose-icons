package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorThinIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.890 117.690 L 70.050 21.620 C 66.304 19.426 61.666 19.426 57.920 21.620 C 54.235 23.711 51.970 27.633 52.000 31.870 L 52.000 224.130 C 51.984 228.353 54.247 232.256 57.920 234.340 C 61.666 236.534 66.304 236.534 70.050 234.340 L 237.820 138.340 C 241.611 136.294 243.980 132.339 243.995 128.031 C 244.009 123.723 241.667 119.752 237.890 117.680 ZM 185.450 96.890 L 160.000 122.340 L 66.400 28.750 ZM 60.000 222.330 L 60.000 33.670 L 154.340 128.000 ZM 66.400 227.250 L 160.000 133.660 L 185.450 159.110 ZM 233.910 131.370 L 192.650 155.000 L 165.650 128.000 L 192.650 101.000 L 234.000 124.660 C 235.252 125.318 236.030 126.622 236.016 128.036 C 236.001 129.451 235.196 130.738 233.930 131.370 Z"),
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
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
