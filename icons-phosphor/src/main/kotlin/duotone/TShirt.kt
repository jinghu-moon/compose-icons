package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorDuotoneIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 247.110 78.770 L 227.840 115.580 C 226.351 118.328 223.466 120.029 220.340 120.000 L 192.000 120.000 L 192.000 40.000 L 243.780 68.250 C 247.601 70.238 249.091 74.945 247.110 78.770 ZM 8.890 78.770 L 28.160 115.580 C 29.649 118.328 32.534 120.029 35.660 120.000 L 64.000 120.000 L 64.000 40.000 L 12.220 68.250 C 8.399 70.238 6.909 74.945 8.890 78.770 Z"),
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
                pathData = parseSvgPathData("M 247.590 61.220 L 195.830 33.000 C 194.657 32.351 193.340 32.007 192.000 32.000 L 160.000 32.000 C 155.582 32.000 152.000 35.582 152.000 40.000 C 152.000 53.255 141.255 64.000 128.000 64.000 C 114.745 64.000 104.000 53.255 104.000 40.000 C 104.000 35.582 100.418 32.000 96.000 32.000 L 64.000 32.000 C 62.656 32.006 61.336 32.349 60.160 33.000 L 8.410 61.220 C 0.729 65.279 -2.218 74.788 1.820 82.480 L 21.090 119.290 C 23.946 124.685 29.566 128.042 35.670 128.000 L 56.000 128.000 L 56.000 208.000 C 56.000 216.837 63.163 224.000 72.000 224.000 L 184.000 224.000 C 192.837 224.000 200.000 216.837 200.000 208.000 L 200.000 128.000 L 220.340 128.000 C 226.444 128.042 232.064 124.685 234.920 119.290 L 254.190 82.480 C 258.227 74.786 255.275 65.276 247.590 61.220 ZM 35.670 112.000 C 35.522 112.007 35.377 111.961 35.260 111.870 L 16.090 75.260 L 56.000 53.480 L 56.000 112.000 ZM 184.000 208.000 L 72.000 208.000 L 72.000 48.000 L 88.800 48.000 C 92.605 66.619 108.986 79.991 127.990 79.991 C 146.994 79.991 163.375 66.619 167.180 48.000 L 184.000 48.000 ZM 220.750 111.860 C 220.638 111.961 220.490 112.011 220.340 112.000 L 200.000 112.000 L 200.000 53.480 L 239.920 75.260 Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
