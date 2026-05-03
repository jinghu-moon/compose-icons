package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorThinIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.000 35.000 C 219.698 25.721 204.642 25.721 195.340 35.000 L 21.170 209.220 C 20.145 210.249 19.758 211.752 20.159 213.148 C 20.560 214.543 21.685 215.612 23.100 215.940 C 34.674 218.631 46.517 219.994 58.400 220.000 C 97.810 220.000 130.670 204.920 153.180 190.400 C 184.390 170.260 202.410 147.400 203.180 146.490 C 204.424 144.899 204.287 142.630 202.860 141.200 L 179.670 118.000 L 229.000 68.630 C 238.254 59.330 238.254 44.300 229.000 35.000 ZM 194.590 144.270 C 181.135 159.492 165.658 172.799 148.590 183.820 C 110.740 208.170 71.590 216.820 32.040 209.630 L 146.000 95.670 ZM 223.380 63.000 L 174.000 112.360 L 151.660 90.000 L 201.000 40.620 C 207.180 34.440 217.200 34.440 223.380 40.620 C 229.560 46.800 229.560 56.820 223.380 63.000 Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
