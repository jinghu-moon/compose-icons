package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorDuotoneIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.011 137.561 222.592 147.069 219.790 156.210 L 156.220 219.790 C 116.604 231.974 73.642 217.357 49.676 183.541 C 25.710 149.726 26.152 104.347 50.773 71.005 C 75.394 37.663 118.633 23.887 158.003 36.840 C 197.374 49.794 223.986 86.553 224.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 174.920 156.000 C 164.630 173.790 147.530 184.000 128.000 184.000 C 108.470 184.000 91.370 173.800 81.080 156.000 C 79.504 153.520 79.414 150.376 80.846 147.809 C 82.278 145.243 85.001 143.669 87.940 143.709 C 90.878 143.749 93.558 145.396 94.920 148.000 C 102.390 160.910 114.130 168.000 128.000 168.000 C 141.870 168.000 153.610 160.900 161.080 148.000 C 162.442 145.396 165.122 143.749 168.060 143.709 C 170.999 143.669 173.722 145.243 175.154 147.809 C 176.586 150.376 176.496 153.520 174.920 156.000 ZM 232.000 128.000 C 232.005 138.357 230.468 148.656 227.440 158.560 C 227.054 159.810 226.367 160.947 225.440 161.870 L 161.870 225.440 C 160.952 226.369 159.818 227.056 158.570 227.440 C 115.653 240.638 69.111 224.803 43.148 188.169 C 17.186 151.535 17.665 102.376 44.338 66.255 C 71.010 30.135 117.852 15.211 160.504 29.244 C 203.156 43.278 231.985 83.099 232.000 128.000 ZM 216.000 128.000 C 215.953 90.248 191.803 56.744 156.003 44.763 C 120.203 32.782 80.751 45.001 57.990 75.120 C 35.230 105.239 34.245 146.528 55.545 177.697 C 76.845 208.866 115.670 222.952 152.000 212.690 L 212.690 152.000 C 214.894 144.191 216.008 136.114 216.000 128.000 ZM 92.000 120.000 C 98.627 120.000 104.000 114.627 104.000 108.000 C 104.000 101.373 98.627 96.000 92.000 96.000 C 85.373 96.000 80.000 101.373 80.000 108.000 C 80.000 114.627 85.373 120.000 92.000 120.000 ZM 164.000 96.000 C 157.373 96.000 152.000 101.373 152.000 108.000 C 152.000 114.627 157.373 120.000 164.000 120.000 C 170.627 120.000 176.000 114.627 176.000 108.000 C 176.000 101.373 170.627 96.000 164.000 96.000 Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
