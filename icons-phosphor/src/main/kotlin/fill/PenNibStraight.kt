package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorFillIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.330 123.890 C 222.270 123.760 222.210 123.630 222.140 123.510 L 192.000 69.910 L 192.000 32.000 C 192.000 23.163 184.837 16.000 176.000 16.000 L 80.000 16.000 C 71.163 16.000 64.000 23.163 64.000 32.000 L 64.000 69.900 L 33.860 123.510 C 33.790 123.630 33.730 123.760 33.660 123.890 C 30.998 129.249 31.561 135.649 35.120 140.460 L 35.230 140.600 L 112.840 241.410 C 113.883 242.755 115.663 243.292 117.276 242.749 C 118.889 242.206 119.982 240.702 120.000 239.000 L 120.000 154.630 C 108.980 150.734 102.369 139.465 104.346 127.944 C 106.322 116.424 116.311 108.003 128.000 108.003 C 139.689 108.003 149.678 116.424 151.654 127.944 C 153.631 139.465 147.020 150.734 136.000 154.630 L 136.000 239.000 C 136.005 240.707 137.094 242.223 138.710 242.774 C 140.326 243.325 142.113 242.789 143.160 241.440 L 220.760 140.630 L 220.870 140.490 C 224.445 135.674 225.009 129.257 222.330 123.890 ZM 176.000 64.000 L 80.000 64.000 L 80.000 32.000 L 176.000 32.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
