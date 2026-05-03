package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorBoldIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 84.000 C 195.882 84.000 212.000 67.882 212.000 48.000 C 212.000 28.118 195.882 12.000 176.000 12.000 C 156.118 12.000 140.000 28.118 140.000 48.000 C 140.000 67.882 156.118 84.000 176.000 84.000 ZM 176.000 36.000 C 182.627 36.000 188.000 41.373 188.000 48.000 C 188.000 54.627 182.627 60.000 176.000 60.000 C 169.373 60.000 164.000 54.627 164.000 48.000 C 164.000 41.373 169.373 36.000 176.000 36.000 ZM 205.280 132.390 C 207.572 135.179 208.486 138.852 207.770 142.390 L 191.770 222.390 C 190.633 227.986 185.710 232.005 180.000 232.000 C 179.208 232.002 178.417 231.925 177.640 231.770 C 174.518 231.147 171.772 229.310 170.005 226.661 C 168.238 224.013 167.596 220.772 168.220 217.650 L 181.360 152.000 L 124.000 152.000 C 119.711 152.003 115.747 149.717 113.602 146.003 C 111.456 142.290 111.456 137.714 113.600 134.000 L 131.520 102.800 C 105.063 90.776 74.068 94.870 51.640 113.350 C 46.517 117.304 39.181 116.483 35.059 111.494 C 30.936 106.506 31.512 99.147 36.360 94.860 C 70.066 67.049 117.925 64.344 154.550 88.180 C 159.864 91.655 161.552 98.668 158.400 104.180 L 144.740 128.000 L 196.000 128.000 C 199.595 128.000 203.000 129.611 205.280 132.390 ZM 163.810 176.910 C 161.240 210.247 133.442 235.987 100.006 235.991 C 66.570 235.994 38.767 210.259 36.190 176.923 C 33.613 143.587 57.131 113.885 90.170 108.750 C 96.720 107.739 102.849 112.230 103.860 118.780 C 104.871 125.330 100.380 131.459 93.830 132.470 C 73.189 135.692 58.505 154.256 60.120 175.084 C 61.735 195.912 79.107 211.990 99.997 211.991 C 120.888 211.993 138.262 195.918 139.880 175.090 C 140.170 170.788 142.746 166.972 146.627 165.095 C 150.509 163.217 155.099 163.566 158.652 166.009 C 162.205 168.452 164.174 172.614 163.810 176.910 Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
