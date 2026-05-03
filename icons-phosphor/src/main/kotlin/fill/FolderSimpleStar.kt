package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorFillIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 208.000 C 128.000 212.418 124.418 216.000 120.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 93.330 48.000 C 96.791 48.009 100.156 49.131 102.930 51.200 L 130.670 72.000 L 216.000 72.000 C 224.837 72.000 232.000 79.163 232.000 88.000 L 232.000 120.000 C 232.000 124.418 228.418 128.000 224.000 128.000 C 219.582 128.000 216.000 124.418 216.000 120.000 L 216.000 88.000 L 128.000 88.000 C 126.269 88.000 124.585 87.439 123.200 86.400 L 93.330 64.000 L 40.000 64.000 L 40.000 200.000 L 120.000 200.000 C 124.418 200.000 128.000 203.582 128.000 208.000 ZM 239.630 159.200 C 238.646 156.094 235.878 153.895 232.630 153.640 L 202.790 151.330 L 191.360 124.830 C 190.098 121.892 187.207 119.989 184.010 119.989 C 180.813 119.989 177.922 121.892 176.660 124.830 L 165.230 151.330 L 135.390 153.640 C 132.141 153.896 129.373 156.097 128.391 159.204 C 127.408 162.311 128.409 165.703 130.920 167.780 L 153.430 186.370 L 146.580 214.080 C 145.811 217.204 146.988 220.484 149.567 222.406 C 152.146 224.329 155.626 224.519 158.400 222.890 L 184.000 207.820 L 209.610 222.890 C 212.384 224.519 215.864 224.329 218.443 222.406 C 221.022 220.484 222.199 217.204 221.430 214.080 L 214.580 186.370 L 237.090 167.780 C 239.607 165.705 240.612 162.310 239.630 159.200 Z"),
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
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
