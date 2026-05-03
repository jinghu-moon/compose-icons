package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorDuotoneIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 128.000 L 58.320 230.000 C 56.826 228.541 55.989 226.538 56.000 224.450 L 56.000 31.550 C 55.989 29.462 56.826 27.459 58.320 26.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 239.820 114.180 L 72.000 18.160 C 67.019 15.255 60.861 15.255 55.880 18.160 C 50.973 20.974 47.961 26.213 48.000 31.870 L 48.000 224.130 C 47.984 229.781 51.010 235.003 55.920 237.800 C 60.901 240.705 67.059 240.705 72.040 237.800 L 239.820 141.800 C 244.867 139.033 248.005 133.736 248.005 127.980 C 248.005 122.224 244.867 116.927 239.820 114.160 ZM 64.000 212.670 L 64.000 43.330 L 148.690 128.000 ZM 160.000 139.310 L 178.920 158.230 L 90.420 208.890 ZM 90.400 47.100 L 178.930 97.770 L 160.000 116.690 ZM 193.310 150.000 L 171.310 128.000 L 193.310 106.000 L 231.740 128.000 Z"),
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
