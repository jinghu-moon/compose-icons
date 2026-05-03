package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorFillIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 83.220 C 125.744 79.559 123.059 76.182 120.000 73.160 L 120.000 40.000 L 104.000 40.000 C 99.582 40.000 96.000 36.418 96.000 32.000 C 96.000 27.582 99.582 24.000 104.000 24.000 L 120.000 24.000 L 120.000 8.000 C 120.000 3.582 123.582 0.000 128.000 0.000 C 132.418 -0.000 136.000 3.582 136.000 8.000 L 136.000 24.000 L 152.000 24.000 C 156.418 24.000 160.000 27.582 160.000 32.000 C 160.000 36.418 156.418 40.000 152.000 40.000 L 136.000 40.000 L 136.000 73.160 C 132.941 76.182 130.256 79.559 128.000 83.220 ZM 180.000 56.000 C 162.260 56.000 146.790 62.480 136.000 73.160 L 136.000 176.000 C 136.000 180.418 132.418 184.000 128.000 184.000 C 123.582 184.000 120.000 180.418 120.000 176.000 L 120.000 73.160 C 109.210 62.480 93.740 56.000 76.000 56.000 C 42.879 56.039 16.039 82.879 16.000 116.000 C 16.000 145.860 30.540 164.850 42.730 175.520 C 49.136 181.103 56.296 185.755 64.000 189.340 L 64.000 208.000 C 64.000 216.837 71.163 224.000 80.000 224.000 L 176.000 224.000 C 184.837 224.000 192.000 216.837 192.000 208.000 L 192.000 189.340 C 199.704 185.755 206.864 181.103 213.270 175.520 C 225.460 164.850 240.000 145.860 240.000 116.000 C 239.961 82.879 213.121 56.039 180.000 56.000 Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
