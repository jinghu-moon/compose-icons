package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorLightIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.840 115.930 L 71.000 19.890 C 66.638 17.343 61.242 17.343 56.880 19.890 C 52.591 22.347 49.960 26.927 50.000 31.870 L 50.000 224.130 C 49.983 229.067 52.628 233.630 56.920 236.070 C 61.282 238.617 66.678 238.617 71.040 236.070 L 238.840 140.070 C 243.256 137.660 246.004 133.031 246.004 128.000 C 246.004 122.969 243.256 118.340 238.840 115.930 ZM 62.000 217.500 L 62.000 38.500 L 151.510 128.000 ZM 160.000 136.500 L 182.190 158.690 L 78.400 218.070 ZM 78.400 37.930 L 182.190 97.330 L 160.000 119.520 ZM 233.000 129.580 L 232.900 129.640 L 193.000 152.490 L 168.490 128.000 L 193.000 103.510 L 232.940 126.360 L 233.040 126.420 C 233.643 126.716 234.025 127.329 234.025 128.000 C 234.025 128.671 233.643 129.284 233.040 129.580 Z"),
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
