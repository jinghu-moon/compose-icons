package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorLightIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 90.000 L 173.000 90.000 L 181.890 41.070 C 182.358 38.926 181.618 36.698 179.961 35.260 C 178.304 33.821 175.993 33.402 173.937 34.167 C 171.880 34.932 170.405 36.758 170.090 38.930 L 160.810 90.000 L 109.000 90.000 L 117.890 41.070 C 118.354 37.872 116.202 34.882 113.023 34.305 C 109.844 33.729 106.779 35.773 106.090 38.930 L 96.810 90.000 L 48.000 90.000 C 44.686 90.000 42.000 92.686 42.000 96.000 C 42.000 99.314 44.686 102.000 48.000 102.000 L 94.630 102.000 L 85.170 154.000 L 32.000 154.000 C 28.686 154.000 26.000 156.686 26.000 160.000 C 26.000 163.314 28.686 166.000 32.000 166.000 L 83.000 166.000 L 74.100 214.930 C 73.808 216.499 74.154 218.120 75.061 219.434 C 75.967 220.747 77.359 221.646 78.930 221.930 C 79.284 221.987 79.642 222.011 80.000 222.000 C 82.896 221.993 85.374 219.919 85.890 217.070 L 95.190 166.000 L 147.000 166.000 L 138.110 214.930 C 137.818 216.499 138.164 218.120 139.071 219.434 C 139.977 220.747 141.369 221.646 142.940 221.930 C 143.296 221.998 143.658 222.031 144.020 222.030 C 146.916 222.023 149.394 219.949 149.910 217.100 L 159.190 166.000 L 208.000 166.000 C 211.314 166.000 214.000 163.314 214.000 160.000 C 214.000 156.686 211.314 154.000 208.000 154.000 L 161.370 154.000 L 170.830 102.000 L 224.000 102.000 C 227.314 102.000 230.000 99.314 230.000 96.000 C 230.000 92.686 227.314 90.000 224.000 90.000 ZM 149.170 154.000 L 97.370 154.000 L 106.830 102.000 L 158.630 102.000 Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
