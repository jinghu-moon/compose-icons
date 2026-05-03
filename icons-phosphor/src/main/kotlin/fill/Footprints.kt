package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorFillIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.060 192.000 L 216.060 204.000 C 216.060 223.899 199.929 240.030 180.030 240.030 C 160.131 240.030 144.000 223.899 144.000 204.000 L 144.000 192.000 C 144.000 187.582 147.582 184.000 152.000 184.000 L 208.000 184.000 C 210.132 183.984 212.182 184.820 213.696 186.322 C 215.209 187.824 216.060 189.868 216.060 192.000 ZM 104.000 160.000 L 48.000 160.000 C 43.582 160.000 40.000 163.582 40.000 168.000 L 40.000 180.000 C 40.000 199.882 56.118 216.000 76.000 216.000 C 95.882 216.000 112.000 199.882 112.000 180.000 L 112.000 168.000 C 112.000 163.582 108.418 160.000 104.000 160.000 ZM 76.000 16.000 C 64.360 16.000 53.070 26.310 44.200 45.000 C 30.270 74.380 25.640 118.000 44.490 141.000 C 46.012 142.858 48.288 143.934 50.690 143.930 L 101.240 143.930 C 103.642 143.934 105.918 142.858 107.440 141.000 C 126.290 118.000 121.660 74.350 107.730 45.000 C 98.850 26.310 87.570 16.000 76.000 16.000 ZM 154.800 168.000 L 205.350 168.000 C 207.752 168.004 210.028 166.928 211.550 165.070 C 230.400 142.070 225.770 98.420 211.840 69.070 C 202.930 50.310 191.640 40.000 180.000 40.000 C 168.360 40.000 157.110 50.310 148.230 69.000 C 134.300 98.380 129.670 142.000 148.520 165.000 C 150.037 166.895 152.333 167.998 154.760 168.000 Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
