package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorRegularIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.820 114.190 L 72.000 18.160 C 67.019 15.255 60.861 15.255 55.880 18.160 C 50.973 20.974 47.961 26.213 48.000 31.870 L 48.000 224.130 C 47.984 229.781 51.010 235.003 55.920 237.800 C 60.901 240.705 67.059 240.705 72.040 237.800 L 239.820 141.800 C 244.863 139.035 247.997 133.741 247.997 127.990 C 247.997 122.239 244.863 116.945 239.820 114.180 ZM 64.000 212.670 L 64.000 43.330 L 148.690 128.000 ZM 160.000 139.310 L 178.920 158.230 L 90.420 208.890 ZM 90.400 47.100 L 178.930 97.770 L 160.000 116.690 ZM 193.310 150.000 L 171.310 128.000 L 193.310 106.000 L 231.740 128.000 Z"),
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
