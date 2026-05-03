package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorDuotoneIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 205.600 159.410 L 213.670 192.000 L 184.000 174.540 L 154.330 192.000 L 162.400 159.410 L 136.000 137.610 L 170.650 134.940 L 184.000 104.000 L 197.350 134.940 L 232.000 137.610 Z"),
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
                pathData = parseSvgPathData("M 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 ZM 40.000 136.000 L 96.000 136.000 C 100.418 136.000 104.000 132.418 104.000 128.000 C 104.000 123.582 100.418 120.000 96.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 ZM 112.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 112.000 200.000 C 116.418 200.000 120.000 196.418 120.000 192.000 C 120.000 187.582 116.418 184.000 112.000 184.000 ZM 237.090 143.780 L 214.570 162.370 L 221.430 190.080 C 222.199 193.204 221.022 196.484 218.443 198.406 C 215.864 200.329 212.384 200.519 209.610 198.890 L 184.000 183.820 L 158.390 198.890 C 155.616 200.519 152.136 200.329 149.557 198.406 C 146.978 196.484 145.801 193.204 146.570 190.080 L 153.420 162.370 L 130.910 143.780 C 128.399 141.703 127.398 138.311 128.381 135.204 C 129.363 132.097 132.131 129.896 135.380 129.640 L 165.220 127.330 L 176.650 100.830 C 177.912 97.892 180.803 95.989 184.000 95.989 C 187.197 95.989 190.088 97.892 191.350 100.830 L 202.780 127.330 L 232.620 129.640 C 235.869 129.896 238.637 132.097 239.619 135.204 C 240.602 138.311 239.601 141.703 237.090 143.780 ZM 211.620 144.060 L 196.730 142.910 C 193.770 142.683 191.179 140.835 190.000 138.110 L 184.000 124.190 L 178.000 138.110 C 176.821 140.835 174.230 142.683 171.270 142.910 L 156.380 144.060 L 167.490 153.240 C 169.865 155.197 170.907 158.342 170.170 161.330 L 166.670 175.450 L 179.940 167.640 C 182.446 166.164 185.554 166.164 188.060 167.640 L 201.330 175.450 L 197.830 161.330 C 197.093 158.342 198.135 155.197 200.510 153.240 Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
