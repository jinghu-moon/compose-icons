package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorBoldIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 ZM 96.000 128.000 C 96.000 121.373 90.627 116.000 84.000 116.000 L 44.470 116.000 C 47.516 94.619 58.692 75.238 75.670 61.890 L 95.380 96.000 C 97.481 99.797 101.468 102.163 105.808 102.189 C 110.147 102.215 114.162 99.897 116.309 96.125 C 118.455 92.354 118.398 87.718 116.160 84.000 L 94.160 46.000 C 91.350 41.128 86.618 37.664 81.125 36.457 C 75.631 35.251 69.883 36.413 65.290 39.660 C 39.435 57.890 22.888 86.553 20.030 118.060 C 19.527 123.706 21.417 129.304 25.240 133.490 C 29.028 137.636 34.384 139.998 40.000 140.000 L 84.000 140.000 C 90.627 140.000 96.000 134.627 96.000 128.000 ZM 235.920 118.060 C 233.065 86.555 216.517 57.894 190.660 39.670 C 186.068 36.422 180.321 35.258 174.828 36.463 C 169.334 37.667 164.602 41.129 161.790 46.000 L 139.840 84.000 C 136.672 89.724 138.673 96.931 144.338 100.202 C 150.004 103.474 157.246 101.605 160.620 96.000 L 180.330 61.870 C 197.312 75.222 208.489 94.612 211.530 116.000 L 172.000 116.000 C 165.373 116.000 160.000 121.373 160.000 128.000 C 160.000 134.627 165.373 140.000 172.000 140.000 L 216.000 140.000 C 221.598 139.984 226.934 137.623 230.710 133.490 C 234.533 129.304 236.423 123.706 235.920 118.060 ZM 160.400 160.110 C 157.086 154.369 149.746 152.401 144.005 155.715 C 138.264 159.029 136.296 166.369 139.610 172.110 L 159.190 206.000 C 139.161 213.973 116.839 213.973 96.810 206.000 L 116.390 172.090 C 119.704 166.349 117.736 159.009 111.995 155.695 C 106.254 152.381 98.914 154.349 95.600 160.090 L 73.780 197.890 C 70.971 202.753 70.336 208.574 72.031 213.929 C 73.726 219.283 77.594 223.679 82.690 226.040 C 111.443 239.293 144.557 239.293 173.310 226.040 C 178.406 223.679 182.274 219.283 183.969 213.929 C 185.664 208.574 185.029 202.753 182.220 197.890 Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
