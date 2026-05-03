package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorBoldIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 88.000 C 200.000 70.327 185.673 56.000 168.000 56.000 C 150.327 56.000 136.000 70.327 136.000 88.000 C 136.000 105.673 150.327 120.000 168.000 120.000 C 185.673 120.000 200.000 105.673 200.000 88.000 ZM 168.000 96.000 C 163.582 96.000 160.000 92.418 160.000 88.000 C 160.000 83.582 163.582 80.000 168.000 80.000 C 172.418 80.000 176.000 83.582 176.000 88.000 C 176.000 92.418 172.418 96.000 168.000 96.000 ZM 181.060 208.280 L 212.310 139.520 C 233.837 120.976 241.565 91.003 231.688 64.362 C 221.812 37.722 196.413 20.030 168.000 20.000 C 167.330 19.997 166.661 20.050 166.000 20.160 L 28.710 43.050 C 19.053 44.635 11.974 52.994 12.000 62.780 L 12.000 113.220 C 11.949 123.025 19.034 131.412 28.710 133.000 L 124.000 148.830 L 124.000 200.000 C 124.012 209.759 131.065 218.085 140.690 219.700 C 144.444 240.684 162.683 255.970 184.000 256.000 L 200.000 256.000 C 206.627 256.000 212.000 250.627 212.000 244.000 C 212.000 237.373 206.627 232.000 200.000 232.000 L 184.000 232.000 C 175.973 231.999 168.724 227.200 165.590 219.810 C 172.376 218.856 178.207 214.510 181.060 208.280 ZM 36.000 66.170 L 168.930 44.000 C 193.231 44.000 212.930 63.699 212.930 88.000 C 212.930 112.301 193.231 132.000 168.930 132.000 L 36.000 109.830 ZM 166.000 155.840 C 166.661 155.950 167.330 156.003 168.000 156.000 C 171.634 155.997 175.263 155.702 178.850 155.120 L 160.270 196.000 L 148.000 196.000 L 148.000 152.830 Z"),
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
