package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorLightIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 128.000 C 205.992 102.888 193.882 79.318 173.470 64.690 L 167.100 29.500 C 165.891 22.839 160.090 17.998 153.320 18.000 L 102.680 18.000 C 95.910 17.998 90.109 22.839 88.900 29.500 L 82.530 64.690 C 62.111 79.313 49.999 102.885 49.999 128.000 C 49.999 153.115 62.111 176.687 82.530 191.310 L 88.900 226.500 C 90.109 233.161 95.910 238.002 102.680 238.000 L 153.320 238.000 C 160.090 238.002 165.891 233.161 167.100 226.500 L 173.470 191.310 C 193.882 176.682 205.992 153.112 206.000 128.000 ZM 100.710 31.640 C 100.886 30.678 101.732 29.984 102.710 30.000 L 153.350 30.000 C 154.328 29.984 155.174 30.678 155.350 31.640 L 159.910 56.830 C 139.653 47.724 116.467 47.724 96.210 56.830 ZM 155.290 224.360 C 155.114 225.322 154.268 226.016 153.290 226.000 L 102.680 226.000 C 101.702 226.016 100.856 225.322 100.680 224.360 L 96.120 199.170 C 116.377 208.276 139.563 208.276 159.820 199.170 ZM 128.000 194.000 C 91.549 194.000 62.000 164.451 62.000 128.000 C 62.000 91.549 91.549 62.000 128.000 62.000 C 164.451 62.000 194.000 91.549 194.000 128.000 C 193.956 164.433 164.433 193.956 128.000 194.000 ZM 174.000 128.000 C 174.000 131.314 171.314 134.000 168.000 134.000 L 128.000 134.000 C 124.686 134.000 122.000 131.314 122.000 128.000 L 122.000 88.000 C 122.000 84.686 124.686 82.000 128.000 82.000 C 131.314 82.000 134.000 84.686 134.000 88.000 L 134.000 122.000 L 168.000 122.000 C 171.314 122.000 174.000 124.686 174.000 128.000 Z"),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
