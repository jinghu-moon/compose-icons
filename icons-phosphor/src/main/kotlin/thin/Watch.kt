package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorThinIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 128.000 C 203.992 103.246 191.920 80.049 171.650 65.840 L 165.130 29.840 C 164.087 24.138 159.117 19.997 153.320 20.000 L 102.680 20.000 C 96.877 19.999 91.905 24.150 90.870 29.860 L 84.350 65.860 C 64.072 80.062 51.996 103.263 51.996 128.020 C 51.996 152.777 64.072 175.978 84.350 190.180 L 90.870 226.180 C 91.922 231.874 96.890 236.005 102.680 236.000 L 153.320 236.000 C 159.123 236.001 164.095 231.850 165.130 226.140 L 171.650 190.140 C 191.914 175.935 203.986 152.747 204.000 128.000 ZM 98.740 31.290 C 99.084 29.384 100.743 27.998 102.680 28.000 L 153.320 28.000 C 155.257 27.998 156.916 29.384 157.260 31.290 L 162.520 60.290 C 140.858 49.197 115.182 49.197 93.520 60.290 ZM 157.260 224.710 C 156.916 226.616 155.257 228.002 153.320 228.000 L 102.680 228.000 C 100.743 228.002 99.084 226.616 98.740 224.710 L 93.480 195.710 C 115.142 206.803 140.818 206.803 162.480 195.710 ZM 128.000 196.000 C 90.445 196.000 60.000 165.555 60.000 128.000 C 60.000 90.445 90.445 60.000 128.000 60.000 C 165.555 60.000 196.000 90.445 196.000 128.000 C 195.961 165.539 165.539 195.961 128.000 196.000 ZM 172.000 128.000 C 172.000 130.209 170.209 132.000 168.000 132.000 L 128.000 132.000 C 125.791 132.000 124.000 130.209 124.000 128.000 L 124.000 88.000 C 124.000 85.791 125.791 84.000 128.000 84.000 C 130.209 84.000 132.000 85.791 132.000 88.000 L 132.000 124.000 L 168.000 124.000 C 170.209 124.000 172.000 125.791 172.000 128.000 Z"),
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
