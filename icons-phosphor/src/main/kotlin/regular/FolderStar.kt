package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorRegularIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.560 200.000 L 40.000 200.000 L 40.000 88.000 L 216.000 88.000 L 216.000 120.000 C 216.000 124.418 219.582 128.000 224.000 128.000 C 228.418 128.000 232.000 124.418 232.000 120.000 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 L 131.310 72.000 L 104.000 44.690 C 101.010 41.676 96.936 39.986 92.690 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.620 C 24.011 209.110 30.890 215.989 39.380 216.000 L 120.560 216.000 C 124.978 216.000 128.560 212.418 128.560 208.000 C 128.560 203.582 124.978 200.000 120.560 200.000 ZM 92.690 56.000 L 108.690 72.000 L 40.000 72.000 L 40.000 56.000 ZM 239.630 159.200 C 238.646 156.094 235.878 153.895 232.630 153.640 L 202.790 151.330 L 191.360 124.830 C 190.098 121.892 187.207 119.989 184.010 119.989 C 180.813 119.989 177.922 121.892 176.660 124.830 L 165.230 151.330 L 135.390 153.640 C 132.141 153.896 129.373 156.097 128.391 159.204 C 127.408 162.311 128.409 165.703 130.920 167.780 L 153.430 186.370 L 146.580 214.080 C 145.811 217.204 146.988 220.484 149.567 222.406 C 152.146 224.329 155.626 224.519 158.400 222.890 L 184.000 207.820 L 209.610 222.890 C 212.384 224.519 215.864 224.329 218.443 222.406 C 221.022 220.484 222.199 217.204 221.430 214.080 L 214.580 186.370 L 237.090 167.780 C 239.607 165.705 240.612 162.310 239.630 159.200 ZM 200.510 177.200 C 198.135 179.157 197.093 182.302 197.830 185.290 L 201.330 199.410 L 188.060 191.600 C 185.554 190.124 182.446 190.124 179.940 191.600 L 166.670 199.410 L 170.170 185.290 C 170.907 182.302 169.865 179.157 167.490 177.200 L 156.380 168.020 L 171.270 166.870 C 174.230 166.643 176.821 164.795 178.000 162.070 L 184.000 148.150 L 190.000 162.070 C 191.179 164.795 193.770 166.643 196.730 166.870 L 211.620 168.020 Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
