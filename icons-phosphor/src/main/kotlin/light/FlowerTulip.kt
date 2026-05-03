package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorLightIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 50.000 C 195.504 49.992 183.157 52.723 171.830 58.000 C 157.160 32.100 131.830 19.210 130.680 18.630 C 128.993 17.788 127.007 17.788 125.320 18.630 C 124.180 19.210 98.840 32.100 84.170 58.000 C 72.843 52.723 60.496 49.992 48.000 50.000 C 44.686 50.000 42.000 52.686 42.000 56.000 L 42.000 96.000 C 42.060 141.141 76.972 178.572 122.000 181.770 L 122.000 222.290 L 82.680 202.630 C 79.714 201.150 76.110 202.354 74.630 205.320 C 73.150 208.286 74.354 211.890 77.320 213.370 L 125.320 237.370 C 127.007 238.212 128.993 238.212 130.680 237.370 L 178.680 213.370 C 181.646 211.890 182.850 208.286 181.370 205.320 C 179.890 202.354 176.286 201.150 173.320 202.630 L 134.000 222.290 L 134.000 181.770 C 179.028 178.572 213.940 141.141 214.000 96.000 L 214.000 56.000 C 214.000 52.686 211.314 50.000 208.000 50.000 ZM 128.000 30.880 C 134.460 34.720 151.070 45.880 161.330 63.820 C 146.267 73.592 134.619 87.809 128.000 104.500 C 121.381 87.809 109.733 73.592 94.670 63.820 C 104.930 45.830 121.540 34.710 128.000 30.880 ZM 54.000 96.000 L 54.000 62.240 C 92.392 65.416 121.949 97.477 122.000 136.000 L 122.000 169.760 C 83.605 166.589 54.046 134.525 54.000 96.000 ZM 202.000 96.000 C 201.954 134.525 172.395 166.589 134.000 169.760 L 134.000 136.000 C 134.051 97.477 163.608 65.416 202.000 62.240 Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
