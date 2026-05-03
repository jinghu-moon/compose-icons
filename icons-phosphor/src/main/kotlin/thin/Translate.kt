package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorThinIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.580 214.210 L 187.580 102.210 C 186.903 100.852 185.517 99.994 184.000 99.994 C 182.483 99.994 181.097 100.852 180.420 102.210 L 157.550 148.000 C 137.264 147.431 117.735 140.175 102.000 127.360 C 120.210 109.552 130.912 85.450 131.910 60.000 L 160.000 60.000 C 162.209 60.000 164.000 58.209 164.000 56.000 C 164.000 53.791 162.209 52.000 160.000 52.000 L 100.000 52.000 L 100.000 32.000 C 100.000 29.791 98.209 28.000 96.000 28.000 C 93.791 28.000 92.000 29.791 92.000 32.000 L 92.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 53.791 28.000 56.000 C 28.000 58.209 29.791 60.000 32.000 60.000 L 123.910 60.000 C 122.898 83.495 112.908 105.705 96.000 122.050 C 85.779 112.174 77.985 100.064 73.230 86.670 C 72.791 85.276 71.626 84.233 70.193 83.949 C 68.760 83.665 67.285 84.185 66.348 85.306 C 65.410 86.426 65.158 87.969 65.690 89.330 C 70.777 103.688 79.090 116.688 89.990 127.330 C 73.624 140.705 53.136 148.007 32.000 148.000 C 29.791 148.000 28.000 149.791 28.000 152.000 C 28.000 154.209 29.791 156.000 32.000 156.000 C 55.398 156.026 78.058 147.808 96.000 132.790 C 112.297 146.374 132.488 154.428 153.660 155.790 L 124.440 214.220 C 123.451 216.197 124.253 218.601 126.230 219.590 C 128.207 220.579 130.611 219.777 131.600 217.800 L 146.470 188.000 L 221.530 188.000 L 236.420 217.790 C 237.098 219.145 238.484 220.001 240.000 220.000 C 240.621 219.997 241.233 219.853 241.790 219.580 C 242.740 219.106 243.462 218.273 243.798 217.266 C 244.134 216.259 244.055 215.159 243.580 214.210 ZM 150.470 180.000 L 184.000 112.940 L 217.530 180.000 Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
