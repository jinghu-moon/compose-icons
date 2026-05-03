package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorFillIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.090 167.780 L 214.580 186.370 L 221.430 214.080 C 222.199 217.204 221.022 220.484 218.443 222.406 C 215.864 224.329 212.384 224.519 209.610 222.890 L 184.000 207.820 L 158.390 222.890 C 155.616 224.519 152.136 224.329 149.557 222.406 C 146.978 220.484 145.801 217.204 146.570 214.080 L 153.420 186.370 L 130.910 167.780 C 128.399 165.703 127.398 162.311 128.381 159.204 C 129.363 156.097 132.131 153.896 135.380 153.640 L 165.220 151.330 L 176.650 124.830 C 177.912 121.892 180.803 119.989 184.000 119.989 C 187.197 119.989 190.088 121.892 191.350 124.830 L 202.780 151.330 L 232.620 153.640 C 235.869 153.896 238.637 156.097 239.619 159.204 C 240.602 162.311 239.601 165.703 237.090 167.780 ZM 128.560 208.000 C 128.560 212.418 124.978 216.000 120.560 216.000 L 39.380 216.000 C 30.890 215.989 24.011 209.110 24.000 200.620 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 92.690 40.000 C 96.936 39.986 101.010 41.676 104.000 44.690 L 131.310 72.000 L 216.000 72.000 C 224.837 72.000 232.000 79.163 232.000 88.000 L 232.000 120.000 C 232.000 124.418 228.418 128.000 224.000 128.000 C 219.582 128.000 216.000 124.418 216.000 120.000 L 216.000 88.000 L 40.000 88.000 L 40.000 200.000 L 120.560 200.000 C 124.978 200.000 128.560 203.582 128.560 208.000 ZM 40.000 72.000 L 108.690 72.000 L 92.690 56.000 L 40.000 56.000 Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
