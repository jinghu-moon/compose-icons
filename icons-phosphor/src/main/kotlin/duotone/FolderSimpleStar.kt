package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorDuotoneIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 205.600 183.410 L 213.670 216.000 L 184.000 198.540 L 154.330 216.000 L 162.400 183.410 L 136.000 161.610 L 170.650 158.940 L 184.000 128.000 L 197.350 158.940 L 232.000 161.610 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 128.000 208.000 C 128.000 212.418 124.418 216.000 120.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 93.330 48.000 C 96.791 48.009 100.156 49.131 102.930 51.200 L 130.670 72.000 L 216.000 72.000 C 224.837 72.000 232.000 79.163 232.000 88.000 L 232.000 120.000 C 232.000 124.418 228.418 128.000 224.000 128.000 C 219.582 128.000 216.000 124.418 216.000 120.000 L 216.000 88.000 L 128.000 88.000 C 126.269 88.000 124.585 87.439 123.200 86.400 L 93.330 64.000 L 40.000 64.000 L 40.000 200.000 L 120.000 200.000 C 124.418 200.000 128.000 203.582 128.000 208.000 ZM 237.090 167.780 L 214.580 186.370 L 221.430 214.080 C 222.199 217.204 221.022 220.484 218.443 222.406 C 215.864 224.329 212.384 224.519 209.610 222.890 L 184.000 207.820 L 158.390 222.890 C 155.616 224.519 152.136 224.329 149.557 222.406 C 146.978 220.484 145.801 217.204 146.570 214.080 L 153.420 186.370 L 130.910 167.780 C 128.399 165.703 127.398 162.311 128.381 159.204 C 129.363 156.097 132.131 153.896 135.380 153.640 L 165.220 151.330 L 176.650 124.830 C 177.912 121.892 180.803 119.989 184.000 119.989 C 187.197 119.989 190.088 121.892 191.350 124.830 L 202.780 151.330 L 232.620 153.640 C 235.869 153.896 238.637 156.097 239.619 159.204 C 240.602 162.311 239.601 165.703 237.090 167.780 ZM 211.620 168.060 L 196.730 166.910 C 193.770 166.683 191.179 164.835 190.000 162.110 L 184.000 148.190 L 178.000 162.110 C 176.821 164.835 174.230 166.683 171.270 166.910 L 156.380 168.060 L 167.490 177.240 C 169.865 179.197 170.907 182.342 170.170 185.330 L 166.670 199.450 L 179.940 191.640 C 182.446 190.164 185.554 190.164 188.060 191.640 L 201.330 199.450 L 197.830 185.330 C 197.093 182.342 198.135 179.197 200.510 177.240 Z"),
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
