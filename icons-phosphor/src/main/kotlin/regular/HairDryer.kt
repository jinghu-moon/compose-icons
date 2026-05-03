package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorRegularIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 88.000 C 200.000 70.327 185.673 56.000 168.000 56.000 C 150.327 56.000 136.000 70.327 136.000 88.000 C 136.000 105.673 150.327 120.000 168.000 120.000 C 185.673 120.000 200.000 105.673 200.000 88.000 ZM 168.000 104.000 C 159.163 104.000 152.000 96.837 152.000 88.000 C 152.000 79.163 159.163 72.000 168.000 72.000 C 176.837 72.000 184.000 79.163 184.000 88.000 C 184.000 96.837 176.837 104.000 168.000 104.000 ZM 177.420 206.620 L 209.000 137.070 C 229.626 119.799 237.250 91.474 228.080 66.183 C 218.909 40.892 194.902 24.037 168.000 24.000 C 167.558 24.002 167.116 24.039 166.680 24.110 L 29.370 47.000 C 21.656 48.286 16.001 54.959 16.000 62.780 L 16.000 113.220 C 16.001 121.041 21.656 127.714 29.370 129.000 L 128.000 145.440 L 128.000 200.000 C 128.000 208.837 135.163 216.000 144.000 216.000 C 144.000 238.091 161.909 256.000 184.000 256.000 L 200.000 256.000 C 204.418 256.000 208.000 252.418 208.000 248.000 C 208.000 243.582 204.418 240.000 200.000 240.000 L 184.000 240.000 C 170.745 240.000 160.000 229.255 160.000 216.000 L 162.850 216.000 C 169.126 216.001 174.823 212.334 177.420 206.620 ZM 32.000 62.780 L 168.640 40.000 C 195.150 40.000 216.640 61.490 216.640 88.000 C 216.640 114.510 195.150 136.000 168.640 136.000 L 32.000 113.230 ZM 166.680 151.890 C 167.116 151.961 167.558 151.998 168.000 152.000 C 174.030 151.998 180.030 151.143 185.820 149.460 L 162.820 200.000 L 144.000 200.000 L 144.000 148.110 Z"),
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
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
